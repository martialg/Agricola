package joueur;

import java.util.ArrayList;

public  class PlateauJoueur {
    private ArrayList<Case> liste_case;
    private ArrayList<Boolean> clotures_lignes;
    private ArrayList<Boolean> clotures_colonnes;
    private ArrayList<Paturage> liste_paturages;
    private int enfant;
    private int enfant_sans_case_libre;
    private int adulte_sans_case_libre;
    
    public PlateauJoueur(){
        this.liste_case = new ArrayList<Case>();
        for(int i = 1; i < 16; i++){
            Case c = new CasePaturage(i);
            this.liste_case.add(c);
        }
        this.liste_case.set(5, new CaseHabitation(true,6));
        this.liste_case.set(10, new CaseHabitation(true,11));
        
        this.clotures_lignes = new ArrayList<Boolean>();
        for(int i = 0; i < 20; i++)
            this.clotures_lignes.add(Boolean.FALSE);
        
        this.clotures_colonnes = new ArrayList<Boolean>();
        for(int i = 0; i < 18; i++)
            this.clotures_colonnes.add(Boolean.FALSE);
        
        this.liste_paturages = new ArrayList<Paturage>();
        this.enfant = 0;
    }
    
    public void ajouterEnfant(){
        this.enfant++;
    }
    
    public int getEnfant(){
        return this.enfant;
    }
    
    public void ajouterEnfantSansCaseLibre(){
        this.enfant_sans_case_libre++;
    }
    
    public int getEnfantSansCaseLibre(){
        return this.enfant_sans_case_libre;
    }
    
    public void ajouterAdulte(){
        this.adulte_sans_case_libre++;
    }
    
    public int getAdulteSansCaseLibre(){
        return this.adulte_sans_case_libre;
    } 
    
    public void addPaturage(Paturage p){
        this.liste_paturages.add(p);
    }
    
    public ArrayList<Case> getListeCase(){
        return this.liste_case;
    }
    
    public void transformerCaseEnChamps(int numero_case){
        this.liste_case.set(numero_case - 1 , new CaseChamps(numero_case));
    }
    
    public ArrayList<Case> casesLibre(){
        ArrayList<Case> liste_place_libre = new ArrayList<Case>();
        for(Case case_actuelle : this.liste_case){
            if(case_actuelle instanceof Case){
                liste_place_libre.add(case_actuelle);
            }
        }
        return liste_place_libre;
    }
    
    public boolean possedeAuMoinsUnChamps(){
        for(Case case_actuelle : this.liste_case)
            if(case_actuelle instanceof CaseChamps)
                return true;
        return false;
    }
    
    public int nombredePaturage(){
        ArrayList<Case> liste_marquee = new ArrayList<Case>();
        for(Case cases_actuelle : this.liste_case){
                if(!(cases_actuelle instanceof CasePaturage)){
                    liste_marquee.add(cases_actuelle);
                }else{
                    
                }
            
        }
        return 0;
    }
    
    public int[] placeParPaturage(){
        if(this.nombredePaturage()==0){
            return null;
        }else{
            
            return null;
        }
    }
    
    public void poserCloture(int type, int indice){
        if(type == 1){
            //vertical
            this.clotures_colonnes.set(indice, Boolean.TRUE);
            int reste = indice % 4;
            if(reste == 0){
                this.liste_case.get(indice).setBordureHaut(true);
                this.verifierNouveauPaturage(this.liste_case.get(indice));
            }else if(reste == 1 || reste == 2){
                this.liste_case.get(indice).setBordureHaut(true);
                this.liste_case.get(indice-5).setBordureBas(true);
                this.verifierNouveauPaturage(this.liste_case.get(indice));
                this.verifierNouveauPaturage(this.liste_case.get(indice-5));
            }else{
                this.liste_case.get(indice-5).setBordureBas(true);
                this.verifierNouveauPaturage(this.liste_case.get(indice-5));
            }
            
        }else{
            //horizontal
            this.clotures_lignes.set(indice, Boolean.TRUE);
            if(indice < 6){
                if(indice == 0){
                    this.liste_case.get(0).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(0));
                }else if(indice < 5){
                    this.liste_case.get(indice-1).setBordureDroite(true);
                    this.liste_case.get(indice).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-1));
                    this.verifierNouveauPaturage(this.liste_case.get(indice));
                }else{
                    this.liste_case.get(indice-1).setBordureDroite(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-1));
                }
            }else if(indice >= 6 && indice < 12){
                if(indice == 6){
                    this.liste_case.get(5).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(5));
                }else if(indice < 5){
                    this.liste_case.get(indice-2).setBordureDroite(true);
                    this.liste_case.get(indice-1).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-2));
                    this.verifierNouveauPaturage(this.liste_case.get(indice-1));
                }else{
                    this.liste_case.get(indice-2).setBordureDroite(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-2));
                }
            }else{
                if(indice == 12){
                    this.liste_case.get(10).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(10));
                }else if(indice < 5){
                    this.liste_case.get(indice-3).setBordureDroite(true);
                    this.liste_case.get(indice-2).setBordureGauche(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-3));
                    this.verifierNouveauPaturage(this.liste_case.get(indice-2));
                }else{
                    this.liste_case.get(indice-3).setBordureDroite(true);
                    this.verifierNouveauPaturage(this.liste_case.get(indice-3));
                }
            }
        }
    }
        
    public void verifierNouveauPaturage(Case c){
        if(c instanceof CasePaturage){
            CasePaturage paturage = (CasePaturage) c;
            boolean est_un_paturage = true;
            ArrayList<CasePaturage> cases_explorees = new ArrayList<CasePaturage>();
            ArrayList<CasePaturage> cases_a_explorer = new ArrayList<CasePaturage>();
            cases_a_explorer.add(paturage);
            while(!cases_a_explorer.isEmpty() && est_un_paturage){
                CasePaturage temp = cases_a_explorer.remove(0);
                cases_explorees.add(temp);
                if(!temp.getBordureDroite()){
                    CasePaturage temp_droite = this.getVoisinDroitePaturage(paturage);
                    if(!cases_explorees.contains(temp_droite)){
                        if(temp_droite == null){
                            est_un_paturage = false;
                        }else{
                            cases_a_explorer.add(temp_droite);
                        }
                    }
                }
                if(!temp.getBordureGauche()){
                    CasePaturage temp_gauche = this.getVoisinGauchePaturage(paturage);
                    if(temp_gauche == null){
                        est_un_paturage = false;
                    }else if(!cases_explorees.contains(temp_gauche)){
                        cases_a_explorer.add(temp_gauche);
                    }
                }if(!temp.getBordureHaut()){
                    CasePaturage temp_haut = this.getVoisinHautPaturage(paturage);
                    if(temp_haut == null){
                        est_un_paturage = false;
                    }else if(!cases_explorees.contains(temp_haut)){
                        cases_a_explorer.add(temp_haut);
                    }
                }if(!temp.getBordureBas()){
                    CasePaturage temp_bas = this.getVoisinBasPaturage(paturage);
                    if(temp_bas == null){
                        est_un_paturage = false;
                    }else if(!cases_explorees.contains(temp_bas)){
                        cases_a_explorer.add(temp_bas);
                    }
                }
            }
            if(est_un_paturage){
                this.liste_paturages.add(new Paturage(cases_explorees));
            }
        }
    }
    
    public CasePaturage getVoisinBasPaturage(CasePaturage paturage){
        int place = paturage.getNumeroCase() - 1;
        if(place >= 10){
            return null;
        }else{
            Case temp = this.liste_case.get(place + 5);
            if(temp instanceof CasePaturage){
                return (CasePaturage)temp;
            }else{
                return null;
            }
        }
    }
    
    public CasePaturage getVoisinHautPaturage(CasePaturage paturage){
        int place = paturage.getNumeroCase() - 1;
        if(place <= 4){
            return null;
        }else{
            Case temp = this.liste_case.get(place - 5);
            if(temp instanceof CasePaturage){
                return (CasePaturage)temp;
            }else{
                return null;
            }
        }
    }
    
    public CasePaturage getVoisinGauchePaturage(CasePaturage paturage){
        int place = paturage.getNumeroCase() - 1;
        if(place == 0 || place == 5 || place == 10){
            return null;
        }else{
            Case temp = this.liste_case.get(place - 1);
            if(temp instanceof CasePaturage){
                return (CasePaturage)temp;
            }else{
                return null;
            }
        }
    }
    
    public CasePaturage getVoisinDroitePaturage(CasePaturage paturage){
        int place = paturage.getNumeroCase() - 1;
        if(place == 4 || place == 9 || place == 14){
            return null;
        }else{
            Case temp = this.liste_case.get(place + 1);
            if(temp instanceof CasePaturage){
                return (CasePaturage)temp;
            }else{
                return null;
            }
        }
    }
    
    
}

package joueur;

import java.util.ArrayList;

public  class PlateauJoueur {
    private ArrayList<Case> liste_case;
    private ArrayList<Boolean> clotures_lignes;
    private ArrayList<Boolean> clotures_colonnes;
    
    
    
    public PlateauJoueur(){
        this.liste_case = new ArrayList<Case>();
        for(int i = 1; i < 16; i++){
            Case c = new Case(i);
            this.liste_case.add(c);
        }
        this.liste_case.set(6, new CaseHabitation(true,6));
        this.liste_case.set(11, new CaseHabitation(true,11));
        
        this.clotures_lignes = new ArrayList<Boolean>();
        for(int i = 0; i < 20; i++)
            this.clotures_lignes.add(Boolean.FALSE);
        
        this.clotures_colonnes = new ArrayList<Boolean>();
        for(int i = 0; i < 18; i++)
            this.clotures_colonnes.add(Boolean.FALSE);
    }
    
    public ArrayList<Case> getListeCase(){
        return this.liste_case;
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
    
    /*
    public int nombredePaturage(){
        int nombre_de_paturage = 0;
        int nombre_de_cloture_col = 0;
        int nombre_de_cloture_ligne = 0;
        //recuperation du nombre de cloture en colonne
        for(Boolean[] bool_col : this.clotures_colonnes){
            for(Boolean bool_current_col : bool_col){
                if(bool_current_col==true){
                    nombre_de_cloture_col ++;
                }
            }
        }
        //recuperation du nombre de cloture en ligne
        for(Boolean[] bool_ligne : this.clotures_lignes){
            for(Boolean bool_current_ligne : bool_ligne){
                if(bool_current_ligne==true){
                    nombre_de_cloture_ligne ++;
                }
            }
        }
        //test si 0 paturage
        if((nombre_de_cloture_col==0)||(nombre_de_cloture_ligne==0)){
            return 0;
        }
        
        int num_ligne = 0;
        int num_col = 0;
        int num_case = 1;
        ArrayList<Case> liste_marquee = new ArrayList<Case>();
        Boolean[][] temp = null;
        
        for(Case[] cases : this.cases){
            for(Case case_actuelle : cases){
                Boolean bordure_haute = clotures_lignes[num_col][num_ligne];
                Boolean bordure_gauche = clotures_colonnes[num_col][num_ligne];
                Boolean bordure_droite = clotures_colonnes[num_col+1][num_ligne];
                Boolean bordure_basse = clotures_lignes[num_col][num_ligne+1];
                if((bordure_haute == true) || (bordure_basse == true) || (bordure_gauche == true) || (bordure_droite == true)){
                    temp[num_ligne][num_col] = true;
                    liste_marquee.add(new Case(num_case));
                }
                num_col++;
                num_case++;
            }
            num_ligne++;
        }
        int num = 1;
        for(Case case_marquee_actuelle : liste_marquee){
            case_marquee_actuelle.getNumeroCase();
        }
        
        //sinon (paturage)
        return 0;
    }*/
    
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
            }else if(reste == 1 || reste == 2){
                this.liste_case.get(indice).setBordureHaut(true);
                this.liste_case.get(indice-5).setBordureBas(true);
            }else{
                this.liste_case.get(indice-5).setBordureBas(true);
            }
            
        }else{
            //horizontal
            this.clotures_lignes.set(indice, Boolean.TRUE);
            if(indice < 6){
                if(indice == 0){
                    this.liste_case.get(0).setBordureGauche(true);
                }else if(indice < 5){
                    this.liste_case.get(indice-1).setBordureDroite(true);
                    this.liste_case.get(indice).setBordureGauche(true);
                }else{
                    this.liste_case.get(indice-1).setBordureDroite(true);
                }
            }else if(indice >= 6 && indice < 12){
                
            }else{
                
            }
        }
    }
    
    
}

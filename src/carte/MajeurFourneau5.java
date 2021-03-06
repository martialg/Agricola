package carte;

import ressources.Argile;
import ressources.MatierePremiere;

public class MajeurFourneau5 extends AmenagementMajeurRemplacant{
    
    public MajeurFourneau5(){
        super();
        this.symbole = Symbole.BOULANGERIE_CUISSON;
        this.points = 1;
        this.ressources_necessaires.add(new Argile(5));
    }
    
    /**
     * A ne pas utiliser. Utiliser les transfomerTYPE
     * @param type
     * @param nourriture
     * @return 
     */
    private boolean transformer(String type, int nourriture){
        MatierePremiere mp = null;
        switch(type){
            case "legume":
                mp = this.joueur.getRessources().getLegume();
                break;
            case "mouton":
                mp = this.joueur.getRessources().getMouton();
                break;
            case "sanglier":
                mp = this.joueur.getRessources().getSanglier();
                break;
            case "boeuf":
                mp = this.joueur.getRessources().getBoeuf();
                break;
            case "cereale":
                mp = this.joueur.getRessources().getCereale();
                break;
        }
        if(mp.getQuantite() > 1){
            mp.consommer(1);
            this.joueur.getRessources().ajouterNourriture(nourriture);
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean transformerLegume(){
        return this.transformer("legume", 3);
    }
    
    public boolean transformerMouton(){
        return this.transformer("mouton", 2);
    }
    
    public boolean transformerSanglier(){
        return this.transformer("sanglier", 3);
    }
    
    public boolean transformerBoeuf(){
        return this.transformer("boeuf", 4);
    }
    
    public boolean cuirPain(){
        return this.transformer("cereale", 3);
    }
}

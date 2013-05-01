package carte;

import ressources.Argile;
import ressources.MatierePremiere;

public class MajeurFoyer3 extends AmenagementMajeur{
    
    public MajeurFoyer3(){
        super();
        this.symbole = Symbole.BOULANGERIE_CUISSON;
        this.points = 1;
        this.ressources_necessaires.add(new Argile(3));
    }
    
    public boolean transformer(String type, int nourriture){
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
        return this.transformer("legume", 2);
    }
    
    public boolean transformerMouton(){
        return this.transformer("mouton", 2);
    }
    
    public boolean transformerSanglier(){
        return this.transformer("sanglier", 2);
    }
    
    public boolean transformerBoeuf(){
        return this.transformer("boueuf", 3);
    }
    
    public boolean cuirPain(){
        return this.transformer("cereale", 2);
    }
}

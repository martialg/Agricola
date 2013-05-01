package carte;

import ressources.Argile;
import ressources.Pierre;
import ressources.MatierePremiere;

public class MajeurPoterie extends AmenagementMajeur{
    
    public MajeurPoterie(){
        super();
        this.symbole = Symbole.AUCUN;
        this.points = 2;
        this.ressources_necessaires.add(new Argile(2));
        this.ressources_necessaires.add(new Pierre(2));
    }
    
    private boolean transformer(String type, int nourriture){
        MatierePremiere mp = null;
        switch(type){
            case "argile":
                mp = this.joueur.getRessources().getArgile();
                break;
        }
        if(mp.getQuantite() > 1){
            mp.consommer(1);
            joueur.getRessources().ajouterNourriture(nourriture);
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean transformerArgile(){
        return this.transformer("argile", 2);
    }
    
}

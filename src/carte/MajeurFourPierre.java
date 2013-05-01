package carte;

import ressources.Argile;
import ressources.Pierre;
import ressources.MatierePremiere;

public class MajeurFourPierre extends AmenagementMajeur{
    
    public MajeurFourPierre(){
        super();
        this.symbole = Symbole.BOULANGERIE;
        this.points = 3;
        this.ressources_necessaires.add(new Argile(1));
        this.ressources_necessaires.add(new Pierre(3));
    }
    
    private boolean transformer(String type, int nourriture){
        MatierePremiere mp = null;
        switch(type){
            case "cereale":
                mp = this.joueur.getRessources().getCereale();
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
    
    public boolean cuirPain(){
        return this.transformer("cereale", 4);
    }
}

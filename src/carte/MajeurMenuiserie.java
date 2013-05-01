package carte;

import ressources.Bois;
import ressources.Pierre;
import ressources.MatierePremiere;

public class MajeurMenuiserie extends AmenagementMajeur{
    
    public MajeurMenuiserie(){
        super();
        this.symbole = Symbole.AUCUN;
        this.points = 2;
        this.ressources_necessaires.add(new Bois(2));
        this.ressources_necessaires.add(new Pierre(2));
    }
    
    private boolean transformer(String type, int nourriture){
        MatierePremiere mp = null;
        switch(type){
            case "bois":
                mp = this.joueur.getRessources().getBois();
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
    
    public boolean transformerBois(){
        return this.transformer("bois", 2);
    }
    
}

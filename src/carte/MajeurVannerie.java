package carte;

import ressources.Roseau;
import ressources.Pierre;
import ressources.MatierePremiere;

public class MajeurVannerie extends AmenagementMajeur{
    
    public MajeurVannerie(){
        super();
        this.symbole = Symbole.AUCUN;
        this.points = 2;
        this.ressources_necessaires.add(new Roseau(2));
        this.ressources_necessaires.add(new Pierre(2));
    }
    
    private boolean transformer(String type, int nourriture){
        MatierePremiere mp = null;
        switch(type){
            case "roseau":
                mp = this.joueur.getRessources().getRoseau();
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
    
    public boolean transformerRoseau(){
        return this.transformer("roseau", 3);
    }
    
}

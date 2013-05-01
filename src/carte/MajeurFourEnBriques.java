package carte;

import ressources.Argile;
import ressources.Cereale;
import ressources.Pierre;

public class MajeurFourEnBriques extends AmenagementMajeur{
    
    public MajeurFourEnBriques(){
        super();
        this.symbole = Symbole.CUISSON;
        this.points = 2;
        this.ressources_necessaires.add(new Argile(3));
        this.ressources_necessaires.add(new Pierre(1));
    }
    
    public boolean cuirPain(){
        Cereale cereale = this.joueur.getRessources().getCereale();
        if(cereale.getQuantite() >= 1){
            cereale.consommer(1);
            this.joueur.getRessources().ajouterNourriture(5);
            return true;
        }else{
            return false;
        }
    }
}

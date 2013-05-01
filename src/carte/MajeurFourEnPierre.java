package carte;

import ressources.Argile;
import ressources.Cereale;
import ressources.Pierre;

public class MajeurFourEnPierre extends AmenagementMajeur{
    
    public MajeurFourEnPierre(){
        super();
        this.symbole = Symbole.CUISSON;
        this.points = 3;
        this.ressources_necessaires.add(new Argile(1));
        this.ressources_necessaires.add(new Pierre(3));
    }
    
    public boolean cuirPain(int nombre){
        Cereale cereale = this.joueur.getRessources().getCereale();
        if(cereale.getQuantite() >= nombre){
            cereale.consommer(nombre);
            this.joueur.getRessources().ajouterNourriture(4*nombre);
            return true;
        }else{
            return false;
        }
    }
}

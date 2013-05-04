package plateau.action;

import joueur.Joueur;
import ressources.Boeuf;

public class Action1Boeuf extends RessourceCumulable {

    public Action1Boeuf(){
        super();
        this.multiplicateur = 1;
    }

    public Boeuf moutonsRetournes(Joueur joueur){
        Boeuf boeuf = new Boeuf(this.quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return boeuf;
    }
}

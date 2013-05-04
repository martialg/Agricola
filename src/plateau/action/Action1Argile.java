package plateau.action;

import joueur.Joueur;

public class Action1Argile extends RessourceCumulable{

    public Action1Argile(){
        super();
        this.multiplicateur = 1;
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getArgile().ajouter(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

package plateau.action;

import joueur.Joueur;

public class Action1Argile extends RessourceCumulable{

    public Action1Argile(){
        super();
        this.multiplicateur = 1;
    }
    
    public boolean action(Joueur joueur) {
        //ajout des ressources
        joueur.getRessources().getArgile().ajouter(quantite_cumulee);
        //suppression sur l'action
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

package plateau.action;

import joueur.Joueur;

public class Action1Pierre extends RessourceCumulable{

    public Action1Pierre(){
        this.multiplicateur = 1;
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getPierre().ajouter(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}
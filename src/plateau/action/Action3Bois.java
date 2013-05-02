package plateau.action;

import joueur.Joueur;

public class Action3Bois extends RessourceCumulable{

    public Action3Bois(){
        super();
        this.multiplicateur = 3;
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getBois().ajouter(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

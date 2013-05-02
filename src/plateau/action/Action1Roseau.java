package plateau.action;

import joueur.Joueur;

public class Action1Roseau extends RessourceCumulable{

    public Action1Roseau(){
        super();
        this.multiplicateur = 1;
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getRoseau().ajouter(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

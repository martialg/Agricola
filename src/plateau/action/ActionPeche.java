package plateau.action;

import joueur.Joueur;

public class ActionPeche extends RessourceCumulable{

    public ActionPeche(){
        super();
        this.multiplicateur = 1;
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().ajouterNourriture(quantite_cumulee);;
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

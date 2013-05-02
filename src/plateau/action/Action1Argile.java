package plateau.action;

import joueur.Joueur;

public class Action1Argile extends RessourceCumulable{

    @Override
    public boolean action(Joueur joueur) {
        //ajout des ressources
        joueur.getRessources().getArgile().ajouter(quantite_cumulee);
        //suppression sur l'action
        this.prendreLesRessource();
        
        return true;
    }
    
}

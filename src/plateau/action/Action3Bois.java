package plateau.action;

import joueur.Joueur;

public class Action3Bois extends RessourceCumulable{

    @Override
    public boolean action(Joueur joueur) {
        //ajout des ressources
        joueur.getRessources().getBois().ajouter(quantite_cumulee);
        //suppression sur l'action
        this.prendreLesRessource();
        
        return true;
    }
    
}

package plateau.action;

import joueur.Joueur;

public class ActionPeche extends RessourceCumulable{

    @Override
    public boolean action(Joueur joueur) {
        //ajout des ressources
        joueur.getRessources().ajouterNourriture(quantite_cumulee);
        //suppression sur l'action
        this.prendreLesRessource();
        
        return true;
    }
    
}

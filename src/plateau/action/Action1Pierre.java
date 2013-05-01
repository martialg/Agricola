package plateau.action;

import joueur.Joueur;

public class Action1Pierre extends RessourceCumulable{

    @Override
    public boolean action(Joueur joueur) {

        joueur.getRessources().getPierre().ajouter(quantite_cumulee);
        
        //recuperation des ressources
        this.prendreLesRessource();
        
        return true;
    }
    
}
package plateau.action;

import joueur.Joueur;
import agricola.Agricola;

public class PremierJoueur extends RessourceCumulable{

    @Override
    public boolean action(Joueur joueur) {
        //devient premier joueur
        Agricola.setPremierJoueur(joueur);
        
        
        //ajout des ressources
        joueur.getRessources().ajouterNourriture(quantite_cumulee);
        //suppression sur l'action
        this.prendreLesRessource();
        return true;
    }
    
}

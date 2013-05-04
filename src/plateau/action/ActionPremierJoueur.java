package plateau.action;

import joueur.Joueur;
import agricola.Agricola;

public class ActionPremierJoueur extends RessourceCumulable{
    
    public ActionPremierJoueur(){
        
    }

    public boolean action(Joueur joueur) {
        Agricola.setPremierJoueur(joueur);
        joueur.getRessources().ajouterNourriture(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

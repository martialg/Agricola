package plateau.action;

import joueur.Joueur;
import agricola.Agricola;

public class ActionPremierJoueur extends RessourceCumulable{
    
    public ActionPremierJoueur(){
        
    }

    public boolean action(Joueur joueur) {
        //devient premier joueur
        Agricola.setPremierJoueur(joueur);
        //ajout des ressources
        joueur.getRessources().ajouterNourriture(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

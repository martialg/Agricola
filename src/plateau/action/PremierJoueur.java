package plateau.action;

import joueur.Joueur;
import agricola.Agricola;

public class PremierJoueur extends RessourceCumulable{

    public boolean action(Joueur joueur) {
        //devient premier joueur
        Agricola.setPremierJoueur(joueur);
        joueur.getRessources().ajouterNourriture(quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

package plateau.action;

import joueur.Joueur;
import ressources.Mouton;

/*
 * Periode 1
 */
public class Action1Mouton extends RessourceCumulable{
    
    public Action1Mouton(){
        super();
        this.multiplicateur = 1;
    }
    
    public Mouton moutonsRetournes(Joueur joueur){
        Mouton mouton = new Mouton(this.quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return mouton;
    }
}

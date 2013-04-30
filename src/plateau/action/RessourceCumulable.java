package plateau.action;

import joueur.Joueur;

public abstract class RessourceCumulable extends CaseAction{
    private int quantite_cumulee;
    private int multiplicateur;
    
    public abstract boolean action(Joueur joueur);
    
    public void finTour(){
        quantite_cumulee += multiplicateur;
    }
}

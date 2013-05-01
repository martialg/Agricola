package plateau.action;

import joueur.Joueur;

public abstract class RessourceCumulable extends CaseAction{
    protected int quantite_cumulee;
    private int multiplicateur;
    
    public abstract boolean action(Joueur joueur);
    
    public void finTour(){
        quantite_cumulee += multiplicateur;
    }
    
    public void prendreLesRessource(){
        quantite_cumulee = 0;
    }
}

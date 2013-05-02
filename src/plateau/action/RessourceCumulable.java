package plateau.action;

import joueur.Joueur;

public abstract class RessourceCumulable extends CaseAction{
    protected int quantite_cumulee;
    protected int multiplicateur;
    
    public RessourceCumulable(){
        super();
        this.quantite_cumulee = 0;
    }
    
    public void debutTour(){
        quantite_cumulee += multiplicateur;
    }
    
    public void prendreLesRessource(){
        quantite_cumulee = 0;
    }
}

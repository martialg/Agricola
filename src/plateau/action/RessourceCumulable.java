package plateau.action;

public abstract class RessourceCumulable extends CaseAction{
    protected int quantite_cumulee;
    private int multiplicateur;
    
    public void finTour(){
        quantite_cumulee += multiplicateur;
    }
    
    public void prendreLesRessource(){
        quantite_cumulee = 0;
    }
}

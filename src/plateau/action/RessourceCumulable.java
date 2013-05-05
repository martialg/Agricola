package plateau.action;

public abstract class RessourceCumulable extends CaseAction{
    protected int quantite_cumulee;
    protected int multiplicateur;
    
    public RessourceCumulable(){
        super();
        this.quantite_cumulee = 0;
    }
    
    public void debutTour(){
        this.quantite_cumulee += this.multiplicateur;
    }
    
    public int getQuantiteCumulee(){
        return this.quantite_cumulee;
    }
    public void prendreLesRessource(){
        quantite_cumulee = 0;
    }
}

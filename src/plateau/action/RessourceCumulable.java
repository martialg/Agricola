package plateau.action;

public abstract class RessourceCumulable extends CaseAction{
    protected int quantite_cumulee;
    protected int multiplicateur;
    
    public RessourceCumulable(){
        super();
        this.quantite_cumulee = 0;
    }
    
    public void debutTour(){
        System.out.println(this.quantite_cumulee + " " + this.multiplicateur + " " + this);
        this.quantite_cumulee += this.multiplicateur;
        System.out.println(this.quantite_cumulee);
    }
    
    public int getQuantiteCumulee(){
        return this.quantite_cumulee;
    }
    public void prendreLesRessource(){
        quantite_cumulee = 0;
    }
}

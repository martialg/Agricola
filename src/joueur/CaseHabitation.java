package joueur;

public class CaseHabitation extends Case{
    private boolean occupe;
    private TypeHabitation type;
    
    public CaseHabitation(int num){
        super(num);
        this.occupe = false;
        this.type = TypeHabitation.BOIS;
    }
    
    public CaseHabitation(boolean occupe,int num){
        super(num);
        this.occupe = occupe;
        this.type = TypeHabitation.BOIS;
    }
    
}

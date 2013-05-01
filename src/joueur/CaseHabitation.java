package joueur;

public class CaseHabitation extends Case{
    private boolean occupe;
    private TypeHabitation type;
    
    public CaseHabitation(){
        this.occupe = false;
        this.type = TypeHabitation.BOIS;
    }
    
    public CaseHabitation(boolean occupe){
        this.occupe = occupe;
        this.type = TypeHabitation.BOIS;
    }
    
}

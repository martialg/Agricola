package joueur;

public class CaseHabitation extends Case{
    private boolean occupe;
    private TypeHabitation type;
    
    public CaseHabitation(int num){
        super(num);
        this.occupe = false;
        this.type = TypeHabitation.BOIS;
    }
    
    public CaseHabitation(int num, TypeHabitation type){
        super(num);
        this.occupe = false;
        this.type = type;
    }
    
    public CaseHabitation(boolean occupe,int num){
        super(num);
        this.occupe = occupe;
        this.type = TypeHabitation.BOIS;
    }
    
    public boolean getOccupe(){
        return occupe;
    }
    
    public TypeHabitation getType(){
        return this.type;
    }
    
    public void ameliorer(){
        if(this.type == TypeHabitation.BOIS)
            this.type = TypeHabitation.ARGILE;
        else
            this.type = TypeHabitation.PIERRE;
    }       
}

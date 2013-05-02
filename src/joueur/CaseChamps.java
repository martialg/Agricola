package joueur;

import ressources.Semaille;

public class CaseChamps extends Case{
    private Semaille semaille;
    
    public CaseChamps(int num){
        super(num);
        this.semaille = null;
    }
    
    public boolean champsVide(){
        if(this.semaille == null)
            return true;
        else
            return false;
    }
    
    public void semer(Semaille semaille){
        this.semaille = semaille;
    }
}

package joueur;

import ressources.Semaille;

public class CaseChamps extends Case{
    private Semaille semaille;
    
    public CaseChamps(int num){
        super(num);
        this.semaille = null;
    }
}

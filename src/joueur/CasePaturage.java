package joueur;

import ressources.Animal;

public class CasePaturage extends Case{
    private boolean etable;
    private Animal animal;
    
    public CasePaturage(int num){
        super(num);
        this.etable = false;
        this.animal = null;
    }
    
    public void ajouterEtable(){
        this.etable = true;
    }
    
    public boolean possedeEtable(){
        return this.etable;
    }
    
    
    
}

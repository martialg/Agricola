package joueur;

import ressources.Animal;

public class CasePaturage extends Case{
    private boolean etable;
    private Animal animal;
    
    public CasePaturage(){
        this.etable = false;
        this.animal = null;
    }
    
    public void ajouterEtable(){
        this.etable = true;
    }
    
}

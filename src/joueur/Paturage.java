package joueur;

import java.util.ArrayList;

public class Paturage {
    private ArrayList<CasePaturage> liste_cases;
    
    public Paturage(){
        liste_cases = new ArrayList<CasePaturage>();
    }

    public Paturage(ArrayList<CasePaturage> cases) {
        liste_cases = new ArrayList<CasePaturage>(cases);
    }
    
    public void ajouterCase(CasePaturage paturage){
        this.liste_cases.add(paturage);
    }
}

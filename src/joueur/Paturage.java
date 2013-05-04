package joueur;

import java.util.ArrayList;
import ressources.Animal;

public class Paturage {
    private ArrayList<CasePaturage> liste_cases;
    private Animal animaux;
    
    public Paturage(){
        liste_cases = new ArrayList<CasePaturage>();
        this.animaux = null;
    }

    public Paturage(ArrayList<CasePaturage> cases) {
        liste_cases = new ArrayList<CasePaturage>(cases);
        this.animaux = null;
    }
    
    public void ajouterCase(CasePaturage paturage){
        this.liste_cases.add(paturage);
    }
    
    public void ajouterAnimaux(Animal animaux){
        if(this.animaux == null){
            this.animaux = animaux;
        }else{
            this.animaux.ajouter(animaux.getQuantite());
        }
    }
    
    public int nombreMaximumAnimaux(){
        int nombre = liste_cases.size();
        for(CasePaturage c : liste_cases)
            if(c.possedeEtable())
                nombre *= 2;
        return nombre;
    }
}

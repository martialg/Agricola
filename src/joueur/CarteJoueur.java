package joueur;

import carte.AmenagementMajeur;
import carte.MajeurFoyer2;
import carte.MajeurFoyer3;
import java.util.ArrayList;

public class CarteJoueur {
    private ArrayList<AmenagementMajeur> amenagements_majeurs_joues;
    
    public CarteJoueur(){
        this.amenagements_majeurs_joues = new ArrayList<AmenagementMajeur>();
    }
    
    public ArrayList<AmenagementMajeur> getAmenagement(){
        return this.amenagements_majeurs_joues;
    }
    
    public void addAmenagementsMajeursJoues(AmenagementMajeur amenagement){
        this.amenagements_majeurs_joues.add(amenagement);
    }

    public void removeAmenagementsMajeursJoues(AmenagementMajeur amenagement_joue) {
        for(AmenagementMajeur am : this.amenagements_majeurs_joues){
            if(am == amenagement_joue){
                this.amenagements_majeurs_joues.remove(am);
            }
        }
    }
}

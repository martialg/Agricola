package plateau;

import carte.AmenagementMajeur;
import carte.*;
import java.util.ArrayList;
public class Plateau {
    private ArrayList<Periode> periodes;
    private ArrayList<AmenagementMajeur> amenagements;
    
    public Plateau(){
        this.periodes = new ArrayList<Periode>(6);
        
        //add période 1 : 4 tours 
        //add période 2 : 3 tours 
        //add période 3 : 2 tours 
        //add période 4 : 2 tours 
        //add période 5 : 2 tours 
        //add période 6 : 1 tours
        this.amenagements.add(new MajeurFoyer2());
        this.amenagements.add(new MajeurFoyer3());
        this.amenagements.add(new MajeurFourneau4());
        this.amenagements.add(new MajeurFourneau5());
        this.amenagements.add(new MajeurPuits());
        this.amenagements.add(new MajeurFourEnBriques());
        this.amenagements.add(new MajeurFourEnPierre());
        this.amenagements.add(new MajeurMenuiserie());
        this.amenagements.add(new MajeurPoterie());
        this.amenagements.add(new MajeurVannerie());
        
    }
    
    public ArrayList<Periode> getPeriodes(){
        return this.periodes;
    }
    
    public ArrayList<AmenagementMajeur> getAmenagements(){
        return this.amenagements;
    }
}

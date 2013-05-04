package plateau;

import carte.AmenagementMajeur;
import carte.*;
import java.util.ArrayList;
import plateau.action.Action1Boeuf;
import plateau.action.Action1Legume;
import plateau.action.Action1Mouton;
import plateau.action.Action1Pierre;
import plateau.action.Action1Sanglier;
import plateau.action.ActionAmenagement;
import plateau.action.ActionCloture;
import plateau.action.ActionLabourageSemailles;
import plateau.action.ActionNaissance;
import plateau.action.ActionNaissanceSansPlaceLibre;
import plateau.action.ActionRenovation;
import plateau.action.ActionRenovationCloture;
import plateau.action.ActionSemailles;
import plateau.action.CaseAction;

public class Plateau {
    private ArrayList<Periode> periodes;
    private ArrayList<AmenagementMajeur> amenagements;
    
    public Plateau(){
        this.periodes = new ArrayList<Periode>(6);
        
        //add période 1 : 4 tours 
        ArrayList<CaseAction> liste_periode_1 = new ArrayList<CaseAction>();
        liste_periode_1.add(new Action1Mouton());
        liste_periode_1.add(new ActionCloture());
        liste_periode_1.add(new ActionSemailles());
        liste_periode_1.add(new ActionAmenagement());
        this.periodes.add(new Periode(1, liste_periode_1));
        
        //add période 2 : 3 tours 
        ArrayList<CaseAction> liste_periode_2 = new ArrayList<CaseAction>();
        liste_periode_2.add(new Action1Pierre());
        liste_periode_2.add(new ActionNaissance());
        liste_periode_2.add(new ActionRenovation());
        this.periodes.add(new Periode(2, liste_periode_2));
        
        //add période 3 : 2 tours 
        ArrayList<CaseAction> liste_periode_3 = new ArrayList<CaseAction>();
        liste_periode_3.add(new Action1Sanglier());
        liste_periode_3.add(new Action1Legume());
        this.periodes.add(new Periode(3, liste_periode_3));
        
        //add période 4 : 2 tours 
        ArrayList<CaseAction> liste_periode_4 = new ArrayList<CaseAction>();
        liste_periode_4.add(new Action1Pierre());
        liste_periode_4.add(new Action1Boeuf());
        this.periodes.add(new Periode(4, liste_periode_4));
        
        //add période 5 : 2 tours 
        ArrayList<CaseAction> liste_periode_5 = new ArrayList<CaseAction>();
        liste_periode_5.add(new ActionNaissanceSansPlaceLibre());
        liste_periode_5.add(new ActionLabourageSemailles());
        this.periodes.add(new Periode(5, liste_periode_5));
        
        //add période 6 : 1 tours
        ArrayList<CaseAction> liste_periode_6 = new ArrayList<CaseAction>();
        liste_periode_6.add(new ActionRenovationCloture());
        this.periodes.add(new Periode(6, liste_periode_6));
        
        
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

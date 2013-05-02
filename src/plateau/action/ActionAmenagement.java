package plateau.action;

import carte.AmenagementMajeur;
import java.util.ArrayList;
import agricola.Agricola;
import joueur.Joueur;

public class ActionAmenagement extends CaseAction{
    
    public ActionAmenagement(){
    }
    
    public ArrayList<AmenagementMajeur> amenagementsDisponibles(){
        return Agricola.getPlateau().getAmenagements();
    }
    
    public boolean verifierPossibilitePrendreAmenagement(Joueur joueur, AmenagementMajeur am){
        return am.attributionPossible(joueur);
    }
    
    public void attribuerAmenagement(Joueur joueur, AmenagementMajeur am){
        Agricola.getPlateau().getAmenagements().remove(am);
        am.attribuer(joueur);
        this.joueur_sur_case = joueur;
    }
}

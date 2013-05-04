package plateau.action;

import java.util.ArrayList;
import joueur.Case;
import joueur.CaseHabitation;
import joueur.Joueur;

public class ActionNaissance extends CaseAction{
    public ActionNaissance(){
        
    }
    
    public boolean action(Joueur joueur){
        if(joueur.compterHabitants() < 5){
            ArrayList<Case> liste_cases = joueur.getPlateauJoueur().getListeCase();
            for(Case c : liste_cases){
                if(c instanceof CaseHabitation){
                    CaseHabitation case_temp = (CaseHabitation)c;
                    if(!case_temp.getOccupe()){
                        joueur.getPlateauJoueur().ajouterEnfant();
                        this.joueur_sur_case = joueur;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

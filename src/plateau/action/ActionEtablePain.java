package plateau.action;

import carte.AmenagementMajeur;
import joueur.CasePaturage;
import joueur.Joueur;

public class ActionEtablePain extends CaseAction{
    public ActionEtablePain(){
        
    }
    
    public void contruireEtable(Joueur joueur, CasePaturage case_paturage){
        case_paturage.ajouterEtable();
        this.joueur_sur_case = joueur;
    }
    
    //pour cuir pain appleler directement la méthode sur la carte.
}

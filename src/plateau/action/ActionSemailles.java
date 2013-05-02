package plateau.action;

import joueur.CaseChamps;
import joueur.Joueur;
import ressources.Cereale;
import ressources.Legume;

public class ActionSemailles extends CaseAction{
    public ActionSemailles(){
    }
    
    public boolean peutSemaillesCereal(Joueur joueur, String type){
        if(joueur.getRessources().getCereale().getQuantite() < 1 && type.compareTo("cereale") ==0)
            return false;
        if(joueur.getRessources().getLegume().getQuantite() < 1 && type.compareTo("legume") ==0)
            return false;
        if(!joueur.possedeChampsLibre())
            return false;
        return true;
    }
    
    public void semaille(Joueur joueur, String type, CaseChamps case_champs){
        if(type.compareTo("legume") ==0){
            case_champs.semer(new Legume(1));
            joueur.getRessources().getLegume().consommer(1);
        }else{
            case_champs.semer(new Cereale(1));
            joueur.getRessources().getCereale().consommer(1);
        }
        this.joueur_sur_case = joueur;
    }
            
            
    
    
}

package plateau.action;

import carte.AmenagementMajeur;
import joueur.CaseChamps;
import joueur.Joueur;
import ressources.Cereale;
import ressources.Legume;
import carte.Symbole;

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
    
    public boolean peutCuirPäin(Joueur joueur){
        if(joueur.getRessources().getCereale().getQuantite() == 0)
            return false;
        else
            for(AmenagementMajeur carte : joueur.getCartes().getAmenagement())
                if(carte.getSymbole() == Symbole.BOULANGERIE_CUISSON || carte.getSymbole() == Symbole.CUISSON)
                    return true;
        return false;
    }
            
            
    
    
}

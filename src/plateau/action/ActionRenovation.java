package plateau.action;

import carte.AmenagementMajeur;
import java.util.ArrayList;
import joueur.Case;
import joueur.CaseHabitation;
import joueur.Joueur;
import joueur.TypeHabitation;

public class ActionRenovation extends CaseAction{
    public ActionRenovation(){
        
    }
    
    public boolean action(Joueur joueur){
        if(!joueur.peutJouerAmenagementMajeur()) return false;
        if(joueur.getRessources().getRoseau().getQuantite() < 1) return false;
        ArrayList<Case> liste_cases = joueur.getPlateauJoueur().getListeCase();
        CaseHabitation ch = (CaseHabitation)liste_cases.get(5);
        TypeHabitation ct = ch.getType();
        ArrayList<CaseHabitation> cases_habitations = new ArrayList<CaseHabitation>();
        for(Case c : liste_cases)
            if(c instanceof CaseHabitation)
                cases_habitations.add((CaseHabitation)c);
        if(ct == TypeHabitation.BOIS){
            if(joueur.getRessources().getArgile().getQuantite() < cases_habitations.size()){
                return false;
            }else{
                joueur.getRessources().getArgile().consommer(cases_habitations.size());
                for(CaseHabitation c : cases_habitations)
                    c.ameliorer();
                this.joueur_sur_case = joueur;
                return true;
            }
        }else if(ct == TypeHabitation.ARGILE){
            if(joueur.getRessources().getPierre().getQuantite() < cases_habitations.size()){
                return false;
            }else{
                joueur.getRessources().getPierre().consommer(cases_habitations.size());
                for(CaseHabitation c : cases_habitations)
                    c.ameliorer();
                this.joueur_sur_case = joueur;
                return true;
            }
        }else{
            return false;
        }
    }
    
    public void jouerAmenagement(AmenagementMajeur am){
        am.attribuer(this.joueur_sur_case);
    }
}

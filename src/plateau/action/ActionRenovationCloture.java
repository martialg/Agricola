package plateau.action;

import java.util.ArrayList;
import joueur.Case;
import joueur.CaseHabitation;
import joueur.Joueur;
import joueur.TypeHabitation;

public class ActionRenovationCloture extends CaseAction{
    public ActionRenovationCloture(){
        
    }
    
    public boolean actionRenovation(Joueur joueur){
        if(!this.peutAcheterCloture(joueur)) return false;
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
    
    
    private boolean peutAcheterCloture(Joueur joueur){
        if(joueur.getRessources().getBois().getQuantite() > 0){
            return true;
        }else{
            return false;
        }
    }
    
     /**
     * 
     * @param joueur
     * @param i indice premiere dimension
     * @param j indice deuxieme dimension
     */
    public void acheterEtPoserClotureVerticale(Joueur joueur, int indice){
        this.acheterEtPoserCloture(joueur, 1, indice);
    }
    
    public void acheterEtPoserClotureHorizontale(Joueur joueur, int indice){
        this.acheterEtPoserCloture(joueur, 2, indice);
    }
    
    /**
     * 
     * @param joueur
     * @param type 1:vertical, 2:horizontal
     * @param premiere_dimension
     * @param deuxieme_dimension 
     */
    private void acheterEtPoserCloture(Joueur joueur, int type, int indice){
        this.joueur_sur_case = joueur;
        this.joueur_sur_case.getRessources().getBois().consommer(1);
        joueur.getPlateauJoueur().poserCloture(type, indice);
    }
}

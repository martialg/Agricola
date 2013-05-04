package plateau.action;

import java.util.ArrayList;
import joueur.Case;
import joueur.CaseHabitation;
import joueur.CasePaturage;
import joueur.Joueur;
import joueur.TypeHabitation;

public class ActionPieceEtable extends CaseAction{
    public ActionPieceEtable(){
        
    }
    
    public boolean peutConstruirePiece(Joueur joueur){
        if(joueur.getRessources().getRoseau().getQuantite() < 2) return false;
        ArrayList<Case> liste_cases = joueur.getPlateauJoueur().getListeCase();
        CaseHabitation ch = (CaseHabitation)liste_cases.get(5);
        TypeHabitation ct = ch.getType();
        if(ch.getType() == TypeHabitation.BOIS && joueur.getRessources().getBois().getQuantite() < 5) return false;
        if(ch.getType() == TypeHabitation.ARGILE && joueur.getRessources().getArgile().getQuantite() < 5) return false;
        if(ch.getType() == TypeHabitation.PIERRE && joueur.getRessources().getPierre().getQuantite() < 5) return false;
        return true;
    }
    
    public void contruirePiece(Joueur joueur, Case c){
        this.joueur_sur_case = joueur;
        ArrayList<Case> liste_cases = joueur.getPlateauJoueur().getListeCase();
        CaseHabitation ch = (CaseHabitation)liste_cases.get(5);
        TypeHabitation ct = ch.getType();
        joueur.getPlateauJoueur().transformerCaseEnHabitat(c.getNumeroCase(), ct);
    }
    
    public void contruireEtable(Joueur joueur, CasePaturage case_paturage){
        case_paturage.ajouterEtable();
        this.joueur_sur_case = joueur;
    }
}

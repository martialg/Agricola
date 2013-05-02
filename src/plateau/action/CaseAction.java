package plateau.action;

import joueur.Joueur;

public abstract class CaseAction {
    protected Joueur joueur_sur_case;
    
    public CaseAction(){
        this.joueur_sur_case = null;
    }
    
    public boolean caseDisponible(){
        if(joueur_sur_case == null)
            return true;
        else
            return false;
    }
}

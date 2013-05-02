package plateau.action;

import joueur.Joueur;

public class Action1Cereale extends CaseAction{

    public Action1Cereale(){
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getCereale().ajouter(1);
        this.joueur_sur_case = joueur;
        return true;
    }
    
}
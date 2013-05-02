package plateau.action;

import joueur.Joueur;

public class Action1Legume extends CaseAction{

    public Action1Legume(){
    }
    
    public boolean action(Joueur joueur) {
        joueur.getRessources().getLegume().ajouter(1);
        this.joueur_sur_case = joueur;
        return true;
    }
    
}

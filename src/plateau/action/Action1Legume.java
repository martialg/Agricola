package plateau.action;

import joueur.Joueur;

public class Action1Legume extends CaseAction{

    @Override
    public boolean action(Joueur joueur) {
        joueur.getRessources().getLegume().ajouter(1);
        return true;
    }
    
}

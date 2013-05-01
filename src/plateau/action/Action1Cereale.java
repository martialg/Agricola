package plateau.action;

import joueur.Joueur;

public class Action1Cereale extends CaseAction{

    @Override
    public boolean action(Joueur joueur) {
        joueur.getRessources().getCereale().ajouter(1);
        return true;
    }
    
}
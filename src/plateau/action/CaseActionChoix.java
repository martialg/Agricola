package plateau.action;

import joueur.Joueur;

public abstract class CaseActionChoix extends CaseAction {
    
    public abstract boolean action(Joueur joueur, String choix);
}

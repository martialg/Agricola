package plateau.action;

import joueur.Joueur;

public class ActionJournalier extends CaseActionChoix{

    @Override
    public boolean action(Joueur joueur, String choix) {
        switch(choix){
            case "bois":
                joueur.getRessources().getBois().ajouter(1);
                break;
            case "roseau":
                joueur.getRessources().getRoseau().ajouter(1);
                break;
            case "argile":
                joueur.getRessources().getArgile().ajouter(1);
                break;
            case "pierre":
                joueur.getRessources().getPierre().ajouter(1);
                break;
        }
        joueur.getRessources().ajouterNourriture(1);
        this.joueur_sur_case = joueur;
        return true;
    }
    
    
}

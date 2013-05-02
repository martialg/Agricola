package plateau.action;

import joueur.Joueur;

public class ActionJournalier extends CaseAction{

    @Override
    public boolean action(Joueur joueur) {
        joueur.getRessources().ajouterNourriture(1);
        String choix = null;
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
        return true;
    }
    
}
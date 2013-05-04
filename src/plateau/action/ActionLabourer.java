package plateau.action;

import joueur.Case;
import joueur.Joueur;

public class ActionLabourer extends CaseAction{
    public ActionLabourer(){
        
    }

    public void labourer(Joueur joueur, Case c){
        this.joueur_sur_case = joueur;
        joueur.getPlateauJoueur().transformerCaseEnChamps(c.getNumeroCase());
    }
    
    
}

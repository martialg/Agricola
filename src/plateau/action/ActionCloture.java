package plateau.action;

import agricola.Agricola;
import joueur.Joueur;

public class ActionCloture extends CaseAction{
    
    public ActionCloture(){    
    }
    
    public boolean peutAcheterCloture(Joueur joueur){
        if(joueur.getRessources().getBois().getQuantite() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * 
     * @param joueur
     * @param i indice premiere dimension
     * @param j indice deuxieme dimension
     */
    public void acheterEtPoserClotureVerticale(Joueur joueur, int indice){
        this.acheterEtPoserCloture(joueur, 1, indice);
    }
    
    public void acheterEtPoserClotureHorizontale(Joueur joueur, int indice){
        this.acheterEtPoserCloture(joueur, 2, indice);
    }
    
    /**
     * 
     * @param joueur
     * @param type 1:vertical, 2:horizontal
     * @param premiere_dimension
     * @param deuxieme_dimension 
     */
    private void acheterEtPoserCloture(Joueur joueur, int type, int indice){
        this.joueur_sur_case = joueur;
        this.joueur_sur_case.getRessources().getBois().consommer(1);
        joueur.getPlateauJoueur().poserCloture(type, indice);
    }
}

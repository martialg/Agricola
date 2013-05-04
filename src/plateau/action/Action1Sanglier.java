package plateau.action;

import joueur.Joueur;
import ressources.Sanglier;

public class Action1Sanglier extends RessourceCumulable {

    public Action1Sanglier(){
        super();
        this.multiplicateur = 1;
    }

    public Sanglier moutonsRetournes(Joueur joueur){
        Sanglier sanglier = new Sanglier(this.quantite_cumulee);
        this.prendreLesRessource();
        this.joueur_sur_case = joueur;
        return sanglier;
    }
    /*
    public boolean action(Joueur joueur) {
        //si le joueur à de quoi cuire
        for(AmenagementMajeur amenagement_joue : joueur.getCartes().getAmenagementMajeursJoues()){
            if((amenagement_joue.getSymbole()== Symbole.BOULANGERIE_CUISSON) || (amenagement_joue.getSymbole()== Symbole.CUISSON)){
                //choix de l'amenagement de cuisson
            }
        }
        //si il a de la place dans un paturage ou s'il doit les ranger dans la reserve
        int nombre_sanglier = joueur.getRessources().getSanglier().getQuantite();
        int nouveau_nombre_sanglier = nombre_sanglier + this.quantite_cumulee;
        if(joueur.nombreDePlacePaturage() >= nouveau_nombre_sanglier){
            joueur.getRessources().getSanglier().ajouter(quantite_cumulee);
        } 
        
        //recuperation des ressources
        this.prendreLesRessource();
        
        return true;
    }
    */
}

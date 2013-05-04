package carte;

import joueur.Joueur;
import ressources.Bois;
import ressources.Pierre;
import agricola.Agricola;
import plateau.Plateau;
public class MajeurPuits extends AmenagementMajeur{
    
    public MajeurPuits(){
        super();
        this.symbole = Symbole.AUCUN;
        this.points = 4;
        this.ressources_necessaires.add(new Bois(1));
        this.ressources_necessaires.add(new Pierre(3));
    }
    
    @Override
    public boolean attribuer(Joueur joueur){
        boolean reussit = this.attribuerAUnJoueur(joueur);
        if(reussit){
            //i est le numero du tour (et non la position dans la liste)
            for(int i = Agricola.getTourCourant()+1; i <= Agricola.getTourCourant() + 5; i++){
                if(i <= 14)
                Agricola.ajouterNourritureJoueurSurTour(i, this.joueur, 1);
            }
            return true;
        }else{
            return false;
        }
    }
}

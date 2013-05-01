package joueur;

import ressources.Ressource;

public class Joueur {
    private String nom;
    private Couleur couleur;
    private PlateauJoueur plateau;
    private Ressource ressources;
    private CarteJoueur cartes;
    
    public Ressource getRessources(){
        return this.ressources;
    }

    public CarteJoueur getCartesJoueur(){
        return this.cartes;
    }

    public int nombreDePlacePaturage() {
        return 0;
    }
    
}

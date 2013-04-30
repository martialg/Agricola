package joueur;

import ressources.Ressource;

public class Joueur {
    private String nom;
    private Couleur couleur;
    private PlateauJoueur plateau;
    private Ressource ressources;
    private CarteJoueur cartes;
    
    public Joueur(String nom, Couleur couleur){
        this.nom = nom;
        this.couleur = couleur;
        this.plateau = new PlateauJoueur();
        this.ressources = new Ressource();
        this.cartes = new CarteJoueur();
    }
}

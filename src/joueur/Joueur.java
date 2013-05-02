package joueur;

import java.util.ArrayList;
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

    public Ressource getRessources(){
        return this.ressources;
    }

    public PlateauJoueur getPlateauJoueur(){
        return this.plateau;
    }
    
    public CarteJoueur getCartes(){
        return this.cartes;
    }
    
    public boolean possedeChampsLibre(){
        ArrayList<Case> liste = new ArrayList<Case>(this.plateau.getListeCase());
        boolean libre = false;
        int i = 0;
        Case temp;
        while(i < liste.size() && !libre){
            temp = liste.get(i);
            if(temp instanceof CaseChamps){
                CaseChamps champ = (CaseChamps)temp;
                if(champ.champsVide())
                    libre = true;
            }
            i++;
        }
        return libre;
    }
}

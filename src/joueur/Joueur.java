package joueur;

import agricola.Agricola;
import carte.AmenagementMajeur;
import java.awt.Color;
import java.util.ArrayList;
import ressources.Ressource;

public class Joueur {

    private String nom;
    private Couleur couleur;
    private PlateauJoueur plateau;
    private Ressource ressources;
    private CarteJoueur cartes;

    public Couleur getCouleur() {
        return this.couleur;
    }

    public Color getInterfaceColor() {
        if (this.couleur == Couleur.BLEU) {
            return new Color(0x006FFF);
        } else if (this.couleur == Couleur.VERT) {
            return new Color(0x08C701);
        }else if(this.couleur == Couleur.ROUGE){
            return new Color(0xDC3333);
        }else if(this.couleur == Couleur.VIOLET){
            return new Color(0xCA00F7);
        }else{
            return new Color(0xFFED8E);
        }
    }

    public String getNom() {
        return this.nom;
    }

    public Joueur(String nom, Couleur couleur) {
        this.nom = nom;
        this.couleur = couleur;
        this.plateau = new PlateauJoueur();
        this.ressources = new Ressource();
        this.cartes = new CarteJoueur();
    }

    public Ressource getRessources() {
        return this.ressources;
    }

    public PlateauJoueur getPlateauJoueur() {
        return this.plateau;
    }

    public CarteJoueur getCartes() {
        return this.cartes;
    }

    public boolean possedeChampsLibre() {
        ArrayList<Case> liste = new ArrayList<Case>(this.plateau.getListeCase());
        boolean libre = false;
        int i = 0;
        Case temp;
        while (i < liste.size() && !libre) {
            temp = liste.get(i);
            if (temp instanceof CaseChamps) {
                CaseChamps champ = (CaseChamps) temp;
                if (champ.champsVide()) {
                    libre = true;
                }
            }
            i++;
        }
        return libre;
    }

    public int compterHabitants() {
        int compteur = 0;

        ArrayList<Case> liste_cases = this.getPlateauJoueur().getListeCase();
        for (Case c : liste_cases) {
            if (c instanceof CaseHabitation) {
                CaseHabitation case_temp = (CaseHabitation) c;
                if (case_temp.getOccupe()) {
                    compteur++;
                }
            }
        }
        compteur += this.getPlateauJoueur().getEnfant();
        compteur += this.getPlateauJoueur().getEnfantSansCaseLibre();
        compteur += this.getPlateauJoueur().getAdulteSansCaseLibre();
        return compteur;
    }

    public boolean peutJouerAmenagementMajeur() {
        for (AmenagementMajeur am : Agricola.getPlateau().getAmenagements()) {
            if (am.attributionPossible(this)) {
                return true;
            }
        }
        return false;
    }
}

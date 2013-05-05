package agricola;

import java.util.ArrayList;
import joueur.Joueur;
import plateau.Periode;
import plateau.Plateau;
import plateau.Tour;

public class Agricola {
    private static ArrayList<Joueur> joueurs;
    private static Plateau plateau;
    private static Joueur premier_joueur;
    private static int tour_courant;

    public static Plateau getPlateau() {
        return plateau;
    }
    
    public static int getTourCourant(){
        return tour_courant;
    }
    
    public static void initialisationAgricola(){
        joueurs = new ArrayList<Joueur>();
    }
    
    public static void ajouterJoueur(Joueur joueur){
        joueurs.add(joueur);
    }
    
    public static void supprimerJoueur(Joueur joueur){
        joueurs.remove(joueur);
    }
    
    public static ArrayList<Joueur> getJoueurs(){
        return joueurs;
    }
    
    public static void ajouterNourritureJoueurSurTour(int numero_tour, Joueur joueur, int quantite){
        ArrayList<Periode> periodes = plateau.getPeriodes();
        boolean trouve = false;
        int i = 0;
        while(!trouve && i < periodes.size()){
            ArrayList<Tour> tours = periodes.get(i).getTours();
            int j = 0;
            while(!trouve && j < tours.size()){
                Tour tour_temp = tours.get(j);
                if(tour_temp.getNumero() == numero_tour){
                    tour_temp.ajouterNourriturePourJoueur(joueur, quantite);
                    trouve = true;
                }
                j++;
            }
            i++;
        }
    } 
    
    public static void setPremierJoueur(Joueur nouveau_premier_joueur){
        premier_joueur = nouveau_premier_joueur;
    }
    
    
}

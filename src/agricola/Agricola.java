package agricola;

import java.util.ArrayList;
import joueur.Case;
import joueur.Joueur;
import plateau.Periode;
import plateau.Plateau;
import plateau.Tour;
import plateau.action.CaseAction;
import plateau.action.RessourceCumulable;

public class Agricola {
    private static ArrayList<Joueur> joueurs;
    private static Plateau plateau;
    private static Joueur premier_joueur;
    private static Joueur joueur_courant;
    private static Periode periode_courante;
    private static Tour tour_courant;

    public static Plateau getPlateau() {
        return plateau;
    }
    
    public static Tour getTourCourant(){
        return tour_courant;
    }
    
    public static void initialisationAgricola(){
        joueurs = new ArrayList<Joueur>();
        plateau = new Plateau();
        premier_joueur = null;
        joueur_courant = null;
        periode_courante = plateau.getPeriodes().get(0);
        tour_courant = periode_courante.getTour(0);
    }
    
    public static Joueur getJoueurCourant(){
        return joueur_courant;
    }
    public static void ajouterJoueur(Joueur joueur){
        joueurs.add(joueur);
        if(premier_joueur == null){
            premier_joueur = joueur;
        }
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
    
    public static void debutDeTour(){
        joueur_courant = premier_joueur;
        reaprovisionnerCases();
        /*ArrayList<Tour> temp_tours = periode_courante.getTours();
        if(temp_tours.size() - 1 > temp_tours.indexOf(tour_courant)){
            tour_courant = temp_tours.get(temp_tours.indexOf(tour_courant) + 1);
        }else{
            periode_courante = plateau.getPeriodeSuivante(periode_courante);
            tour_courant = periode_courante.getTour(0);
        }*/
    }
    
    public static void joueurSuivant(){
        int place = joueurs.indexOf(joueur_courant);
        place++;
        if(joueurs.size() == place){
            joueur_courant = joueurs.get(0);
        }else{
            joueur_courant = joueurs.get(place);
        }
    }
    
    public static void finDeTour(){
        if(tour_courant.getNumero() == 4 || tour_courant.getNumero() == 7 || tour_courant.getNumero() == 9 
                || tour_courant.getNumero() == 11 || tour_courant.getNumero() == 13){
            //fin de periode
            //nourrir pour chaque joueur
            
        }else if(tour_courant.getNumero() == 14){
            
            //fin de partie
        }else{
            //fin de tour normal();
            
        }
    }
    
    public static void reaprovisionnerCases(){
        ArrayList<CaseAction> liste = new ArrayList<CaseAction>(plateau.getActions_Fixes());
        for(CaseAction ca : liste){
            if(ca instanceof RessourceCumulable){
                    ((RessourceCumulable)ca).debutTour();
            }
        }
        ArrayList<Periode> liste_periodes = plateau.getPeriodes();
        Periode periode_temp;
        Tour tour_temp;
        int i = 0;
        int j;
        boolean fin = false;
        while(!fin){
            periode_temp = liste_periodes.get(i);
            ArrayList<Tour> liste_tours = periode_temp.getTours();
            j = 0;
            while(j < liste_tours.size() && !fin){
                tour_temp = liste_tours.get(j);
                if(tour_temp == tour_courant){
                    fin = true;
                }
                if(tour_temp.getAction() instanceof RessourceCumulable){
                    ((RessourceCumulable)tour_temp.getAction()).debutTour();
                }
            }
        }
    }
}

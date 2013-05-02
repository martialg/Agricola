package carte;

import java.util.ArrayList;
import joueur.Joueur;
import ressources.Argile;
import ressources.Bois;
import ressources.MatierePremiere;
import ressources.Pierre;
import ressources.Ressource;
import ressources.Roseau;
import agricola.Agricola;

public class AmenagementMajeur {
    protected Symbole symbole;
    protected int points;
    protected ArrayList<MatierePremiere> ressources_necessaires;
    protected Joueur joueur;
    
    public boolean attribuer(Joueur joueur){
        return this.attribuerAUnJoueur(joueur);
    }
    
    /**
     * Méthode qui attribue un amenagement au joueur
     * suppression dans l'arraylist de plateua
     * ajout dans l'arraylist de joueur
     * attribution de joueur a la carte
     * consomme les prerequis
     * @param joueur
     * @return 
     */
    protected boolean attribuerAUnJoueur(Joueur joueur){
        if(this.ressources_necessaires.isEmpty()){
            this.joueur = joueur;
            this.joueur.getCartes().addAmenagementsMajeursJoues(this);
            Agricola.getPlateau().getAmenagements().remove(this);
            return true;
        }else{
            Ressource ressources_joueur = joueur.getRessources();
            if(this.attributionPossible(joueur)){
                for(MatierePremiere mp : this.ressources_necessaires){
                    if(mp instanceof Argile){
                        ressources_joueur.getArgile().consommer(mp.getQuantite());
                    }else if(mp instanceof Pierre){
                        ressources_joueur.getPierre().consommer(mp.getQuantite());
                    }else if(mp instanceof Bois){
                        ressources_joueur.getBois().consommer(mp.getQuantite());
                    }else if(mp instanceof Roseau){
                        ressources_joueur.getRoseau().consommer(mp.getQuantite());
                    }
                }
                this.joueur = joueur;
                this.joueur.getCartes().addAmenagementsMajeursJoues(this);
                Agricola.getPlateau().getAmenagements().remove(this);
                return true;
            }else{
                return false;
            }
        }
    }
    
    public boolean attributionPossible(Joueur joueur){
        if(this.ressources_necessaires.isEmpty()){
            return true;
        }else{
            Ressource ressources_joueur = joueur.getRessources();
            boolean possible = true;
            for(MatierePremiere mp : this.ressources_necessaires){
                if(mp instanceof Argile){
                    if(ressources_joueur.getArgile().getQuantite() < mp.getQuantite())
                        possible = false;
                }else if(mp instanceof Pierre){
                    if(ressources_joueur.getPierre().getQuantite() < mp.getQuantite())
                        possible = false;
                }else if(mp instanceof Bois){
                    if(ressources_joueur.getBois().getQuantite() < mp.getQuantite())
                        possible = false;
                }else if(mp instanceof Roseau){
                    if(ressources_joueur.getRoseau().getQuantite() < mp.getQuantite())
                        possible = false;
                }
            }
            return possible;
        }
    }
    
    public AmenagementMajeur(){
        ressources_necessaires = new ArrayList<MatierePremiere>();
        joueur = null;
    }
    
    protected Symbole getSymbole(){
        return this.symbole;
    }
}
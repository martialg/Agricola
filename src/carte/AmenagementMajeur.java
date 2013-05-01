package carte;

import java.util.ArrayList;
import joueur.Joueur;
import ressources.Argile;
import ressources.Bois;
import ressources.MatierePremiere;
import ressources.Pierre;
import ressources.Ressource;
import ressources.Roseau;

public class AmenagementMajeur {
    protected Symbole symbole;
    protected int points;
    protected ArrayList<MatierePremiere> ressources_necessaires;
    protected Joueur joueur;
    
    public boolean attribuer(Joueur joueur){
        return this.attribuerAUnJoueur(joueur);
    }
    
    protected boolean attribuerAUnJoueur(Joueur joueur){
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
            if(possible){
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
                return true;
            }else{
                return false;
            }
        }
    }
    
    public AmenagementMajeur(){
        ressources_necessaires = new ArrayList<MatierePremiere>();
        joueur = null;
    }
    
    public Symbole getSymbole(){
        return this.symbole;
    }
}
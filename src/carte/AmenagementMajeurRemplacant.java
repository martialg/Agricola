package carte;

import joueur.Joueur;
import ressources.Argile;
import ressources.Bois;
import ressources.MatierePremiere;
import ressources.Pierre;
import ressources.Ressource;
import ressources.Roseau;
import agricola.Agricola;

public class AmenagementMajeurRemplacant extends AmenagementMajeur{

    
    public AmenagementMajeurRemplacant(){
        super();
    }
    

    protected boolean attribuerAUnJoueurDefausse(Joueur joueur, AmenagementMajeur amenagement_majeur){
        this.joueur = joueur;
        this.joueur.getCartes().addAmenagementsMajeursJoues(this);
        Agricola.getPlateau().getAmenagements().remove(this);
        Agricola.getPlateau().getAmenagements().add(amenagement_majeur);
        this.joueur.getCartes().removeAmenagementsMajeursJoues(amenagement_majeur);
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

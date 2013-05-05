package plateau;

import java.util.HashMap;
import joueur.Joueur;
import plateau.action.CaseAction;

public class Tour {
    private int numero;
    private CaseAction action;
    private HashMap<Joueur, Integer> nourriture_pour_joueur;
    
    public Tour(int numero, CaseAction action){
        this.numero = numero;
        this.action = action;
        this.nourriture_pour_joueur = new HashMap<Joueur, Integer>();
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public CaseAction getAction(){
        return this.action;
    }
    
    public void ajouterNourriturePourJoueur(Joueur joueur, Integer quantite){
        this.nourriture_pour_joueur.put(joueur, quantite);
    }
}

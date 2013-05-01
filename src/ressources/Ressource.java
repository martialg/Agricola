package ressources;

public class Ressource {
    //en commentaire nombre par défaut au début du jeu
    private int nb_membres_famille; //5
    private int nb_clotures; //15
    private int nb_etables; //4
    private int nourriture; //3    
    
    //Matières 1ères
    private Bois bois;
    private Argile argile;
    private Pierre pierre;
    private Roseau roseau;
    
    private Cereale cereale;
    private Legume legume;
    
    private Mouton mouton;
    private Sanglier sanglier;
    private Boeuf boeuf;
    
    public Sanglier getSanglier(){
        return sanglier;
    }
       
}

package ressources;

public class Ressource {
    private int nb_membres_famille;
    private int nb_clotures;
    private int nb_etables;
    private int nourriture;    
    
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
       

    public Ressource(){
        this.nb_membres_famille = 3; //3 car 2 utilisés à l'initialisation
        this.nb_clotures = 15;
        this.nb_etables = 4;
        this.nourriture = 3;
        
        this.bois = new Bois();
        this.argile = new Argile();
        this.pierre = new Pierre();
        this.roseau = new Roseau();
        
        this.cereale = new Cereale();
        this.legume = new Legume();
        
        this.mouton = new Mouton();
        this.sanglier = new Sanglier();
        this.boeuf = new Boeuf();
    }
    

}

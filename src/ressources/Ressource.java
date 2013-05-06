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

    public int getNourriture() {
        return this.nourriture;
    }

    public Bois getBois() {
        return this.bois;
    }

    public Argile getArgile() {
        return this.argile;
    }

    public Pierre getPierre() {
        return this.pierre;
    }

    public Roseau getRoseau() {
        return this.roseau;
    }

    public Legume getLegume() {
        return this.legume;
    }

    public Cereale getCereale() {
        return this.cereale;
    }
    
    public Mouton getMouton() {
        return this.mouton;
    }

    public Boeuf getBoeuf() {
        return this.boeuf;
    }
    

    public Sanglier getSanglier(){
        return this.sanglier;
    }
       
    

    public Ressource(){
        this.nb_membres_famille = 3;
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
    
    public void ajouterNourriture(int quantite){
        this.nourriture += quantite;
    }
    
    public int getNbMembresFamille(){
        return this.nb_membres_famille;
    }

    public int getNbCloture(){
        return this.nb_clotures;
    }
    
    public int getNbEtable(){
        return this.nb_etables;
    }
}

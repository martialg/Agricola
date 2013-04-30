package ressources;

public class MatierePremiere {
    protected int quantite;
    
    public MatierePremiere(){
        this.quantite = 0;
    }
    
    public MatierePremiere(int quantite){
        this.quantite = quantite;
    }
    
    public void consommer(int quantite){
        this.quantite -= quantite;
    }
    
    public void ajouter(int quantite){
        this.quantite += quantite;
    }
}

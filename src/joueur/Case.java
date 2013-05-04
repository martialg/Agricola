package joueur;

public class Case {
    private int numero_case;
    private boolean bordure_haut;
    private boolean bordure_bas;
    private boolean bordure_gauche;
    private boolean bordure_droite;
    public Case(int num){
        this.numero_case = num;
    }
    
    public void setBordureHaut(boolean choix){
        this.bordure_haut = choix;
    }
    
    public void setBordureBas(boolean choix){
        this.bordure_bas = choix;
    }
    
    public void setBordureGauche(boolean choix){
        this.bordure_gauche = choix;
    }
    
    public void setBordureDroite(boolean choix){
        this.bordure_droite= choix;
    }
    
    
    public boolean equal(Object obj){
        if(obj == null){
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Case other = (Case) obj;
        if(this.numero_case != other.getNumeroCase()){
            return false;
        }
        return true;
    }
    
    public int getNumeroCase(){
        return this.numero_case;
    }
}

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

    public int getNumeroCase() {
        return numero_case;
    }

    public boolean getBordureHaut() {
        return bordure_haut;
    }

    public boolean getBordureBas() {
        return bordure_bas;
    }

    public boolean getBordureGauche() {
        return bordure_gauche;
    }

    public boolean getBordureDroite() {
        return bordure_droite;
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
    
}

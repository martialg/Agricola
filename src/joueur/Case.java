package joueur;

public class Case {
    private int numero_case;
    
    public Case(int num){
        this.numero_case = num;
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

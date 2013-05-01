package plateau;

import plateau.action.CaseAction;

public class Tour {
    private int numero;
    private CaseAction action;
    
    public Tour(int numero, CaseAction action){
        this.numero = numero;
        this.action = action;
    }
}

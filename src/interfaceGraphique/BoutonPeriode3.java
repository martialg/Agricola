package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import plateau.action.CaseAction;

class BoutonPeriode3 extends BoutonPeriode implements ActionListener{

    public BoutonPeriode3(CaseAction case_action){
        super(case_action);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
package interfaceGraphique;

import carte.AmenagementMajeur;
import javax.swing.JButton;
import plateau.action.CaseAction;

public class BoutonPeriode extends JButton{
    private CaseAction case_action;
    
    public BoutonPeriode(CaseAction case_action){
        this.case_action = case_action;
    }
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    public void setCaseAction(CaseAction case_action){
        this.case_action = case_action;
    }
    
    public CaseAction getCaseAction(){
        return this.case_action;
    }
    
}

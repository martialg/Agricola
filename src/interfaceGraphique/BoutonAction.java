package interfaceGraphique;

import javax.swing.JButton;

public class BoutonAction extends JButton{
    
    public BoutonAction(){
    }
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
}

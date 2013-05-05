package interfaceGraphique;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import plateau.action.ActionEtablePain;

public class BoutonEtablePain extends JButton implements ActionListener{
    private ActionEtablePain action;

    public BoutonEtablePain(String nom){
        super();
        action = new ActionEtablePain();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}

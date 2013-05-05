package interfaceGraphique;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import plateau.action.ActionLabourer;

public class BoutonLabourer extends JButton implements ActionListener{
    private ActionLabourer action;

    public BoutonLabourer(String nom){
        super();
        action = new ActionLabourer();
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

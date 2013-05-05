package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import plateau.action.ActionPeche;

public class BoutonPeche extends JButton implements ActionListener{
    private ActionPeche action;

    public BoutonPeche(String nom){
        super();
        action = new ActionPeche();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " +this.action.getQuantiteCumulee() + " nourriture ?"); 
        if(result == 0)
            this.action.action(Agricola.getJoueurCourant());
    }
    
}

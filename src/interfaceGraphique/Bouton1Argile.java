package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import plateau.action.Action1Argile;

public class Bouton1Argile extends JButton implements ActionListener{
    private Action1Argile action;

    public Bouton1Argile(String nom){
        super();
        action = new Action1Argile();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " +this.action.getQuantiteCumulee() + " argile ?"); 
        if(result == 0)
            this.action.action(Agricola.getJoueurCourant());
    }
    
}

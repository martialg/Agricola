package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import plateau.action.Action3Bois;

public class Bouton3Bois extends JButton implements ActionListener{
    private Action3Bois action;

    public Bouton3Bois(String nom){
        super();
        action = new Action3Bois();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " +this.action.getQuantiteCumulee() + " bois ?"); 
        if(result == 0)
            this.action.action(Agricola.getJoueurCourant());
    }
    
}

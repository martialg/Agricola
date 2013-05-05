package interfaceGraphique;

import javax.swing.JButton;
import plateau.action.Action1Cereale;
import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton1Cereale extends JButton implements ActionListener{
    private Action1Cereale action;
    
    public Bouton1Cereale(String nom) {
        super();
        this.setName(nom);
        action = new Action1Cereale();
        addActionListener(this);
    }

    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.action.action(Agricola.getJoueurCourant());
    }
    
}

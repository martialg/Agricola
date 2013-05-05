package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import plateau.action.ActionPremierJoueur;

public class BoutonPremierJoueur extends JButton implements ActionListener{
    private ActionPremierJoueur action;
    public BoutonPremierJoueur(String nom) {
        super();
        this.setName(nom);
        action = new ActionPremierJoueur();
        addActionListener(this);
    }

    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous devenir le premier joueur ?"); 
        // oui = 0, non = 1 annuler = 2
        if(result == 0){
            action.action(Agricola.getJoueurCourant());
        }
    }
    

}

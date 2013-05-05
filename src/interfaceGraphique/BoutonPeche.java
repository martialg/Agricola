package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.ActionPeche;

public class BoutonPeche extends BoutonAction implements ActionListener {

    private ActionPeche action;

    public BoutonPeche(String nom, ActionPeche action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " nourriture ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
        }
    }
}

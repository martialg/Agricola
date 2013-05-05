package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action1Roseau;

public class Bouton1Roseau extends BoutonAction implements ActionListener {

    private Action1Roseau action;

    public Bouton1Roseau(String nom, Action1Roseau action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " roseau ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
        }
    }
}

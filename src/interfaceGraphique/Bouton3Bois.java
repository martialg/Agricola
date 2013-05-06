package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action3Bois;

public class Bouton3Bois extends BoutonAction implements ActionListener {

    private Action3Bois action;

    public Bouton3Bois(String nom, Action3Bois action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
    public void ajoutBois() {
        PionBois pionbois = new PionBois();
        pionbois.setVisible(true);
        int x = this.getX();
        int y = this.getY();
        pionbois.setBounds(x + 20, y + 20, 40, 40);
        InterfacePlateau.getFrame().add(pionbois);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " bois ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
            ajoutBois();
        }
    }
}

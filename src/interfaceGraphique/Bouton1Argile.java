package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action1Argile;

public class Bouton1Argile extends BoutonAction implements ActionListener {

    private Action1Argile action;
    private PionArgile pionargile;

    public Bouton1Argile(String nom, Action1Argile action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
     public void ajoutArgile() {
        this.pionargile = new PionArgile();
        pionargile.setVisible(true);
        int x = this.getX();
        int y = this.getY();
        pionargile.setBounds(x + 130, y + 40, 40, 40);
        InterfacePlateau.getFrame().add(pionargile);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " argile ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
            this.pionargile.setVisible(false);
        }
    }
}

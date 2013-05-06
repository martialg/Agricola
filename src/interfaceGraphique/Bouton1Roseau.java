package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action1Roseau;

public class Bouton1Roseau extends BoutonAction implements ActionListener {

    private Action1Roseau action;
    private PionRoseau pionroseau;

    public Bouton1Roseau(String nom, Action1Roseau action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
     public void ajoutRoseau() {
        this.pionroseau = new PionRoseau();
        pionroseau.setVisible(true);
        int x = this.getX();
        int y = this.getY();
        pionroseau.setBounds(x + 20, y + 40, 40, 40);
        InterfacePlateau.getFrame().add(pionroseau);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " roseau ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
            this.pionroseau.setVisible(false);
        }
    }
}

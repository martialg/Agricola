package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action3Bois;

public class Bouton3Bois extends BoutonAction implements ActionListener {

    private Action3Bois action;
    private PionBois pionbois1;
    private PionBois pionbois2;
    private PionBois pionbois3;

    public Bouton3Bois(String nom, Action3Bois action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
    
    public void ajoutBois() {
        int x = this.getX();
        int y = this.getY();
        
        this.pionbois1 = new PionBois();
        pionbois1.setVisible(true);
        pionbois1.setBounds(x + 20, y + 20, 40, 40);
        this.pionbois2 = new PionBois();
        pionbois2.setVisible(true);
        pionbois2.setBounds(x + 20, y + 40, 40, 40);
        this.pionbois3 = new PionBois();
        pionbois3.setVisible(true);
        pionbois3.setBounds(x + 20, y + 60, 40, 40);
        
        InterfacePlateau.getFrame().add(pionbois1);
        InterfacePlateau.getFrame().add(pionbois2);
        InterfacePlateau.getFrame().add(pionbois3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " + this.action.getQuantiteCumulee() + " bois ?");
        if (result == 0) {
            this.action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
            this.pionbois1.setVisible(false);
            this.pionbois2.setVisible(false);
            this.pionbois3.setVisible(false);
        }
    }
}

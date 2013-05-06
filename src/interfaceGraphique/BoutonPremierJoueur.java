package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.ActionPremierJoueur;

public class BoutonPremierJoueur extends BoutonAction implements ActionListener{
    private ActionPremierJoueur action;
    private PionNourriture pionnourriture;
    
    public BoutonPremierJoueur(String nom, ActionPremierJoueur action){
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }

    public void ajoutPremierJoueur() {
        this.pionnourriture = new PionNourriture();
        this.pionnourriture.setVisible(true);
        int x = this.getX();
        int y = this.getY();
        this.pionnourriture.setBounds(x + 130, y + 40, 40, 40);
        InterfacePlateau.getFrame().add(pionnourriture);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous devenir le premier joueur ?"); 
        // oui = 0, non = 1 annuler = 2
        if(result == 0){
            action.action(Agricola.getJoueurCourant());
            this.ajoutBouton();
            this.passeLaMain();
            this.pionnourriture.setVisible(false);
        }
    }
    

}

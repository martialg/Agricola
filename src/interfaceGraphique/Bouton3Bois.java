package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action3Bois;

public class Bouton3Bois extends BoutonAction implements ActionListener{
    private Action3Bois action;

    public Bouton3Bois(String nom){
        super();
        this.setName(nom);
        action = new Action3Bois();
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " +this.action.getQuantiteCumulee() + " bois ?"); 
        Color c = Agricola.getJoueurCourant().getInterfaceColor();
        GradientCircularButton gci = new GradientCircularButton(Agricola.getJoueurCourant().getNom(), c);
        gci.setVisible(true);
        int x = this.getX();
        int y = this.getY();
        gci.setBounds(x+50, y+10, 100, 100);
        InterfacePlateau.getFrame().add(gci);
        if(result == 0)
            this.action.action(Agricola.getJoueurCourant());
    }
    
}

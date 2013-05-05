package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import plateau.action.Action1Argile;

public class Bouton1Argile extends BoutonAction implements ActionListener{
    private Action1Argile action;

    public Bouton1Argile(String nom){
        super();
        this.setName(nom);
        action = new Action1Argile();
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Voulez vous prendre " +this.action.getQuantiteCumulee() + " argile ?"); 
        if(result == 0)
            this.action.action(Agricola.getJoueurCourant());
    }
    
}
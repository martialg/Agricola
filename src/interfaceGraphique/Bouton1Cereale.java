package interfaceGraphique;

import javax.swing.JButton;
import plateau.action.Action1Cereale;
import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton1Cereale extends BoutonAction implements ActionListener{
    private Action1Cereale action;
    
    public Bouton1Cereale(String nom){
        super();
        this.setName(nom);
        action = new Action1Cereale();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.action.action(Agricola.getJoueurCourant());
    }
    
}

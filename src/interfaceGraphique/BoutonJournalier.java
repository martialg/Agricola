package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import plateau.action.ActionJournalier;

public class BoutonJournalier extends BoutonAction implements ActionListener {

    private ActionJournalier action;

    public BoutonJournalier(String nom, ActionJournalier action) {
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] message = {"", "bois", "roseau", "argile", "pierre"};
        JComboBox box = new JComboBox(message);
        JOptionPane.showMessageDialog(null, box, "Quel type de ressource voulez vous une unité ?", JOptionPane.PLAIN_MESSAGE); 
        String result = box.getSelectedItem().toString();
        if(result.compareTo("") != 0){
            this.action.action(Agricola.getJoueurCourant(), result);
            this.ajoutBouton();
            this.passeLaMain();
        }
    }
}

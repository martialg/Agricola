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

    public BoutonJournalier(String nom) {
        super();
        this.setName(nom);
        action = new ActionJournalier();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] message = {"bois", "roseau", "argile", "pierre"};
        JOptionPane.showMessageDialog(null, new JComboBox(message), "Quel type de ressource voulez vous une unité ?", JOptionPane.PLAIN_MESSAGE);
        this.ajoutBouton();
    }
}

package interfaceGraphique;

import agricola.Agricola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import plateau.action.ActionJournalier;
import plateau.action.ActionPeche;

public class BoutonJournalier extends JButton implements ActionListener{
    private ActionJournalier action;

    public BoutonJournalier(String nom){
        super();
        action = new ActionJournalier();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String[] message = {"bois", "roseau", "argile", "pierre"};
        JOptionPane.showMessageDialog(null, new JComboBox(message), "Quel type de ressource voulez vous une unité ?", JOptionPane.PLAIN_MESSAGE);  
        
    }
    
}

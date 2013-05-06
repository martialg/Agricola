package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import javax.swing.JButton;
import joueur.Joueur;

public class BoutonAction extends JButton {

    public BoutonAction() {
    }

    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }

    protected void ajoutBouton() {
        if (Agricola.getJoueurCourant().peutPlacerHabitants()) {
            Color c = Agricola.getJoueurCourant().getInterfaceColor();
            GradientCircularButton gci = new GradientCircularButton(Agricola.getJoueurCourant().getNom(), c);
            gci.setVisible(true);
            int x = this.getX();
            int y = this.getY();
            gci.setBounds(x + 50, y + 10, 100, 100);
            InterfacePlateau.getFrame().add(gci);
        }
    }

    protected void passeLaMain() {
        Agricola.joueurSuivant();
        InterfacePlateau.afficheBoutonJoueurPresent();
        InterfacePlateau.getFrame().revalidate();
        InterfacePlateau.getFrame().repaint();
        //InterfacePlateau.repaint(InterfacePlateau.getGraphics());
    }
}

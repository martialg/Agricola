package interfaceGraphique;

import agricola.Agricola;
import carte.AmenagementMajeur;
import java.awt.Color;
import javax.swing.JButton;
import plateau.action.CaseAction;

public class BoutonPeriode extends JButton {

    private CaseAction case_action;

    public BoutonPeriode(CaseAction case_action) {
        this.case_action = case_action;
    }

    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }

    public void setCaseAction(CaseAction case_action) {
        this.case_action = case_action;
    }

    public CaseAction getCaseAction() {
        return this.case_action;
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
    }
}

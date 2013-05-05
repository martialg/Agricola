package interfaceGraphique;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JDialog;

public class BoutonPremierJoueur extends JButton implements MouseListener{

    public BoutonPremierJoueur(String nom) {
        super();
    }

    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {}

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {}

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("test");
        DialogConfirm dc = new DialogConfirm("Voulez vous devenir le premier joueur ?");
        JDialog dialog = dc.createDialog(this.getParent(), "Confirmation");
        dialog.setVisible(true);
    }
    
    @Override
    public void mousePressed(MouseEvent e) {}
    
    @Override
    public void mouseReleased(MouseEvent e) {}
}

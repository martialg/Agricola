package interfaceGraphique;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class Bouton1Cereale extends JButton implements MouseListener{
    private static JButton bouton;

    public Bouton1Cereale(String nom) {
        super();
        bouton = new JButton();
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
    public void mouseClicked(MouseEvent e){}
    
    @Override
    public void mousePressed(MouseEvent e) {}
    
    @Override
    public void mouseReleased(MouseEvent e) {}
}

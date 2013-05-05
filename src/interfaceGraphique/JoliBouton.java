package interfaceGraphique;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JoliBouton extends JButton implements MouseListener {

    private static JButton bouton;
    private static Image img_normal;
    private static Image img_over;

    public JoliBouton(String nom) {
        super();
        bouton = new JButton();
        this.setText(nom);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
    }

    protected void createButton() {
        try {
            img_normal = ImageIO.read(new File("images/button.png"));
            img_over = ImageIO.read(new File("images/button-over.png"));
            this.setIcon(new ImageIcon(img_normal));
            this.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
            Color c = new Color(0x643E1D);
            this.setForeground(c);
            this.setFocusPainted(false);
            this.setBorderPainted(false);
            this.setContentAreaFilled(false);       
        } catch (IOException ex) {
            Logger.getLogger(JoliBouton.class.getName()).log(Level.SEVERE, null, ex);
        }
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

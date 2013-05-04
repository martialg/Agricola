package interfaceGraphique;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JoliBouton extends JButton implements MouseListener {

    private static JButton bouton;
    private static Image img_normal;
    private static Image img_over;

    public JoliBouton(String nom) {
        super();
        bouton = new JButton();
        bouton.setText(nom);

    }

    @Override
    protected void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            img_normal = ImageIO.read(new File("images/button.png"));
            img_over = ImageIO.read(new File("images/button-over.png"));
            bouton.setIcon(new ImageIcon(img_normal));
            bouton.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
            bouton.setHorizontalTextPosition(JButton.CENTER);
            bouton.setVerticalTextPosition(JButton.CENTER);
            Color c = new Color(0x643E1D);
            bouton.setForeground(c);
            bouton.setFocusPainted(false);
            bouton.setBorderPainted(false);
            bouton.setContentAreaFilled(false);
        } catch (IOException ex) {
            Logger.getLogger(JoliBouton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        bouton.setIcon(new ImageIcon(img_over));
        Color c = new Color(0xDA6C0D);
        bouton.setForeground(c);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        bouton.setIcon(new ImageIcon(img_normal));
        Color c = new Color(0x643E1D);
        bouton.setForeground(c);
    }

    //}
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

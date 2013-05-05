package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import joueur.Joueur;

public class InterfacePlateauJoueur extends JPanel implements MouseListener, ActionListener {

    private JFrame fenetre;
    private BufferedImage background;
    private InterfacePlateauJoueur plateau_joueur;
    private ArrayList<GradientCircularButton> pions;
    private Joueur joueur;
    

    public InterfacePlateauJoueur(Joueur j) {
        try {
            background = ImageIO.read(new File("images/plateau-joueur-base.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfacePlateauJoueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        joueur = j;
        fenetre = new JFrame(joueur.getNom());
        fenetre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fenetre.setSize(600, 458);
        fenetre.setContentPane(this);
        //Color c1 = new Color(0xC96D1C);
        //fenetre.getContentPane().setBackground(c1);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(fenetre.getParent());
        fenetre.setVisible(false);
    }
    
    public void setVisibleTrue(){
        fenetre.setVisible(true);
    }
    
    public void setVisibleFalse(){
        fenetre.setVisible(false);
    }
    
    
    
    public void affichePions(){
        
    }

    public void affichage() {
        
        plateau_joueur = new InterfacePlateauJoueur(joueur);
        plateau_joueur.setOpaque(true);
        plateau_joueur.setLayout(null);
        
    }

    public void start() throws IOException {
        InterfacePlateau.affichage();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - background.getWidth()) / 2;
        int y = (getHeight() - background.getHeight()) / 2;
        g.drawImage(background, x, y, this);
    }
}

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

    private static JFrame fenetre;
    private static BufferedImage background;
    private static InterfacePlateauJoueur plateau_joueur;
    private static ArrayList<GradientCircularButton> pions;
    private static Joueur joueur;

    public InterfacePlateauJoueur() {
        try {
            background = ImageIO.read(new File("images/plateau-joueur-base.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfacePlateauJoueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fenetre.setSize(600, 458);
        fenetre.setContentPane(this);
        //Color c1 = new Color(0xC96D1C);
        //fenetre.getContentPane().setBackground(c1);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(fenetre.getParent());
        fenetre.setVisible(true);

    }
    
    public static void intialisationNbPion(){
        pions = new ArrayList<GradientCircularButton>();
        pions.add(new GradientCircularButton("Joueur",new Color(0xDC3333)));
        pions.add(new GradientCircularButton("Joueur",new Color(0xDC3333)));
    }
    
    public static void affichePions(){
        
    }

    public static void affichage() {
        
        
        
        //fenetre principale
        plateau_joueur = new InterfacePlateauJoueur();
        plateau_joueur.setOpaque(true);
        plateau_joueur.setLayout(null);
    }

    public static void start() throws IOException {
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
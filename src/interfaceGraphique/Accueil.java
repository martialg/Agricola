package interfaceGraphique;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Accueil extends JPanel implements ActionListener {

    private static JFrame fenetre;
    private static BufferedImage background;
    private static Accueil accueil;
    private static JoliBouton bouton_fermer;
    private static JoliBouton bouton_jouer;
    private static JoliBouton bouton_regle;
    private static JLabel label_choix_joueur;

    
    public Accueil() {
        try {
            background = ImageIO.read(new File("images/background2.png"));
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(660, 420);
        fenetre.setContentPane(this);
        Color c1 = new Color(0xC96D1C);
        fenetre.getContentPane().setBackground(c1);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(fenetre.getParent());
        fenetre.setVisible(true);
    }

    public static void start() throws IOException {
        Accueil.affichage();
    }

    private static void affichage() throws IOException {

        //bouton fermer
        bouton_fermer = new JoliBouton("Fermer");
        bouton_fermer.createButton();
        bouton_fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_fermer.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_fermer.setForeground(c);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_fermer.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_fermer.setForeground(c);
            }
        });
        bouton_fermer.setBounds(260, 310, 123, 41);


        //bouton Regle
        bouton_regle = new JoliBouton("Règle");
        bouton_regle.createButton();
        bouton_regle.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_regle.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_regle.setForeground(c);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_regle.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_regle.setForeground(c);
            }
        });
        bouton_regle.setBounds(260, 240, 123, 41);


        //bouton Jouer
        bouton_jouer = new JoliBouton("Jouer");
        bouton_jouer.createButton();
        bouton_jouer.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_jouer.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_jouer.setForeground(c);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_jouer.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_jouer.setForeground(c);
            }
        });
        bouton_jouer.setBounds(260, 170, 123, 41);

        //Label choix des joueurs
        Image im_lab = ImageIO.read(new File("images/label-background.png"));
        label_choix_joueur = new JLabel("Choix des Joueurs");
        label_choix_joueur.setIcon(new ImageIcon(im_lab));
        label_choix_joueur.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        Color c = new Color(0x643E1D);
        
        label_choix_joueur.setHorizontalTextPosition(JLabel.CENTER);
        label_choix_joueur.setVerticalTextPosition(JLabel.CENTER);
        label_choix_joueur.setForeground(c);
        label_choix_joueur.setBounds(130, 145, 400, 40);
        label_choix_joueur.setVisible(false);
        //bouton ajout 1er joueur
        
        

        //fenetre principale
        accueil = new Accueil();
        accueil.setOpaque(true);
        accueil.setLayout(null);


        //ajout des boutons
        accueil.add(bouton_fermer);
        accueil.add(bouton_jouer);
        accueil.add(bouton_regle);
        accueil.add(label_choix_joueur);

        //ajout des actions
        bouton_regle.addActionListener(accueil);
        bouton_jouer.addActionListener(accueil);
        bouton_fermer.addActionListener(accueil);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        String action = String.valueOf(obj);
        int debut = action.indexOf("text=") + 5;
        int fin = action.indexOf(",defaultCapable=");
        String action_name = action.substring(debut, fin);
        switch (action_name) {
            case "Fermer":
                System.exit(0);
                break;
            case "Jouer":
                bouton_jouer.setVisible(false);
                bouton_fermer.setVisible(false);
                bouton_regle.setVisible(false);
                label_choix_joueur.setVisible(true);
                break;
            case "Règle":
                System.exit(0);
                break;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - background.getWidth()) / 2;
        int y = (getHeight() - background.getHeight()) / 2;
        g.drawImage(background, x, y, this);
    }
}

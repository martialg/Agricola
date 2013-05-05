package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import joueur.Couleur;
import joueur.Joueur;

public class InterfaceAccueil extends JPanel implements ActionListener {

    private static JFrame fenetre;
    private static BufferedImage background;
    private static InterfaceAccueil accueil;
    private static JoliBouton bouton_fermer;
    private static JoliBouton bouton_jouer;
    private static JoliBouton bouton_regle;
    private static JoliBouton bouton_retour;
    private static JoliBouton bouton_lancer;
    private static JLabel label_choix_joueur;
    private static GradientCircularButton joueur_rouge;
    private static GradientCircularButton joueur_vert;
    private static GradientCircularButton joueur_bleu;
    private static GradientCircularButton joueur_violet;
    private static GradientCircularButton joueur_naturel;
    private static Color couleur_rouge_over;
    private static Color couleur_rouge_pressed;
    private static Color couleur_vert_over;
    private static Color couleur_vert_pressed;
    private static Color couleur_bleu_over;
    private static Color couleur_bleu_pressed;
    private static Color couleur_violet_over;
    private static Color couleur_violet_pressed;
    private static Color couleur_naturel_over;
    private static Color couleur_naturel_pressed;
    private static Joueur joueur1;
    private static Joueur joueur2;
    private static Joueur joueur3;
    private static Joueur joueur4;
    private static Joueur joueur5;
    

    public InterfaceAccueil() {
        try {
            background = ImageIO.read(new File("images/background2.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfaceAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        Agricola.initialisationAgricola();
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
        InterfaceAccueil.affichage();
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

        //bouton rouge
        couleur_rouge_over = new Color(0xDC3333);
        couleur_rouge_pressed = new Color(0x8A1919);
        joueur_rouge = new GradientCircularButton("Joueur 1", couleur_rouge_over, couleur_rouge_pressed);
        joueur_rouge.setVisible(false);
        joueur_rouge.setBounds(30, 200, 100, 100);

        //bouton vert
        couleur_vert_over = new Color(0x08C701);
        couleur_vert_pressed = new Color(0x048100);
        joueur_vert = new GradientCircularButton("Joueur 2", couleur_vert_over, couleur_vert_pressed);
        joueur_vert.setVisible(false);
        joueur_vert.setBounds(150, 200, 100, 100);

        //bouton bleu
        couleur_bleu_over = new Color(0x006FFF);
        couleur_bleu_pressed = new Color(0x003479);
        joueur_bleu = new GradientCircularButton("Joueur 3", couleur_bleu_over, couleur_bleu_pressed);
        joueur_bleu.setVisible(false);
        joueur_bleu.setBounds(270, 200, 100, 100);

        //bouton violet
        couleur_violet_over = new Color(0xCA00F7);
        couleur_violet_pressed = new Color(0x71008A);
        joueur_violet = new GradientCircularButton("Joueur 4", couleur_violet_over, couleur_violet_pressed);
        joueur_violet.setVisible(false);
        joueur_violet.setBounds(390, 200, 100, 100);

        //bouton naturel
        couleur_naturel_over = new Color(0xFFED8E);
        couleur_naturel_pressed = new Color(0xFFDE32);
        joueur_naturel = new GradientCircularButton("Joueur 5", couleur_naturel_over, couleur_naturel_pressed);
        joueur_naturel.setVisible(false);
        joueur_naturel.setBounds(510, 200, 100, 100);

        //bouton Retour
        bouton_retour = new JoliBouton("Retour");
        bouton_retour.createButton();
        bouton_retour.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_retour.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_retour.setForeground(c);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_retour.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_retour.setForeground(c);
            }
        });
        bouton_retour.setVisible(false);
        bouton_retour.setBounds(30, 315, 123, 41);

        //bouton Lancer
        bouton_lancer = new JoliBouton("Lancer");
        bouton_lancer.createButton();
        bouton_lancer.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_lancer.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_lancer.setForeground(c);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_lancer.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_lancer.setForeground(c);
            }
        });
        bouton_lancer.setVisible(false);
        bouton_lancer.setBounds(488, 315, 123, 41);


        //fenetre principale
        accueil = new InterfaceAccueil();
        accueil.setOpaque(true);
        accueil.setLayout(null);


        //ajout des boutons
        accueil.add(bouton_fermer);
        accueil.add(bouton_jouer);
        accueil.add(bouton_regle);
        accueil.add(label_choix_joueur);
        accueil.add(joueur_rouge);
        accueil.add(joueur_vert);
        accueil.add(joueur_bleu);
        accueil.add(joueur_violet);
        accueil.add(joueur_naturel);
        accueil.add(bouton_lancer);
        accueil.add(bouton_retour);


        //ajout des actions
        bouton_regle.addActionListener(accueil);
        bouton_jouer.addActionListener(accueil);
        bouton_fermer.addActionListener(accueil);
        bouton_retour.addActionListener(accueil);
        joueur_rouge.addActionListener(accueil);
        joueur_vert.addActionListener(accueil);
        joueur_bleu.addActionListener(accueil);
        joueur_violet.addActionListener(accueil);
        joueur_naturel.addActionListener(accueil);
        bouton_lancer.addActionListener(accueil);
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
                joueur_rouge.setVisible(true);
                joueur_vert.setVisible(true);
                joueur_bleu.setVisible(true);
                joueur_violet.setVisible(true);
                joueur_naturel.setVisible(true);
                bouton_lancer.setVisible(true);
                bouton_retour.setVisible(true);
                break;
            case "Retour":
                bouton_jouer.setVisible(true);
                bouton_fermer.setVisible(true);
                bouton_regle.setVisible(true);
                label_choix_joueur.setVisible(false);
                joueur_rouge.setVisible(false);
                joueur_vert.setVisible(false);
                joueur_bleu.setVisible(false);
                joueur_violet.setVisible(false);
                joueur_naturel.setVisible(false);
                bouton_lancer.setVisible(false);
                bouton_retour.setVisible(false);
                Agricola.supprimerJoueur(joueur1);
                Agricola.supprimerJoueur(joueur2);
                Agricola.supprimerJoueur(joueur3);
                Agricola.supprimerJoueur(joueur4);
                Agricola.supprimerJoueur(joueur5);
                joueur_rouge.setColorGris();
                joueur_vert.setColorGris();
                joueur_bleu.setColorGris();
                joueur_violet.setColorGris();
                joueur_naturel.setColorGris();
                break;
            case "Joueur 1":
                joueur1 = new Joueur("Joueur 1", Couleur.ROUGE);
                Agricola.ajouterJoueur(joueur1);
                joueur_rouge.setColor(couleur_rouge_over);
                break;
            case "Joueur 2":
                joueur2 = new Joueur("Joueur 2", Couleur.VERT);
                Agricola.ajouterJoueur(joueur2);
                joueur_vert.setColor(couleur_vert_over);
                break;
            case "Joueur 3":
                joueur3 = new Joueur("Joueur 3", Couleur.BLEU);
                Agricola.ajouterJoueur(joueur3);
                joueur_bleu.setColor(couleur_bleu_over);
                break;
            case "Joueur 4":
                joueur4 = new Joueur("Joueur 4", Couleur.VIOLET);
                Agricola.ajouterJoueur(joueur4);
                joueur_violet.setColor(couleur_violet_over);
                break;
            case "Joueur 5":
                joueur5 = new Joueur("Joueur 4", Couleur.NATUREL);
                Agricola.ajouterJoueur(joueur5);
                joueur_naturel.setColor(couleur_naturel_over);
                break;
            case "Lancer":
                //System.out.println(Agricola.getJoueurs());
                if(Agricola.getJoueurs().size()>=2){
                    fenetre.dispose();
                    InterfacePlateau.affichage();
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Veuillez saisir au minimum 2 Joueurs", "Attention", 1);
                }
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

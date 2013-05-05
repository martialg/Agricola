package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import joueur.Couleur;
import joueur.Joueur;
import plateau.action.Action3Bois;

public class InterfacePlateau extends JPanel implements ActionListener {

    private static ArrayList<InterfacePlateauJoueur> listeplateau;
    private static InterfacePlateauJoueur interface_joueur1;
    private static InterfacePlateauJoueur interface_joueur2;
    private static InterfacePlateauJoueur interface_joueur3;
    private static InterfacePlateauJoueur interface_joueur4;
    private static InterfacePlateauJoueur interface_joueur5;
    private static JFrame fenetre;
    private static BufferedImage background;
    private static InterfacePlateau plateau;
    private static ImagePanel carte_tournee_1;
    private static ImagePanel carte_tournee_2;
    private static ImagePanel carte_tournee_3;
    private static ImagePanel carte_tournee_4;
    private static ImagePanel carte_tournee_5;
    private static ImagePanel carte_tournee_6;
    private static ImagePanel carte_tournee_7;
    private static ImagePanel carte_tournee_8;
    private static ImagePanel carte_tournee_9;
    private static ImagePanel carte_tournee_10;
    private static ImagePanel carte_tournee_11;
    private static ImagePanel carte_tournee_12;
    private static ImagePanel carte_tournee_13;
    private static ImagePanel carte_tournee_14;
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
    
    private static Bouton3Bois bouton3Bois;
    private static Bouton1Argile bouton1Argile;
    private static Bouton1Roseau bouton1Roseau;
    private static BoutonPeche boutonPeche;
    private static BoutonPieceEtable boutonPieceEtable;
    private static BoutonPremierJoueur boutonPremierJoueur;
    private static Bouton1Cereale bouton1Cereale;
    private static BoutonLabourer boutonLabourer;
    private static BoutonEtablePain boutonEtablePain;
    private static BoutonJournalier boutonJournalier;

    public InterfacePlateau() {
        try {
            background = ImageIO.read(new File("images/plateau2.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfacePlateau.class.getName()).log(Level.SEVERE, null, ex);
        }
        fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(1910, 829);
        fenetre.setContentPane(this);
        Color c1 = new Color(0xC96D1C);
        fenetre.getContentPane().setBackground(c1);
        fenetre.setResizable(true);
        fenetre.setLocationRelativeTo(fenetre.getParent());
        fenetre.setVisible(true);
        listeplateau = new ArrayList<InterfacePlateauJoueur>();
    }

    public static void affichage() throws IOException {
        //1er carte
        carte_tournee_1 = new ImagePanel("images/periode1.png");
        carte_tournee_1.setSize(148, 230);
        carte_tournee_1.setVisible(true);
        carte_tournee_1.setBounds(596, 40, 148, 230);
        //2eme carte
        carte_tournee_2 = new ImagePanel("images/periode1.png");
        carte_tournee_2.setSize(148, 230);
        carte_tournee_2.setVisible(true);
        carte_tournee_2.setBounds(772, 40, 148, 230);
        //3eme carte
        carte_tournee_3 = new ImagePanel("images/periode1.png");
        carte_tournee_3.setSize(148, 230);
        carte_tournee_3.setVisible(true);
        carte_tournee_3.setBounds(772, 280, 148, 230);
        //4eme carte
        carte_tournee_4 = new ImagePanel("images/periode1.png");
        carte_tournee_4.setSize(148, 230);
        carte_tournee_4.setVisible(true);
        carte_tournee_4.setBounds(772, 520, 148, 230);
        //5eme carte
        carte_tournee_5 = new ImagePanel("images/periode2.png");
        carte_tournee_5.setSize(148, 230);
        carte_tournee_5.setVisible(true);
        carte_tournee_5.setBounds(948, 40, 148, 230);
        //6eme carte
        carte_tournee_6 = new ImagePanel("images/periode2.png");
        carte_tournee_6.setSize(148, 230);
        carte_tournee_6.setVisible(true);
        carte_tournee_6.setBounds(948, 280, 148, 230);
        //7eme carte
        carte_tournee_7 = new ImagePanel("images/periode2.png");
        carte_tournee_7.setSize(148, 230);
        carte_tournee_7.setVisible(true);
        carte_tournee_7.setBounds(948, 520, 148, 230);
        //8eme carte
        carte_tournee_8 = new ImagePanel("images/periode3.png");
        carte_tournee_8.setSize(148, 230);
        carte_tournee_8.setVisible(true);
        carte_tournee_8.setBounds(1124, 280, 148, 230);
        //9eme carte
        carte_tournee_9 = new ImagePanel("images/periode3.png");
        carte_tournee_9.setSize(148, 230);
        carte_tournee_9.setVisible(true);
        carte_tournee_9.setBounds(1124, 520, 148, 230);
        //10eme carte
        carte_tournee_10 = new ImagePanel("images/periode4.png");
        carte_tournee_10.setSize(148, 230);
        carte_tournee_10.setVisible(true);
        carte_tournee_10.setBounds(1300, 280, 148, 230);
        //11eme carte
        carte_tournee_11 = new ImagePanel("images/periode4.png");
        carte_tournee_11.setSize(148, 230);
        carte_tournee_11.setVisible(true);
        carte_tournee_11.setBounds(1300, 520, 148, 230);
        //12eme carte
        carte_tournee_12 = new ImagePanel("images/periode5.png");
        carte_tournee_12.setSize(148, 230);
        carte_tournee_12.setVisible(true);
        carte_tournee_12.setBounds(1476, 280, 148, 230);
        //13eme carte
        carte_tournee_13 = new ImagePanel("images/periode5.png");
        carte_tournee_13.setSize(148, 230);
        carte_tournee_13.setVisible(true);
        carte_tournee_13.setBounds(1476, 520, 148, 230);
        //1'eme carte
        carte_tournee_14 = new ImagePanel("images/periode6.png");
        carte_tournee_14.setSize(148, 230);
        carte_tournee_14.setVisible(true);
        carte_tournee_14.setBounds(1652, 280, 148, 230);

        //BoutonBois bb = new BoutonBois();
        //bb.setVisible(true);
        //bb.setBounds(500, 315, 40, 40);

        //Label choix des joueurs
        Image im_lab;
        im_lab = ImageIO.read(new File("images/label-background.png"));
        label_choix_joueur = new JLabel("Affichage des plateaux des joueurs");
        label_choix_joueur.setIcon(new ImageIcon(im_lab));
        label_choix_joueur.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        Color c = new Color(0x643E1D);
        label_choix_joueur.setHorizontalTextPosition(JLabel.CENTER);
        label_choix_joueur.setVerticalTextPosition(JLabel.CENTER);
        label_choix_joueur.setForeground(c);
        label_choix_joueur.setBounds(1300, 20, 400, 40);
        label_choix_joueur.setVisible(true);

        //bouton rouge
        couleur_rouge_over = new Color(0xDC3333);
        couleur_rouge_pressed = new Color(0x8A1919);
        joueur_rouge = new GradientCircularButton("Joueur 1", couleur_rouge_over, couleur_rouge_pressed);
        joueur_rouge.setVisible(false);
        joueur_rouge.setBounds(1180, 90, 100, 100);

        //bouton vert
        couleur_vert_over = new Color(0x08C701);
        couleur_vert_pressed = new Color(0x048100);
        joueur_vert = new GradientCircularButton("Joueur 2", couleur_vert_over, couleur_vert_pressed);
        joueur_vert.setVisible(false);
        joueur_vert.setBounds(1310, 90, 100, 100);

        //bouton bleu
        couleur_bleu_over = new Color(0x006FFF);
        couleur_bleu_pressed = new Color(0x003479);
        joueur_bleu = new GradientCircularButton("Joueur 3", couleur_bleu_over, couleur_bleu_pressed);
        joueur_bleu.setVisible(false);
        joueur_bleu.setBounds(1440, 90, 100, 100);

        //bouton violet
        couleur_violet_over = new Color(0xCA00F7);
        couleur_violet_pressed = new Color(0x71008A);
        joueur_violet = new GradientCircularButton("Joueur 4", couleur_violet_over, couleur_violet_pressed);
        joueur_violet.setVisible(false);
        joueur_violet.setBounds(1570, 90, 100, 100);

        //bouton naturel
        couleur_naturel_over = new Color(0xFFED8E);
        couleur_naturel_pressed = new Color(0xFFDE32);
        joueur_naturel = new GradientCircularButton("Joueur 5", couleur_naturel_over, couleur_naturel_pressed);
        joueur_naturel.setVisible(false);
        joueur_naturel.setBounds(1700, 90, 100, 100);


        //########################################
        //Bouton 3 Bois
        bouton3Bois = new Bouton3Bois("3 Bois");
        bouton3Bois.createButton();
        bouton3Bois.setBounds(570, 275, 190, 120);
        bouton3Bois.setVisible(true);
        
        //########################################
        //Bouton 1 Argile
        bouton1Argile = new Bouton1Argile("1 Argile");
        bouton1Argile.createButton();
        bouton1Argile.setBounds(570, 400, 190, 120);
        bouton1Argile.setVisible(true);
        
        //########################################
        //Bouton 1 Roseau
        bouton1Roseau = new Bouton1Roseau("1 Roseau");
        bouton1Roseau.createButton();
        bouton1Roseau.setBounds(570, 525, 190, 120);
        bouton1Roseau.setVisible(true);
        
        //########################################
        //Bouton 1 Roseau
        boutonPeche = new BoutonPeche("1 Peche");
        boutonPeche.createButton();
        boutonPeche.setBounds(570, 650, 190, 120);
        boutonPeche.setVisible(true);
        

        //Bouton Piece Etable
        boutonPieceEtable = new BoutonPieceEtable("Piece Etable");
        boutonPieceEtable.createButton();
        boutonPieceEtable.setBounds(240, 150, 190, 120);
        boutonPieceEtable.setVisible(true);

        //Bouton Premier Joueur
        boutonPremierJoueur = new BoutonPremierJoueur("Premier Joueur");
        boutonPremierJoueur.createButton();
        boutonPremierJoueur.setBounds(365, 150, 190, 120);
        boutonPremierJoueur.setVisible(true);
        
        //########################################
        //Bouton 1 Cereale
        bouton1Cereale = new Bouton1Cereale("1 Céréale");
        bouton1Cereale.createButton();
        bouton1Cereale.setBounds(365, 275, 190, 120);
        bouton1Cereale.setVisible(true);
        
        //########################################
        //Bouton Labourer
        boutonLabourer = new BoutonLabourer("Labourer");
        boutonLabourer.createButton();
        boutonLabourer.setBounds(490, 275, 190, 120);
        boutonLabourer.setVisible(true);
    
        //########################################
        //Bouton Etable Pain
        boutonEtablePain = new BoutonEtablePain("Etable Pain");
        boutonEtablePain.createButton();
        boutonEtablePain.setBounds(365, 275, 190, 120);
        boutonEtablePain.setVisible(true);
    
        //########################################
        //Bouton Journalier
        boutonJournalier = new BoutonJournalier("Journalier");
        boutonJournalier.createButton();
        boutonJournalier.setBounds(365, 275, 190, 120);
        boutonJournalier.setVisible(true);


        //fenetre principale
        plateau = new InterfacePlateau();
        plateau.setOpaque(true);
        plateau.setLayout(null);


        //ajout des carte face cachée
        plateau.add(carte_tournee_1);
        plateau.add(carte_tournee_2);
        plateau.add(carte_tournee_3);
        plateau.add(carte_tournee_4);
        plateau.add(carte_tournee_5);
        plateau.add(carte_tournee_6);
        plateau.add(carte_tournee_7);
        plateau.add(carte_tournee_8);
        plateau.add(carte_tournee_9);
        plateau.add(carte_tournee_10);
        plateau.add(carte_tournee_11);
        plateau.add(carte_tournee_12);
        plateau.add(carte_tournee_13);
        plateau.add(carte_tournee_14);

        plateau.add(label_choix_joueur);

        
        plateau.add(bouton3Bois);
        plateau.add(bouton1Argile);
        plateau.add(bouton1Roseau);
        plateau.add(boutonPeche);
        plateau.add(boutonPieceEtable);
        plateau.add(boutonPremierJoueur);
        plateau.add(bouton1Cereale);
        plateau.add(boutonLabourer);
        plateau.add(boutonEtablePain);
        plateau.add(boutonJournalier);

        //plateau.add(bb);


        afficheBoutonJoueurPresent();

    }

    public static void afficheBoutonJoueurPresent() {
        for (Joueur joueur : Agricola.getJoueurs()) {
            if (joueur.getCouleur() == Couleur.ROUGE) {
                interface_joueur1 = new InterfacePlateauJoueur(joueur, couleur_rouge_over);
                listeplateau.add(interface_joueur1);
                plateau.add(joueur_rouge);
                joueur_rouge.setVisible(true);
                joueur_rouge.addActionListener(plateau);
            }
            if (joueur.getCouleur() == Couleur.VERT) {
                interface_joueur2 = new InterfacePlateauJoueur(joueur, couleur_vert_over);
                listeplateau.add(interface_joueur2);
                plateau.add(joueur_vert);
                joueur_vert.setVisible(true);
                joueur_vert.addActionListener(plateau);
            }
            if (joueur.getCouleur() == Couleur.BLEU) {
                interface_joueur3 = new InterfacePlateauJoueur(joueur, couleur_bleu_over);
                listeplateau.add(interface_joueur1);
                plateau.add(joueur_bleu);
                joueur_bleu.setVisible(true);
                joueur_bleu.addActionListener(plateau);
            }
            if (joueur.getCouleur() == Couleur.VIOLET) {
                interface_joueur4 = new InterfacePlateauJoueur(joueur, couleur_violet_over);
                listeplateau.add(interface_joueur2);
                plateau.add(joueur_violet);
                joueur_violet.setVisible(true);
                joueur_violet.addActionListener(plateau);
            }
            if (joueur.getCouleur() == Couleur.NATUREL) {
                interface_joueur5 = new InterfacePlateauJoueur(joueur, couleur_naturel_over);
                listeplateau.add(interface_joueur2);
                plateau.add(joueur_naturel);
                joueur_naturel.setVisible(true);
                joueur_naturel.addActionListener(plateau);
            }
        }
    }

    public static void start() throws IOException {
        Agricola.premierTour();
        InterfacePlateau.affichage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        String action = String.valueOf(obj);
        int debut = action.indexOf("text=") + 5;
        int fin = action.indexOf(",defaultCapable=");
        String action_name = action.substring(debut, fin);
        switch (action_name) {
            case "Joueur 1":
                interface_joueur1.setVisibleTrue();
                interface_joueur1.affichage();
                //System.out.println(interface_joueur1.getJoueur().compterHabitants());
                break;
            case "Joueur 2":
                interface_joueur2.setVisibleTrue();
                interface_joueur2.affichage();
                break;
            case "Joueur 3":
                interface_joueur3.setVisibleTrue();
                interface_joueur3.affichage();
                break;
            case "Joueur 4":
                interface_joueur4.setVisibleTrue();
                interface_joueur4.affichage();
                break;
            case "Joueur 5":
                interface_joueur5.setVisibleTrue();
                interface_joueur5.affichage();
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

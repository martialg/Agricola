package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.ComponentOrientation;
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
import joueur.Joueur;

public class InterfacePlateauJoueur extends JPanel implements ActionListener {

    private JFrame fenetre;
    private BufferedImage background;
    private InterfacePlateauJoueur plateau_joueur;
    private Joueur joueur;
    private Color color;
    private JLabel label_cloture;
    private JLabel label_nb_cloture;
    private JLabel label_bois;
    private JLabel label_nb_bois;
    private JLabel label_argile;
    private JLabel label_nb_argile;
    private JLabel label_pierre;
    private JLabel label_nb_pierre;
    private JLabel label_roseau;
    private JLabel label_nb_roseau;
    private JLabel label_mouton;
    private JLabel label_nb_mouton;
    private JLabel label_sanglier;
    private JLabel label_nb_sanglier;
    private JLabel label_boeuf;
    private JLabel label_nb_boeuf;
    private JLabel label_nourriture;
    private JLabel label_nb_nourriture;
    private JLabel label_etable;
    private JLabel label_nb_etable;
    private JLabel label_cereale;
    private JLabel label_nb_cereale;
    private JLabel label_legume;
    private JLabel label_nb_legume;

    public InterfacePlateauJoueur(Joueur j, Color c) {
        try {
            background = ImageIO.read(new File("images/plateau-joueur-base.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfacePlateauJoueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        joueur = j;
        fenetre = new JFrame(joueur.getNom());
        fenetre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fenetre.setSize(1040, 458);
        this.setLayout(null);
        fenetre.setContentPane(this);
        fenetre.getContentPane().setBackground(c);
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
    
    public Joueur getJoueur(){
        return this.joueur;
    }
    

    public void affichage() {
        Image background_nb = null;
        Image background_nom = null;
        try {
            background_nb = ImageIO.read(new File("images/nbfois.png"));
            background_nom = ImageIO.read(new File("images/labelnb.png"));
        } catch (IOException ex) {
            Logger.getLogger(InterfacePlateauJoueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        Color couleur_ecriture = new Color(0x643E1D);
        //bois
        label_nb_bois = new JLabel(""+joueur.getRessources().getBois().getQuantite());
        label_nb_bois.setIcon(new ImageIcon(background_nb));
        label_nb_bois.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_bois.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_bois.setVerticalTextPosition(JLabel.CENTER);
        label_nb_bois.setForeground(couleur_ecriture);
        label_nb_bois.setBounds(600, 10, 55, 41);
        label_nb_bois.setVisible(true);
        
        label_bois = new JLabel("Bois(s)");
        label_bois.setIcon(new ImageIcon(background_nom));
        label_bois.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_bois.setHorizontalTextPosition(JLabel.CENTER);
        label_bois.setVerticalTextPosition(JLabel.CENTER);
        label_bois.setForeground(couleur_ecriture);
        label_bois.setBounds(660, 10, 144, 41);
        label_bois.setVisible(true);
        
        //argile
        label_nb_argile = new JLabel(""+joueur.getRessources().getArgile().getQuantite());
        label_nb_argile.setIcon(new ImageIcon(background_nb));
        label_nb_argile.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_argile.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_argile.setVerticalTextPosition(JLabel.CENTER);
        label_nb_argile.setForeground(couleur_ecriture);
        label_nb_argile.setBounds(600, 60, 55, 41);
        label_nb_argile.setVisible(true);
        
        label_argile = new JLabel("Argile(s)");
        label_argile.setIcon(new ImageIcon(background_nom));
        label_argile.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_argile.setHorizontalTextPosition(JLabel.CENTER);
        label_argile.setVerticalTextPosition(JLabel.CENTER);
        label_argile.setForeground(couleur_ecriture);
        label_argile.setBounds(660, 60, 144, 41);
        label_argile.setVisible(true);
        
        //pierre
        label_nb_pierre = new JLabel(""+joueur.getRessources().getPierre().getQuantite());
        label_nb_pierre.setIcon(new ImageIcon(background_nb));
        label_nb_pierre.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_pierre.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_pierre.setVerticalTextPosition(JLabel.CENTER);
        label_nb_pierre.setForeground(couleur_ecriture);
        label_nb_pierre.setBounds(600, 110, 55, 41);
        label_nb_pierre.setVisible(true);
        
        label_pierre = new JLabel("Pierre(s)");
        label_pierre.setIcon(new ImageIcon(background_nom));
        label_pierre.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_pierre.setHorizontalTextPosition(JLabel.CENTER);
        label_pierre.setVerticalTextPosition(JLabel.CENTER);
        label_pierre.setForeground(couleur_ecriture);
        label_pierre.setBounds(660, 110, 144, 41);
        label_pierre.setVisible(true);
        
        //roseau
        label_nb_roseau = new JLabel(""+joueur.getRessources().getRoseau().getQuantite());
        label_nb_roseau.setIcon(new ImageIcon(background_nb));
        label_nb_roseau.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_roseau.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_roseau.setVerticalTextPosition(JLabel.CENTER);
        label_nb_roseau.setForeground(couleur_ecriture);
        label_nb_roseau.setBounds(600, 160, 55, 41);
        label_nb_roseau.setVisible(true);
        
        label_roseau = new JLabel("Roseau(x)");
        label_roseau.setIcon(new ImageIcon(background_nom));
        label_roseau.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_roseau.setHorizontalTextPosition(JLabel.CENTER);
        label_roseau.setVerticalTextPosition(JLabel.CENTER);
        label_roseau.setForeground(couleur_ecriture);
        label_roseau.setBounds(660, 160, 144, 41);
        label_roseau.setVisible(true);
        
        //mouton
        label_nb_mouton = new JLabel(""+joueur.getRessources().getMouton().getQuantite());
        label_nb_mouton.setIcon(new ImageIcon(background_nb));
        label_nb_mouton.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_mouton.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_mouton.setVerticalTextPosition(JLabel.CENTER);
        label_nb_mouton.setForeground(couleur_ecriture);
        label_nb_mouton.setBounds(820, 10, 55, 41);
        label_nb_mouton.setVisible(true);
        
        label_mouton = new JLabel("Mouton(s)");
        label_mouton.setIcon(new ImageIcon(background_nom));
        label_mouton.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_mouton.setHorizontalTextPosition(JLabel.CENTER);
        label_mouton.setVerticalTextPosition(JLabel.CENTER);
        label_mouton.setForeground(couleur_ecriture);
        label_mouton.setBounds(880, 10, 144, 41);
        label_mouton.setVisible(true);
        
        //sanglier
        label_nb_sanglier = new JLabel(""+joueur.getRessources().getSanglier().getQuantite());
        label_nb_sanglier.setIcon(new ImageIcon(background_nb));
        label_nb_sanglier.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_sanglier.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_sanglier.setVerticalTextPosition(JLabel.CENTER);
        label_nb_sanglier.setForeground(couleur_ecriture);
        label_nb_sanglier.setBounds(820, 60, 55, 41);
        label_nb_sanglier.setVisible(true);
        
        label_sanglier = new JLabel("Sanglier(s)");
        label_sanglier.setIcon(new ImageIcon(background_nom));
        label_sanglier.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_sanglier.setHorizontalTextPosition(JLabel.CENTER);
        label_sanglier.setVerticalTextPosition(JLabel.CENTER);
        label_sanglier.setForeground(couleur_ecriture);
        label_sanglier.setBounds(880, 60, 144, 41);
        label_sanglier.setVisible(true);
        
        //boeuf
        label_nb_boeuf = new JLabel(""+joueur.getRessources().getBoeuf().getQuantite());
        label_nb_boeuf.setIcon(new ImageIcon(background_nb));
        label_nb_boeuf.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_boeuf.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_boeuf.setVerticalTextPosition(JLabel.CENTER);
        label_nb_boeuf.setForeground(couleur_ecriture);
        label_nb_boeuf.setBounds(820, 110, 55, 41);
        label_nb_boeuf.setVisible(true);
        
        label_boeuf = new JLabel("Boeuf(s)");
        label_boeuf.setIcon(new ImageIcon(background_nom));
        label_boeuf.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_boeuf.setHorizontalTextPosition(JLabel.CENTER);
        label_boeuf.setVerticalTextPosition(JLabel.CENTER);
        label_boeuf.setForeground(couleur_ecriture);
        label_boeuf.setBounds(880, 110, 144, 41);
        label_boeuf.setVisible(true);
        
        //nourriture
        label_nb_nourriture = new JLabel(""+joueur.getRessources().getNourriture());
        label_nb_nourriture.setIcon(new ImageIcon(background_nb));
        label_nb_nourriture.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_nourriture.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_nourriture.setVerticalTextPosition(JLabel.CENTER);
        label_nb_nourriture.setForeground(couleur_ecriture);
        label_nb_nourriture.setBounds(820, 160, 55, 41);
        label_nb_nourriture.setVisible(true);
        
        label_nourriture = new JLabel("Nourriture(s)");
        label_nourriture.setIcon(new ImageIcon(background_nom));
        label_nourriture.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nourriture.setHorizontalTextPosition(JLabel.CENTER);
        label_nourriture.setVerticalTextPosition(JLabel.CENTER);
        label_nourriture.setForeground(couleur_ecriture);
        label_nourriture.setBounds(880, 160, 144, 41);
        label_nourriture.setVisible(true);
        
        //cereale
        label_nb_cereale = new JLabel(""+joueur.getRessources().getCereale().getQuantite());
        label_nb_cereale.setIcon(new ImageIcon(background_nb));
        label_nb_cereale.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_cereale.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_cereale.setVerticalTextPosition(JLabel.CENTER);
        label_nb_cereale.setForeground(couleur_ecriture);
        label_nb_cereale.setBounds(600, 230, 55, 41);
        label_nb_cereale.setVisible(true);
        
        label_cereale = new JLabel("Céréale(s)");
        label_cereale.setIcon(new ImageIcon(background_nom));
        label_cereale.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_cereale.setHorizontalTextPosition(JLabel.CENTER);
        label_cereale.setVerticalTextPosition(JLabel.CENTER);
        label_cereale.setForeground(couleur_ecriture);
        label_cereale.setBounds(660, 230, 144, 41);
        label_cereale.setVisible(true);
        
        //legume
        label_nb_legume = new JLabel(""+joueur.getRessources().getLegume().getQuantite());
        label_nb_legume.setIcon(new ImageIcon(background_nb));
        label_nb_legume.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_legume.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_legume.setVerticalTextPosition(JLabel.CENTER);
        label_nb_legume.setForeground(couleur_ecriture);
        label_nb_legume.setBounds(600, 280, 55, 41);
        label_nb_legume.setVisible(true);
        
        label_legume = new JLabel("Légume(s)");
        label_legume.setIcon(new ImageIcon(background_nom));
        label_legume.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_legume.setHorizontalTextPosition(JLabel.CENTER);
        label_legume.setVerticalTextPosition(JLabel.CENTER);
        label_legume.setForeground(couleur_ecriture);
        label_legume.setBounds(660, 280, 144, 41);
        label_legume.setVisible(true);
        
        //cloture
        label_nb_cloture = new JLabel(""+joueur.getRessources().getNbCloture());
        label_nb_cloture.setIcon(new ImageIcon(background_nb));
        label_nb_cloture.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_cloture.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_cloture.setVerticalTextPosition(JLabel.CENTER);
        label_nb_cloture.setForeground(couleur_ecriture);
        label_nb_cloture.setBounds(820, 230, 55, 41);
        label_nb_cloture.setVisible(true);
        
        label_cloture = new JLabel("Cloture(s)");
        label_cloture.setIcon(new ImageIcon(background_nom));
        label_cloture.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_cloture.setHorizontalTextPosition(JLabel.CENTER);
        label_cloture.setVerticalTextPosition(JLabel.CENTER);
        label_cloture.setForeground(couleur_ecriture);
        label_cloture.setBounds(880, 230, 144, 41);
        label_cloture.setVisible(true);
        
        //etable
        label_nb_etable = new JLabel(""+joueur.getRessources().getNbEtable());
        label_nb_etable.setIcon(new ImageIcon(background_nb));
        label_nb_etable.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_nb_etable.setHorizontalTextPosition(JLabel.CENTER);
        label_nb_etable.setVerticalTextPosition(JLabel.CENTER);
        label_nb_etable.setForeground(couleur_ecriture);
        label_nb_etable.setBounds(820, 280, 55, 41);
        label_nb_etable.setVisible(true);
        
        label_etable = new JLabel("Etable(s)");
        label_etable.setIcon(new ImageIcon(background_nom));
        label_etable.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        label_etable.setHorizontalTextPosition(JLabel.CENTER);
        label_etable.setVerticalTextPosition(JLabel.CENTER);
        label_etable.setForeground(couleur_ecriture);
        label_etable.setBounds(880, 280, 144, 41);
        label_etable.setVisible(true);
        
        //fenetre principale
        plateau_joueur = new InterfacePlateauJoueur(joueur, color);
        plateau_joueur.setOpaque(true);
        plateau_joueur.setLayout(null);

        
        //ajout des infos
        fenetre.add(label_nb_bois);
        fenetre.add(label_bois);
        fenetre.add(label_nb_argile);
        fenetre.add(label_argile);
        fenetre.add(label_nb_pierre);
        fenetre.add(label_pierre);
        fenetre.add(label_nb_roseau);
        fenetre.add(label_roseau);
        fenetre.add(label_nb_mouton);
        fenetre.add(label_mouton);
        fenetre.add(label_nb_sanglier);
        fenetre.add(label_sanglier);
        fenetre.add(label_nb_boeuf);
        fenetre.add(label_boeuf);
        fenetre.add(label_nb_nourriture);
        fenetre.add(label_nourriture);
        fenetre.add(label_nb_cloture);
        fenetre.add(label_cloture);
        fenetre.add(label_nb_etable);
        fenetre.add(label_etable);
        fenetre.add(label_nb_cereale);
        fenetre.add(label_cereale);
        fenetre.add(label_nb_legume);
        fenetre.add(label_legume);
        
        
    }

    public void start() throws IOException {
        InterfacePlateau.affichage();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 0 ;
        int y = (getHeight() - background.getHeight()) / 2;
        g.drawImage(background, x, y, this);
    }
}

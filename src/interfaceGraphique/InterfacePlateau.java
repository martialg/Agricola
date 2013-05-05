package interfaceGraphique;

import agricola.Agricola;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import joueur.Joueur;
import plateau.action.Action3Bois;

public class InterfacePlateau extends JPanel implements MouseListener, ActionListener {

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

    }

    public static void affichage() {
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

        BoutonBois bb = new BoutonBois();

        bb.setVisible(true);
        bb.setBounds(500, 315, 40, 40);

        for (Joueur joueur : Agricola.getJoueurs()) {
            InterfacePlateauJoueur.affichage();
            
        }

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

        plateau.add(bb);

        //bouton_joueur.addActionListener(plateau);
    }

    public static void start() throws IOException {
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
            case "Fermer":
                break;
        }
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - background.getWidth()) / 2;
        int y = (getHeight() - background.getHeight()) / 2;
        g.drawImage(background, x, y, this);
    }
}

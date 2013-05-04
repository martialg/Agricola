package interfaceGraphique;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Accueil extends JPanel implements ActionListener{

    private static JFrame fenetre;
    private JButton bouton_jouer;
    private static JoliBouton bouton_quitter;
    private static boolean fin;
    private BufferedImage background;
    private static Accueil accueil;
    

    public Accueil(BufferedImage background){
        this.background = background;
    }
    
    public static void start() throws IOException {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName());
            fin = false;
            Accueil.affichage();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void affichage() throws IOException {
        BufferedImage background = ImageIO.read(new File("images/background2.png"));
        accueil = new Accueil(background);
        accueil.setOpaque(true);
        accueil.setLayout(null);
        

        //quitter
        
        bouton_quitter = new JoliBouton("Fermer");
        /*Image img_normal = ImageIO.read(new File("images/button.png"));
        bouton_quitter.setIcon(new ImageIcon(img_normal));
        bouton_quitter.setText("Quitter");
        bouton_quitter.addActionListener(accueil);
        bouton_quitter.setFont(new Font("Matura MT Script Capitals", Font.ROMAN_BASELINE, 20));
        
        bouton_quitter.setHorizontalTextPosition(JButton.CENTER);
        bouton_quitter.setVerticalTextPosition(JButton.CENTER);
        Color c = new Color(0x643E1D);
        bouton_quitter.setForeground(c);
        bouton_quitter.setFocusPainted(false);
        bouton_quitter.setBorderPainted(false);
        bouton_quitter.setContentAreaFilled(false);
        
        bouton_quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            Image img_normal = ImageIO.read(new File("images/button.png"));
            Image img_over = ImageIO.read(new File("images/button-over.png"));
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bouton_quitter.setIcon(new ImageIcon(img_over));
                Color c = new Color(0xDA6C0D);
                bouton_quitter.setForeground(c);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bouton_quitter.setIcon(new ImageIcon(img_normal));
                Color c = new Color(0x643E1D);
                bouton_quitter.setForeground(c);
            }
        });*/
        
        
        bouton_quitter.setBounds(530, 5, 123, 41);
        
        bouton_quitter.addActionListener(accueil);
        accueil.add(bouton_quitter);
        
        
        
        fenetre = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setContentPane(accueil);
        fenetre.setSize(660,420);
        Color c1 = new Color(0xC96D1C);
        fenetre.getContentPane().setBackground(c1);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(fenetre.getParent());
        fenetre.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == bouton_quitter){
            System.exit(0);
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - background.getWidth())/2;
        int y = (getHeight() - background.getHeight())/2;
        g.drawImage(background, x, y, this);
    }
    
}

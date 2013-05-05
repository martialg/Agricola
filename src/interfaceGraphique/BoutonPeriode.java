package interfaceGraphique;

import carte.AmenagementMajeur;
import javax.swing.JButton;

public class BoutonPeriode extends JButton{
    private AmenagementMajeur amenagement;
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    public void setAmenagement(AmenagementMajeur amenagement){
        this.amenagement = amenagement;
    }
    
    public AmenagementMajeur getAmenagement(){
        return this.amenagement;
    }
    
}

package interfaceGraphique;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import plateau.action.ActionPieceEtable;

public class BoutonPieceEtable extends JButton implements ActionListener{
    private ActionPieceEtable action;

    public BoutonPieceEtable(String nom){
        super();
        action = new ActionPieceEtable();
        addActionListener(this);
    }
    
    
    protected void createButton() {
        this.setFocusPainted(true);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}

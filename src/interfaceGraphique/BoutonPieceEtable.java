package interfaceGraphique;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import plateau.action.ActionPieceEtable;

public class BoutonPieceEtable extends BoutonAction implements ActionListener{
    private ActionPieceEtable action;

    public BoutonPieceEtable(String nom){
        super();
        this.setName(nom);
        action = new ActionPieceEtable();
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}

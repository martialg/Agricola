package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import plateau.action.ActionLabourer;

public class BoutonLabourer extends BoutonAction implements ActionListener{
    private ActionLabourer action;

    public BoutonLabourer(String nom){
        super();
        this.setName(nom);
        action = new ActionLabourer();
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}

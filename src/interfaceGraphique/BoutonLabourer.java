package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import plateau.action.ActionLabourer;

public class BoutonLabourer extends BoutonAction implements ActionListener{
    private ActionLabourer action;

    public BoutonLabourer(String nom, ActionLabourer action){
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}

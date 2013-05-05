/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import plateau.action.ActionEtablePain;


class BoutonEtableEtPain extends BoutonAction implements ActionListener{
    private ActionEtablePain action;

    public BoutonEtableEtPain(String nom, ActionEtablePain action){
        super();
        this.setName(nom);
        this.action = action;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

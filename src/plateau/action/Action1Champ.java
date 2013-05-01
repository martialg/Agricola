package plateau.action;

import joueur.Joueur;

public class Action1Champ extends CaseAction{

    @Override
    public boolean action(Joueur joueur) {
        if(joueur.getPlateauJoueur().casesLibre().isEmpty()){
            return false;
        }else{
            if(joueur.getPlateauJoueur().possedeAuMoinsUnChamps()){
                //Place un champ avec restriction
                placeChampNumeroCase(int[] case_choisie);
            }else{
                //Place n'importe ou
                placeChampNumeroCase(int[] case_choisie);
            }
        return true;
        }
    }
    
}
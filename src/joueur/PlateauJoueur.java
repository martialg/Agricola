package joueur;

public  class PlateauJoueur {
    private Case[][] cases;
    private Boolean[][] clotures_lignes;
    private Boolean[][] clotures_colonnes;
    
    public PlateauJoueur(){
        cases = new Case[5][3];
                
        clotures_lignes = new Boolean[5][4];
        for(int i = 0; i < clotures_lignes.length; i++)
            for(int j = 0; j < clotures_lignes[i].length; j++)
                clotures_lignes[i][j] = false;
        
        clotures_colonnes = new Boolean[6][3];
        for(int i = 0; i < clotures_colonnes.length; i++)
            for(int j = 0; j < clotures_colonnes[i].length; j++)
                clotures_colonnes[i][j] = false;
    }
    
    
}

package joueur;

public  class PlateauJoueur {
    private Case[][] cases;
    private Boolean[][] clotures_lignes;
    private Boolean[][] clotures_colonnes;
    
    
    public PlateauJoueur(){
        this.cases = new Case[5][3];
        for(int i = 0; i < this.cases.length; i++)
            for(int j = 0; j < this.cases[i].length; j++)
                this.cases[i][j] = new Case();
        this.cases[0][1] = new CaseHabitation(true);
        this.cases[0][2] = new CaseHabitation(true);
                
        this.clotures_lignes = new Boolean[5][4];
        for(int i = 0; i < this.clotures_lignes.length; i++)
            for(int j = 0; j < this.clotures_lignes[i].length; j++)
                this.clotures_lignes[i][j] = false;
        
        this.clotures_colonnes = new Boolean[6][3];
        for(int i = 0; i < this.clotures_colonnes.length; i++)
            for(int j = 0; j < this.clotures_colonnes[i].length; j++)
                this.clotures_colonnes[i][j] = false;
    }
}

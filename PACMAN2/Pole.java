import fri.shapesge.Stvorec;

public class Pole {
    private Stvorec stvorec;
    private int cisloPola;
    
    public Pole(int x, int y, int velkost, int cisloPola, Stvorec stvorec) {
        this.cisloPola = cisloPola;
        this.stvorec = stvorec;
        this.stvorec.zmenStranu(velkost - 1);
        
        if (cisloPola == 1) {
            this.stvorec.zmenFarbu("black");
        } else if (cisloPola == 0) {
            this.stvorec.zmenFarbu("blue");
        }
        
        this.stvorec.posunVodorovne(x * velkost);
        this.stvorec.posunZvisle(y * velkost);
        this.stvorec.zobraz();
    }
    
    public int getCisloPola() {
        return cisloPola;
    }
}

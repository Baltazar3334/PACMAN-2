import fri.shapesge.Stvorec;
import fri.shapesge.Kruh;

public class Pole {
    private Stvorec stvorec;
    private int cisloPola;
    private Kruh piskot;
    public Pole(int x, int y, int velkost, int cisloPola, Stvorec stvorec, Kruh piskot) {
        this.cisloPola = cisloPola;
        this.stvorec = stvorec;
        this.stvorec.zmenStranu(velkost - 1);
        this.piskot = piskot;
        if (cisloPola == 1) {
            this.stvorec.zmenFarbu("black");
        } else if (cisloPola == 0) {
            this.stvorec.zmenFarbu("blue");
        }
        this.stvorec.posunVodorovne(x * velkost);
        this.stvorec.posunZvisle(y * velkost);
        this.stvorec.zobraz();
        if (cisloPola == 0) {
            this.piskot.zmenPriemer(5);
            this.piskot.zmenFarbu("yellow");
            this.piskot.posunVodorovne(45 + x * velkost);
            this.piskot.posunZvisle(y * velkost);
            this.piskot.zobraz();
        }
    }
    
    public int getCisloPola() {
        return this.cisloPola;
    }
}

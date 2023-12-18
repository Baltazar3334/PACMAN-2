import fri.shapesge.Obrazok;

public class Duch {
    private Obrazok duch;
    private int x;
    private int y;
    private boolean pohyb;
    private String pohybSmer;
    public Duch(String obrazok,int x,int y) {
        this.duch = new Obrazok(obrazok);
        this.duch.zobraz();
        this.duch.posunVodorovne(-100);
        this.duch.posunZvisle(-100);
        this.duch.posunVodorovne(x);
        this.duch.posunZvisle(y);
        
        this.x = x;
        this.y = y;
        this.pohyb = false;
        this.pohybSmer = "";
    }
}

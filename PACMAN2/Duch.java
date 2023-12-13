import fri.shapesge.Obrazok;

public class Duch {
    private Obrazok duch;
    private int x;
    private int y;
    private boolean pohyb;
    private String pohybSmer;
    public void Duch(String obrazok,int x,int y) {
        this.duch = new Obrazok(obrazok);
        this.duch.zobraz();
        this.x = x;
        this.y = y;
        this.pohyb = false;
        this.pohybSmer = "";

    }
    
}

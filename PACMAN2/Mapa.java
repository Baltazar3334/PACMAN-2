
import fri.shapesge.Obrazok;
public class Mapa {
    
    private Obrazok mapa;
    public Mapa() {
        this.mapa = new Obrazok("pic/mapa.png");
        this.mapa.zmenPolohu(15, 5);
        this.mapa.zobraz();
    }
}

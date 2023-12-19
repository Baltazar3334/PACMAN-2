
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
public class Hra {
    private OvladaniePacman pacman;
    private Mapa mapa;
    private OvladanieDuchovia ovladanieDuchovia;
    public Hra()throws IOException {
        this.mapa = new Mapa(20);
        this.pacman = new OvladaniePacman();
        this.ovladanieDuchovia = new OvladanieDuchovia();
    }
    
    public void spustiHru() {
        this.pacman.start();
        this.ovladanieDuchovia.start();
    }
    
    public void skonciHru() {
        this.pacman.stop();
    }
    
    
}


/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private OvladaniePacman pacman;
    private Mapa mapa;
    public Hra() {
        this.pacman = new OvladaniePacman();
        this.mapa = new Mapa();
    }
    
    public void spustiHru() {
        this.pacman.start();
    }
    
    public void skonciHru() {
        this.pacman.stop();
    }
}

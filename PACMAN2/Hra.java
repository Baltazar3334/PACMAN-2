
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private OvladaniePacman pacman;
    private Mapa mapa;
    private Duch duch;
    public Hra() {
        this.pacman = new OvladaniePacman();
        this.mapa = new Mapa();
        this.duch = new Duch();
    }
    
    public void spustiHru() {
        this.pacman.start();
    }
    
    public void skonciHru() {
        this.pacman.stop();
    }
    public void spawnDuchov(){
        this.Duch();
        
    }
}

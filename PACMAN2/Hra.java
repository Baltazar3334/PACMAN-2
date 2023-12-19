
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
    private Duch duch1;
    private Duch duch2;
    private Duch duch3;
    private Duch duch4;
    public Hra()throws IOException {
        this.mapa = new Mapa(20);
        this.pacman = new OvladaniePacman();
    }
    
    public void spustiHru() {
        this.pacman.start();
    }
    
    public void skonciHru() {
        this.pacman.stop();
    }
    
    public void spawnDuchov(){
        this.duch1 = new Duch("pic/ghost_blue.png",20,10);
        this.duch3 = new Duch("pic/ghost_pink.png",20,260);
        this.duch2 = new Duch("pic/ghost_red.png",240,10);
        this.duch4 = new Duch("pic/ghost_orange.png",240,260);
    }
}

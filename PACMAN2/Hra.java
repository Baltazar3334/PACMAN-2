
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
public class Hra {
    private OvladaniePacman pacmanOvladanie;
    private Mapa mapa;
    private Duch duch1;
    private Duch duch2;
    private Duch duch3;
    private Duch duch4;
    public Hra()throws IOException {
        this.mapa = new Mapa(20);
        this.pacmanOvladanie = new OvladaniePacman(mapa.getMapa(), 20); 
        int spawnX = -1;
        int spawnY = -1;
        for (int x = 0; x < mapa.getMapa().length; x++) {
            for (int y = 0; y < mapa.getMapa()[0].length; y++) {
                if (mapa.getMapa()[x][y].getCisloPola() == 0) { 
                    spawnX = x;
                    spawnY = y;
                    break;
                }
            }
            if (spawnX != -1 && spawnY != -1) {
                break;
            }
        }
        pacmanOvladanie.spawnujPacmana(spawnX, spawnY);
    }
    
    public void spustiHru() {
        this.pacmanOvladanie.start();
    }
    
    public void skonciHru() {
        this.pacmanOvladanie.stop();
    }
    
    public void spawnDuchov(){
        this.duch1 = new Duch("pic/ghost_blue.png",20,10);
        this.duch3 = new Duch("pic/ghost_pink.png",20,260);
        this.duch2 = new Duch("pic/ghost_red.png",240,10);
        this.duch4 = new Duch("pic/ghost_orange.png",240,260);
    }
}
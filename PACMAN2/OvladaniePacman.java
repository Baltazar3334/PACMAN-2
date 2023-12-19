
/**
 * Write a description of class OvladaniePacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import fri.shapesge.Manazer;
public class OvladaniePacman {
    /**
     * Constructor for objects of class OvladaniePacman
     */
    private Manazer manazer;
    private Pacman pacman;
    private Pole[][] mapa;
    private int velkost;
    public OvladaniePacman(Pole[][] mapa, int velkost) {
        this.pacman = new Pacman(mapa, velkost);
        this.manazer = new Manazer();
        this.mapa = mapa;
        this.velkost = velkost;
    }
    
    public void posunVpravo() {
        this.pacman.pohybP();
    }
    
    public void posunVlavo() {
        this.pacman.pohybL();
    }
    
    public void posunHore(){
        this.pacman.pohybH();
    }
    
    public void posunDole(){
        this.pacman.pohybD();
    }
    
    public void start(){
        this.manazer.spravujObjekt(this);
    }
    
    public void stop() {
        this.manazer.prestanSpravovatObjekt(this);
    }
    public void spawnujPacmana(int x, int y) {
        pacman.startovnaPozicia(x, y);
    }
}

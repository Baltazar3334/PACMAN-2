
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
    public OvladaniePacman() {
        this.pacman = new Pacman();
        this.manazer = new Manazer();
    }
    
    public void posunVpravo() {
        this.pacman.posunVpravo();
    }
    
    public void posunVlavo() {
        this.pacman.posunVlavo();
    }
    
    public void posunHore(){
        this.pacman.posunHore();
    }
    
    public void posunDole(){
        this.pacman.posunDole();
    }
    
    public void start(){
        this.manazer.spravujObjekt(this.pacman);
    }
    
    public void stop() {
        this.manazer.prestanSpravovatObjekt(this.pacman);
    }
    
}

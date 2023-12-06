
/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import fri.shapesge.Kruh;
public class Pacman {
    /**
     * Constructor for objects of class Pacman
     */
    private Kruh pacman;
    private int x;
    private int y;
    public Pacman() {
        this.pacman = new Kruh();
        this.pacman.zmenPriemer(30);
        this.pacman.zobraz();
        this.x = 0;
        this.y = 0;
    }
    
    public void posunHore() {
        this.pacman.posunZvisle(y - 5);
    }
    
    public void posunDole() {
        this.pacman.posunZvisle(y + 5);
    }
    
    public void posunVlavo() {
        this.pacman.posunVodorovne(x - 5);
    }
    
    public void posunVpravo() {
        this.pacman.posunVodorovne(x + 5);
    }
}

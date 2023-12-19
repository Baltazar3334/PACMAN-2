
import fri.shapesge.Obrazok;

public class Pacman {
    private Obrazok pacman;
    private int x;
    private int y;
    public Pacman() {
        this.pacman = new Obrazok("pic/pacman.png");
        this.pacman.posunVodorovne(-100);
        this.pacman.posunZvisle(-100);
        this.pacman.posunVodorovne(241);
        this.pacman.posunZvisle(110);
        this.pacman.zobraz();
        this.x = 0;
        this.y = 0;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void pohybH() {
        this.pacman.posunZvisle(this.y - 20);
    }
    
    public void pohybD() {
        this.pacman.posunZvisle(this.y + 20);
    }
    
    public void pohybP() {
        this.pacman.posunVodorovne(this.x + 20);
    }
    
    public void pohybL() {
        this.pacman.posunVodorovne(this.x - 20);
    }
    


}

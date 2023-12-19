
import fri.shapesge.Obrazok;

public class Pacman {
    private Obrazok pacman;
    private int x;
    private int y;
    private Pole[][] mapa;
    private int velkost;
    public Pacman(Pole[][] mapa, int velkost) {
        this.pacman = new Obrazok("pic/pacman.png");
        this.pacman.zobraz();
        this.x = 0;
        this.y = 0;
        this.mapa = mapa;
        this.velkost =velkost;
    }
   
    public void startovnaPozicia(int vstupX, int vstupY) {
        this.x = vstupX;
        this.y = vstupY;
        this.pacman.posunVodorovne((vstupX -2)* velkost);
        this.pacman.posunZvisle((vstupY -2) * velkost);
    }
    public void pohybH() {
        if (jeMozny(x, y - 1)) {
            this.pacman.posunZvisle(-velkost); 
            this.y -= 1;
        }
    }
    
    public void pohybD() {
        if (jeMozny(x, y + 1)) {
            this.pacman.posunZvisle(velkost); 
            this.y += 1;
        }
    }
    
    public void pohybP() {
        if (jeMozny(x + 1, y)) {
            this.pacman.posunVodorovne(velkost); 
            this.x += 1;
        }
    }
    
    public void pohybL() {
        if (jeMozny(x - 1, y)) {
            this.pacman.posunVodorovne(-velkost); 
            this.x -= 1;
        }
    }
        private boolean jeMozny(int newX, int newY) {
        if (newX >= 0 && newX < mapa.length && newY >= 0 && newY < mapa[0].length) {
            return mapa[newX][newY].getCisloPola() != 1;
        }
        return false;
    }


}

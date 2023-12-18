
import fri.shapesge.Obrazok;

public class Pacman {
    private Obrazok pacman;
    private int x;
    private int y;
    private boolean pohyb;
    private String pohybSmer;
    public Pacman() {
        this.pacman = new Obrazok("pic/pacman.png");
        this.pacman.zobraz();
        this.x = 0;
        this.y = 0;
        this.pohyb = false;
        this.pohybSmer = "";
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void pohyb(){
        while(pohyb == true){
            switch(pohybSmer){
                case "hore": 
                this.pohybH();
                break;
                
                case "dole":
                this.pohybD();
                break;
                
                case "pravo":
                this.pohybP();
                break;
                
                case "lavo":
                this.pohybL();
                break;
                
                default:
                this.pohyb = false;
                break;
            }
        }
    }
    
    public void pohybH() {
        this.pacman.posunZvisle(this.y - 5);
        this.pohyb = true;
        this.pohyb();
    }
    
    public void pohybD() {
        this.pacman.posunZvisle(this.y + 5);
        this.pohyb = true;
        this.pohyb();
    }
    
    public void pohybP() {
        this.pacman.posunVodorovne(this.x + 5);
        this.pohyb = true;
        this.pohyb();
    }
    
    public void pohybL() {
        this.pacman.posunVodorovne(this.x - 5);
        this.pohyb = true;
        this.pohyb();
    }
    


}

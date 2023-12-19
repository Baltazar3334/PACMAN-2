import fri.shapesge.Manazer;
public class OvladanieDuchovia {
    
    private Manazer manazer;
    private Duch duch1;
    private Duch duch2;
    private Duch duch3;
    private Duch duch4;
    public OvladanieDuchovia() {
        this.manazer = new Manazer();
    }
    
    public void posunVpravo() {
        this.duch1.duchPohybH();
    }
    
    public void posunVlavo() {
        this.duch1.duchPohybL();
    }
    
    public void posunHore(){
        this.duch1.duchPohybH();
    }
    
    public void posunDole(){
        this.duch1.duchPohybD();
    }
    
    public void stop() {
        this.manazer.prestanSpravovatObjekt(this);
    }
    
    public void start(){
        this.duch1 = new Duch("pic/ghost_blue.png",20,10);
        this.duch3 = new Duch("pic/ghost_pink.png",20,260);
        this.duch2 = new Duch("pic/ghost_red.png",240,10);
        this.duch4 = new Duch("pic/ghost_orange.png",240,260);
    }
}

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import fri.shapesge.Stvorec;
import fri.shapesge.Kruh;
public class Mapa {
    private Pole[][] mapa;
    private int vyska;
    private int sirka;
    
    public Mapa(int velkost) throws IOException {
        this.vyska = 11;
        this.sirka = 19;
        this.mapa = new Pole[sirka][vyska];
        nacitajMapu("mapa.txt", velkost);
    }
    
    private void nacitajMapu(String nazovSuboru, int velkost) throws IOException {
        File subor = new File(nazovSuboru);
        Scanner scanner = new Scanner(subor);
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                if (scanner.hasNextInt()){
                    int cisloPola = scanner.nextInt();
                    Stvorec stvorec = new Stvorec();
                    Kruh piskot = new Kruh();
                    Pole policko = new Pole(x, y, velkost, cisloPola, stvorec, piskot);
                    this.mapa[x][y] = policko;
                }
            }
        }
        
        scanner.close();
    }
}
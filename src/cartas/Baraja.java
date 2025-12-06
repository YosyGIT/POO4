package cartas;
import java.util.*;
public class Baraja  {
    private Carta[] baraja;

    public Baraja(){
        this.baraja = new Carta[40];
        int i = 0;
        for (int p = 0; p < 4; p++) {
            for (int v = 0; v < 10; v++) {
                this.baraja[i] = new Carta();
                this.baraja[i].modificar(p, v);
                i++;
            }
        }
    }

    public void barajar(){
        int pos, pos2;
        Carta c1, c2;
        for (int p = 0; p < 250; p++) {
            pos = (int)(Math.random() * (39 + 1));
            pos2 = (int)(Math.random() * (39 + 1));
            c1 = this.baraja[pos];
            c2 = this.baraja[pos2];
            this.baraja[pos2] = c1;
            this.baraja[pos] = c2;
        }
    }

    public Carta[] escribir(){
        return this.baraja;
    }
}

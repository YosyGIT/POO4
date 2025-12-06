package cartas;

public class Baraja  {
    private Carta[] baraja;

    public Baraja(){
        this.baraja = new Carta[40];
        int i = 0;
        for (int p = 0; p < 4; p++) {
            for (int v = 0; v < 10; v++) {
                this.baraja[i] = new Carta(p,v);
                i++;
            }
        }
    }

    public void barajar(){
        int pos;
        int pos2;
        Carta c1 = new Carta();
        Carta c2 = new Carta();
        for (int p = 0; p < 250; p++) {
            pos = (int)(Math.random() * (39 + 1));
            pos2 = (int)(Math.random() * (39 + 1));
            c1 = this.baraja[pos];
            c2 = this.baraja[pos2];
            this.baraja[pos2] = c1;
            this.baraja[pos] = c2;
        }
    }

    public void escribir(){
        int i = 0;
        while(i != 40){
            System.out.println("Carta " + (i+1) + ": " + baraja[i].pasarATexto());
            i++;
        }
    }
}

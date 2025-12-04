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

    public void modificarBaraja(){
        int i = 0;
        for (int p = 0; p < 4; p++) {
            for (int v = 0; v < 10; v++) {

            }
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

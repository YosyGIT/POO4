package cartas;

/**
 * @author YosyGIT
 */
public class Baraja  {
    private Carta[] baraja;

    /**
     * En el constructor creamos un array de Cartas, hacemos uso de la clase modificar
     * para comprobar su funcionamiento.
     */
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

    /**
     * Un metodo que baraja las cartas para que tengan posiciones aleatorias
     */
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

    /**
     * Metodo que devuelve el array de Cartas para poder hacer uso del array
     * @return Devuelve el array creado anteriormente.
     */
    public Carta[] escribir(){
        return this.baraja;
    }
}

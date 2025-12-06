package cartas;

/**
 * @author YosyGIT
 */
public class MainCartas {
    public static void main(String[] args) {
        Baraja baraja1 = new Baraja();
        int i = 1;

        System.out.println("Baraja sin barajar: ");
        for (Carta c : baraja1.escribir()){
            System.out.println("Carta " + i + ": " + c.pasarATexto());
            i++;
        }
        i = 0;

        baraja1.barajar();
        System.out.println("\n" + "Baraja barajada: ");
        for (Carta c : baraja1.escribir()){
            System.out.println("Carta " + i + ": " + c.pasarATexto());
            i++;
        }
    }
}

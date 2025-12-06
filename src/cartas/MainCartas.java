package cartas;

public class MainCartas {
    public static void main(String[] args) {
        Baraja baraja1 = new Baraja();

        System.out.println("Baraja sin barajar: ");
        baraja1.escribir();
        baraja1.barajar();
        System.out.println("\n" + "Baraja barajada: ");
        baraja1.escribir();
    }
}

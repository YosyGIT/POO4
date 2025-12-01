package coordenadas;
import java.sql.SQLOutput;
import java.util.*;
/**
 * @author YosyGIT
 */
public class MainPunto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char caracter;

        Punto p1 = new Punto(-5,2);
        Punto p2 = new Punto(6,3);

        p1.cambiarCoods(34.5,67.8);
        p2.cambiarCoods(3.5, 5.7);
        p2.sumaCoords(p1);

        System.out.println(p1.copiar().toString() + "\n" +
                p2.copiar().toString() + "\n");
        System.out.println("Son iguales?: " + p1.iguales(p2) + "\n");
        System.out.println("La distancia entre los dos puntos es: " +
                p1.obtenerDistancia(p2));
        System.out.println();

        //Pruebas con la clase rectangulo
        Rectangulo r1 = new Rectangulo(9,5,p1);

        System.out.println("-Cambios de esquina en el rectangulo 1:");
        r1.cambiarEsquina(-5,7);
        System.out.println(r1.getEsquina().toString());
        r1.cambiarEsquina(p2);
        System.out.println(r1.getEsquina().toString() + "\n");

        System.out.println("-Dibujo del rectangulo, metodo asteriscos:");
        r1.dibujar();
        System.out.println();

        System.out.println("-Dibujo del rectangulo, metodo caracter:");
        System.out.print("Introduce un caracter para dibujar el rectangulo: ");
        caracter = in.next().charAt(0);
        r1.dibujar(caracter);
        System.out.println();

        System.out.println("-Comprobación del metodo interior, usamos punto 2 en el rectangulo: " + r1.interior(p2));
        System.out.println();

        System.out.println("Vertices del rectangulo: ");
        for (int i = 0; i < r1.obtenerVertices().length; i++){
            System.out.println((i+1) + " " + r1.obtenerVertices()[i].toString());
        }
    }
}

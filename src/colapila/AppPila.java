package colapila;

/**
 * @author YosyGIT
 */
import java.util.*;
public class AppPila {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int opcion = 0;
        String nombre;
        String atendido;

        Pila p1 = new Pila();
        Pila p2 = new Pila();
        Pila p3 = new Pila();

        Cola c1 = new Cola();

        p1.push("Ana");
        p1.push("Oscar");
        p1.push("Carmen");

        System.out.println("--Salida de pila: " + p1.pop());
        System.out.println("--Salida de pila: " + p1.pop());

        p1.push("Mateo");
        p1.push("Luisa");

        System.out.println("\n" + "---LISTADO P1---");
        p1.list();

        System.out.println("\n" + "--Espacios libres: " + p1.available());

        p2.push("Javier");
        p2.push("Lola");

        p3 = p1.add(p2);

        System.out.println("\n" + "---LISTADO P3---");
        p3.list();

        while (opcion != 4){
            System.out.println("\n" + "-----MENU COLA-----");
            System.out.println("1. Añadir una persona a la cola.");
            System.out.println("2. Atender a una persona.");
            System.out.println("3. Mostrar la lista de personas en la cola.");
            System.out.println("4. Salir");
            System.out.print("Escriba su opcion:");
            opcion = in.nextInt();
            in.nextLine();


            switch (opcion){
                case 1:
                    System.out.print("-Introduce el nombre de la persona:");
                    nombre = in.nextLine();
                    c1.add(nombre);
                break;

                case 2:
                    atendido = c1.poll();
                    if (atendido.equalsIgnoreCase("0")){
                        System.out.println("-La lista se encuentra vacia.");
                    }else{
                        System.out.println("-Persona atendida: " + atendido);
                    }
                break;

                case 3:
                    System.out.println("\n" + "---LISTADO---");
                    c1.list();
                break;

                case 4:
                    System.out.println("···Finalizando programa···");
                break;
            }
        }


    }
}

package colapila;

public class AppPila {
    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.push("Ana");
        p1.push("Oscar");
        p1.push("Carmen");
        System.out.println("Salida de pila: " + p1.pop());
        System.out.println("Salida de pila: " + p1.pop());
        p1.push("Mateo");
        p1.push("Luisa");
        System.out.println("\n" + "---LISTADO---");
        p1.list();
    }
}

package pruebaexamen;

public class AppCodificadora {
    public static void main(String[] args) {
        Agenda a1 = new Agenda();
        Contacto c1 = new Contacto("Jose","657948617");
        Contacto c2 = new Contacto("Alicia","657948646");
        Contacto c3 = new Contacto("Pepe","657948623");

        a1.agregarContactos(c1);
        a1.agregarContactos(c2);
        a1.agregarContactos(c3);

        System.out.println("Buscando contacto..." + "\n" + a1.buscarContactos("Jose"));
        System.out.println("Buscando contacto..." + "\n" + a1.buscarContactos("Salva"));
    }
}

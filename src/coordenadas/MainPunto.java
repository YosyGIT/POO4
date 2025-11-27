package coordenadas;

public class MainPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(34.5,12.2);
        Punto p2 = new Punto();

        p1.cambiarCoods(34.5,67.8);
        p2.copiar();
    }
}

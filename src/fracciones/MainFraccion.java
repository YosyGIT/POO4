package fracciones;

/**
 * @author YosyGIT
 */
public class MainFraccion {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(3,10);
        Fraccion f3 = new Fraccion();

        f1.cambiarFraccion(60,24);
        f1.simplificar();
        System.out.println("**f1 simplificada: " + f1.escribir());
        System.out.println("**Valor decimal de f1: " + f1.valorDecimal());

        f3.setNumerador(6);
        f3.setDenominador(4);

        f3.simplificar();
        System.out.println("**f3 simplificada: " + f3.escribir());

        f1 = f2.sumar(f3);
        System.out.println(f2.escribir() + "+" + f3.escribir() + "=" + f1.escribir());
        f1 = f2.dividir(f3);
        System.out.println(f2.escribir() + "/" + f3.escribir() + "=" + f1.escribir());
    }
}

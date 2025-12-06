package cartas;

/**
 * @author YosyGIT
 */
public class Carta {
    private int palo;
    private int valor;

    private static String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
    private static String[] valores = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};

    /**
     * Estos tres contructores te dan posibilidad de crear la carte dando parametros
     * o no dandoles y asignando por defecto As de Oros.
     * @param palo Los he puesto del 0 al 3 para no dejar en el array de String el
     *             primer hueco vacio.
     * @param valor Lo mismo que con los palos.
     */
    public Carta(int palo, int valor){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        if (valor >= 0 && valor <= 9){
            this.valor = valor;
        }
    }

    public Carta(int palo){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        this.valor = 0;
    }

    public Carta(){
        this.palo = 0;
        this.valor = 0;
    }

    /**
     * Un metodo estatico que maneja los numeros con los que creamos las cartas
     * en un array de Strings y asi podemos mostrar el nombre completo del palo y valor
     * @param p Palo de la carta
     * @param v Valor de la carta
     * @return Devolvemos un String con la traduccion de los numeros a palabras
     */
    private static String traductorBaraja(int p, int v){
        String textoPalo, textoValor;
        if (p >= 0 && p <= 3){
            textoPalo = palos[p];
        }else {
            textoPalo = "Palo de la carta fuera de rango";
        }
        if (v >= 0 && v <= 9){
            textoValor = valores[v];
        }else {
            textoValor = "Valor de la carta fuera de rango";
        }
        return textoValor + " de " + textoPalo;
    }

    /**
     * Con este metodo podemos modificar una carta que ya este creada
     * @param palo Palo de la carta
     * @param valor Valor de la carta
     */
    public void modificar(int palo, int valor){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        if (valor >= 0 && valor <= 9){
            this.valor = valor;
        }
    }

    /**
     * Llamamos al metodo estatico para poder hacer uso de ella en la clase Main
     * @return Devolvemos un String que hace uso del metodo traductorCartas
     */
    public String pasarATexto(){
        return Carta.traductorBaraja(this.palo, this.valor);
    }
}

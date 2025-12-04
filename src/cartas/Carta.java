package cartas;

public class Carta {
    private int palo;
    private int valor;

    private static String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
    private static String[] valores = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};

    public Carta(int palo){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        this.valor = 1;
    }

    public Carta(int palo, int valor){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        if (valor >= 0 && valor <= 9){
            this.valor = valor;
        }
    }

    public Carta(){
        this.palo = 0;
        this.valor = 0;
    }

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

    public void modificar(int palo, int valor){
        if (palo >= 0 && palo <= 3){
            this.palo = palo;
        }
        if (valor >= 0 && valor <= 9){
            this.valor = valor;
        }
    }

    public String pasarATexto(){
        return Carta.traductorBaraja(this.palo, this.valor);
    }
}

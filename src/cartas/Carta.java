package cartas;

public class Carta {
    private int [] palo = new int[4];
    private int [] valor = new int[10];

    public Carta(int[] palo){
        this.palo = palo;
        this.valor = new int[]{0};
    }

    public Carta(int[] palo, int[] valor){
        this.palo = palo;
        this.valor = valor;
    }

    public Carta(){
        this.palo = new int[]{0};
        this.valor = new int[]{0};
    }

    private static String traductorBaraja(int p, int v){
        String[] palo = {"Oros", "Bastros", "Espadas", "Copas"};
        String[] valor = {"As","2","3","4","5","6","Sota","Caballo","Rey"};

        return palo[p-1] + " " + valor[v-1];
    }

    public void modificar(int[] palo, int[] valor){
        this.palo = palo;
        this.valor = valor;
    }

    //public String pasarATexto(int palo, int valor){
      //  return
    //}
}

package colapila;

public class Pila {
    private String[] datos = new String [50];
    private static int contador = -1;

    public Pila (){

    }

    public boolean full (){
        return contador == 50;
    }

    public boolean empty (){
        return contador == 0;
    }

    public void push (String teclado){
        contador++;
        this.datos[contador] = teclado;
    }

    public String pop (){
        String salida = datos[contador];
        int copiaCont = contador;
        datos[contador] = "";
        contador--;
        return salida;
    }

    public void list (){
        for (int i = contador; i >= 0; i--){
            System.out.println(datos[i]);
        }
    }

    public void setEmpty(){
        for (int i = 0; i <= contador; i++){
            datos[i] = "";
        }
        contador = -1;
    }

}

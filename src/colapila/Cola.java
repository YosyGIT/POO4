package colapila;

public class Cola {
    private String[] cola = new String[50];
    private int contador = 0;

    public Cola(){

    }

    public void add(String teclado){
        if (contador < cola.length){
            cola[contador] = teclado;
            contador++;
        }
    }

    public boolean empty(){
        return contador == 0;
    }

    public String poll(){
        String salida = "0";
        if (contador != 0){
            salida = cola[0];
            for (int i = 0; i < contador - 1; i++){
                cola[i] = cola[i + 1];
            }
            contador--;
        }
        return salida;
    }

    public void list(){
        for (int i = 0; i < contador; i++){
            System.out.println(cola[i]);
        }
    }

    public void setEmpty(){
        for (int i = 0; i < contador; i++){
            cola[i] = "";
        }
        contador = 0;
    }

    public int available(){
        return cola.length - (contador + 1);
    }


}

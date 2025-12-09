package colapila;

/**
 * @author YosyGIT
 */
public class Pila {
    private String[] datos = new String [50];
    private int contador = 0;

    public Pila (){

    }

    public boolean full (){
        return contador == 49;
    }

    public boolean empty (){
        return contador == 0;
    }

    public void push (String teclado){
        if (contador < datos.length){
            this.datos[contador] = teclado;
            contador++;
        }
    }

    public String pop (){
        String salida = null;
        if (!empty()){
            salida = this.datos[contador];
            datos[contador] = "";
            contador--;
        }
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
        contador = 0;
    }

    public int available(){
        return datos.length - (contador + 1);
    }

    public Pila add(Pila p){
        Pila fusion = new Pila();
        int calculoEspacios;
        for (int i = 0; i <= this.contador; i++){
            fusion.push(this.datos[i]);
        }
        for (int j = 0; j < p.contador; j++){
            if (!fusion.full()){
                fusion.push(p.datos[j]);
            }
        }
        return fusion;
    }
}

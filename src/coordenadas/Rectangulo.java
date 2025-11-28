package coordenadas;
/**
 * @author YosyGIT
 */
public class Rectangulo {
    private double altura;
    private double anchura;
    private Punto esquina = new Punto();

    public Rectangulo(double altura, double anchura, Punto esquina){
        //Damos valor al rectangulo con los parametros
        this.altura = altura;
        this.anchura = anchura;
        //Creamos el punto
        this.esquina = esquina;
    }

    public Rectangulo(){

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Punto getEsquina() {
        return esquina;
    }

    public void setEsquina(Punto esquina) {
        this.esquina = esquina;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public void cambiarEsquina(double x, double y){
        this.esquina = new Punto(x,y);
    }

    public void cambiarEsquina(Punto esquina){
        this.esquina = esquina;
    }

    public void dibujar(){
        for (int i = 0; i <= altura; i++){
            for (int j = 0; j <= anchura; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}

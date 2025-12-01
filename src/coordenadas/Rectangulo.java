package coordenadas;
/**
 * @author YosyGIT
 */
public class Rectangulo {
    private double altura;
    private double anchura;
    private Punto esquina = new Punto();

    /**
     * Constructores del rectangulo
     * @param altura: Altura del rectangulo
     * @param anchura: Anchura del rectangulo
     * @param esquina: Punto del vertice superior izquierdo
     */
    public Rectangulo(double altura, double anchura, Punto esquina){
        //Damos valor al rectangulo con los parametros
        this.altura = altura;
        this.anchura = anchura;
        //Creamos el punto
        this.esquina = esquina;
    }

    public Rectangulo(){

    }

    /**
     * Getters and Setters de la clase rectangulo
     */
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

    /**
     * Metodo que cambia la esquina superior izquierda del rectangulo
     * @param x: Eje X del Punto
     * @param y: Eje Y del Punto
     */
    public void cambiarEsquina(double x, double y){
        this.esquina = new Punto(x,y);
    }

    /**
     * Metodo que cambia la esquina superior izquierda del rectangulo
     * @param esquina: Punto de cambio
     */
    public void cambiarEsquina(Punto esquina){
        this.esquina = esquina;
    }

    /**
     *Metodo que dibuja el rectangulo mediante asteriscos
     */
    public void dibujar(){
        for (int i = 0; i <= altura; i++){
            for (int j = 0; j <= anchura; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Metodo que dibuja el rectangulo con el caracter que le indiquemos
     * @param caracter: Caracter que mandamos introducir
     */
    public void dibujar(char caracter){
        for (int i = 0; i <= altura; i++){
            for (int j = 0; j <= anchura; j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    /**
     * Metodo que comprueba si un Punto esta en el interior del rectangulo
     * @param punto: Punto que comprobamos si esta en su interior
     * @return: Devuelve true si es correcto
     */
    public boolean interior(Punto punto){
        return punto.getX() >= this.esquina.getX() &&
               punto.getX() <= this.esquina.getX() + anchura &&
               punto.getY() <= this.esquina.getY() &&
               punto.getY() >= this.esquina.getY() - altura;
    }

    /**
     * Metodo que devuelve un array con los Puntos de cada vertice del rectangulo
     * @return: Devuelve Punto[]
     */
    public Punto[] obtenerVertices(){
        Punto[] puntos = new Punto[4];
        puntos[0] = this.esquina.copiar();
        puntos[1] = new Punto();
        puntos[1].cambiarCoods(this.esquina.getX() + this.anchura, this.esquina.getY());
        puntos[2] = new Punto();
        puntos[2].cambiarCoods(this.esquina.getX() + this.anchura, this.esquina.getY() - this.altura);
        puntos[3] = new Punto();
        puntos[3].cambiarCoods(this.esquina.getX(), this.esquina.getY() - this.altura);

        return puntos;
    }
}

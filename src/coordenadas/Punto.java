package coordenadas;
/**
 * @author YosyGIT
 */
public class Punto {
    private double x;
    private double y;

    /**
     * Constructores del objeto punto, interpretan un punto de coordenadas
     * @param x: Eje X de la coordenada.
     * @param y: Eje Y de la coordenada.
     */
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Metodos getters and setters.
     * @return
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Metodo para cambiar el valor tanto de X como de Y.
     * @param x: Eje x.
     * @param y: Eje y.
     */
    public void cambiarCoods(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo que devuelve la ubicación actual del punto
     * @return: Devuelve las coordenadas
     */
    public Punto copiar(){
        return new Punto(this.x, this.y);
    }

    /**
     * Metodo que compara las coordenadas de dos objetos de tipo Punto
     * @param p: Objeto con el que comparamos.
     * @return: Devolvemos si es true o false.
     */
    public boolean iguales(Punto p){
        boolean comprobacion = (this.x == p.x && this.y == p.y);
        return comprobacion;
    }

    /**
     * Metodo que suma las coordenadas de dos objetos de tipo Punto diferentes
     * @param p: El objeto con el que sumamos X e Y.
     */
    public void sumaCoords(Punto p){
        this.x = this.x + p.x;
        this.y = this.y + p.y;
    }

    /**
     * Metodo que nos permite saber cual es la distancia entre dos puntos.
     * Se basa en la formula de la distancia euclidiana del Teorema de Pitágoras.
     * @param p: Objeto tipo Punto.
     * @return: devuelve la distancia en Double.
     */
    public Double obtenerDistancia(Punto p){
        double diferenciaX = Math.pow(Math.max(p.getX(), this.x) - Math.min(p.getX(), this.x), 2);
        double diferenciaY = Math.pow(Math.max(p.getY(), this.y) - Math.min(p.getY(), this.y), 2);

        return Math.sqrt(diferenciaX + diferenciaY);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

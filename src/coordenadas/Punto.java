package coordenadas;

/**
 * @author YosyGIT
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Metodos getters and setters
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

    public void cambiarCoods(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void copiar(Punto p){
        Punto obj = new Punto();
        obj.x = p.x;
        obj.y = p.y;
        System.out.println("COPIA COORDEANDAS: " + "\n" +
                "X: " + obj.x + "\n" +
                "Y: " + obj.y);
    }

    public boolean iguales(Punto p){
        boolean comprobacion = (this.x == p.x && this.y == p.y);
        System.out.print("El punto X e Y son iguales?: ");

        return comprobacion;
    }

    public void sumaCoords(Punto p){
        p.x = this.x + p.x;
        p.y = this.y + p.y;
    }


}

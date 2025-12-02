package fracciones;

/**
 * @author YosyGIT
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     * Constructores para obtener o no datos por parametros
     * @param numerador: Numerador de la Fraccion
     * @param denominador: Denominador de la Fraccion
     */
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(){
        this.numerador = 1;
        this.denominador = 1;
    }

    /**
     * Getters and Setters
     * @return
     */
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void cambiarFraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Metodo para escribir la fraccion
     * @return: devuelve un String del numerador y denominador separado por "/"
     */
    public String escribir(){
        return "[" + this.numerador + "/" + this.denominador + "]";
    }

    /**
     * Devuelve el valor decimal de la Fraccion
     * @return: Devuelve un dato de tipo decimal (double)
     */
    public double valorDecimal(){
        double  valor = (double)this.numerador / this.denominador;
        return valor;
    }

    /**
     * Calcula el mcd de una Fraccion, es un metodo private porque solo se usara
     * para la creación de otros metodos dentro de esta clase
     * @param numero1: Numerador de la Fraccion
     * @param numero2: Denominador de la Fraccion
     * @return: Devuelve el mcd en un tipo de dato entero (int)
     */
    private static int mcd(int numero1, int numero2){
        if(numero1 <= 0 || numero2 <= 0){
            return 0;
        }else{
            int divisor = Math.min(numero1, numero2);
            while(numero1 % divisor != 0 || numero2 % divisor != 0){
                divisor--;
            }
            return divisor;
        }
    }

    /**
     * Calcula el mcm de una Funcion, el metodo es private porque solon se usa
     * para la creación de otros metodos dentro de esta clase
     * @param numero1: Numerador de la Fraccion
     * @param numero2: Denominador de la Fraccion
     * @return: Devuelve el mcm en un tipo de dato entero (int)
     */
    private static int mcm(int numero1, int numero2){
        if (numero1 <= 0 || numero2 <= 0){
            return 0;
        }else {
            int multiplo = Math.max(numero1, numero2);
            while(multiplo % numero1 != 0 || multiplo % numero2 != 0){
                multiplo++;
            }
            return multiplo;
        }
    }

    /**
     * Metodo usado para simplificar la Fraccion
     */
    public void simplificar(){
        int simplificador = Fraccion.mcd(this.numerador,this.denominador);
        this.numerador /=  simplificador;
        this.denominador /= simplificador;
    }

    /**
     * Metodo que suma dos Fracciones
     * @param fraccion: Fraccion con la que se sumamos la Fraccion con la que
     *                llamamos al metodo.
     * @return: Devuelve una nueva Fraccion con el resultado
     */
    public Fraccion sumar(Fraccion fraccion){
        Fraccion suma = new Fraccion();
        if (this.denominador == fraccion.denominador){
            suma.numerador = this.numerador + fraccion.numerador;
            suma.denominador = fraccion.denominador;
        }else {
            int comunDenominador = Fraccion.mcm(this.denominador,fraccion.denominador);
            int numerador1 = this.numerador*(comunDenominador / this.denominador);
            int numerador2 = fraccion.numerador*(comunDenominador / fraccion.denominador);
            suma.denominador = comunDenominador;
            suma.numerador = numerador1 + numerador2;
        }
        suma.simplificar();
        return suma;
    }

    /**
     * Metodo que resta dos Fracciones
     * @param fraccion: Fraccion con la que restamos la Fraccion con la que
     *                llamamos al metodos
     * @return: Devuelve una nueva Fraccion con el resultado
     */
    public Fraccion restar(Fraccion fraccion){
        Fraccion resta = new Fraccion();
        if (this.denominador == fraccion.denominador){
            resta.numerador = this.numerador - fraccion.numerador;
            resta.denominador = fraccion.denominador;
        }else{
            int comunDenominador = Fraccion.mcm(this.denominador,fraccion.denominador);
            int numerador1 = this.numerador*(comunDenominador / this.denominador);
            int numerador2 = fraccion.numerador*(comunDenominador / fraccion.denominador);
            resta.denominador = comunDenominador;
            resta.numerador = numerador1 - numerador2;
        }
        resta.simplificar();
        return resta;
    }

    /**
     * Metodo que multiplica dos Fracciones
     * @param fraccion: Fraccion con la que multiplicamos la Fraccion con la que
     *              llamamos al metodos
     * @return: Devuelve una nueva Fraccion con el resultado
     */
    public Fraccion multiplicar(Fraccion fraccion){
        Fraccion multiplica = new Fraccion();
        multiplica.numerador = this.numerador * fraccion.numerador;
        multiplica.denominador = this.denominador * fraccion.denominador;
        multiplica.simplificar();
        return multiplica;
    }

    /**
     * Metodo que divide dos Fracciones
     * @param fraccion: Fraccion con la que dividimos la Fraccion con la que
     *                llamamos al metodos
     * @return: Devuelve una nueva Fraccion con el resultado
     */
    public Fraccion dividir(Fraccion fraccion){
        Fraccion dividir = new Fraccion();
        dividir.numerador = this.numerador * fraccion.denominador;
        dividir.denominador = this.denominador * fraccion.numerador;
        dividir.simplificar();
        return dividir;
    }
}

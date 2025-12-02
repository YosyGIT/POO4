package fracciones;

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

    public String escribir(){
        return "[" + this.numerador + "/" + this.denominador + "]";
    }

    public double valorDecimal(){
        double  valor = (double)this.numerador / this.denominador;
        return valor;
    }

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

    public void simplificar(){
        int simplificador = Fraccion.mcd(this.numerador,this.denominador);
        this.numerador /=  simplificador;
        this.denominador /= simplificador;
    }

    public Fraccion sumar(Fraccion fraccion){
        Fraccion suma = new Fraccion();
        if (this.denominador == fraccion.denominador){
            suma.numerador = this.numerador + fraccion.numerador;
            suma.denominador = fraccion.denominador;
        }else {
            int mcm1 = Fraccion.mcm(this.numerador,this.denominador);
            int mcm2 = Fraccion.mcm(fraccion.numerador,fraccion.denominador);
            this.numerador /= mcm1;
            this.denominador /= mcm1;
            fraccion.numerador /= mcm2;
            fraccion.denominador /= mcm2;
            suma.numerador = this.numerador + fraccion.numerador;
            suma.denominador = this.denominador + fraccion.denominador;
        }
        return suma;
    }
}

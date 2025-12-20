package pruebaexamen;

public class Contacto {
    private String nombreCodificado;
    private String telefonoCodificado;

    public Contacto(String nombre, String telefono) {
        char[] pass = nombre.toCharArray();
        char[] pass2 = telefono.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] == 'a' || pass[i] == 'e' || pass[i] == 'i' || pass[i] == 'o' || pass[i] == 'u') {
                pass[i] = '*';
            }
        }
        this.nombreCodificado = new String(pass);
        for (int j = 0; j < pass2.length; j++) {
            if (pass2[j] == 'a' || pass2[j] == 'e' || pass2[j] == 'i' || pass2[j] == 'o' || pass2[j] == 'u') {
                pass2[j] = '*';
            }
        }
        this.telefonoCodificado = new String(pass2);
    }

    private String decodificar(String cadenaCodificada) {
        char[] pass = cadenaCodificada.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] == '*') {
                pass[i] = 'e';
            }
        }
        return new String(pass);
    }

    public String obtenerInformacion(){
        return "NOMBRE: " + decodificar(this.nombreCodificado) + "\n" +
                "TELEFONO: " + decodificar(this.telefonoCodificado);
    }
}

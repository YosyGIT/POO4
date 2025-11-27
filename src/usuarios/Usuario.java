package usuarios;
/**
 * @author YosyGIT
 */
public class Usuario {
    private String nombre;
    private String password;

    /**
     * Crear un usuario usando el nombre y la contraseña
     * @param nombre: nombre del usuario
     * @param password: contraseña del usuario
     */
    public Usuario(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
        this.password = "";
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + "\n" +
                "Contraseña: " + this.password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

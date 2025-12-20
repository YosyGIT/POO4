package pruebaexamen;

import java.util.Arrays;

public class Agenda {
    private Contacto[] contactos;
    private int numeroContactos = 0;

    public Agenda(){
        contactos = new Contacto[10];
    }

    public boolean agregarContactos(Contacto nuevoContacto){
        boolean respuesta = false;
        if (numeroContactos != 10){
            contactos[numeroContactos] = nuevoContacto;
            numeroContactos++;
            respuesta = true;
        }
        return respuesta;
    }

    public String buscarContactos(String nombreBuscado){
        String[] pass = new String[numeroContactos * 4];
        char[] pass2;
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++){
            pass[i] = Arrays.toString(contactos[i].obtenerInformacion().split(" "));
        }
        while(!encontrado){
            for (int j = 0; j < pass.length; j++){
                pass2 = pass[j].toCharArray();
                for (int k = 0; k < pass2.length; k++){
                    if (pass2[k] == '*') {
                        pass2[k] = 'e';
                    }
                }
                pass[j] = new String(pass2);
                if (pass[j].equalsIgnoreCase(nombreBuscado)){
                    encontrado = true;
                }
            }
        }
        return encontrado?contactos[numeroContactos].obtenerInformacion():"Contacto no encontrado";
    }
}

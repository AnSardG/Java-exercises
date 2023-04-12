
/**
 *
 * @author Antonio Sard González
 */
public class CPersona {
    //Atributos:

    private String nombre, direccion;
    private long telefono;
    //Constructores:

    public CPersona() {
    }

    public CPersona(String nombre, String dir, long tel) {
        asignarNombre(nombre);
        asignarDireccion(dir);
        asignarTelefono(tel);
    }
    //Métodos:

    public void asignarNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }//Fin Si
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarDireccion(String dir) {
        if (dir != null) {
            direccion = dir;
        } else {
            direccion = "";
        }//Fin Si
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public void asignarTelefono(long tel){
        telefono = tel;
    }
    public long obtenerTelefono(){
        return telefono;
    }
}

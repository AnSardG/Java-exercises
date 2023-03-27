/**
 *
 * @author Antonio Sard González
 */
public class Persona {
    //Atributos:
    private String nombre, apellidos;
    //Constructores:
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    //Métodos:
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
}

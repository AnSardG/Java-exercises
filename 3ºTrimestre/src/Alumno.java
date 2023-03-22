
/**
 *
 * @author Antonio Sard González
 */
public class Alumno {
    //Atributos:
    private byte cod;
    private String nombre;
    private float nota;
    //Constructores:
    public Alumno(){
    }
    public Alumno(byte cod, String nombre, float nota){
        this.cod = cod;
        this.nombre = nombre;
        this.nota = nota;
    }
    //Métodos:
    public byte getCod(){
        return cod;
    }
    public String getNombre(){
        return nombre;
    }
    public float getNota(){
        return nota;
    }
}   

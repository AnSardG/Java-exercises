
/**
 *
 * @author Antonio Sard González
 */
public class Alumno {
    //Atributos:

    private String nombre, apellidos;
    private float notaTeoria, notaPractica;
    private float aula;
    //Constructores:

    public Alumno(String nombre, String apellidos, float notaTeoria,
            float notaPractica, float aula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
        this.aula = aula;
    }

    public Alumno(Alumno alumno) {
        this.nombre = alumno.nombre;
        this.apellidos = alumno.apellidos;
        this.notaTeoria = alumno.notaTeoria;
        this.notaPractica = alumno.notaPractica;
        this.aula = alumno.aula;
    }
    //Getters y Setters:

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public float getTeoria() {
        return this.notaTeoria;
    }

    public float getPractica() {
        return this.notaPractica;
    }

    public float getAula() {
        return this.aula;
    }

}

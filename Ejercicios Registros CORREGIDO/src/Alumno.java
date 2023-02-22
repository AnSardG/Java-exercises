/**
 *
 * @author Antonio Sard González
 */
public class Alumno {
    //Atributos:
    private String nombre, apellidos;
    private float notaTeoria, notaPractica;
    private static float notaMedia, aula=2.2F;
    private static byte numAlumnos;
    //Constructores:
    public Alumno(String nombre, String apellidos, float notaTeoria, 
            float notaPractica){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.notaTeoria=notaTeoria;
        this.notaPractica=notaPractica;
        Alumno.numAlumnos++;
        Alumno.notaMedia=(Alumno.notaMedia+this.getNotaTotal());
    }
    //Getters y Setters:
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public float getNotaTeoria(){
        return this.notaTeoria;
    }
    public float getNotaPractica(){
        return this.notaPractica;
    }
    public float getNotaTotal(){
        return (this.notaPractica+this.notaTeoria)/2;
    }
    public static float getNotaMedia(){
        return Alumno.notaMedia/Alumno.numAlumnos;
    }
    public static float getAula(){
        return Alumno.aula;
    }
    public static byte getAlumnos(){
        return Alumno.numAlumnos;
    }
}

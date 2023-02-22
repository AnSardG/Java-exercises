/**
 *
 * @author Antonio Sard González
 */
public class Empleado {
    //Atributos:
    private String nombre, apellidos;
    private int departamento, seccion;
    private float sueldo;
    //Constructores:
    public Empleado(String nombre, String apellidos, int departamento, 
            int seccion, float sueldo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.departamento=departamento;
        this.seccion=seccion;
        this.sueldo=sueldo;
    }
    public Empleado(Empleado emp){
        this.nombre=emp.getNombre();
        this.apellidos=emp.getApellidos();
        this.departamento=emp.getDepartamento();
        this.seccion=emp.getSeccion();
        this.sueldo=emp.getSueldo();
    }
    //Getters y Setters:
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public int getDepartamento(){
        return this.departamento;
    }
    public int getSeccion(){
        return this.seccion;
    }
    public float getSueldo(){
        return this.sueldo;
    }
}
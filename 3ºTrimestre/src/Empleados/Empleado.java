package Empleados;

/**
 *
 * @author Administrador
 */
public class Empleado extends Persona implements Comparable<Empleado> {
    //Atributos:
    private float sueldoBase;
    //Constructores:
    public Empleado(String nombre, String apellidos, float sueldoBase){
        super(nombre, apellidos);
        this.sueldoBase = sueldoBase;
    }
    //Métodos:
    public float getSueldoBase(){
        return sueldoBase;
    }
    public void setSueldoBase(float sueldo){
        this.sueldoBase = sueldo;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getNombre().compareToIgnoreCase(o.getNombre());
    }
}

/**
 *
 * @author Administrador
 */
public class Empleado extends Persona {
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
}

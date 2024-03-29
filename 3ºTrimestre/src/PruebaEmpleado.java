import Empleados.ComparaEmpleadoPorSueldo;
import Empleados.Persona;
import Empleados.Encargado;
import Empleados.Empleado;


/**
 *
 * @author Antonio Sard González
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        //Entorno:
        Empleado e1, e2, e3;
        Persona p1;
        Encargado en1;
        ComparaEmpleadoPorSueldo cs;
        //Algoritmo:
        p1 = new Persona("Pepe", "González");
        System.out.println("Nombre: "+p1.getNombre()+"\tApellidos: "+p1.getApellidos());
        e1 = new Empleado("Juan", "Alondiga", 2345.23F);
        e2 = new Empleado("Pepe", "B", 1223.23F);
        e3 = new Empleado("Luis", "C", 3456.23F);
        System.out.println("Nombre: "+e1.getNombre()+"\tApellidos: "+e1.getApellidos() 
                +"\tSueldo base: "+e1.getSueldoBase());
        en1 = new Encargado("Luis", "Gallardon", 2500.23F);
        
        System.out.println("Nombre: "+en1.getNombre()+"\tApellidos: "+en1.getApellidos() 
                +"\tSueldo base: "+en1.getSueldoBase());
        System.out.println("PRUEBAS COMPARATOR");
        cs = new ComparaEmpleadoPorSueldo();
        if(cs.compare(e2, e2) < 0){
            System.out.println("El empleado 1 tiene menos sueldo");
        }else if(cs.compare(e2, e2) > 0){
            System.out.println("El empleado 1 tiene más sueldo");
        }else{
            System.out.println("El empleado 1 tiene el mismo sueldo");
        }
    }//Fin Programa

}

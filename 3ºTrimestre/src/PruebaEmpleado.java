
/**
 *
 * @author Antonio Sard González
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        //Entorno:
        Empleado e1;
        Persona p1;
        Encargado en1;
        //Algoritmo:
        p1 = new Persona("Pepe", "González");
        System.out.println("Nombre: "+p1.getNombre()+"\tApellidos: "+p1.getApellidos());
        e1 = new Empleado("Juan", "Alondiga", 2345.23F);
        System.out.println("Nombre: "+e1.getNombre()+"\tApellidos: "+e1.getApellidos() 
                +"\tSueldo base: "+e1.getSueldoBase());
        en1 = new Encargado("Luis", "Gallardon", 2500.23F);
        System.out.println("Nombre: "+en1.getNombre()+"\tApellidos: "+en1.getApellidos() 
                +"\tSueldo base: "+en1.getSueldoBase());
    }//Fin Programa

}


/**
 *
 * @author Antonio Sard González
 */
public class Ej1 {

    public static boolean deseaContinuar() {
        //Entorno
        char opcion;
        //Algoritmo:
        do {
            System.out.print("¿Desea continuar? (S/N): ");
            opcion = Leer.datoChar();
        } while (opcion != 's' && opcion != 'S' && opcion != 'n' && opcion != 'N');
        return opcion == 's' || opcion == 'S';
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        Empleado emp, empMax, empMin;
        String nombre, apellidos;
        int departamento, seccion;
        float sueldo, sueldoMin, sueldoMax;
        byte cantEmpleados;
        //Algoritmo:
        sueldoMin = 1000.1F;
        sueldoMax = 999.99F;
        cantEmpleados = 0;
        empMax = null;
        empMin = null;
        do {
            do {
                System.out.print("Introduzca el nombre (max. 20 caracteres): ");
                nombre = Leer.dato();
            } while (nombre.isEmpty() || nombre.length() > 20);
            do {
                System.out.print("Introduzca los apellidos (max. 35 caracteres): ");
                apellidos = Leer.dato();
            } while (apellidos.isEmpty() || apellidos.length() > 35);
            do {

                System.out.print("Introduzca un departamento válido (1-9999): ");
                departamento = Leer.datoInt();
            } while (departamento < 1 || departamento > 9999);
            do {

                System.out.print("Introduzca una sección válida (1-99): ");
                seccion = Leer.datoInt();
            } while (seccion < 1 || seccion > 99);
            do {

                System.out.print("Introduzca un sueldo válido (1000-9999,99€): ");
                sueldo = Leer.datoFloat();
            } while (sueldo < 1000 || sueldo > 9999.99F);
            emp = new Empleado(nombre, apellidos, departamento, seccion, sueldo);
            if (emp.getSueldo() > sueldoMax) {
                sueldoMax = emp.getSueldo();
                empMax = new Empleado(nombre, apellidos, departamento, seccion
                        , sueldo);
            }//Fin Si
            if (emp.getSueldo() < sueldoMin) {
                sueldoMin = emp.getSueldo();
                empMin = new Empleado(nombre, apellidos, departamento, seccion
                        , sueldo);
            }//Fin Si
            cantEmpleados = (byte) (cantEmpleados + 1);
        } while (deseaContinuar() && cantEmpleados < 101);
        System.out.println("-----------------------------");
        System.out.println("Empleado con el sueldo máximo: ");
        System.out.println("Nombre: " + empMax.getNombre());
        System.out.println("Apellidos: " + empMax.getApellidos());
        System.out.println("Departamento: " + empMax.getDepartamento());
        System.out.println("Sección: " + empMax.getSeccion());
        System.out.println("Sueldo: " + empMax.getSueldo());
        System.out.println("-----------------------------");
        System.out.println("Empleado con el sueldo mínimo: ");
        System.out.println("Nombre: " + empMin.getNombre());
        System.out.println("Apellidos: " + empMin.getApellidos());
        System.out.println("Departamento: " + empMin.getDepartamento());
        System.out.println("Sección: " + empMin.getSeccion());
        System.out.println("Sueldo: " + empMin.getSueldo());
        System.out.println("-----------------------------");
    }//Fin Programa
}

/**
 *
 * @author Antonio Sard González
 */
public class Ej1 {

    public static byte leeByte() {
        //Entorno:
        short dato;
        //Algoritmo:
        dato = Leer.datoShort();
        while (dato < Byte.MIN_VALUE || dato > Byte.MAX_VALUE) {
            System.out.print("Ese dato no es válido. Teclee otro: ");
            dato = Leer.datoShort();
        }//Fin Mientras
        return (byte) dato;

    }

    public static Empleado leerEmpleado() {
        //Entorno:
        String nombre, apellidos;
        byte departamento, seccion;
        float sueldo;
        //Algoritmo:
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
            departamento = Ej1.leeByte();
        } while (departamento < 1 || departamento > 9999);
        do {

            System.out.print("Introduzca una sección válida (1-99): ");
            seccion = Ej1.leeByte();
        } while (seccion < 1 || seccion > 99);
        do {
            System.out.print("Introduzca un sueldo válido (1000-9999,99€): ");
            sueldo = Leer.datoFloat();
        } while (sueldo < 1000 || sueldo > 9999.99F);

        return new Empleado(nombre, apellidos, departamento, seccion, sueldo);
    }

    public static void muestraEmpleado(Empleado emp) {
        System.out.println("Nombre: " + emp.getNombre());
        System.out.println("Apellidos: " + emp.getApellidos());
        System.out.println("Departamento: " + emp.getDepartamento());
        System.out.println("Sección: " + emp.getSeccion());
        System.out.println("Sueldo: " + emp.getSueldo());
    }

    public static boolean deseaContinuar() {
        //Entorno
        String opcion;

        //Algoritmo:

        do {
            System.out.print("¿Desea continuar? (S/N): ");
            opcion = Leer.dato();
        } while (opcion.length() != 1 || "sSnN".indexOf(opcion) < 0);

        return opcion.equalsIgnoreCase("S");
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        Empleado emp, empMax, empMin;
        byte cantEmpleados;
        //Algoritmo:
        emp = Ej1.leerEmpleado();
        empMax = emp;
        empMin = emp;
        cantEmpleados = 1;
        while (Ej1.deseaContinuar() && cantEmpleados <= 100) {
            emp = Ej1.leerEmpleado();
            cantEmpleados++;
            if (emp.getSueldo() > empMax.getSueldo()) {
                empMax = emp;
            } else {
                if (emp.getSueldo() < empMin.getSueldo()) {
                    empMin = emp;
                }//Fin Si
            }//Fin Si
        }//Fin Mientras
        System.out.println("Empleado con el sueldo máximo: ");
        Ej1.muestraEmpleado(empMax);
        System.out.println("Empleado con el sueldo mínimo: ");
        Ej1.muestraEmpleado(empMin);
    }//Fin Programa
}
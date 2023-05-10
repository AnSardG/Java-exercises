package Empleados;

import java.util.Comparator;

/**
 *
 * @author Antonio Sard González
 */
public class ComparaEmpleadoPorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int)(o1.getSueldoBase() - o2.getSueldoBase());
    }
}

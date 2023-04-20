
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Antonio Sard González
 */
enum Estado {

    ACTIVO(1), INACTIVO(0), SUSPENDIDO(-1);
    private int numEstado;

    private Estado(int numEstado) {
        this.numEstado = numEstado;
    }

    int getEstado() {
        return numEstado;
    }
}



class EjemploAlumno {

    String nombre, apellidos;
    Estado estado;

    EjemploAlumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        estado = Estado.SUSPENDIDO;
    }

    EjemploAlumno(String nombre, String apellidos, Estado estado) throws IllegalArgumentException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
    }

    String getNombre() {
        return nombre;
    }

    String getApellidos() {
        return apellidos;
    }

    String getEstado() {
        return estado.toString();
    }
}

public class PruebaEnum {

    public static void main(String[] args) {
        //Entorno:
        List<EjemploAlumno> alumnos;
        ListIterator<EjemploAlumno> iAlumno;
        String nombre, apellidos;
        Estado estado;
        int i;
        //Algoritmo:
        alumnos = new ArrayList();
        do {
            System.out.print("Nombre: ");
            nombre = Leer.dato();
            System.out.print("Apellidos: ");
            apellidos = Leer.dato();
            try {
                System.out.print("Estado: ");
                estado = Estado.valueOf(Leer.dato().toUpperCase());
                alumnos.add(new EjemploAlumno(nombre, apellidos, estado));
            } catch (IllegalArgumentException iae) {
                alumnos.add(new EjemploAlumno(nombre, apellidos));
            }
        } while (Utilidades.continuar());
        iAlumno = alumnos.listIterator();
        i = 0;
        while (iAlumno.hasNext()) {
            System.out.println("Nombre: " + alumnos.get(i).getNombre());
            System.out.println("Apellidos: " + alumnos.get(i).getApellidos());
            System.out.println("Estado: " + alumnos.get(i).getEstado());
            i++;
            iAlumno.next();
        }
    }//Fin Programa
}

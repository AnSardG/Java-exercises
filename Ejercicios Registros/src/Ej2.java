
/**
 *
 * @author Antonio Sard González
 */
public class Ej2 {

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
        Alumno alumno, alumnoMayorNota;
        String nombre, apellidos;
        float notaTeoria, notaPractica, mayorNota;
        //Algoritmo:
        mayorNota = -1;
        alumnoMayorNota = null;
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
                System.out.print("Introduzca la nota teórica (0-10): ");
                notaTeoria = Leer.datoFloat();
            } while (notaTeoria < 0 || notaTeoria > 10);
            do {
                System.out.print("Introduzca la nota práctica (0-10): ");
                notaPractica = Leer.datoFloat();
            } while (notaPractica < 0 || notaPractica > 10);
            alumno = new Alumno(nombre, apellidos, notaTeoria, notaPractica);
            if (alumno.getNotaTotal() > mayorNota) {
                alumnoMayorNota = new Alumno(nombre, apellidos, notaTeoria, notaPractica);
                mayorNota=alumnoMayorNota.getNotaTotal();
            }//Fin Si
        } while (deseaContinuar() && Alumno.getAlumnos() <= 30);
        System.out.println("-----------------------------");
        System.out.println("El alumno con la mayor nota tiene los siguientes datos: ");
        System.out.println("Nombre completo: " + alumnoMayorNota.getNombre() + " "
                + alumnoMayorNota.getApellidos());
        System.out.println("Nota: " + alumnoMayorNota.getNotaTotal());
        System.out.println("Aula: " + Alumno.getAula());
        System.out.println("-----------------------------");
        System.out.println("La nota media del grupo es: " + Alumno.getNotaMedia());
    }//Fin Programa
}

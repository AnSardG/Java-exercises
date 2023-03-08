
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

    public static Alumno pideAlumno() {
        //Entorno:
        String nombre, apellidos;
        float notaTeoria, notaPractica, aula;
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
            System.out.print("Introduzca la nota teórica (0-10): ");
            notaTeoria = Leer.datoFloat();
        } while (notaTeoria < 0 || notaTeoria > 10);
        do {
            System.out.print("Introduzca la nota práctica (0-10): ");
            notaPractica = Leer.datoFloat();
        } while (notaPractica < 0 || notaPractica > 10);
        System.out.print("Introduzca el aula: ");
        aula = Leer.datoFloat();
        return new Alumno(nombre, apellidos, notaTeoria, notaPractica, aula);
    }

    public static void main(String[] args) {
        //Entorno:
        Alumno alumno, alumnoMayorNota;
        float mayorNota, notaMedia;
        byte numAlumnos;
        //Algoritmo:
        alumno = Ej2.pideAlumno();
        alumnoMayorNota = alumno;
        mayorNota = (alumnoMayorNota.getPractica() + alumnoMayorNota.getTeoria()) / 2;
        numAlumnos = 1;
        notaMedia = (alumno.getTeoria() + alumno.getPractica()) / 2;
        while (deseaContinuar() && numAlumnos <= 30) {
            alumno = Ej2.pideAlumno();
            if ((alumno.getTeoria() + alumno.getPractica()) / 2 > mayorNota) {
                alumnoMayorNota = new Alumno(alumno);
                mayorNota = (alumnoMayorNota.getPractica()
                        + alumnoMayorNota.getTeoria()) / 2;
            }//Fin Si
            notaMedia += (alumno.getTeoria() + alumno.getPractica()) / 2;
            numAlumnos++;
        }//Fin Mientras
        System.out.println("-----------------------------");
        System.out.println("El alumno con la mayor nota tiene los siguientes datos: ");
        System.out.println("Nombre completo: " + alumnoMayorNota.getNombre() + " "
                + alumnoMayorNota.getApellidos());
        System.out.println("Nota: " + (alumnoMayorNota.getPractica()
                + alumnoMayorNota.getTeoria()) / 2);
        System.out.println("Aula: " + alumnoMayorNota.getAula());
        System.out.println("-----------------------------");
        System.out.println("La nota media del grupo es: " + notaMedia / numAlumnos);
    }//Fin Programa
}

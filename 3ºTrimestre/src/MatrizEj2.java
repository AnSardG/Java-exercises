
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj2 {

    public static void main(String[] args) {
        //Entorno:
        final byte ALUMNOS = 10;
        final byte ASIGNATURAS = 4;
        byte alumno, asignatura;
        float nota, notaTotal;
        //Algoritmo:
        for (alumno = 1; alumno <= ALUMNOS; alumno++) {
            notaTotal = 0;
            System.out.println("Introduzca las notas del alumno " + alumno + ": ");
            for (asignatura = 1; asignatura <= ASIGNATURAS; asignatura++) {
                do {
                    System.out.print("\tNota " + asignatura + ": ");
                    nota = Leer.datoFloat();
                } while (nota < 0 || nota > 10);
                notaTotal += nota;
            }//Fin Para
            System.out.println("\tLa media es: " + notaTotal / ASIGNATURAS);
        }//Fin Programa
    }
}
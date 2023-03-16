
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj2 {

    public static void main(String[] args) {
        //Entorno:
        byte alumno, asignatura;
        float nota, notaTotal;
        //Algoritmo:
        for (alumno = 1; alumno <= 10; alumno++) {
            notaTotal = 0;
            System.out.println("Introduzca las notas del alumno " + alumno + ": ");
            for (asignatura = 1; asignatura <= 4; asignatura++) {
                do {
                    System.out.print("\tNota " + asignatura + ": ");
                    nota = Leer.datoFloat();
                } while (nota < 0 || nota > 10);
                notaTotal += nota;
            }
            System.out.println("\tLa media es: " + notaTotal / (asignatura - 1));
        }
    }
}
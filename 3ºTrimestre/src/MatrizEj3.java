
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj3 {

    public static void main(String[] args) {
        //Entorno:
        final byte ASIGNATURAS = 4;
        float[] notaTotal;
        float nota;
        byte asignatura, alu;
        //Algoritmo:
        notaTotal = new float[10];
        for (alu = 0; alu < notaTotal.length; alu++) {
            System.out.println("Introduzca las notas del alumno " + (alu + 1) + ". ");
            for (asignatura = 1; asignatura <= ASIGNATURAS; asignatura++) {
                do {
                    System.out.print("\tNota " + asignatura + ": ");
                    nota = Leer.datoFloat();
                } while (nota < 0 || nota > 10);
                notaTotal[alu] += nota;
            }//Fin Para
            notaTotal[alu] /= ASIGNATURAS;
        }//Fin Para
        for (alu = 0; alu < notaTotal.length; alu++){
            System.out.println("Nota media alumno "+(alu+1)+": "+notaTotal[alu]);
        }//Fin Para
    }//Fin Programa
}

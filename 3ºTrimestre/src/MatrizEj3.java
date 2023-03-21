
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj3 {

    public static void main(String[] args) {
        //Entorno:
        float[] alumno;
        float nota;
        byte asignatura, i;
        //Algoritmo:
        alumno = new float[10];
        for (i = 0; i < alumno.length; i++) {
            System.out.println("Introduzca las notas del alumno " + (i + 1) + ". ");
            for (asignatura = 1; asignatura <= 4; asignatura++) {
                do {
                    System.out.print("\tNota " + asignatura + ": ");
                    nota = Leer.datoFloat();
                } while (nota < 0 || nota > 10);
                alumno[i] += nota;
            }//Fin Para
            alumno[i] /= asignatura - 1;
        }//Fin Para
        for (i = 0; i < alumno.length; i++){
            System.out.println("Nota media alumno "+(i+1)+": "+alumno[i]);
        }//Fin Para
    }//Fin Programa
}

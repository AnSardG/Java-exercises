
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj4 {

    public static void main(String[] args) {
        //Entorno:
        float[][] alumno;
        float media;
        byte asignatura, col;
        String linea;
        //Algoritmo:
        alumno = new float[4][10];
        for (col = 0; col < alumno[0].length; col++) {
            System.out.println("Introduzca las notas del alumno " + (col + 1) + ". ");
            for (asignatura = 0; asignatura < alumno.length; asignatura++) {
                do {
                    System.out.print("\tNota " + (asignatura + 1) + ": ");
                    alumno[asignatura][col] = Leer.datoFloat();
                } while (alumno[asignatura][col] < 0 || alumno[asignatura][col] > 10);
            }//Fin Para
        }//Fin Para
        for (col = 0; col < alumno[0].length; col++) {
            linea = "Nota media del alumno " + (col + 1) + ", con las notas ";
            asignatura = 0;
            linea += alumno[asignatura][col];
            media = alumno[asignatura][col];
            for (asignatura = 1; asignatura < alumno.length; asignatura++) {
                linea += ", " + alumno[asignatura][col];
                media += alumno[asignatura][col];
            }//Fin Para
            media /= alumno.length;
            linea += " es: " + media + ".";
            System.out.println(linea);
        }//Fin Para
    }//Fin Programa
}

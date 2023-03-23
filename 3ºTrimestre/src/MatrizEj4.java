
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj4 {

    public static void main(String[] args) {
        //Entorno:
        float[][] alumno;
        float media;
        byte asignatura, alu;
        String linea;
        //Algoritmo:
        alumno = new float[4][10];
        for (alu = 0; alu < alumno[0].length; alu++) {
            System.out.println("Introduzca las notas del alumno " + (alu + 1) + ". ");
            for (asignatura = 0; asignatura < alumno.length; asignatura++) {
                do {
                    System.out.print("\tNota " + (asignatura + 1) + ": ");
                    alumno[asignatura][alu] = Leer.datoFloat();
                } while (alumno[asignatura][alu] < 0 || alumno[asignatura][alu] > 10);
            }//Fin Para
        }//Fin Para
        for (alu = 0; alu < alumno[0].length; alu++) {
            linea = "Nota media del alumno " + (alu + 1) + ", con las notas "
                    +alumno[0][alu];
            media = alumno[0][alu];
            for (asignatura = 1; asignatura < alumno.length; asignatura++) {
                linea += ", " + alumno[asignatura][alu];
                media += alumno[asignatura][alu];
            }//Fin Para
            media /= alumno.length;
            linea += " es: " + media + ".";
            System.out.println(linea);
        }//Fin Para
    }//Fin Programa
}

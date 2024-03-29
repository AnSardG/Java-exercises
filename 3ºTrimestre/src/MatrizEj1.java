
/**
 *
 * @author Antonio Sard González
 */
public class MatrizEj1 {

    public static void main(String[] args) {
        //Entorno:
// Matriz 4x10
        float[][] alumno = {
            {9, 4, 8.25F, 6, 10, 2.25F, 1.75F, 7.25F, 3, 5.5F},
            {7.75F, 7, 9.25F, 2.5F, 5, 6, 3.5F, 6.75F, 1, 4},
            {5.25F, .75F, 8.5F, 7, 6.5F, 10, 0.25F, 8.25F, 8, 7.5F},
            {5.5F, 0.25F, 7, 8.5F, 8, 4.75F, 9, 8, 6.5F, 6}};
        byte fila, columna;
        String linea;
        //Algoritmo:
        for (fila = 0; fila < alumno.length; fila++) {
            linea = "";
            for (columna = 0; columna < alumno[0].length; columna++) {
                linea += alumno[fila][columna] + "\t";
            }//Fin Para
            System.out.println(linea.trim());
        }//Fin Para
    }//Fin Programa
}

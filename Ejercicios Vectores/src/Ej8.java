
/**
 *
 * @author Antonio Sard González
 */
public class Ej8 {

    public static void main(String[] args) {
        //Entorno:
        byte[] calificacion;
        byte numNotas, i, nota;
        //Algoritmo:
        calificacion = new byte[11];
        numNotas = 1;
        do {
            System.out.print("Introduzca la nota " + (numNotas) + ": ");
            nota = Utilidades.leeByte();
            if (nota >= 0 && nota < calificacion.length - 1) {
                calificacion[nota] += 1;
            }//Fin Si
            numNotas++;
        } while (nota >= 0 && nota <= 10);
        System.out.println("Lista de frecuencias de cada una de las notas: ");
        for (i = 0; i <= calificacion.length - 1; i++) {
            if (calificacion[i] != 0) {
                System.out.println("Nota: " + i + ". Frecuencia: " + calificacion[i]
                        + ".");
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}

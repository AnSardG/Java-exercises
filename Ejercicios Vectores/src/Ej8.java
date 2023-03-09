
/**
 *
 * @author Antonio Sard González
 */
public class Ej8 {

    public static byte preguntaNotas() {
        //Entorno:
        byte cantidad;
        String op;
        //Algoritmo:
        do {
            System.out.print("¿Sabe cuántas notas va a introducir? (s/n): ");
            op = Leer.dato();
        } while ("sSnN".indexOf(op) < 0 || op.isEmpty());
        if ("s".equals(op.toLowerCase())) {
            do {
                System.out.print("¿Cuántas notas quiere introducir?: ");
                cantidad = Utilidades.leeByte();
            } while (cantidad < 1);
        } else {
            cantidad = 30;
        }//Fin Si
        return cantidad;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        byte[] calificacion;
        byte cantNotas, numNotas, i, nota;
        //Algoritmo:
        cantNotas = Ej8.preguntaNotas();
        calificacion = new byte[11];
        numNotas = 0;
        do {
            System.out.print("Introduzca la nota " + (numNotas + 1) + ": ");
            nota = Utilidades.leeByte();
            if (nota >= 0 && nota < calificacion.length - 1) {
                calificacion[nota] += 1;
            }//Fin Si
            numNotas++;
        } while (numNotas < cantNotas && nota >= 0 && nota <= 10);
        System.out.println("Lista de frecuencias de cada una de las notas: ");
        for (i = 0; i <= calificacion.length - 1; i++) {
            if (calificacion[i] != 0) {
                System.out.println("Nota: " + i + ". Frecuencia: " + calificacion[i]
                        + ".");
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}

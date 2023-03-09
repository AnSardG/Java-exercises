
/**
 *
 * @author Antonio Sard González
 */
public class Ej8 {

    public static void main(String[] args) {
        //Entorno:
        byte[] calificacion;
        byte cantNotas, nota, i, frecuencia;
        String op;
        //Algoritmo:
        do {
            System.out.print("¿Sabe cuántas notas va a introducir? (s/n): ");
            op = Leer.dato();
        } while ("sSnN".indexOf(op) > 0 || op.isEmpty());
        if ("s".equals(op.toLowerCase())) {
            do {
                System.out.print("¿Cuántas notas quiere introducir?: ");
                cantNotas = Utilidades.leeByte();
            } while (cantNotas < 1);
        } else {
            cantNotas = 30;
        }//Fin Si
        calificacion = new byte[cantNotas];
        nota = 0;
        op = "";
        do {
            System.out.print("Introduzca la nota " + (nota + 1) + ": ");
            calificacion[nota] = Utilidades.leeByte();
            if(calificacion[nota]>= 0 && calificacion[nota] <= 10){
                op += calificacion[nota];   
            }//Fin Si
            nota++;
        } while (nota < cantNotas && calificacion[nota - 1] >= 0
                && calificacion[nota - 1] <= 10);
        System.out.println("Lista de frecuencias de cada una de las notas: ");
        nota = 0;
        while (nota <= 10) {
            if (op.indexOf(String.valueOf(nota)) >= 0) {
                frecuencia = 0;
                for (i = 0; i <= cantNotas - 1; i++) {
                    if (calificacion[i] == nota) {
                        frecuencia++;
                    }//Fin Si
                }//Fin Para
                System.out.println("Nota: " + nota + ". Frecuencia: " + frecuencia
                        + ".");
                op = op.replaceAll(String.valueOf(nota), "");
            }//Fin Si
            nota++;
        }//Fin Mientras
    }//Fin Programa
}


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
                if(cantNotas){
                    
                }
            } while (cantNotas < 1);
        } else {
            cantNotas = 30;
        }//Fin Si
        calificacion = new byte[cantNotas];
        nota = 0;
        do {
            System.out.print("Introduzca la nota " + (nota + 1) + ": ");
            calificacion[nota] = Utilidades.leeByte();
            nota++;
        } while (nota < cantNotas && calificacion[nota - 1] >= 0
                && calificacion[nota - 1] <= 10);
        System.out.println("Lista de frecuencias de cada una de las notas: ");
        
    }//Fin Programa
}

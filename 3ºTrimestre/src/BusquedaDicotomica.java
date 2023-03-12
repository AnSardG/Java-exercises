
/**
 *
 * @author Antonio Sard González
 */
public class BusquedaDicotomica {

    public static void main(String[] args) {
        //Entorno:
        byte principio, fin, mitad;
        int x;
        int[] vector = {1, 2, 3, 6, 10, 13, 20, 27, 28};
        //Algoritmo:
        principio = 0;
        fin = (byte) (vector.length - 1);
        System.out.print("¿Qué número desea buscar?: ");
        x = Leer.datoInt();
        mitad = (byte) ((principio + fin) / 2);
        while (x != vector[mitad] && principio != fin) {
            if (x > vector[mitad]) {
                principio = (byte) (mitad + 1);
            } else if (x < vector[mitad]) {
                fin = (byte) (mitad - 1);
            }//Fin Si
            mitad = (byte) ((principio + fin) / 2);
        }//Fin Mientras
        if (x == vector[mitad]) {
            System.out.println(x + " se encuentra en la posición: " + mitad);
        } else {
            System.out.println("No se encuentra el número en la tabla.");
        }//Fin Si
    }//Fin programa
}

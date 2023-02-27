
/**
 *
 * @author Antonio Sard González
 */
public class Ej17 {

    public static void main(String[] args) {
        //Entorno:
        long suma;
        int numero;
        byte i;
        //Algoritmo:
        suma = 0;
        i = 0;
        System.out.println("Introduzca a continuación una serie de números a sumar,"
                + "(el número 0 señala el final).");
        do {
            System.out.print("Introduzca el número " + (i+1) + ": ");
            numero = Leer.datoInt();
            if (suma + numero <= Long.MAX_VALUE) {
                suma += numero;
                i++;
            } else {
                System.out.println("La longitud de la suma se ha excedido.");
                numero = 0;
            }//Fin Si
        } while (numero != 0);
        System.out.println("Resultado de sumar la serie de números: " + suma
                + ". Cantidad de sumandos: " + (i - 1));
    }//Fin Programa
}

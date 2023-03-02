
/**
 *
 * @author Antonio Sard González
 */
public class Product {

    public static int recursiveProduct(int m, int n) {
        //Algoritmo:
        if (m < n) {
            return recursiveProduct(n, m);
        } else if (n != 0) {
            return (m + recursiveProduct(m, n - 1));
        } else {
            return 0;
        }//Fin Si
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        int num1, num2;
        //Algoritmo:
        System.out.print("Escribe primer num: ");
        num1 = Leer.datoInt();
        System.out.print("Escribe segundo num: ");
        num2 = Leer.datoInt();
        System.out.println(recursiveProduct(num1, num2));
    }//Fin Programa
}

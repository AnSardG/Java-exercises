
/**
 *
 * @author Antonio Sard González
 */
public class Ej11 {

    public static boolean deseaContinuar() {
        //Entorno:
        char opcion;
        //Algoritmo
        do {
            System.out.print("¿Desea continuar? (S/N): ");
            opcion = Leer.datoChar();
        } while (opcion != 's' && opcion != 'S' && opcion != 'n' && opcion != 'N');
        return opcion == 's' || opcion == 'S';
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        int[] numero;
        byte cantNum, i, j;
        int numAux;
        //Algoritmo:
        numero = new int[50];
        cantNum = 0;
        do {
            System.out.print("Introduzca el número " + (cantNum + 1) + ": ");
            numero[cantNum] = Leer.datoInt();
            i = 0;
            while (i < numero.length - 1 && numero[cantNum] > numero[i]) {
                i++;
            }//Fin Mientras
            for (j = cantNum; j >= i; j--) {
                if (j != i) {
                    numAux = numero[j];
                    numero[j] = numero[j - 1];
                    numero[j-1]=numAux;
                }//Fin Si    
            }//Fin Para
            cantNum++;
        } while (deseaContinuar() && cantNum <= 50);
        System.out.println("---------------------------------------");
        System.out.println("Tabla introducida en orden ascendente: ");
        for (i = 0; i <= cantNum - 1; i++) {
            System.out.print(numero[i] + ", ");
        }//Fin Para
        System.out.println("\b\b.");
    }//Fin Programa
}


/**
 *
 * @author Antonio Sard González
 */
public class OrdenacionIntercambio {

    public static void muestraTabla(byte[] vector) {
        //Entorno:
        byte i;
        //Algoritmo:
        for (i = 0; i <= vector.length - 1; i++) {
            System.out.print(vector[i] + ", ");
        }//Fin Para
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        byte[] vector = {5, 10, 8, 22, 1, 12, 15};
        byte i, posicion, num, lugar;
        //Algoritmo:
        lugar = 0;
        System.out.println("Tabla sin ordenar: ");
        OrdenacionIntercambio.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
        for (i = 0; i <= vector.length - 1; i++) {
            num = vector[i];
            for (posicion = i; posicion <= vector.length - 1; posicion++) {
                if (vector[posicion] < num) {
                    num = vector[posicion];
                    lugar = posicion;
                }//Fin Si
            }//Fin Para
            if (vector[i] >= vector[lugar]) {
                num = vector[i];
                vector[i] = vector[lugar];
                vector[lugar] = num;
            }//Fin Si
        }//Fin Para
        System.out.println("Tabla ordenada: ");
        OrdenacionIntercambio.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
    }//Fin Programa
}

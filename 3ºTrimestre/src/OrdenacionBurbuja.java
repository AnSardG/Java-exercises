
/**
 *
 * @author Antonio Sard González
 */
public class OrdenacionBurbuja {

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
        byte[] vector = {22, 13, 17, 12, 7, 15, 2};
        byte num, i, pos;
        //Algoritmo:
        System.out.println("Tabla sin ordenar: ");
        OrdenacionBurbuja.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
        for (i = 0; i <= vector.length - 1; i++) {
            for (pos = 0; pos <= vector.length - 1; pos++) {
                if (pos + 1 <= vector.length - 1 && vector[pos] > vector[pos + 1]) {
                    num = vector[pos + 1];
                    vector[pos + 1] = vector[pos];
                    vector[pos] = num;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        System.out.println("Tabla ordenada: ");
        OrdenacionBurbuja.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
    }//Fin Programa
}

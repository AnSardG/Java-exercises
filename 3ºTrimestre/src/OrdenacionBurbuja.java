
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
        byte num, pos, fin;
        boolean desordenado;
        //Algoritmo:
        System.out.println("Tabla sin ordenar: ");
        OrdenacionBurbuja.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
        fin = (byte)(vector.length - 1);
        do{
            desordenado = false;
            for (pos = 0; pos <= fin; pos++) {
                if (pos + 1 <= fin && vector[pos] > vector[pos + 1]) {
                    num = vector[pos + 1];
                    vector[pos + 1] = vector[pos];
                    vector[pos] = num;
                    desordenado = true;
                }//Fin Si
            }//Fin Para
            fin--;
        }while(desordenado) ;
        System.out.println("Tabla ordenada: ");
        OrdenacionBurbuja.muestraTabla(vector);
        System.out.println("\b\b.\n-------------------------------");
    }//Fin Programa
}

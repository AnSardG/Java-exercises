
/**
 *
 * @author Antonio Sard González
 */
public class Ej2 {

    public static void visualizaTabla(int[] tabla) {
        //Entorno:
        byte i;
        //Algoritmo:
        for (i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }//Fin Procedimiento

    public static byte muestraMenu() {
        //Entorno:
        byte opcion;
        //Algoritmo:
        do {
            System.out.println("1.\tVisualizar");
            System.out.println("2.\tInsertar elemento al principio.");
            System.out.println("3.\tBorrar elemento al principio.");
            System.out.println("4.\tInsertar elemento al final.");
            System.out.println("5.\tBorrar elemento al final.");
            System.out.println("6.\tInsertar un elemento en una posición.");
            System.out.println("7.\tBorrar un elemento de una posición");
            System.out.println("8.\tSALIR.");
            System.out.print("Introduzca su opción [1-8]: ");
            opcion = Utilidades.leeByte();
        } while (opcion < 1 || opcion > 8);
        return opcion;
    }//Fin Función

    public static void insertaElemento(int[] tabla, int elemento, byte opcion) {
        //Entorno:
        byte i;
        //Algoritmo:
        switch (opcion) {
            case 2:
                i = (byte)(tabla.length - 1);
                if(tabla[i] == 0){
                    while(i != 0){
                        tabla[i] = tabla[i - 1];
                    }//Fin Mientras
                    tabla[i] = elemento;
                } else {
                    System.out.println("Imposible introducir datos, tabla llena.");
                }//Fin Si
                break;

            case 4:
                i = (byte)(tabla.length - 1);
                if(tabla[i] == 0){
                    while(i == 0){
                        i--;
                    }//Fin Mientras
                    tabla[i + 1] = elemento;
                } else {
                    System.out.println("Imposible introducir datos, tabla llena.");
                }//Fin Si
                break;

            case 6:
                
                break;
        }
    }

    public static void main(String[] args) {
        //Entorno:
        int[] tabla;
        byte i;
        //Algoritmo:
        tabla = new int[10];
        while (Ej2.muestraMenu() != 8) {
            System.out.println("Ole los caracole");
        }//Fin Mientras

    }//Fin Programa
}

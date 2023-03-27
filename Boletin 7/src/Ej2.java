
/**
 *
 * @author Antonio Sard González
 */
public class Ej2 {

    public static void visualizaTabla(int[] tabla) {
        //Entorno:
        byte i;
        String linea;
        //Algoritmo:
        linea = "";
        for (i = 0; i < tabla.length; i++) {
            if (tabla[i] != 0) {
                linea += tabla[i] + "\t";
            } else {
                linea += '-' + "\t";
            }//Fin Si
        }//Fin Para
        System.out.println("Contenido de la tabla: ");
        System.out.println(linea);
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
        byte i, posicion;
        boolean tablaLlena;
        //Algoritmo:
        i = 0;
        while (i < tabla.length - 1 && tabla[i] != 0) {
            i++;
        }//Fin Mientras
        tablaLlena = tabla[i] != 0;
        if (!tablaLlena) {
            switch (opcion) {
                case 2:
                    i = (byte) (tabla.length - 1);
                    while (i != 0) {
                        if (tabla[i - 1] != 0) {
                            tabla[i] = tabla[i - 1];
                        }//Fin Si
                        i--;
                    }//Fin Mientras
                    tabla[i] = elemento;
                    break;

                case 4:
                    i = 0;
                    while (i < tabla.length - 1 && tabla[i] != 0) {
                        i++;
                    }//Fin Mientras
                    tabla[i] = elemento;
                    break;

                case 6:
                    do {
                        System.out.print("Introduzca la posición [1-10]: ");
                        posicion = Utilidades.leeByte();
                    } while (posicion < 1 || posicion > 10);
                    posicion--;
                    if (tabla[posicion] != 0) {
                        i = posicion;
                        while (i < tabla.length - 1 && tabla[i] != 0) {
                            i++;
                        }//Fin Mientras
                        if (i == 9) {
                            while (i > 0 && tabla[i] != 0) {
                                i--;
                            }//Fin Mientras
                            while (i < posicion) {
                                tabla[i] = tabla[i + 1];
                                i++;
                            }//Fin Mientras
                        }//Fin Si
                        while (i > posicion) {
                            tabla[i] = tabla[i - 1];
                            i--;
                        }//Fin Mientras                        
                    }//Fin Si
                    tabla[posicion] = elemento;
                    break;
            }//Fin Según Sea
        } else {
            System.out.println("Imposible introducir datos, tabla llena");
        }//Fin Si
    }//Fin Procedimiento

    public static void borraElemento(int[] tabla, byte opcion){
        //Entorno:
        byte i, posicion;
        boolean tablaVacia;
        //Algoritmo:
        i = 0;
        while (i < tabla.length - 1 && tabla[i] == 0) {
            i++;
        }//Fin Mientras
        tablaVacia = i == tabla.length - 1;
        if(!tablaVacia){
            switch(opcion){
                case 3:
                    for(i = 0; i<tabla.length - 1;i++){
                        tabla[i] = tabla[i + 1];
                    }//Fin Para
                    break;

                case 5:
                    posicion = (byte)(tabla.length - 1);
                    while(tabla[posicion] == 0){
                        posicion--;
                    }//Fin Mientras
                    
                    break;
                    
                case 7:
                    
                    break;
            }//Fin Según Sea
        } else {
            System.out.println("Imposible borar dato, tabla vacía");
        }//Fin Si
    }//Fin Procedimiento
    
    public static void main(String[] args) {
        //Entorno:
        int[] tabla;
        int elemento;
        byte opcion;
        //Algoritmo:
        tabla = new int[10];
        opcion = Ej2.muestraMenu();
        while (opcion != 8) {
            if (opcion == 1) {
                Ej2.visualizaTabla(tabla);
            } else {
                if (opcion == 2 || opcion == 4 || opcion == 6) {
                    do {
                        System.out.print("Introduzca el elemento (número entero mayor que 0): ");
                        elemento = Leer.datoInt();
                    } while (elemento < 1);
                    Ej2.insertaElemento(tabla, elemento, opcion);
                } else if (opcion != 8){
                    Ej2.borraElemento(tabla, opcion);
                }//Fin Si
            }//Fin Si
            opcion = Ej2.muestraMenu();
        }//Fin Mientras
    }//Fin Programa
}

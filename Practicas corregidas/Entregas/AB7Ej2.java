
/**
 *
 * @author Antonio Sard González
 */
public class AB7Ej2 {

    public static byte leeByte() {
        //Entorno:
        short num;
        //Algoritmo:
        num = Leer.datoShort();
        while (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
            System.out.print("Dato no válido. Teclee otro: ");
            num = Leer.datoShort();
        }//Fin Mientras
        return (byte) num;
    }//Fin Función

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
            opcion = AB7Ej2.leeByte();
        } while (opcion < 1 || opcion > 8);
        return opcion;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        int elemento;
        byte opcion, posicion;
        B7Ej2 tabla;
        //Algoritmo:
        tabla = new B7Ej2();
        opcion = AB7Ej2.muestraMenu();
        while (opcion != 8) {
            switch (opcion) {
                case 1:
                    tabla.visualizar();
                    break;
                case 2:
                case 4:
                    if (tabla.estaLlena()) {
                        System.out.println("Imposible introducir datos, tabla llena");
                    } else {
                        do {
                            System.out.print("Introduzca el elemento (número entero mayor que 0): ");
                            elemento = Leer.datoInt();
                        } while (elemento < 1);
                        if (opcion == 2) {
                            tabla.insertarAlPrincipio(elemento);
                        } else {
                            tabla.insertarAlFinal(elemento);
                        }//Fin Si
                    }//Fin Si                     
                    break;
                case 3:
                    if (tabla.estaVacia()) {
                        System.out.println("Imposible borrar dato, tabla vacía");
                    } else {
                        tabla.eliminarAlPrincipio();
                    }//Fin Si
                    break;
                case 5:
                    if (tabla.estaVacia()) {
                        System.out.println("Imposible borrar dato, tabla vacía");
                    } else {
                        tabla.eliminarAlFinal();
                    }//Fin Si
                    break;
                case 6:
                case 7:
                    if (opcion == 6 && tabla.estaLlena()) {
                        System.out.println("Imposible introducir datos, tabla llena");
                    } else if (opcion == 7 && tabla.estaVacia()) {
                        System.out.println("Imposible borrar dato, tabla vacía");                        
                    } else {
                        do {
                            System.out.print("Introduzca la posición [1-10]: ");
                            posicion = AB7Ej2.leeByte();
                        } while (posicion < 1 || posicion > 10);
                        posicion--;
                        if(opcion == 6){
                           do {
                                System.out.print("Introduzca el elemento (número entero mayor que 0): ");
                                elemento = Leer.datoInt();
                            } while (elemento < 1);
                            tabla.insertar(posicion, elemento); 
                        } else {
                            tabla.eliminar(posicion);
                        }//Fin Si
                    }//Fin Si
                    break;
            }//Fin Según Sea
            opcion = AB7Ej2.muestraMenu();
        }//Fin Mientras
    }//Fin Programa
}

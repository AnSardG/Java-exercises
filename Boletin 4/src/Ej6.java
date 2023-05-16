
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Ej6 {

    public static byte muestraMenu() throws IOException {
        //Entorno:
        byte op;
        BufferedReader teclado;
        String linea;
        //Algoritmo:
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1. Entra persona.");
            System.out.println("2. Sale persona.");
            System.out.println("3. Mostrar tienda.");
            System.out.println("4. Salir");
            System.out.print("Introduzca opción(1-4): ");
            linea = teclado.readLine();
            op = Byte.valueOf(linea);
            if (op < 1 || op > 4) {
                throw new IllegalArgumentException();
            }//Fin Si
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }//Fin Try
        return op;
    }//Fin Función

    public static void main(String[] args) throws IOException {
        //Entorno:
        Deque<Boolean> colaPersonas;
        byte opcion;
        boolean argument;
        //Algoritmo:
        colaPersonas = new LinkedList();        
        do {
            try {
                opcion = muestraMenu();
                argument = false;
            } catch (IllegalArgumentException iae) {
                argument = true;
            }
        } while (argument);
    }//Fin Programa
}

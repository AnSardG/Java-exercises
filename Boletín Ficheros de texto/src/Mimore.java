
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Mimore {

    public static void main(String[] args) {
        //Entorno:
        BufferedReader fSalida = null, teclado;
        String linea, lineaTeclado;
        int cantLineas;
        //Algoritmo:
        if (args.length == 1) {
            try {
                fSalida = new BufferedReader(new FileReader(args[0]));
                teclado = new BufferedReader(new InputStreamReader(System.in));
                linea = fSalida.readLine();
                cantLineas = 0;
                while (linea != null) {
                    System.out.println(linea);
                    cantLineas++;
                    linea = fSalida.readLine();
                    if (cantLineas == 10) {
                        System.out.println("--More--[Presione intro para seguir "
                                + "o 'q' para terminar]");
                        do {
                            lineaTeclado = teclado.readLine();
                        } while (!lineaTeclado.matches("[qQ]") && !lineaTeclado.matches(""));
                        cantLineas = 0;
                        if (lineaTeclado.toLowerCase().equals("q")) {
                            linea = null;
                        }//Fin Si
                    }//Fin Si
                }//Fin Mientras
            } catch (FileNotFoundException fnfe) {
                System.out.println("Archivo no encontrado, compruebe la ruta introducida.");
            } catch (IOException ioe) {
                System.out.println("Error de E/N.");
            } finally {
                if (fSalida != null) {
                    try {
                        fSalida.close();
                    } catch (IOException ioe) {
                        System.out.println("Error de E/S al leer el archivo "
                                + args[0] + ".");
                    }//Fin Try                 
                }//Fin Si
            }//Fin Try            
        } else {
            System.out.println("Número de argumentos inválido. Debe introducir"
                    + " un solo fichero.");
        }//Fin Si
    }//Fin Programa
}

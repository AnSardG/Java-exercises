
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Antonio Sard González
 */
public class Micat {

    public static void main(String[] args) {
        //Entorno:
        BufferedReader fSalida;
        String linea;
        int i;
        //Algoritmo:
        fSalida = null;
        if (args.length > 0) {
            for (String file : args) {
                try {
                    fSalida = new BufferedReader(new FileReader(file));
                    linea = fSalida.readLine();
                    while (linea != null) {
                        System.out.println(linea);
                        linea = fSalida.readLine();
                    }//Fin Mientras         
                } catch (FileNotFoundException fnfe) {
                    System.out.println("No existe " + file + ".");
                } catch (IOException ioe) {
                    System.out.println("Error de E/S al leer el archivo " + file + ".");
                } finally {
                    if (fSalida != null) {
                        try {
                            fSalida.close();
                        } catch (IOException ioe) {
                            System.out.println("Error de E/S al leer el archivo "
                                    + file + ".");
                        }//Fin Try                 
                    }//Fin Si
                }//Fin Try
            }//Fin Foreach
        } else {
            System.out.println("Número de argumentos inválido, introduzca el nombre "
                    + "de uno o varios archivos.");
        }//Fin Si         
    }//Fin Programa
}

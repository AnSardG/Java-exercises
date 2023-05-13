
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Antonio Sard González
 */
public class LinCarPal {

    public static void main(String[] args) {
        //Entorno:
        BufferedReader fSalida = null;
        String linea ;
        int lineas, caracteres, palabras;
        //Algoritmo:
        if(args.length == 1){
            try{
                fSalida = new BufferedReader(new FileReader (args[0]));
                linea = fSalida.readLine();
                lineas = 0;
                caracteres = 0;
                palabras = 0;
                while(linea != null){
                    lineas++;
                    caracteres += linea.replaceAll(" +", "").length();
                    palabras += linea.length() - linea.replaceAll(" +", "").length() + 1;
                    linea = fSalida.readLine();
                }//Fin Mientras
                System.out.println("Número de lineas, caracteres y palabras del archivo "+args[0]+":");
                System.out.println("\tLineas: "+lineas);
                System.out.println("\tCaracteres: "+caracteres);
                System.out.println("\tPalabras: "+palabras);
            } catch (FileNotFoundException fnfe){
                System.out.println(args[0]+" no existe. Compruebe la ruta o el "
                        + "archivo introducido.");
            } catch (IOException ioe){
                System.out.println("Error de E/S al leer el archivo "+args[0]);
            } finally {
                if (fSalida != null){
                    try{
                        fSalida.close();
                    }catch (IOException ioe){
                        System.out.println("Error de E/S al leer el archivo "+args[0]);
                    }//Fin Try
                }//Fin Si
            }//Fin Try            
        } else {
            System.out.println("Número de argumentos inválido, introduzca el nombre"
                    + " de un solo archivo.");
        }//Fin Si
    }//Fin Programa

}

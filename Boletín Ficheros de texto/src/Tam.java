
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Antonio Sard González
 */
public class Tam {

    public static void main(String[] args) {
        //Entorno:
        BufferedReader teclado;
        String linea = null;
        File f;
        //Algoritmo:
        try{
            teclado = new BufferedReader(new InputStreamReader (System.in));
            System.out.print("Introduzca el nombre de un fichero: ");
            linea = teclado.readLine();               
            f = new File(linea);
            if(f.exists()){
                System.out.println("El archivo "+f.getName()+" ocupa "+f.length()+" bytes.");
            } else {
                System.out.println("El fichero "+linea+" no existe");
            }//Fin Si            
        }catch (FileNotFoundException fnfe){
            System.out.println("El fichero "+linea+" no existe");
        }catch (IOException ioe){
            System.out.println("Error de E/S al abrir el archivo "+linea);
        }//Fin Try        
    }//Fin Programa

}

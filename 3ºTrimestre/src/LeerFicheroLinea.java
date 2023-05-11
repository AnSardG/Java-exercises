
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Administrador
 */
public class LeerFicheroLinea {

    public static void main(String[] args) {
        //Entorno:
        String linea;
        BufferedReader fSalida;               
        //Algoritmo:
        fSalida = null;
        try{
            fSalida = new BufferedReader(new FileReader("salida.txt"));
            linea = fSalida.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = fSalida.readLine();
            }
        } catch (FileNotFoundException fnfe){
            System.out.println("No existe salida.txt");
        } catch (IOException ioe){
            System.out.println("Error de E/S al leer.");
        } finally{
            if (fSalida != null){
                try{
                    fSalida.close();
                }catch (IOException ioe){
                    System.out.println("Error de E/S al cerrar fichero");
                }
            }
        }
    }//Fin Programa

}

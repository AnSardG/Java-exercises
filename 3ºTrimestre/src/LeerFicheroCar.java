
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Administrador
 */
public class LeerFicheroCar {

    public static void main(String[] args) {
        //Entorno:
        File f;
        FileReader fSalida;
        int byt;
        //Algoritmo:
        fSalida = null;
        try{
            f = new File("salida.txt");
            fSalida = new FileReader(f);
            byt = fSalida.read();
            while (byt != -1){
                System.out.print((char)byt);
                byt = fSalida.read();
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("No existe el fichero salida.txt");
        }catch (IOException ioe){
            System.out.println("Error de E/S al leer.");
        } finally {
            if(fSalida != null){
                try{
                    fSalida.close();
                }catch(IOException ioe){
                    System.out.println("Error de E/S al cerrar");
                }
            }
        }
    }//Fin Programa

}


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



/**
 *
 * @author Antonio Sard González
 */
public class LeerFichero {

    public static void main(String[] args) {
        File f;
        int byt;
        FileInputStream fPrueba = null;
        try{
            f = new File(".\\prueba.txt");
            fPrueba = new FileInputStream(f);
            byt = fPrueba.read();            
        }catch (FileNotFoundException fnfe){
            System.out.println("El fichero prueba.txt no existe");
        }catch(IOException ioe){
            System.err.println("Error de E/S al cerrar.");
        }finally{
            if (fPrueba != null){
                try{
                    fPrueba.close();
                }catch(IOException ioe){
                    System.err.println("Error de E/S al cerrar");
                }
            }
        }
    }

}

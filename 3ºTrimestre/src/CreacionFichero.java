import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class CreacionFichero {

    public static void main(String[] args) {
        File f;
        FileWriter fSalida;
        BufferedReader teclado;
        String linea;
        
        f = new File("salida.txt");
        fSalida = null;
        try{
            fSalida = new FileWriter(f);
            teclado = new BufferedReader(new InputStreamReader(System.in));
            linea = teclado.readLine();
            while (linea.length() > 0 ){
                fSalida.write(linea + "\n");
                linea = teclado.readLine();
            }
        } catch (IOException ioe){
            System.err.println("Error de E/S");
        } finally {
            if(fSalida != null){
                try {
                    fSalida.close();
                } catch (IOException ioe){
                    System.err.println("Error de E/S al cerrar");
                }
            }
        }
    }

}

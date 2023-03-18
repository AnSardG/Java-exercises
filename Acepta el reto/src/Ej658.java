
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej658 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        short disposicion, niveles; 
        int numBloques, cantBloques;
        
        teclado = new BufferedReader(new InputStreamReader(System.in));
        do{
            linea = teclado.readLine();
            numBloques = Integer.valueOf(linea);
            if(numBloques > 0){
                disposicion = 1;
                niveles = 1;
                cantBloques = 1;
                while( cantBloques < numBloques){
                    disposicion+=2;
                    niveles++;
                    cantBloques+=(int)(Math.pow(disposicion, 2));
                }
                System.out.println(niveles);
            }
        }while(!"0".equals(linea));
    }
}

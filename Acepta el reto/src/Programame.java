
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Programame {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, salida;
        int veces, alto, largo, altoR, largoR, recortes;
       
        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        for(veces = Integer.valueOf(linea); veces >=1; veces--){
            linea = teclado.readLine();
            salida = linea + " ";
            linea = teclado.readLine() + " ";
            alto = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ")+1);
            largo = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ")+1);
            altoR = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ")+1);
            largoR = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            recortes = alto / altoR * (largo / largoR);
            if(alto%altoR != 0){
                recortes += altoR * largoR;
            }
            salida += Integer.toString(recortes);
            System.out.println(salida);
        }
        
    }
}

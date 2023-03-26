import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class E {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        boolean numPar;
        int[] resultado;
        int vuelta, veces, numA, numB, numC, numPos, pos, i;

        teclado = new BufferedReader(new InputStreamReader (System.in));
        linea = teclado.readLine();
        veces = Integer.valueOf(linea);
        for(vuelta = 1; vuelta<=veces; vuelta++){
            linea = teclado.readLine() + "  ";
            numA = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ") + 1);
            numB = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ") + 1);
            numC = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = teclado.readLine();
            numPos = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            i = linea.length() - linea.replaceAll(" +", "").length();
            linea += "  ";
            resultado = new int[i];
            i = 0;
            while(numPos != -1 && i < resultado.length){
                resultado[i] = numA;
                for(pos=2; pos<=numPos; pos++){
                    numPar = pos%2==0;
                    if(numPar){
                        resultado[i] += numB;
                    } else {
                        resultado[i] += numC;
                    }
                }
                linea = linea.substring(linea.indexOf(" ") + 1);
                numPos = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
                i++;
            }
            System.out.println("listado "+vuelta+":");
            for (i = 0; i<resultado.length; i++){
                System.out.println(resultado[i]);
            }            
        }
    }

}

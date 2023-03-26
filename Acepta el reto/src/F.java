
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class F {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, numeros;
        int[] radio;
        int minPlantas, maxPlantas, i, numA, numB;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        maxPlantas = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
        minPlantas = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
        while (minPlantas > 0) {
            radio = new int[6];
            numeros = "";
            for (i = 1; i <= maxPlantas; i++) {
                linea = teclado.readLine();
                if (numeros.indexOf(linea) < 0) {
                    numeros += linea + "  ";
                    linea = linea.replaceAll("-", "");
                    numA = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
                    numB = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
                    if (numA < 6 && numB < 6) {
                        if (numA > numB) {
                            radio[numA] += 1;
                        } else {
                            radio[numB] += 1;
                        }
                    }
                }
            }
            numA = 0;
            numB = 0;
            for (i = 0; i < radio.length; i++) {
                if (numA < minPlantas) {
                    numA += radio[i];
                    numB = i;
                }
            }
            if (numA >= minPlantas) {
                System.out.println(numB);
            } else {
                System.out.println("IMPOSIBLE");
            }
            linea = teclado.readLine();
            maxPlantas = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            minPlantas = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
        }
    }
}

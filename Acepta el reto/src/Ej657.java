
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej657 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int numA, numB, numC, distancia1, distancia2, veces;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        for (veces = Integer.valueOf(linea); veces >= 1; veces--) {
            linea = teclado.readLine();
            numA = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ") + 1);
            numB = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ") + 1);
            numC = Integer.valueOf(linea.substring(0));
            distancia1 = numB - numA;
            distancia2 = numC - numB;
            if (numA < 0 && numB > 0) {
                distancia1--;
            }
            if (numC > 0 && numB < 0) {
                distancia2--;
            }
            if (distancia1 > distancia2) {
                System.out.println(numC);
            } else if (distancia1 < distancia2) {
                System.out.println(numA);
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej659 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, letras[] = {"T", "G", "C", "F", "D", "R", "H"};
        int num, cifras, veces;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        num = Integer.valueOf(linea);
        while (num != 0) {
            for (cifras = linea.length(); cifras >= 1; cifras--) {
                for (veces = (int) (num / Math.pow(10, cifras - 1)) % 10; veces >= 1; veces--) {
                    System.out.print(letras[cifras - 1]);
                }
            }
            System.out.println();
            linea = teclado.readLine();
            num = Integer.valueOf(linea);
        }
    }
}

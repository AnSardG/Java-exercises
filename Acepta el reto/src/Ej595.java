
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej595 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int veces;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        for (veces = Integer.valueOf(linea); veces >= 1; veces--) {
            linea = teclado.readLine();
            System.out.println(linea.substring(0, linea.length() - 2));
        }
    }
}

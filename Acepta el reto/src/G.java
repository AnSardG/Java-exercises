
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class G {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, texto;
        int palabras;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        while (!"FIN".equals(linea)) {
            linea += "  ";
            palabras = 0;
            while (linea.length() != 1) {
                texto = linea.substring(0, linea.indexOf(" ")).toLowerCase();
                if (texto.indexOf("e") >= 0 && texto.indexOf("a") >= 0 && texto.indexOf("i") >= 0
                        && texto.indexOf("o") >= 0 && texto.indexOf("u") >= 0) {
                    palabras += 1;
                }
                linea = linea.substring(linea.indexOf(" ")+1);
            }
            System.out.println(palabras);
            linea = teclado.readLine();
        }
    }
}

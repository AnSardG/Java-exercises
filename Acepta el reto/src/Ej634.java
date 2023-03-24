
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej634 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int puntos, total, i, veces;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        for (veces = Integer.valueOf(linea); veces >= 1; veces--) {
            linea = teclado.readLine();
            total = 0;
            puntos = 0;
            for (i = 0; i < linea.length(); i++) {
                if ("O".equals(linea.substring(i, i + 1))) {
                    puntos += 10;
                    total += puntos;
                } else {
                    puntos = 0;
                }
            }
            System.out.println(total);
        }
    }
}

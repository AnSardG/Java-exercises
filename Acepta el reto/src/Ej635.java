
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej635 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int veces, anio, fin;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        for (veces = Integer.valueOf(linea); veces >= 1; veces--) {
            linea = teclado.readLine();
            if (linea.length() >= 4) {
                anio = Integer.valueOf(linea.substring(0, linea.length() - 2));
                fin = Integer.valueOf(linea.substring(linea.length() - 2));
            } else if (linea.length() == 3) {
                anio = Integer.valueOf(linea.substring(0, 1));
                fin = Integer.valueOf(linea.substring(1));
            } else {
                if (Integer.valueOf(linea) > 0) {
                    anio = 1;
                } else {
                    anio = 0;
                }
                fin = 0;
            }
            if (fin > 0) {
                anio += 1;
            }
            System.out.println(anio);
        }
    }
}

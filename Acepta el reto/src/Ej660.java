
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej660 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, silaba;
        int veces, i, pictogramas;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        veces = Integer.valueOf(linea) * 2;
        for (i = 1; i <= veces; i++) {
            linea = teclado.readLine();
            linea = " "+linea.trim().toLowerCase() + " ";
            pictogramas = 0;
            while (!"".equals(linea)) {
                if (linea.length() > 2 && linea.substring(0, 2).matches(" [aeiou]")) {
                    linea = linea.replaceAll(linea.substring(0, 2), "");
                    pictogramas++;
                } else {
                    if (linea.length() > 4 && linea.substring(0, 4)
                            .matches("^[^aeiou\\s][aeiou][^aeiou\\s][^aeiou\\s]$")) {
                        silaba = linea.substring(0, 4);
                        linea = linea.replaceAll(linea.substring(0, 3), silaba.substring(4));
                        pictogramas++;
                    } else if (linea.length() > 2 && linea.substring(0, 2)
                            .matches("^[^aeiou][aeiou]$")) {
                        silaba = linea.substring(0, 3);
                        linea = linea.replaceAll(linea.substring(0, 2), silaba.substring(3));
                        pictogramas++;
                    } else {
                        linea = linea.substring(1);
                    }
                }
            }
            if (pictogramas != 0) {
                System.out.println(pictogramas);
            }
        }
    }
}

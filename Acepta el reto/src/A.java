
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, digitos;
        int caso, veces, pos, piñonActual, i;
        int[] piñon;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        veces = Integer.valueOf(linea);
        for (caso = 1; caso <= veces; caso++) {
            piñon = new int[12];
            linea = teclado.readLine();
            pos = 0;
            piñonActual = Integer.valueOf(linea.substring(0, 2));
            pos = 2;
            while (pos < linea.length() && !"S".equals(linea.substring(pos, pos + 1))) {
                digitos = linea.substring(pos, pos + 1);
                if (!"U".equals(digitos) && !"D".equals(digitos)) {
                    piñon[piñonActual - 1] += Integer.valueOf(linea.substring(pos, pos + 3));
                    pos+=3;
                } else {
                    if ("U".equals(digitos)) {
                        piñonActual += 1;
                    } else {
                        piñonActual -= 1;
                    }
                    pos++;
                }
            }
            System.out.println("caso " + caso + ":");
            for (i = 0; i < piñon.length; i++) {
                if (piñon[i] > 0) {
                    System.out.println((i + 1) + " " + piñon[i]);
                }
            }
        }

    }
}

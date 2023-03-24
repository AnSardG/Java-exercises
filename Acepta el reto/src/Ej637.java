
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej637 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, letras;
        int duracion, veces, a, i, pos, longitud, longCadena;
        boolean esLetra;
        String[] valores = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-.-.--", "..--.."};
        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        a = Integer.valueOf(linea);
        for (veces = 1; veces <= a; veces++) {
            duracion = 0;
            esLetra = false;
            linea = teclado.readLine();
            longitud = linea.length();
            for (i = 0; i < longitud; i++) {
                pos = letras.indexOf(linea.substring(i, i + 1));
                if (pos >= 0) {
                    longCadena = valores[pos].length();
                    duracion += longCadena - valores[pos].replaceAll("\\.+", "").length();
                    duracion += (longCadena - valores[pos].replaceAll("-+", "").length()) * 3;
                    duracion += longCadena - 1;
                    if (esLetra) {
                        duracion += 3;
                    }
                    esLetra = true;
                } else {
                    duracion += 5;
                    esLetra = false;
                }
            }
            System.out.println(duracion);
        }
    }
}

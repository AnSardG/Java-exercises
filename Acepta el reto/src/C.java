
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class C {

    public static int buscaPosTiempo(int[] tiempos, int tiempo, int vueltas) {
        int pos;

        pos = 0;
        while (pos < vueltas && tiempo >= tiempos[pos]) {
            pos++;
        }
        return pos;
    }

    public static String[] ordenaEsquiador(String[] esquiador, String esquiadorActual, int pos, int vueltas) {
        for (vueltas = vueltas; vueltas > pos; vueltas--) {
            esquiador[vueltas] = esquiador[vueltas - 1];
        }
        esquiador[pos] = esquiadorActual;
        return esquiador;
    }

    public static int[] ordenaPuntuacion(int[] puntuacion, int puntuacionActual, int pos, int vueltas) {
        for (vueltas = vueltas; vueltas > pos; vueltas--) {
            puntuacion[vueltas] = puntuacion[vueltas - 1];
        }
        puntuacion[pos] = puntuacionActual;
        return puntuacion;
    }

    public static int[] ordenaSegundos(int[] segundos, int segundosActuales, int pos, int vueltas) {
        for (vueltas = vueltas; vueltas > pos; vueltas--) {
            segundos[vueltas] = segundos[vueltas - 1];
        }
        segundos[pos] = segundosActuales;
        return segundos;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int[] puntos = {100, 80, 60, 50, 45, 40, 36, 32, 29, 26, 24, 22, 20, 18,
            16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int veces, i, pos, segundosActuales, puntuacionActual, fin;
        float segundosMin;
        String nombreActual;
        String[] esquiador;
        int[] puntuacion, segundos;
        boolean desordenado;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        veces = Integer.valueOf(linea);
        esquiador = new String[veces];
        puntuacion = new int[veces];
        segundos = new int[veces];
        for (i = 0; i < veces; i++) {
            linea = teclado.readLine();
            nombreActual = linea;
            linea = teclado.readLine().replaceAll("[\\:\\.]", "");
            puntuacionActual = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            linea = linea.substring(linea.indexOf(" ") + 1);
            segundosActuales = Integer.valueOf(linea.substring(0, 2)) * 60
                    + Integer.valueOf(linea.substring(2));
            pos = buscaPosTiempo(segundos, segundosActuales, i);
            segundos = ordenaSegundos(segundos, segundosActuales, pos, i);
            esquiador = ordenaEsquiador(esquiador, nombreActual, pos, i);
            puntuacion = ordenaPuntuacion(puntuacion, puntuacionActual, pos, i);
        }
        segundosMin = 0;
        if (veces > 30) {
            veces = 30;
        }
        for (i = 0; i < veces; i++) {
            if (i == 0) {
                puntuacion[i] += puntos[i];
                segundosMin = segundos[i] + segundos[i] * 0.08F;
            } else {
                if (segundos[i - 1] == segundos[i]) {
                    puntos[i] = puntos[i - 1];
                }
                if ((float) segundos[i] <= segundosMin) {
                    puntuacion[i] += puntos[i];
                }
            }
        }
        fin = esquiador.length - 1;
        do {
            desordenado = false;
            for (pos = 0; pos <= fin; pos++) {
                if (pos + 1 <= fin && puntuacion[pos] < puntuacion[pos + 1]) {
                    puntuacionActual = puntuacion[pos + 1];
                    puntuacion[pos + 1] = puntuacion[pos];
                    puntuacion[pos] = puntuacionActual;
                    nombreActual = esquiador[pos + 1];
                    esquiador[pos + 1] = esquiador[pos];
                    esquiador[pos] = nombreActual;
                    desordenado = true;
                }//Fin Si
            }//Fin Para
            fin--;
        } while (desordenado);
        for (i = 0; i <= esquiador.length - 1; i++) {
            System.out.println(puntuacion[i] + " " + esquiador[i]);
        }
    }
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej662 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea;
        int[][] nilo;
        int ancho, alto, mitad, i, j, num, numMitad, numMax, anegadas, total;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        ancho = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
        alto = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
        nilo = new int[alto][ancho];
        mitad = ancho * alto / 2;
        j = 0;
        numMitad = 0;
        for (i = 0; i < nilo.length; i++) {
            linea = teclado.readLine().replaceAll(" ", "");
            for (num = 0; num < nilo[0].length; num++) {
                nilo[i][num] = Integer.valueOf(linea.substring(num, num + 1));
                if (j == mitad) {
                    numMitad = nilo[i][num];
                }
                j++;
            }
        }
        i = 0;
        num = 0;
        if (nilo.length > 1) {
            alto = nilo.length / 2 + 1;
        } else {
            alto = 0;
        }
        ancho = 0;
        anegadas = 0;
        total = nilo.length * nilo[0].length;
        numMax = 0;
        j=0;
        while (i < total && (num < numMitad || j<mitad)) {
            if (nilo[alto][ancho] <= num && i<=mitad) {
                i++;
                j++;
                anegadas++;
            } else if (nilo[alto][ancho] == num + 1) {
                num++;
                anegadas++;
                j++;
                i++;
            } else if (nilo[alto][ancho] > numMitad && i>mitad) {
                numMax = nilo[alto][ancho];
                anegadas++;
                i++;
            }
            if (ancho != nilo[0].length - 1) {
                ancho++;
            } else {
                ancho = 0;
                alto += 1;
            }
            if (alto == nilo.length) {
                alto = 0;
            }
            
        }
        if(numMax>num){
            num=numMax;
        }
        System.out.println(num + " " + j);
    }
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ej661 {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        String linea, obj, salida;
        String[] objetos;
        int[] valores, pesos;
        int i, valor, peso, pos, posAux;

        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = teclado.readLine();
        pos = Integer.valueOf(linea);
        while (pos != 0) {
            objetos = new String[pos];
            valores = new int[pos];
            pesos = new int[pos];
            linea = teclado.readLine();
            obj = linea.substring(0, linea.indexOf(" "));
            linea = linea.substring(linea.indexOf(" ") + 1);
            valor = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
            peso = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
            objetos[0] = obj;
            valores[0] = valor;
            pesos[0] = peso;
            for (i = 1; i < objetos.length; i++) {
                linea = teclado.readLine();
                obj = linea.substring(0, linea.indexOf(" "));
                linea = linea.substring(linea.indexOf(" ") + 1);
                valor = Integer.valueOf(linea.substring(0, linea.indexOf(" ")));
                peso = Integer.valueOf(linea.substring(linea.indexOf(" ") + 1));
                pos = 0;
                while (pos <= i && (valor < valores[pos] || (valor == valores[pos]
                        && peso >= pesos[pos]))) {
                    pos++;
                }
                while (pos > 0 && valor == valores[pos] && peso < pesos[pos - 1]) {
                    pos--;
                }
                for (posAux = i; posAux >= pos; posAux--) {
                    if (posAux > 0) {
                        objetos[posAux] = objetos[posAux - 1];
                        valores[posAux] = valores[posAux - 1];
                        pesos[posAux] = pesos[posAux - 1];
                    }
                }
                objetos[pos] = obj;
                valores[pos] = valor;
                pesos[pos] = peso;
            }
            salida = "";
            for (i = 0; i < objetos.length; i++) {
                salida += objetos[i] + " ";
            }
            System.out.println(salida.trim());
            linea = teclado.readLine();
            pos = Integer.valueOf(linea);
        }
    }
}

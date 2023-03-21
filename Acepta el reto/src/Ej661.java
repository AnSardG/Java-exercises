
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
        String linea, obj;
        String[] objetos;
        int[] valores, pesos;
        int i, valor, peso, pos, posAux;
        
        teclado = new BufferedReader(new InputStreamReader(System.in));
        linea = "";
        while (!"0".equals(linea)) {
            linea = teclado.readLine();
            pos = Integer.valueOf(linea);
            objetos = new String[pos];
            valores = new int[pos];
            pesos = new int[pos];
            do {
                linea = teclado.readLine();
            } while (linea.matches("^[a-z]{1,9} \\d \\d$"));
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
                while (pos <= i && valor < valores[pos]) {
                    pos++;
                }
                while (valor == valores[pos] && pos <= i && peso < pesos[pos]) {
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
            linea = "";
            for (i = 0; i < objetos.length; i++) {
                linea += objetos[i] + " ";
            }
            System.out.println(linea.trim());
        }
    }
}

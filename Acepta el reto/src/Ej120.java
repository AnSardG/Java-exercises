
import java.util.Scanner;

/**
 *
 * @author Antonio Sard González
 */
public class Ej120 {

    public static void main(String[] args) {
        String n;
        byte columna, fila, dimension,contador;
        short num;
        Scanner myObj;
        boolean notZero;
        
        myObj = new Scanner(System.in);
        notZero = true;
        while(notZero){
            do {
            n = myObj.nextLine();
            notZero = !"0 0".equals(n);
            } while (!notZero && !n.matches("[1-9]{1,2}?\\s[0-9]{1,3}?"));
            if(notZero){
                num = Short.valueOf(n.substring(n.indexOf(" ")+1));
                dimension = Byte.valueOf(n.substring(0, n.indexOf(" ")));
                columna = 3;
                fila = 1;
                contador = 0;
                while(columna != dimension || fila != 1){
                    columna -= 1;
                    fila += 1;
                    if(fila < 1){
                        fila = dimension;
                        columna += 1;
                    } else if (columna > dimension){
                        columna = 1;
                        fila = (byte)(fila-1);
                    }
                    if(columna + fila == dimension + 1){
                        contador += num;
                    }
                    num++;
                }
                System.out.println(contador);
            }
        }
    }
}

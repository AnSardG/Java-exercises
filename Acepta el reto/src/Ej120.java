
import java.util.Scanner;

/**
 *
 * @author Antonio Sard González
 */
public class Ej120 {

    public static void main(String[] args) {
        String n;
        byte columna, fila, dimension, contDiagonal;
        int num, constante;
        Scanner myObj;
        boolean zero;
        
        myObj = new Scanner(System.in);
        zero = false;
        while(!zero){
            do {
            n = myObj.nextLine();
            zero = "0 0".equals(n);
            } while (!n.matches("[0-9]{1,2}?\\s[0-9]{1,3}?") 
                    && Byte.valueOf(n.substring(0, n.indexOf(" "))) % 2 == 0);
            if(!zero){
                num = Integer.valueOf(n.substring(n.indexOf(" ")+1));
                dimension = Byte.valueOf(n.substring(0, n.indexOf(" ")));
                columna = (byte)((dimension+1) / 2);
                fila = 1;
                constante = 0;
                contDiagonal = 0;
                n = "";
                do{
                    fila -= 1;
                    columna += 1;
                    if(n.indexOf(String.valueOf(fila) + String.valueOf(columna))>=0){
                        fila += 1;
                    }
                    if(columna > dimension){
                        columna = 1;
                    }
                    if(fila < 1){
                        fila = dimension;
                    }
                    if(fila + columna == dimension + 1){
                        constante += num;
                        contDiagonal++;
                    }
                    n += String.valueOf(fila) + String.valueOf(columna) + " ";
                    num++;
                }while(contDiagonal != dimension);
                System.out.println(constante);
            }
        }
    }
}

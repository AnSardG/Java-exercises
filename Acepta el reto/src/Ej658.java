
import java.util.Scanner;

/**
 *
 * @author Antonio Sard González
 */
public class Ej658 {

    public static void main(String[] args) {
        Scanner myObj;
        String bloques;
        short disposicion, niveles; 
        int numBloques, cantBloques;
        
        myObj = new Scanner(System.in);
        do{
            bloques = myObj.nextLine();
            numBloques = Integer.valueOf(bloques);
            if(numBloques > 0){
                disposicion = 1;
                niveles = 1;
                cantBloques = 1;
                while( cantBloques < numBloques){
                    disposicion+=2;
                    niveles++;
                    cantBloques+=(int)(Math.pow(disposicion, 2));
                }
                System.out.println(niveles);
            }
        }while(!"0".equals(bloques));
    }
}

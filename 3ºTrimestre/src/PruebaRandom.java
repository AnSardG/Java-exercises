
import java.util.Random;


/**
 *
 * @author Antonio Sard González
 */
public class PruebaRandom {

    public static void main(String[] args) {
        //Entorno:
        Random numAleatorio;
        //Algoritmo:
        numAleatorio = new Random();
        for(byte i= 0; i< 10; i++){
            System.out.println(numAleatorio.nextInt(10));
        }
    }//Fin Programa
}

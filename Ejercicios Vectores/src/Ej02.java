
import java.util.Random;

/**
 *
 * @author Antonio Sard González
 */
public class Ej02 {
    public static void main(String[] args){
        //Entorno:
        Random numAleatorio;
        int[] numero;
        byte i;
        //Algoritmo:
        numAleatorio=new Random();
        numero=new int[15];
        for(i=0;i<=numero.length-1;i++){
            numero[i]=numAleatorio.nextInt();
        }//Fin Para
        for(i=(byte)(numero.length-1);i>=0;i--){
            System.out.println("Número "+(i+1)+": "+numero[i]);
        }//Fin Para
    }//Fin Programa
}

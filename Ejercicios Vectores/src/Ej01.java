import java.util.Random;
/**
 *
 * @author Antonio Sard González
 */
public class Ej01 {

    public static void main(String[] args) {
        //Entorno:
        int[] numero;
        Random numAleatorio;
        byte i;
        //Algoritmo:
        numero=new int[20];
        numAleatorio=new Random();
        for(i=0;i<=numero.length-1;i++){
            numero[i]=numAleatorio.nextInt();
        }//Fin para
        for(i=0;i<=numero.length-1;i++){
            System.out.println("Número "+(i+1)+": "+numero[i]);
        }//Fin para
    }//Fin Programa
}

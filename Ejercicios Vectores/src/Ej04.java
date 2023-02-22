/**
 *
 * @author Antonio Sard González
 */
public class Ej04 {
    public static void main(String[] args){
        //Entorno:
        int[] numero;
        byte i;
        int numMin;
        //Algoritmo:
        numero=new int[50];
        System.out.print("Introduzca el número 1: ");
        numero[0]=Leer.datoInt();
        numMin=numero[0];
        for(i=1;i<=numero.length-1;i++){
            System.out.print("Introduzca el número "+(i+1)+": ");
            numero[i]=Leer.datoInt();
            if(numMin>numero[i]){
                numMin=numero[i];
            }//Fin Si
        }//Fin Para
        i=0;
        while(i<=numero.length-1 && numero[i]!=numMin){
            i++;
        }//Fin Mientras
        System.out.println("El número menor de todos es el "+numMin
                +", introducido en la posición "+(i+1)+".");
    }//Fin Programa
}

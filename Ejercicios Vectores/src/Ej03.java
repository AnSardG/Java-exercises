/**
 *
 * @author Antonio Sard González
 */
public class Ej03 {
    public static void main(String[] args){
        //Entorno:
        int[] numero;
        int numMax;
        byte i;
        //Algoritmo:
        numero=new int[50];
        System.out.print("Introduzca el número 1: ");
        numero[0]=Leer.datoInt();
        numMax=numero[0];
        for(i=1;i<=numero.length-1;i++){
            System.out.print("Introduzca el número "+(i+1)+": ");
            numero[i]=Leer.datoInt();
            if(numero[i]>numMax){
                numMax=numero[i];
            }//Fin Si
        }//Fin Para
        i=0;
        while(i<=numero.length-1 && numero[i]!=numMax){
            i++;
        }//Fin Mientras
        System.out.println("El número mayor de todos es el "+numMax
                +", introducido en la posición "+(i+1)+".");

    }//Fin Programa
}

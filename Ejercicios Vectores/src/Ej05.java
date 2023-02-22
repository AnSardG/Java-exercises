/**
 *
 * @author Antonio Sard González
 */
public class Ej05 {
    public static void main(String[] args){
        //Entorno:
        int[] numero;
        byte i;
        int numeroMax;
        //Algoritmo:
        numero=new int[50];
        System.out.print("Introduzca el número 1: ");
        numero[0]=Leer.datoInt();
        numeroMax=numero[0];
        for(i=1;i<=numero.length-1;i++){
            System.out.print("Introduzca el número "+(i+1)+": ");
            numero[i]=Leer.datoInt();
            if(numero[i]>numeroMax){
                numeroMax=numero[i];
            }//Fin Si
        }//Fin Para
        System.out.print("El número mayor de todos es el "+numeroMax+" introducido en la posicion: ");
        for(i=0;i<=numero.length-1;i++){
            if(numero[i]==numeroMax){
                System.out.print((i+1)+", ");
            }//Fin Si
        }//Fin Para
        System.out.println("\b\b.");
    }//Fin Programa
}

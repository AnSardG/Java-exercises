/**
 *
 * @author Antonio Sard González
 */
public class Ej7 {
    public static void main(String[] args){
        //Entorno:
        int[] numero;
        byte i;
        //Algoritmo:
        numero=new int[50];
        for(i=0;i<=numero.length-1;i++){
            System.out.print("Introduzca el número "+(i+1)+": ");
            numero[i]=Leer.datoInt();
        }//Fin Para
        for(i=(byte)(numero.length-1);i>=0;i--){
            System.out.println("Número "+(i+1)+": "+numero[i]);
        }//Fin Para
    }//Fin Programa
}

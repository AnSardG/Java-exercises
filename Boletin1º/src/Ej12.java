/**
 *
 * @author Antonio Sard González
 */
public class Ej12 {
    public static void main(String[] args){
        //Entorno:
        int num;
        byte i;
        //Algoritmo:
        System.out.print("Introduzca el número a multiplicar: ");
        num=Leer.datoInt();
        for(i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }//Fin Para
    }//Fin Programa
}

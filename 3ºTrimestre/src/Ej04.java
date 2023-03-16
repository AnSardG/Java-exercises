/**
 *
 * @author Antonio Sard González
 */
public class Ej04 {
    public static void main(String[] args){
        //Entorno:
        int numero, numMin;
        byte pos, posMin;
        //Algoritmo:
        System.out.print("Introduzca el número 1: ");
        numero=Leer.datoInt();
        numMin=numero;
        posMin=1;
        for(pos=2;pos<=50;pos++){
            System.out.print("Introduzca el número "+pos+": ");
            numero=Leer.datoInt();
            if(numMin>=numero){
                numMin=numero;
                posMin=pos;
            }//Fin Si
        }//Fin Para
        System.out.println("El número menor de todos es el "+numMin
                +", introducido en la posición "+posMin+".");
    }//Fin Programa
}

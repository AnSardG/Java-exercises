/**
 *
 * @author Antonio Sard González
 */
public class Ej03 {
    public static void main(String[] args){
        //Entorno:
        int numero, numMax;
        byte pos, posMax;
        //Algoritmo:
        System.out.print("Introduzca el número 1: ");
        numero=Leer.datoInt();
        numMax=numero;
        posMax=1;
        for(pos=2;pos<=50;pos++){
            System.out.print("Introduzca el número "+pos+": ");
            numero=Leer.datoInt();
            if(numero>numMax){
                numMax=numero;
                posMax=pos;
            }//Fin Si
        }//Fin Para
        System.out.println("El número mayor de todos es el "+numMax
                +", introducido en la posición "+posMax+".");
    }//Fin Programa
}

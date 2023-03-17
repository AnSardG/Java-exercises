/**
 *
 * @author Antonio Sard González
 */
public class Ej05 {
    public static void main(String[] args){
        //Entorno:
        int numero, numeroMax;
        byte i;
        String posMax;
        //Algoritmo:
        System.out.print("Introduzca el número 1: ");
        numero=Leer.datoInt();
        numeroMax=numero;
        posMax="1, ";
        for(i=2;i<=50;i++){
            System.out.print("Introduzca el número "+i+": ");
            numero=Leer.datoInt();
            if(numero==numeroMax){
                posMax+=Byte.toString(i)+", ";
            }else if(numero > numeroMax){
                numeroMax=numero;
                posMax=Byte.toString(i)+", ";
            }//Fin Si
        }//Fin Para
        System.out.print("El número mayor de todos es el "+numeroMax
                +" introducido en ");
        posMax=posMax.substring(0, posMax.length()-2)+".";
        if(posMax.matches("\\d\\.")){
            System.out.print("la posicion: ");
        } else {
            System.out.print("las posiciones: ");
        }//Fin Si
        System.out.println(posMax);
    }//Fin Programa
}

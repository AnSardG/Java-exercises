//Programa: Ej15
//Autor: Antonio Sard González
public class Ej15 {

    public static void main(String[] args) {
        //Entorno:
        float num, numMayor, numMenor;
        byte i;
        //Algoritmo:
        System.out.print("Introduzca el número 1: ");
        num = Leer.datoFloat();
        numMayor = num;
        numMenor = num;
        for(i=2;i<=4;i++) {
            System.out.print("Introduzca el número "+i+": ");
            num = Leer.datoFloat();
            if (numMayor < num) {
                numMayor = num;
            } else {
                if (numMenor > num) {
                    numMenor = num;
                }//Fin Si
            }//Fin Si
        }//Fin Para
        System.out.println("El número mayor de los introducidos es: " + numMayor 
                + ", y el menor es: " + numMenor);
    }//Fin Programa
}

//Programa: Ej15
//Autor: Antonio Sard González
public class Ej15 {

    public static void main(String[] args) {
        //Entorno:
        float num, numMayor, numMenor;
        short auxI;
        byte i;
        //Algoritmo:
        System.out.print("Introduzca a continuación cuatro números para saber cuál es mayor y cuál menor: ");
        num = Leer.datoFloat();
        numMayor = num;
        numMenor = num;
        auxI = (short) 1;
        i = (byte) auxI;
        do {
            System.out.print("Introduzca otro número: ");
            num = Leer.datoFloat();
            if (numMayor < num) {
                numMayor = num;
            } else {
                if (numMenor > num) {
                    numMenor = num;
                }//Fin Si
            }//Fin Si
            i++;
        } while (i <= 3);
        System.out.print("El número mayor de los introducidos es: " + numMayor 
                + ", y el menor es: " + numMenor);
    }//Fin Programa
}

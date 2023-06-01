
import java.util.Random;

//Programa: Practica3
//Autor: Antonio Sard González
public class Practica3 {

    public static byte cifras(int num) {
        //Entorno:
        byte cifras;
        //Algoritmo:
        cifras = 0;
        while (num != 0) {
            num = num / 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Función

    public static byte sacaDigito(int numero, byte posicion) {
        //Entorno:
        byte digito;
        int auxNum;
        //Algoritmo:
        if ((byte) (cifras(numero) - posicion) < 0) {
            digito = -1;
        } else {
            numero = numero / (int) Math.pow(10, (byte) (cifras(numero) - posicion));
            auxNum = numero / 10 * 10;
            digito = (byte) (numero - auxNum);
        }//Fin Si
        return digito;
    }//Fin Función

    public static int numeroAleatorio() {
        //Entorno:
        Random numAleatorio;
        int num;
        //Algoritmo:
        numAleatorio = new Random();
        do {
            num = numAleatorio.nextInt(1000001);
        } while (num == 0);
        return num;
    }//Fin Función

    public static void muestraResultado(int numAleatorio, int numIntroducido) {
        //Entorno:
        int auxAleatorio, auxIntroducido;
        byte cifraNum;
        //Algoritmo:
        auxAleatorio = numAleatorio;
        auxIntroducido = numIntroducido;
        if (cifras(numAleatorio) > cifras(numIntroducido)) {
            while (cifras(auxAleatorio) > cifras(auxIntroducido)) {
                System.out.print("*");
                auxAleatorio = auxAleatorio / 10;
            }//Fin Mientras
            numAleatorio = numAleatorio - (int) (numAleatorio
                    / Math.pow(10, cifras(numIntroducido)))
                    * (int) Math.pow(10, cifras(numIntroducido));
        }//Fin Si
        if (cifras(numIntroducido) > cifras(numAleatorio)) {
            numIntroducido = numIntroducido - (int) (numIntroducido
                    / Math.pow(10, cifras(numAleatorio)))
                    * (int) Math.pow(10, cifras(numAleatorio));
        }//Fin Si
        for (cifraNum = 1; cifraNum <= cifras(numIntroducido); cifraNum++) {
            if (sacaDigito(numAleatorio, cifraNum) == sacaDigito(numIntroducido, cifraNum)) {
                System.out.print(sacaDigito(numAleatorio, cifraNum));
            } else {
                System.out.print("*");
            }//Fin Si
        }//Fin Para
        System.out.println();
    }//Fin Procedimiento

    public static void main(String[] args) {
        //Entorno:
        int numAleatorio, numIntroducido;
        byte oportunidad, cifrasAleatorio;
        boolean incorrecto;
        //Algoritmo:
        numAleatorio = numeroAleatorio();
        incorrecto = true;
        oportunidad = 1;
        System.out.print("Tiene 10 oportunidades para adivinar el siguiente número: ");
        for (cifrasAleatorio = cifras(numAleatorio); cifrasAleatorio >= 1; cifrasAleatorio--) {
            System.out.print("*");
        }//Fin Para
        System.out.println(" (" + cifras(numAleatorio) + " dígitos)");
        do {
            System.out.print("Introduzca un número (" + oportunidad 
                    + "ª oportunidad): ");
            numIntroducido = Leer.datoInt();
            if (numAleatorio != numIntroducido) {
                muestraResultado(numAleatorio, numIntroducido);
                oportunidad++;
            } else {
                incorrecto = false;
            }//Fin Si
        } while (incorrecto && oportunidad <= 10);
        if (incorrecto) {
            System.out.println("Ha perdido, el número correcto es el " 
                    + numAleatorio + ".");
        } else {
            System.out.println("¡Ha acertado, el número correcto es el " + numAleatorio 
                    + ", ha ganado en la " + oportunidad + "ª oportunidad!");
        }//Fin Si
    }//Fin Programa
}
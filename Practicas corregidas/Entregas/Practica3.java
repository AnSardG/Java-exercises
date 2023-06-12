
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
        //Algoritmo:
        if (cifras(numero) < posicion) {
            digito = -1;
        } else {
            digito = (byte) (numero / (int) Math.pow(10, cifras(numero) - posicion) % 10);
        }//Fin Si
        return digito;
    }//Fin Función

    public static int numeroAleatorio() {
        //Entorno:
        Random numAleatorio;
        int num;
        //Algoritmo:
        numAleatorio = new Random();
        num = numAleatorio.nextInt(1000000) + 1;
        return num;
    }//Fin FunciónS

    public static void muestraResultado(int numAleatorio, int numIntroducido) {
        //Entorno:
        byte cifraNum, diferencia, cifrasNumAleatorio, cifrasNumIntroducido, diferenciaCifras;
        //Algoritmo:
        cifrasNumAleatorio = cifras(numAleatorio);
        cifrasNumIntroducido = cifras(numIntroducido);
        diferencia = (byte) (cifrasNumAleatorio - cifrasNumIntroducido);
        while (diferencia >= 1) {
            System.out.print("*");
            diferencia--;
        }//Fin Mientras
        diferenciaCifras = (byte) (cifrasNumAleatorio - cifrasNumIntroducido);
        for (cifraNum = 1; cifraNum <= cifrasNumIntroducido; cifraNum++) {
            if (sacaDigito(numAleatorio, (byte)(cifraNum + diferenciaCifras)) 
                    == sacaDigito(numIntroducido, cifraNum)) {
                System.out.print(sacaDigito(numIntroducido, cifraNum));
            } else {
                System.out.print("*");
            }//Fin Si
        }//Fin Para
        System.out.println();
    }//Fin Procedimiento

    public static int pideNumero() {
        //Entorno:
        int numero;
        //Algoritmo:
        do {
            System.out.print("Introduzca un número positivo (no debe tener mas cifras que el aleatorio): ");
            numero = Leer.datoInt();
        } while (numero < 0);
        return numero;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        int numAleatorio, numIntroducido;
        byte oportunidad, cifrasAleatorio;
        //Algoritmo:
        numAleatorio = numeroAleatorio();
        oportunidad = 1;
        System.out.print("Tiene 10 oportunidades para adivinar el siguiente número: ");
        for (cifrasAleatorio = cifras(numAleatorio); cifrasAleatorio >= 1; cifrasAleatorio--) {
            System.out.print("*");
        }//Fin Para
        System.out.println(" (" + cifras(numAleatorio) + " dígitos)");
        do {
            System.out.println(" (" + oportunidad + "ª oportunidad)");
            do {
                numIntroducido = pideNumero();
            } while (cifras(numIntroducido) > cifras(numAleatorio));
            muestraResultado(numAleatorio, numIntroducido);
            oportunidad++;
        } while (numAleatorio != numIntroducido && oportunidad < 10);
        if (numAleatorio != numIntroducido) {
            System.out.println("Ha perdido, el número correcto es el "
                    + numAleatorio + ".");
        } else {
            System.out.println("¡Ha acertado, el número correcto es el " + numAleatorio
                    + ", ha ganado en la " + oportunidad + "ª oportunidad!");
        }//Fin Si
    }//Fin Programa
}
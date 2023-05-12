
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class Ahorcado {

    public static byte pideDificultad() {
        //Entorno:
        BufferedReader teclado;
        String dificultad;
        //Algoritmo:
        System.out.println("Nivel 1.- Fácil");
        System.out.println("Nivel 2.- Difícil");
        System.out.print("Elige opción: ");
        teclado = new BufferedReader(new InputStreamReader(System.in));
        dificultad = "-1";
        try {
            dificultad = teclado.readLine();
            while ((Long.valueOf(dificultad) < Byte.MIN_VALUE || Long.valueOf(dificultad) > Byte.MAX_VALUE)
                    || (Byte.valueOf(dificultad) != 1 && Byte.valueOf(dificultad) != 2)) {
                System.out.print("Elige una opción correcta [1-2]: ");
                dificultad = teclado.readLine();
            }//Fin Mientras
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try       
        return Byte.valueOf(dificultad);
    }//Fin Función

    public static String pidePalabra() {
        //Entorno:
        BufferedReader teclado;
        String palabra;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        palabra = "";
        try {
            palabra = teclado.readLine();
            while (palabra.isEmpty() || !palabra.matches("[a-zA-ZñÑÁÉÓÍÚáéóíú]+")) {
                System.out.print("Palabra incorrecta, introduzca una palabra: ");
                palabra = teclado.readLine();
            }//Fin Mientras
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return palabra;
    }//Fin Función

    public static char pideLetra() {
        //Entorno:
        BufferedReader teclado;
        String linea;
        char letra;
        //Algoritmo:
        letra = '\n';
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            linea = teclado.readLine();
            while (linea.isEmpty() || !linea.matches("[a-zA-ZñÑÁÉÓÍÚáéóíú]")) {
                System.out.print("Letra incorrecta. Introduzca una letra correcta: ");
                linea = teclado.readLine();
            }//Fin Mientras
            letra = linea.charAt(0);
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return letra;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        AhorcadoDificil aDificil;
        AhorcadoFacil aFacil;
        byte res;
        //Algoritmo:
        if (Ahorcado.pideDificultad() == 1) {
            System.out.print("Introduzca la palabra secreta: ");
            aFacil = new AhorcadoFacil(Ahorcado.pidePalabra());
            do {
                System.out.print("Introduzca una letra: ");
                aFacil.compruebaLetra(Ahorcado.pideLetra());
                res = aFacil.muestraResultado();
                aFacil.muestraListaFallos();
            } while (res == -1 && aFacil.getFallos() < aFacil.FALLOSPERMITIDOS);
        } else {
            System.out.print("Introduzca la palabra secreta: ");
            aDificil = new AhorcadoDificil(Ahorcado.pidePalabra());
            do {
                System.out.print("Introduzca una letra: ");
                aDificil.compruebaLetra(Ahorcado.pideLetra());
                res = aDificil.muestraResultado();
            } while (res == -1 && aDificil.getFallos()
                    < AhorcadoDificil.FALLOSPERMITIDOS);
        }//Fin Si              
    }//Fin Programa
}

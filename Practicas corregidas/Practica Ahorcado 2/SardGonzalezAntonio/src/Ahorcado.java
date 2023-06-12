
import JuegoAhorcado.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
        byte res, dificultad;
        //Algoritmo:       
        dificultad = Ahorcado.pideDificultad();
        try {
            if (dificultad == 1) {
                aFacil = new AhorcadoFacil();
                do {
                    System.out.print("Introduzca una letra: ");
                    aFacil.compruebaLetra(Ahorcado.pideLetra());
                    if (aFacil.getFallos() > 0) {
                        aFacil.muestraListaFallos();
                    }//Fin Si    
                    res = aFacil.muestraResultado();
                } while (res == -1 && aFacil.getFallos() < aFacil.FALLOSPERMITIDOS);
            } else {
                aDificil = new AhorcadoDificil();
                do {
                    System.out.print("Introduzca una letra: ");
                    aDificil.compruebaLetra(Ahorcado.pideLetra());
                    res = aDificil.muestraResultado();
                } while (res == -1 && aDificil.getFallos()
                        < AhorcadoDificil.FALLOSPERMITIDOS);
            }//Fin Si     
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el archivo correspondiente en "
                    + "el directorio Ficheros: cree el archivo Facil.txt o Dificil.txt");
        } catch (NumberFormatException nfe) {
            System.out.println("No se ha especificado en el fichero el número de "
                    + "palabras que contiene, asegurese de haber escrito en la "
                    + "primera línea la cantidad exacta de palabras que contenga.");
        } catch (IllegalArgumentException iae) {
            System.out.println("El fichero está mal formado, se han encontrado "
                    + "menos palabras de las debidas, compruebe su formato.");
        } catch (IOException ioe) {
            System.out.println("Se ha encontrado un error de E/S.");
        }//Fin try
    }//Fin Programa
}

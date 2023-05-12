
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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

    public static String buscaPalabra(byte dificultad) {
        //Entorno:
        BufferedReader fSalida = null;
        String palabra = "";
        Random numAleatorio;
        int cantPalabras, numPalabra, i;
        //Algoritmo:
        try {
            if (dificultad == 1) {
                fSalida = new BufferedReader(new FileReader(".\\Ficheros\\Facil.txt"));
            } else {
                fSalida = new BufferedReader(new FileReader(".\\Ficheros\\Dificil.txt"));
            }//Fin Si
            cantPalabras = Integer.valueOf(fSalida.readLine());
            numAleatorio = new Random();
            numPalabra = numAleatorio.nextInt(cantPalabras);
            palabra = fSalida.readLine();
            i = 0;
            while(palabra != null && numPalabra > i){
                fSalida.readLine();
                i++;
            }//Fin Mientras
            palabra = fSalida.readLine();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el archivo correspondiente en"
                    + "el directorio Ficheros: cree el archivo Facil.txt o Dificil.txt");
        } catch (IOException ioe){
            System.out.println("Se ha encontrado un error de E/S.");
        } finally {
            if(fSalida != null){
                try{
                    fSalida.close();
                } catch (IOException ioe){
                    System.out.println("Error de E/S al cerrar fichero");
                }//Fin Try
            }//Fin Si
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
        byte res, dificultad;
        //Algoritmo:
        dificultad = Ahorcado.pideDificultad();
        if (dificultad == 1) {
            aFacil = new AhorcadoFacil(Ahorcado.buscaPalabra(dificultad));
            do {
                System.out.print("Introduzca una letra: ");
                aFacil.compruebaLetra(Ahorcado.pideLetra());
                res = aFacil.muestraResultado();
                if (aFacil.getFallos() > 0) {
                    aFacil.muestraListaFallos();
                }//Fin Si                
            } while (res == -1 && aFacil.getFallos() < aFacil.FALLOSPERMITIDOS);
        } else {
            aDificil = new AhorcadoDificil(Ahorcado.buscaPalabra(dificultad));
            do {
                System.out.print("Introduzca una letra: ");
                aDificil.compruebaLetra(Ahorcado.pideLetra());
                res = aDificil.muestraResultado();
            } while (res == -1 && aDificil.getFallos()
                    < AhorcadoDificil.FALLOSPERMITIDOS);
        }//Fin Si              
    }//Fin Programa
}

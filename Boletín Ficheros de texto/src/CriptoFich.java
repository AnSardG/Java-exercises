
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class CriptoFich {

    public static byte muestraMenu() {
        //Entorno:
        BufferedReader teclado;
        String linea = null;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CRIPTOFICH");
        System.out.println("--------------");
        System.out.println("1. Encriptar (Codificar).");
        System.out.println("2. Desencriptar (Decodificar).");
        System.out.println("3. Salir");
        System.out.print("Elija opción (1-3): ");
        try {
            linea = teclado.readLine();
            while (!linea.matches("[1-3]")) {
                System.out.println("1. Encriptar (Codificar).");
                System.out.println("2. Desencriptar (Decodificar).");
                System.out.println("3. Salir");
                System.out.print("Opción incorrecta, elija una opción correcta (1-3): ");
                linea = teclado.readLine();
            }//Fin Mientras
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return Byte.valueOf(linea);
    }//Fin Función

    public static File pideFicheroOrigen(byte opcion) {
        //Entorno:
        BufferedReader teclado;
        String linea;
        File fichero = null;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            if (opcion == 1) {
                System.out.print("Introduzca el nombre del fichero que desea codificar: ");
            } else {
                System.out.print("Introduzca el nombre del fichero con el texto codificado: ");
            }//Fin Si
            linea = teclado.readLine();
            fichero = new File(linea);
            while (!fichero.exists()) {
                System.out.print("El fichero introducido no existe, asegúrese"
                        + " del nombre del archivo y vuelva a introducirlo: ");
                linea = teclado.readLine();
                fichero = new File(linea);
            }//Fin Mientras
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return fichero;
    }//Fin Función

    public static File pideFicheroDestino(byte opcion) {
        //Entorno:
        BufferedReader teclado;
        String linea;
        File fichero = null;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            if (opcion == 1) {
                System.out.print("Introduzca el nombre del fichero destino que "
                        + "contendrá el texto encriptado: ");
            } else {
                System.out.print("Introduzca el nombre del fichero donde desea "
                        + "almacenar el resultado del texto desencriptado: ");
            }//Fin Si
            linea = teclado.readLine();
            fichero = new File(linea);
            if (!fichero.exists()) {
                fichero.createNewFile();
                System.out.println("Se ha creado el fichero " + fichero.getName() + ".");
            }//Fin Si
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return fichero;
    }//Fin Función

    public static char[][] obtenMatriz(File fichero) {
        //Entorno:
        BufferedReader fSalida = null;
        String linea;
        char[][] matriz = null;
        int numFilas, numColumnas, fila, columna;
        //Algoritmo:
        try {
            fSalida = new BufferedReader(new FileReader(fichero));
            linea = fSalida.readLine();
            numFilas = Integer.parseInt(linea);
            linea = fSalida.readLine();
            numColumnas = Integer.parseInt(linea);
            linea = fSalida.readLine();
            matriz = new char[numFilas][numColumnas];
            for (fila = 0; fila < numFilas; fila++) {
                for (columna = 0; columna < numColumnas; columna++) {
                    matriz[fila][columna] = linea.charAt(0);
                    linea = linea.substring(1);
                }//Fin Para
            }//Fin Para
        } catch (FileNotFoundException fnfe) {
            System.out.println(fSalida + " no existe. Compruebe la ruta o el "
                    + "archivo introducido.");
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        } finally {
            if (fSalida != null) {
                try {
                    fSalida.close();
                } catch (IOException ioe) {
                    System.out.println("Error de E/S.");
                }//Fin Try
            }//Fin Si
        }//Fin Try
        return matriz;
    }//Fin Función

    public static File obtenFicheroNuevo(File fichero, char[][] matriz) {
        //Entorno:
        FileWriter fEntrada = null;
        char[][] matrizPermutada;
        int cantFilas, cantColumnas, fila, columna;
        String linea;
        //Algoritmo:
        cantFilas = matriz[0].length;
        cantColumnas = matriz.length;
        matrizPermutada = new char[cantFilas][cantColumnas];
        for (columna = 0; columna < cantColumnas; columna++) {
            for (fila = 0; fila < cantFilas; fila++) {
                matrizPermutada[fila][columna] = matriz[columna][fila];
            }//Fin Para
        }//Fin Para
        try {
            fEntrada = new FileWriter(fichero);
            fEntrada.write(Integer.toString(cantFilas) + "\n");
            fEntrada.write(Integer.toString(cantColumnas) + "\n");
            cantFilas = matrizPermutada.length;
            cantColumnas = matrizPermutada[0].length;
            linea = "";
            for (fila = 0; fila < cantFilas; fila++) {
                for (columna = 0; columna < cantColumnas; columna++) {
                    linea += matrizPermutada[fila][columna];
                }//Fin Para
            }//Fin Para
//            linea = linea.replaceAll(" +", " ");
            fEntrada.write(linea);
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        } finally {
            if (fEntrada != null) {
                try {
                    fEntrada.close();
                } catch (IOException ioe) {
                    System.out.println("Error de E/S.");
                }//Fin Try                
            }//Fin Si
        }//Fin Try
        return fichero;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        byte op;
        File fOrigen, fDestino;
        char[][] matriz;
        //Algoritmo:
        do {
            op = muestraMenu();
            if (op == 1) {
                fOrigen = pideFicheroOrigen(op);
                fDestino = pideFicheroDestino(op);
                matriz = obtenMatriz(fOrigen);
                obtenFicheroNuevo(fDestino, matriz);
                System.out.println("Fichero codificado satisfactoriamente.");
            } else if (op == 2) {
                fOrigen = pideFicheroOrigen(op);
                fDestino = pideFicheroDestino(op);
                matriz = obtenMatriz(fOrigen);
                obtenFicheroNuevo(fDestino, matriz);
                System.out.println("Fichero descodificado satisfactoriamente.");
            }//Fin Si
        } while (op != 3);
    }//Fin Programa
}

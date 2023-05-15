
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio Sard González
 */
public class PruebaTest {

    public static byte muestraOpcion() {
        //Entorno:
        BufferedReader teclado;
        String linea = null;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CORRECION DE TEST");
        System.out.println("----------------------------");
        System.out.println("1.Cargar fichero de resultados.");
        System.out.println("2.Evaluar fichero de respuestas.");
        System.out.println("3.Salir");
        System.out.print("Elija opción (1-3): ");
        try {
            linea = teclado.readLine();
            while (!linea.matches("[1-3]")) {
                System.out.println("Opción incorrecta, introduzca una opción correcta.");
                System.out.println("1.Cargar fichero de resultados.");
                System.out.println("2.Evaluar fichero de respuestas.");
                System.out.println("3.Salir");
                System.out.print("Elija opción (1-3): ");
                linea = teclado.readLine();
            }//Fin Mientras
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return Byte.valueOf(linea);
    }//Fin Función

    public static String[] cargaResultados(File fResultados) {
        //Entorno:
        BufferedReader fSalida;
        String linea;
        int i, cantResultados;
        String[] resultados = null;
        //Algoritmo:
        try {
            fSalida = new BufferedReader(new FileReader(fResultados));
            linea = fSalida.readLine();
            while (!linea.matches("[0-9]+")) {
                linea = fSalida.readLine();
            }//Fin Mientras
            cantResultados = Integer.parseInt(linea);
            resultados = new String[cantResultados];
            for (i = 0; i < cantResultados; i++) {
                linea = fSalida.readLine();
                resultados[i] = linea.substring(linea.length() - 1);
            }//Fin Para
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo de resultados no encontrado, asegurese "
                    + "de que la ruta es correcta y el archivo existe.");
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return resultados;
    }//Fin Función

    public static boolean compruebaNumeroRespuestasDeArchivo(File fRespuesta, String[] resultados) {
        //Entorno:
        BufferedReader fSalida = null;
        String linea;
        boolean archivoCorrecto = false;
        //Algoritmo:
        try {
            fSalida = new BufferedReader(new FileReader(fRespuesta));
            do {
                linea = fSalida.readLine();
            } while (!linea.matches("[0-9]+"));
            if (Integer.valueOf(linea) == resultados.length) {
                archivoCorrecto = true;
            } else {
                archivoCorrecto = false;
            }//Fin Si
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo de respuestas no encontrado, asegurese"
                    + " de que dicho archivo existe.");
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
        return archivoCorrecto;
    }//Fin Función

    public static boolean[] compruebaRespuestas(File fRespuesta, String[] resultados) {
        //Entorno:
        BufferedReader fSalida = null;
        String linea;
        boolean[] respuestas = null;
        int i;
        //Algoritmo:
        try {
            fSalida = new BufferedReader(new FileReader(fRespuesta));
            do {
                linea = fSalida.readLine();
            } while (linea.matches("[0-9]+"));
            respuestas = new boolean[resultados.length];
            for (i = 0; i < resultados.length; i++) {
                linea = fSalida.readLine();
                linea = linea.substring(linea.length() - 1);
                respuestas[i] = linea.equals(resultados[i]);
            }//Fin Para
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo de respuestas no encontrado, asegurese"
                    + " de que dicho archivo existe.");
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
        return respuestas;
    }//Fin Función

    public static void muestraResultados(File fRespuesta, boolean[] respuestas) {
        //Entorno:
        BufferedReader fSalida = null;
        String linea, nombre, apellidos;
        int aciertos, fallos;
        //Algoritmo:
        try {
            fSalida = new BufferedReader(new FileReader(fRespuesta));
            linea = fSalida.readLine();
            nombre = linea.replaceFirst("Nombre: ", "");
            linea = fSalida.readLine();
            apellidos = linea.replaceFirst("Apellidos: ", "");
            System.out.println("Alumno: " + nombre + " " + apellidos);
            aciertos = 0;
            fallos = 0;
            for (boolean respuesta : respuestas) {
                if (respuesta) {
                    aciertos++;
                } else {
                    fallos++;
                }//Fin Si
            }//Fin Foreach
            System.out.println("Resultados:");
            System.out.println("\tAciertos: " + aciertos);
            System.out.println("\tFallos: " + fallos);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo de respuestas erróneo, compruebe el archivo"
                    + " correspondiente antes de continuar la ejecución.");
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
    }//Fin Procedimiento

    public static File pideFichero(byte opcion) {
        //Entorno:
        BufferedReader teclado;
        String linea;
        File fichero = null;
        //Algoritmo:
        teclado = new BufferedReader(new InputStreamReader(System.in));
        if (opcion == 1) {
            System.out.print("Introduzca el nombre del fichero que contiene los "
                    + "resultados del test: ");
        } else {
            System.out.print("Introduzca el nombre del fichero que contiene las"
                    + " respuestas del alumno: ");
        }//Fin Si        
        try {
            linea = teclado.readLine();
            fichero = new File(linea);
            while (!fichero.exists()) {
                System.out.print("El archivo introducido no es correcto. Introduzca"
                        + " un archivo correcto: ");
                linea = teclado.readLine();
                fichero = new File(linea);
            }//Fin Mientras
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
        return fichero;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        byte opcion;
        boolean resultadosCargados;
        String[] resultados = null;
        boolean[] respuestas;
        File fRespuesta, fResultados;
        //Algoritmo:
        resultadosCargados = false;
        do {
            opcion = muestraOpcion();
            if (opcion == 1) {
                fResultados = pideFichero(opcion);
                resultados = cargaResultados(fResultados);
                System.out.println("Resultados cargados satisfactoriamente.");
                resultadosCargados = true;
            } else if (opcion == 2 && resultadosCargados) {
                fRespuesta = pideFichero(opcion);
                if (compruebaNumeroRespuestasDeArchivo(fRespuesta, resultados)) {
                    respuestas = compruebaRespuestas(fRespuesta, resultados);
                    muestraResultados(fRespuesta, respuestas);
                } else {
                    System.out.println("El fichero de respuestas dado tiene "
                            + "un tamaño distinto al número anterior, el programa"
                            + " no seguirá leyendo respuestas.");
                    opcion = 3;
                }//Fin Si                
            } else if (opcion != 3) {
                System.out.println("------------------------");
                System.out.println("Primero debe cargar los resultados del archivo que "
                        + "contiene las respuestas del test (opción 1).");
                System.out.println("------------------------");
            }//Fin Si
        } while (opcion != 3);
    }//Fin Programa
}

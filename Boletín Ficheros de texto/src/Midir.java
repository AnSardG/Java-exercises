
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author Antonio Sard González
 */
public class Midir {

    public static void muestraEtiqueta(File sArchivos) {
        //Entorno:
        Path etiqueta;
        //Algoritmo:
        etiqueta = sArchivos.toPath().toAbsolutePath();
        if (etiqueta.startsWith("C:\\")) {
            System.out.println(" El volumen de la unidad C no tiene etiqueta.");
        } else {
            System.out.println(" Etiqueta del volumen de la unidad C: " + etiqueta);
        }//Fin Si            
    }//Fin Procedimiento

    public static void muestraDirectorio(File sArchivos) {
        System.out.println(" Directorio de " + sArchivos.getAbsolutePath());
    }//Fin Procedimiento

    public static void muestraContenido(File sArchivos) {
        //Entorno:
        File[] archivos;
        File fAux;
        FileTime fTiempo;
        String lineaAux, linea;
        short numArchivos, numDirectorios;
        long bytesArchivos;
        //Algoritmo:
        archivos = sArchivos.listFiles();
        while (archivos == null) {
            lineaAux = "..\\";
            fAux = new File(lineaAux);
            archivos = fAux.listFiles();
            lineaAux += lineaAux;
        }//Fin Mientras
        numDirectorios = 0;
        numArchivos = 0;
        bytesArchivos = 0;
        try {
            fTiempo = Files.getLastModifiedTime(archivos[0].toPath());
            linea = fTiempo.toString();
            linea = linea.substring(8, 10) + "/" + linea.substring(5, 7) + "/"
                    + linea.substring(0, 4) + "  " + linea.substring(11, 16);
            if (archivos[0].length() == 0) {
                linea += "      <DIR>\t\t";
                numDirectorios++;
            } else {
                linea += "\t\t    " + archivos[0].length();
                numArchivos++;
                bytesArchivos += archivos[0].length();
            }//Fin Si
            linea += " .";
            System.out.println(linea);
            fAux = new File(archivos[0].getParent());
            fTiempo = Files.getLastModifiedTime(fAux.toPath());
            linea = fTiempo.toString();
            linea = linea.substring(8, 10) + "/" + linea.substring(5, 7) + "/"
                    + linea.substring(0, 4) + "  " + linea.substring(11, 16);
            if (fAux.length() == 0) {
                linea += "      <DIR>\t\t";
                numDirectorios++;
            } else {
                linea += "\t\t    " + fAux.length();
                numArchivos++;
                bytesArchivos += fAux.length();
            }//Fin Si
            linea += " ..";
            System.out.println(linea);
            for (File a : archivos) {
                fTiempo = Files.getLastModifiedTime(a.toPath());
                linea = fTiempo.toString();
                linea = linea.substring(8, 10) + "/" + linea.substring(5, 7) + "/"
                        + linea.substring(0, 4) + "  " + linea.substring(11, 16);
                if (a.length() == 0) {
                    linea += "      <DIR>\t\t";
                    numDirectorios++;
                } else {
                    linea += "\t\t    " + a.length();
                    numArchivos++;
                    bytesArchivos += a.length();
                }//Fin Si
                linea += " " + a.getName();
                System.out.println(linea);
            }//Fin Foreach
            System.out.println("\t\t" + numArchivos + " archivos\t\t" + bytesArchivos + " bytes");
            System.out.println("\t\t" + numDirectorios + " dirs    "
                    + archivos[0].getFreeSpace() + " bytes libres");
        } catch (IOException ioe) {
            System.out.println("Error de E/S.");
        }//Fin Try
    }//Fin Procedimiento

    public static void main(String[] args) {
        //Entorno:
        File sArchivos = null;
        boolean paramCorrectos;
        //Algoritmo:           
        paramCorrectos = true;
        if (args.length == 0) {
            sArchivos = new File("");
        } else if (args.length == 1) {
            sArchivos = new File(args[0]);
        } else {
            paramCorrectos = false;
            System.out.println("Número erróneo de parámetros, introduzca un "
                    + "parámetro como máximo.");
        }//Fin Si
        if (paramCorrectos) {
            muestraEtiqueta(sArchivos);
            System.out.println("");
            muestraDirectorio(sArchivos);
            System.out.println("");
            muestraContenido(sArchivos);
        }//Fin Si            
    }//Fin Programa
}

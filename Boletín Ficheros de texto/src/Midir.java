
import java.io.BufferedReader;
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
    }

    public static void muestraContenido(File sArchivos) {
        //Entorno:
        File[] archivos;
        File fAux;
        FileTime fTime;
        String lineaAux, linea;
        //Algoritmo:
        archivos = sArchivos.listFiles();
        while (archivos == null) {
            lineaAux = "..\\";
            fAux = new File(lineaAux);
            archivos = fAux.listFiles();
            lineaAux += lineaAux;
        }//Fin Mientras
        for (File a : archivos) {
            try {
                fTime = Files.getLastModifiedTime(a.toPath());
                linea = fTime.toString();
                linea = linea.substring(8, 10) + "/" + linea.substring(5, 7) + "/"
                        + linea.substring(0, 4) + "  " + linea.substring(11, 16);
                if(a.length() == 0){
                    linea += "      <DIR>";
                } else {
                    linea += "\t\t"+a.length();
                }
                linea += " "+a.getName();
                System.out.println(linea);
            } catch (IOException ioe) {
                System.out.println("Error de E/S.");
            }
        }
    }

    public static void main(String[] args) {
        //Entorno:
        BufferedReader fSalida;
        File sArchivos;
        String linea;
        //Algoritmo:               
        if (args.length == 0) {
            sArchivos = new File("");
            muestraEtiqueta(sArchivos);
            System.out.println("");
            muestraDirectorio(sArchivos);
            System.out.println("");
            muestraContenido(sArchivos);
        }
    }//Fin Programa
}

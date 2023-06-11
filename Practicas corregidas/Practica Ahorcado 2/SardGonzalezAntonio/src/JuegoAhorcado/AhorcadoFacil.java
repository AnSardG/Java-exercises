package JuegoAhorcado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Antonio Sard González
 */
public class AhorcadoFacil extends AhorcadoDificil {
    //Atributos:

    private LinkedList<Character> listaFallos;
    //Constructores:

    public AhorcadoFacil() throws FileNotFoundException,
            IllegalArgumentException, NumberFormatException, IOException {
        super();
        listaFallos = new LinkedList();
    }
    //Métodos:

    @Override
    public void compruebaLetra(char letra) {
        //Entorno:
        int cantLetra;
        //Algoritmo:
        letra = Character.toLowerCase(letra);
        cantLetra = palabraSecreta.length()
                - palabraSecreta.toLowerCase().replaceAll(String.valueOf(letra), "").length();
        if (cantLetra > 0) {
            this.modificaPalabraRespuesta(letra, cantLetra);
        } else if (listaFallos.indexOf(letra) < 0) {
            listaFallos.add(letra);
            this.incrementaFallos();
            this.modificaDibujo();
        }//Fin Si             
    }

    public void muestraListaFallos() {
        //Entorno:
        Iterator<Character> iterador;
        String linea;
        //Algoritmo:
        iterador = listaFallos.iterator();
        linea = "Letras fallidas: ";
        while (iterador.hasNext()) {
            linea += iterador.next() + ", ";
        }//Fin Mientras
        linea = linea.substring(0, linea.length() - 2) + ".";
        System.out.println(linea);
    }
}

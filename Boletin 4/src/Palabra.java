
/**
 *
 * @author Administrador
 */
public class Palabra {
    //Atributos:

    private String palabra;
    private int contador;
    //Constructores:

    public Palabra() {
    }

    public Palabra(String palabra) {
        this.palabra = palabra;
        contador = 1;
    }
    //M?todos:

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    public void incrementaContador() {
        contador++;
    }
}

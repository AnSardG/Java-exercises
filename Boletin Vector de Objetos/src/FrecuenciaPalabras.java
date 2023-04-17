
/**
 *
 * @author Administrador
 */
public class FrecuenciaPalabras {
    //Atributos:

    private Palabra[] matriz;
    //Constructores:

    public FrecuenciaPalabras() {
        matriz = new Palabra[0];
    }
    //M?todos:

    public int getTotalPalabras() {
        return matriz.length;
    }

    public int buscarPalabra(Palabra palabra) {
        //Entorno:
        int i;
        //Algoritmo:
        
        if (matriz.length > 0) {
            i = 0;
            while (i < matriz.length && !palabra.getPalabra().equals(matriz[i].getPalabra())) {
                i++;
            }//Fin Mientras
            if (i == matriz.length && !palabra.getPalabra().equals(matriz[i - 1].getPalabra())) {
                i = -1;
            }//Fin Si
        } else {
            i = -1;
        }//Fin Si        
        return i;
    }

    public void insertarPalabra(Palabra palabra) {
        //Entorno:
        int posicion;
        //Algoritmo:
        posicion = buscarPalabra(palabra);
        if (posicion >= 0) {
            obtenerObjPalabra(posicion).incrementaContador();
        } else {
            agrandarMatriz(matriz);
            matriz[matriz.length - 1] = palabra;
        }//Fin Si
    }

    public Palabra obtenerObjPalabra(int pos) {
        //Entorno:
        Palabra palabra;
        //Algoritmo:
        palabra = null;
        if(pos>-1 && pos < matriz.length){
            palabra = matriz[pos];
        }//Fin Si
        return palabra;
    }

    private void agrandarMatriz(Palabra[] matriz) {
        //Entorno:
        int i;
        //Algoritmo:
        this.matriz = new Palabra[matriz.length + 1];
        for (i = 0; i < matriz.length; i++) {
            this.matriz[i] = matriz[i];
        }//Fin Para
    }
}

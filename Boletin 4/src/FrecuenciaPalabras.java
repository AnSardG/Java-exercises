
import java.util.LinkedList;
import java.util.ListIterator;


/**
 *
 * @author Administrador
 */
public class FrecuenciaPalabras {
    //Atributos:

    private LinkedList<Palabra> matriz;
    //Constructores:

    public FrecuenciaPalabras() {
        matriz = new LinkedList();
    }
    //M?todos:

    public int getTotalPalabras() {
        return matriz.size();
    }

    public int buscarPalabra(Palabra palabra) {
        //Entorno:
        int i;
        ListIterator iterador;
        //Algoritmo:
        iterador = matriz.listIterator();
        i = 0;
        if (!matriz.isEmpty()){
            while(iterador.hasNext() && !matriz.peek().getPalabra().equals(palabra.getPalabra())){
                iterador.next();
                i++;
            }//Fin Mientras
            if(i == matriz.size() && !matriz.peekLast().getPalabra().equals(palabra.getPalabra())){
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
            matriz.add(palabra);
        }//Fin Si
    }

    public Palabra obtenerObjPalabra(int pos) {

        return matriz.get(pos);
    }

}


import java.util.LinkedList;


/**
 *
 * @author Antonio Sard González
 */
public class ListaTelefonos {
    //Atributos:

    private LinkedList<CPersona> listaTfnos;
    private int nElementos;
    //Constructores:

    public ListaTelefonos() {
        listaTfnos = new LinkedList();
    }

    //Métodos:

    public void ponerValorEn(int pos, CPersona persona) {
        //Algoritmo:
        if (pos >= 0 && pos < nElementos) {
            listaTfnos.add(pos, persona);
        }//Fin Si
    }

    public void aniadir(CPersona persona) {
        listaTfnos.add(persona);
        nElementos++;
    }

    public boolean eliminar(long elemento) {
        //Entorno:
        boolean eliminado;
        //Algoritmo:
        eliminado = false;
        if (elemento >= 0 && elemento < nElementos) {
            eliminado = true;
           listaTfnos.remove((int)elemento);
           nElementos--;
        }//Fin Si        
        return eliminado;
    }

    public int buscar(String nom) {
        //Entorno;
        int pos;
        //Algoritmo:
        pos = 0;
        while (pos < nElementos - 1 && !listaTfnos.get(pos).obtenerNombre().equals(nom)) {
            pos++;
        }//Fin Mientras
        if (!listaTfnos.get(pos).obtenerNombre().equals(nom)) {
            pos = -1;
        }//Fin Si
        return pos;
    }

    public CPersona valorEn(int pos) {
        //Entorno:
        CPersona persona;
        //Algoritmo:
        persona = null;
        if(pos>=0 && pos < listaTfnos.size()){
            persona = listaTfnos.get(pos);
        }//Fin Si
        return persona;
    }

    public int longitud() {
        return nElementos;
    }
}

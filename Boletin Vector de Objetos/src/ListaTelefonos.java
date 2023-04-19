
/**
 *
 * @author Antonio Sard González
 */
public class ListaTelefonos {
    //Atributos:

    private CPersona[] listaTfnos;
    private int nElementos;
    //Constructores:

    public ListaTelefonos() {
        listaTfnos = new CPersona[0];
    }

    //Métodos:
    public void unElementoMas(CPersona[] listaTfnos) {
        //Entorno:
        int i;
        //Algoritmo:
        nElementos++;
        this.listaTfnos = new CPersona[nElementos];
        for (i = 0; i < nElementos - 1; i++) {
            this.listaTfnos[i] = listaTfnos[i];
        }//Fin Para
    }

    public void ponerValorEn(int pos, CPersona persona) {
        //Entorno:
        int i;
        //Algoritmo:
        if (pos >= 0 && pos < nElementos) {
            unElementoMas(listaTfnos);
            for (i = listaTfnos.length - 1; i > pos; i--) {
                listaTfnos[i] = listaTfnos[i - 1];
            }//Fin Para
            listaTfnos[pos] = persona;
        }//Fin Si
    }

    public void aniadir(CPersona persona) {
        unElementoMas(listaTfnos);
        listaTfnos[nElementos - 1] = persona;
    }

    public void unElementoMenos() {
        //Entorno;
        CPersona[] listaAux;
        int i, cantPersonas;
        //Algoritmo:
        if (nElementos > 0) {
            cantPersonas = 0;
            for (i = 0; i < nElementos; i++) {
                if (listaTfnos[i] != null) {
                    cantPersonas++;
                }//Fin Si
            }//Fin Para
            listaAux = listaTfnos;
            listaTfnos = new CPersona[cantPersonas];
            cantPersonas = 0;
            for (i = 0; i < nElementos; i++) {
                if (listaAux[i] != null) {
                    listaTfnos[cantPersonas] = listaAux[i];
                    cantPersonas++;
                }//Fin Si
            }//Fin Para
            nElementos = cantPersonas;
        }//Fin Si
    }

    public boolean eliminar(long elemento) {
        //Entorno:
        boolean eliminado;
        //Algoritmo:
        eliminado = false;
        if (elemento >= 0 && elemento < nElementos) {
            eliminado = true;
            listaTfnos[(int) elemento] = null;
            unElementoMenos();
        }//Fin Si
        return eliminado;
    }

    public int buscar(String nom) {
        //Entorno;
        int pos;
        //Algoritmo:
        pos = 0;
        while (pos < nElementos - 1 && !listaTfnos[pos].obtenerNombre().equals(nom)) {
            pos++;
        }//Fin Mientras
        if (!listaTfnos[pos].obtenerNombre().equals(nom)) {
            pos = -1;
        }//Fin Si
        return pos;
    }

    public CPersona valorEn(int pos) {
        //Entorno:
        CPersona persona;
        //Algoritmo:
        if (pos >= 0 && pos < nElementos) {
            persona = listaTfnos[pos];
        } else {
            persona = null;
        }//Fin Si
        return persona;
    }

    public int longitud() {
        return nElementos;
    }
}

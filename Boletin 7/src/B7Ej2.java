
/**
 *
 * @author Antonio Sard González
 */
public class B7Ej2 {
    //Atributos:

    private int[] v;
    private int nElementos;

    //Constructores:
    public B7Ej2() {
        v = new int[10];
    }

    //Métodos:
    public void visualizar() {
        //Entorno:
        int i;
        String linea;
        //Algoritmo:
        linea = "";
        for (i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                linea += v[i] + "\t";
            } else {
                linea += '-' + "\t";
            }//Fin Si
        }//Fin Para
        System.out.println("Contenido de la tabla: ");
        System.out.println(linea);
    }//Fin Método

    public void insertarAlPrincipio(int n) {
        //Algoritmo:
        desplazaDerecha(0, nElementos);
        v[0] = n;
        nElementos++;
    }//Fin Método

    public void insertarAlFinal(int n) {
        v[nElementos] = n;
        nElementos++;
    }//Fin Método

    public void insertar(byte p, int n) {
        if (v[p] != 0) {
            desplazaDerecha(p, nElementos);
            v[p] = n;
        } else {
            v[nElementos] = n;
        }//Fin Si        
        nElementos++;
    }//Fin Método

    public void eliminarAlPrincipio() {
        desplazaIzquierda(1, nElementos - 1);
        nElementos--;
    }//Fin Método

    public void eliminarAlFinal() {
        v[nElementos - 1] = 0;
        nElementos--;
    }//Fin Método

    public void eliminar(byte p) {
        if (v[p] != 0) {
            desplazaIzquierda(p + 1, nElementos - 1);
            nElementos--;
        }//Fin Si
    }//Fin Método

    private void desplazaDerecha(int desde, int hasta) {
        while (hasta != desde) {
            v[hasta] = v[hasta - 1];
            hasta--;
        }//Fin Mientras
    }//Fin Método

    private void desplazaIzquierda(int desde, int hasta) {
        while (desde <= hasta) {
            v[desde - 1] = v[desde];
            desde++;
        }//Fin Mientras
        v[hasta] = 0;
    }//Fin Método

    public boolean estaLlena() {
        return nElementos == v.length;
    }//Fin Método

    public boolean estaVacia() {
        return nElementos == 0;
    }//Fin Método
}

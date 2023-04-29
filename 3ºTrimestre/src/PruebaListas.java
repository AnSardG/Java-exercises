
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author Antonio Sard González
 */
public class PruebaListas {

    public static void main(String[] args) {
        //Entorno:
        List<String> lista;
        ListIterator iterador;
        //Algoritmo:
        lista = new ArrayList();
        lista.add("Pepe");
        lista.add("Luis");
        lista.add("Juan");
        lista.add("Lucía");
        System.out.println("Recorriendo usando un iterador");
        iterador = lista.listIterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        System.out.println("Recorriendo usando for extendido");
        for(String l:lista){
            System.out.println(l);
        }
        System.out.println("Recorriendo usando for");
        for(byte i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }//Fin Programa

}


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;


/**
 *
 * @author Antonio Sard González
 */
public class PruebaEstructurasDinamicas {

    public static void main(String[] args) {
        //Entorno:
        ArrayList<String> array;
        LinkedList<String> enlazada;
        Vector<String> vector;
        Stack<String> pila;
        Queue<String> cola;
        Deque<String> colaDoble;
        //Algoritmo:
        System.out.println("PRUEBA LISTAS");
        System.out.println("Vector dinámico no sincronizable (ArrayList): ");
        array = new ArrayList();
        array.add("Juan");
        array.add("Miguel");
        for(String l:array){
            System.out.println(l);
        }
        System.out.println("");
        System.out.println("Lista doblemente enlazada (LinkedList): ");
        enlazada = new LinkedList();
        enlazada.add("Luis");
        enlazada.addFirst("Jesús");
        enlazada.addLast("Antonio");
        for(String l:enlazada){
            System.out.println(l);
        }
        System.out.println("");
        System.out.println("Vector dinámico sincronizable (Vector): ");
        vector = new Vector();
        vector.add("Blanca");
        vector.addElement("Maria");
        vector.add("Luisa");
        vector.removeElementAt(vector.size() - 1);
        for(String l:vector){
            System.out.println(l);
        }
        System.out.println("");
        System.out.println("Vector dinámico tratado como pila (Stack): ");
        pila = new Stack();
        pila.push("Antonio");
        pila.push("Luis");
        pila.push("Jesús");
        for(String l:pila){
            System.out.println(l);            
        }
        System.out.println("Desapilando 1");
        pila.pop();
        for(String l:pila){
            System.out.println(l);            
        }
        System.out.println("Desapilando 1");
        pila.pop();
        for(String l:pila){
            System.out.println(l);            
        }
        pila.pop();
        if(pila.empty()){
            System.out.println("Pila vacía");
        }
        System.out.println("------------------------------------------------");
        System.out.println("PRUEBA COLAS");
        System.out.println("Cola normal (Queue):");
        cola = new LinkedList();
        cola.offer("David");
        cola.offer("Pedro");
        cola.offer("Natalia");
        for(String c:cola){
            System.out.println(c);            
        }
        System.out.println("Desencolando a: "+cola.poll());
        System.out.println("Desencolando a: "+cola.poll());
        System.out.println("Cola tras desencolar: ");
        for(String c:cola){
            System.out.println(c);            
        }
        System.out.println("");
        System.out.println("Cola doble entrada (Deque):");
        colaDoble = new ArrayDeque();
        colaDoble.offer("Luis");
        colaDoble.offerLast("Antonio");        
        colaDoble.offerFirst("Jesús");
        for(String c:colaDoble){
            System.out.println(c);            
        }
        System.out.println("Desencolando al último: " + colaDoble.pollLast());
        System.out.println("Desencolando al primero: " + colaDoble.pollFirst());
        System.out.println("Desencolando 1: " + colaDoble.poll());
        if(colaDoble.isEmpty()){
            System.out.println("Cola vacía");
        }
    }//Fin Programa

}

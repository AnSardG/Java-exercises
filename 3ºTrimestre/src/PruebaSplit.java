
/**
 *
 * @author Antonio Sard González
 */
public class PruebaSplit {

    public static void main(String[] args) {
        //Entorno:
        String[] cadenas;
        String cad;
        //Algoritmo:
        cad = " Hola   que  tal la   ola ";
        cadenas = cad.trim().split(" +");
        for(String v:cadenas){
            System.out.println(v);
        }
    }//Fin Programa
}

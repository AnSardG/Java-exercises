
/**
 *
 * @author Antonio Sard González
 */
public class EjStringExcepcion1 {

    public static void main(String[] args) {
        //Entorno:
        String[] vector = {"3", "9", "m", "0", "123"};
        String linea;
        //Algoritmo:
        System.out.println("Números: ");
        linea = "\t";
        for(String v:vector){
            try{
                linea+=Float.parseFloat(v) + "\t";
            }catch(NumberFormatException nfe){
                linea += v + "\t";
            }//Fin Try
        }//Fin Foreach
        System.out.println(linea);
        try {
            System.out.println("Número 1: " + Float.parseFloat(vector[0]) / 2);
            System.out.println("Número 2: " + Float.parseFloat(vector[1]) / 2);
            System.out.println("Número 3: " + Float.parseFloat(vector[2]) / 2);
            System.out.println("Número 4: " + Float.parseFloat(vector[3]) / 2);
            System.out.println("Número 5: " + Float.parseFloat(vector[4]) / 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Lo que se encuentra en esta posición no es un número.");
        }//Fin try            
    }//Fin Programa
}

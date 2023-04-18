
/**
 *
 * @author Antonio Sard González
 */
public class EjStringExcepcion2 {

    public static void main(String[] args) {
        //Entorno:
        String[] vector = {"3", "9", "m", "0", "123"};
        String linea;
        byte i;
        //Algoritmo:
        System.out.println("Números: ");
        linea = "\t";
        for (String v : vector) {
            try {
                linea += Integer.parseInt(v) + "\t";
            } catch (NumberFormatException nfe) {
                linea += v + "\t";
            }//Fin Try
        }//Fin Foreach
        System.out.println(linea);
        i = 1;
        for (String v : vector) {
            try {
                System.out.println("Número " + i + ": " + Float.parseFloat(v) / 2);
            } catch (NumberFormatException nfe) {
                System.out.println("Lo que se encuentra en esta posición no es un número.");
            }//Fin Try
            i++;
        }//Fin Foreach
    }//Fin Programa
}

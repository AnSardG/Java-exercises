
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Entorno:
        String mensaje;
        //Algoritmo:
        do {
            System.out.print("Introduzca una frase (25 caracteres max.): ");
            mensaje = Leer.dato();
        } while (mensaje.length() > 25);
        if (mensaje.isEmpty()) {
            System.out.println("No se ha introducido ninguna frase.");
        } else {
            mensaje = mensaje.trim();
            while (mensaje.indexOf("  ") > 0) {
                mensaje = mensaje.replaceAll("  ", " ");
            }//Fin Mientras
            System.out.println(mensaje);
        }//Fin Si
    }//Fin Programa
}
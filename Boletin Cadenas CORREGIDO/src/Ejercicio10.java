
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        //Entorno:
        String abecedario, mensaje, letra;
        int contLetra;
        //Algoritmo:
        abecedario = "abcdefghijklmnopqrstuvwxyz";
        do {
            System.out.print("Introduzca su mensaje: ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty());
        mensaje = mensaje.trim().replaceAll(" ", "").toLowerCase();
        do {
            letra = mensaje.substring(0, 1);
            if (abecedario.indexOf(letra) >= 0) {
                contLetra = mensaje.length() - mensaje.replaceAll(letra, "")
                        .length();
                if (contLetra == 1) {
                    System.out.println("El texto tiene " + contLetra
                            + " vez la letra " + letra);
                } else {
                    System.out.println("El texto tiene " + contLetra
                            + " veces la letra " + letra);
                }//Fin Si
            }//Fin Si
            mensaje = mensaje.replaceAll(letra, "");
        } while (mensaje.length() != 0);
    }//Fin Programa
}

/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Entorno:
        String mensaje, abecedario, palabra;
        int posicion, indice, contPareja;
        //Algoritmo:
        do {
            System.out.print("Introduzca un mensaje (50 caracteres max.): ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty() || mensaje.length() > 50);
        mensaje = mensaje.trim().replaceAll("  +", " ").toLowerCase() + " ";
        abecedario = "";
        for (posicion = 0; posicion <= mensaje.length() - 2; posicion++) {
            if (mensaje.substring(posicion, posicion + 2).indexOf(" ") < 0
                    && abecedario.indexOf(mensaje.substring(posicion, posicion + 2)) < 0) {
                palabra = mensaje.substring(posicion, posicion + 2);
                if (posicion != 0 && palabra.substring(0, 1).equals(abecedario
                        .substring(abecedario.length() - 1))) {
                    abecedario = abecedario + palabra.substring(1);
                } else {
                    abecedario = abecedario +" "+ palabra;
                }//Fin Si
                contPareja = 0;
                for (indice = 0; indice <= mensaje.length() - 1; indice++) {
                    if (indice < mensaje.length() - 1) {
                        if (mensaje.substring(indice, indice + 2).equals(palabra)) {
                            contPareja = contPareja + 1;
                        }//Fin Si
                    } else {
                        if (mensaje.substring(indice).equals(palabra)) {
                            contPareja = contPareja + 1;
                        }//Fin Si
                    }//Fin Si
                }//Fin Para
                if (contPareja == 1) {
                    System.out.println(palabra + " aparece " + contPareja + " vez");
                } else {
                    System.out.println(palabra + " aparece " + contPareja + " veces");
                }//Fin Si
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}

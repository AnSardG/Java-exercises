
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Entorno:
        String mensajeCifrado, mensaje, palabra;
        int indice, indiceAux;
        //Algoritmo:
        do {
            System.out.print("Introduzca un mensaje cifrado (256 caracteres max.): ");
            mensajeCifrado = Leer.dato();
        } while (mensajeCifrado.isEmpty() || mensajeCifrado.length() > 256);
        if (mensajeCifrado.length() == 1) {
            System.out.println("Mensaje descifrado: " + mensajeCifrado);
        } else {
            mensaje = "";
            palabra = "";
            mensajeCifrado = mensajeCifrado + " ";
            for (indice = 0; indice <= mensajeCifrado.length() - 1; indice++) {
                if (mensajeCifrado.charAt(indice) != ' ') {
                    palabra = palabra + mensajeCifrado.charAt(indice);
                } else {
                    for (indiceAux = palabra.length() - 1; indiceAux >= 0; indiceAux--) {
                        mensaje = mensaje + palabra.charAt(indiceAux);
                    }//Fin Para
                    if (indice < mensajeCifrado.length() - 1) {
                        mensaje = mensaje + " ";
                    }//Fin Si
                    palabra = "";
                }//Fin Si
            }//Fin Para
            System.out.println("Mensaje descifrado: " + mensaje);
        }//Fin Si
    }//Fin Programa
}
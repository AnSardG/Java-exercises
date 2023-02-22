
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        //Entorno:
        String abecedario, mensaje, mensajeAux, letraAux;
        char letra;
        int posicionAux, contLetra;
        //Algoritmo:
        abecedario = "";
        for (letra = 'a'; letra <= 'z'; letra++) {
            abecedario = abecedario + letra;
        }//Fin Para
        for (letra = 'B'; letra <= 'Z'; letra++) {
            abecedario = abecedario + letra;
        }//Fin Para
        do {
            System.out.print("Introduzca su mensaje: ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty());
        mensajeAux = mensaje.trim().replaceAll(" ", "").replaceAll("A", "a");
        do {
            contLetra = 0;
            letraAux = mensajeAux.substring(0, 1);
            if (abecedario.indexOf(letraAux) >= 0) {
                for (posicionAux = 0; posicionAux <= mensajeAux.length() - 1; 
                        posicionAux++) {
                    if (mensajeAux.charAt(posicionAux) == mensajeAux.charAt(0)) {
                        contLetra = contLetra + 1;
                    }//Fin Si
                }//Fin Para
                if (contLetra == 1) {
                    System.out.println("El texto tiene " + contLetra
                            + " vez la letra " + letraAux);
                } else {
                    System.out.println("El texto tiene " + contLetra
                            + " veces la letra " + letraAux);
                }//Fin Si
            }//Fin Si
            mensajeAux = mensajeAux.replaceAll(letraAux, "");
        } while (mensajeAux.length() != 0);
    }//Fin Programa
}
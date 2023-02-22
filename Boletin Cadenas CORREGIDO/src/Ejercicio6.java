
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Entorno:
        int desplazamiento, indice, posicion;
        char letra;
        String abecedario, mensaje, mensajeDesp, abecedarioMayus;
        //Algoritmo:
        abecedario = "";
        abecedarioMayus = "";
        for (letra = 'a'; letra <= 'z'; letra++) {
            abecedario = abecedario + letra;
        }//Fin Para
        for (letra = 'A'; letra <= 'Z'; letra++) {
            abecedarioMayus = abecedarioMayus + letra;
        }//Fin Para
        System.out.print("Introduzca el mensaje a decodificar: ");
        mensaje = Leer.dato();
        do {
            System.out.print("Introduzca la clave del desplazamiento "
                    + "(debe ser un número positivo): ");
            desplazamiento = Leer.datoInt();
        } while (desplazamiento < 0);
        mensajeDesp = "";
        for (indice = 0; indice <= mensaje.length() - 1; indice++) {
            if (abecedario.indexOf(mensaje.charAt(indice)) >= 0) {
                posicion = abecedario.indexOf(mensaje.charAt(indice))
                        - desplazamiento;
                if (posicion < 0) {
                    posicion = abecedario.length()+posicion  ;
                }//Fin Si
                mensajeDesp = mensajeDesp + abecedario.charAt(posicion);
            } else {
                if (abecedarioMayus.indexOf(mensaje.charAt(indice)) >= 0) {
                    posicion = abecedarioMayus.indexOf(mensaje.charAt(indice))
                            - desplazamiento;
                    if (posicion < 0) {
                        posicion = abecedarioMayus.length()+ posicion;
                    }//Fin Si
                    mensajeDesp = mensajeDesp + abecedarioMayus.charAt(posicion);
                } else {
                    mensajeDesp = mensajeDesp + mensaje.charAt(indice);
                }//Fin Si
            }//Fin Si
        }//Fin Para
        System.out.println(mensajeDesp);
    }//Fin Programa
}

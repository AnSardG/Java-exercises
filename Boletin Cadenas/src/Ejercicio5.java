/**
 *
 * @author Administrador
 */
public class Ejercicio5 {

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
        System.out.print("Introduzca su mensaje a codificar: ");
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
                        + desplazamiento;
                if (posicion > abecedario.length() - 1) {
                    posicion = posicion - (abecedario.length());
                }//Fin Si
                mensajeDesp = mensajeDesp + abecedario.charAt(posicion);
            } else {
                if (abecedarioMayus.indexOf(mensaje.charAt(indice)) >= 0) {
                    posicion = abecedarioMayus.indexOf(mensaje.charAt(indice))
                            + desplazamiento;
                    if (posicion > abecedarioMayus.length() - 1) {
                        posicion = posicion - (abecedarioMayus.length());
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

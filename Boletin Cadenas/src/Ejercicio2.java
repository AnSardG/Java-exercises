
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Entorno:
        String mensaje;
        int posicionIzq, posicionDch;
        boolean esPalindromo;
        //Algoritmo:
        System.out.print("Introduzca una frase para "
                + "comprobar si es un palindromo: ");
        mensaje = Leer.dato();
        posicionIzq = 0;
        posicionDch = mensaje.trim().replaceAll(" ", "").length() - 1;
        esPalindromo = true;
        while (posicionIzq < posicionDch && esPalindromo) {
// Primero limpia los espacios en blanco del texto y después compara
// caracter a caracter si son iguales por el principio y final; si
// no se cumple esta condición se apaga el interruptor y sale del
// bucle.
            esPalindromo = mensaje.trim().replaceAll(" ", "")
                    .substring(posicionIzq, posicionIzq + 1)
                    .compareToIgnoreCase(mensaje.trim().replaceAll(" ", "")
                    .substring(posicionDch, posicionDch + 1)) == 0;
            posicionDch--;
            posicionIzq++;
        }//Fin Mientras
        if (esPalindromo) {
            System.out.println("Su frase es un palíndromo\nFrase introducida: "
                    + mensaje);
        } else {
            System.out.println("Su frase no es un palíndromo"
                    + "\nFrase introducida: " + mensaje);
        }//Fin Si
    }//Fin Programa
}
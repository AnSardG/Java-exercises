
/**
 *
 * @author Antonio Sard González
 */
public class BoletinCadenas {

    public static void limpiaCadena() {
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
    }//Fin Procedimiento

    public static void esPalindromo() {
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
//            Primero limpia los espacios en blanco del texto y después compara
//            caracter a caracter si son iguales por el principio y final; si
//            no se cumple esta condición se apaga el interruptor y sale del
//            bucle.
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
    }//Fin Procedimiento

    public static void cifrarCadena() {
        //Entorno:
        String mensaje, mensajeCif, palabra;
        int indice, indiceAux;
        //Algoritmo:
        do {
            System.out.print("Introduzca un mensaje a cifrar (256 caracteres max.): ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty() || mensaje.length() > 256);
        mensajeCif = "";
        if (mensaje.length() == 1) {
            System.out.println(mensaje);
        } else {
            palabra = "";
            mensaje = mensaje + " ";
            for (indice = 0; indice <= mensaje.length() - 1; indice++) {
                if (mensaje.charAt(indice) != ' ') {
                    palabra = palabra + mensaje.charAt(indice);
                } else {
                    for (indiceAux = palabra.length() - 1; indiceAux >= 0; indiceAux--) {
                        mensajeCif = mensajeCif + palabra.charAt(indiceAux);
                    }//Fin Para
                    if (indice < mensaje.length() - 1) {
                        mensajeCif = mensajeCif + " ";
                    }//Fin Si
                    palabra = "";
                }//Fin Si
            }//Fin Para
            System.out.println(mensajeCif);
        }//Fin Si
    }//Fin Procedimiento

    public static void descifrarCadena() {
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
    }//Fin Procedimiento

    public static void codificaCadena() {
        //Entorno:
        int desplazamiento, indice, posicion;
        char c;
        String alfabeto, mensaje, mensajeDesp;
        //Algoritmo:
        alfabeto = "";
        for (c = 'a'; c <= 'z'; c++) {
            alfabeto = alfabeto + c;
        }//Fin Para
        System.out.print("Introduzca su mensaje a codificar: ");
        mensaje = Leer.dato();
        do {
            System.out.print("Desplazamiento (debe ser un número positivo): ");
            desplazamiento = Leer.datoInt();
        } while (desplazamiento < 0);
        mensajeDesp = "";
        for (indice = 0; indice <= mensaje.length() - 1; indice++) {
            if (alfabeto.indexOf(mensaje.charAt(indice)) >= 0) {
                posicion = alfabeto.indexOf(mensaje.charAt(indice)) + desplazamiento;
                if (posicion > alfabeto.length() - 1) {
                    posicion = posicion - (alfabeto.length());
                }//Fin Si
                mensajeDesp = mensajeDesp + alfabeto.charAt(posicion);
            } else {
                mensajeDesp = mensajeDesp + mensaje.charAt(indice);
            }//Fin Si
        }//Fin Para
        System.out.println(mensajeDesp);
    }//Fin Procedimiento

    public static void decodificaCadena() {
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
        abecedario = abecedario + 'ñ';
        for (letra = 'A'; letra <= 'Z'; letra++) {
            abecedarioMayus = abecedarioMayus + letra;
        }//Fin Para
        abecedarioMayus = abecedarioMayus + 'Ñ';
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
                    posicion = abecedario.length() + posicion;
                }//Fin Si
                mensajeDesp = mensajeDesp + abecedario.charAt(posicion);
            } else {
                if (abecedarioMayus.indexOf(mensaje.charAt(indice)) >= 0) {
                    posicion = abecedarioMayus.indexOf(mensaje.charAt(indice))
                            - desplazamiento;
                    if (posicion < 0) {
                        posicion = abecedarioMayus.length() + posicion;
                    }//Fin Si
                    mensajeDesp = mensajeDesp + abecedarioMayus.charAt(posicion);
                } else {
                    mensajeDesp = mensajeDesp + mensaje.charAt(indice);
                }//Fin Si
            }//Fin Si
        }//Fin Para
        System.out.println(mensajeDesp);
    }//Fin Procedimiento

    public static void cadenaMinusculas() {
        //Entorno:
        String mensaje;
        //Algoritmo:
        do {
            System.out.print("Introduzca su mensaje: ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty());
        System.out.println("Mensaje en minúsculas: " + mensaje.toLowerCase());
    }//Fin Procedimiento

    public static void cantidadLetra() {
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
                for (posicionAux = 0; posicionAux <= mensajeAux.length() - 1; posicionAux++) {
                    if (mensajeAux.charAt(posicionAux) == mensajeAux.charAt(0)) {
                        contLetra = contLetra + 1;
                    }//Fin Si
                }//Fin Para
                System.out.println("El texto tiene " + contLetra + " veces la letra "
                        + letraAux);
            }//Fin Si
            mensajeAux = mensajeAux.replaceAll(letraAux, "");
        } while (mensajeAux.length() != 0);
    }

    public static boolean deseaContinuar() {
        //Algoritmo:
        char op;
        //Entorno:
        do {
            op = Leer.datoChar();
        } while (op != 's' && op != 'n' && op != 'S' && op != 'N');
        return op == 's' || op == 'S';
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        int opcion;
        //Algoritmo:
        do {
            do {
                System.out.print("Introduzca la opción (de 1 a 10): ");
                opcion = Leer.datoInt();
            } while (opcion < 1 || opcion > 10);
            switch (opcion) {
                case 1:
                    do {
                        BoletinCadenas.limpiaCadena();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 2:
                    do {
                        BoletinCadenas.esPalindromo();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 3:
                    do {
                        BoletinCadenas.cifrarCadena();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 4:
                    do {
                        BoletinCadenas.descifrarCadena();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 5:
                    do {
                        BoletinCadenas.codificaCadena();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 6:
                    do {
                        BoletinCadenas.decodificaCadena();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 9:
                    do {
                        BoletinCadenas.cadenaMinusculas();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
                case 10:
                    do {
                        BoletinCadenas.cantidadLetra();
                        System.out.print("¿Desea volver a ejecutar el programa?(S/N): ");
                    } while (BoletinCadenas.deseaContinuar());
                    break;
            }//Fin Según Sea
            System.out.print("¿Desea probar otra opción? (S/N): ");
        } while (BoletinCadenas.deseaContinuar());
    }//Fin Programa
}
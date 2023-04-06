/*
 * Programa: Practica2
 * Autor: Antonio Sard Gonz?lez
 * Entorno:
 *      num, adiv, numAux, adivAux, oportunidad, digitos es num?rico entero
 * Algoritmo:
 *      Escribir "Introduzca su n?mero: "
 *      Leer num
 *      numAux <-- num
 *      oportunidad <-- 1
 *      adivAux <-- num + 1
 *      Mientras adivAux <> numAux y oportunidad <= 10 hacer
 *          Escribir "Adivine el n?mero que se ha introducido: "
 *          Leer adiv
 *          adivAux <-- adiv
 *          Si adiv <> num entonces
 *              digitos <-- 0
 *              Si num = 0 y num = adiv % 10 entonces
 *                  digitos <-- digitos + 1
 *              Sino
 *                  Mientras adivAux <> 0 y numAux <> 0 hacer
 *                      Si numAux % 10 = adivAux % 10 entonces
 *                          digitos <-- digitos + 1
 *                      Fin Si
 *                      adivAux <-- adivAux \ 10
 *                      numAux <-- numAux \ 10
 *                  Fin Mientras
 *              Fin Si
 *              Si digitos = 0 entonces
 *                  Escribir "No se ha introducido ning?n d?gito correcto."
 *              Sino
 *                  Escribir "Se han introducido ",digitos," d?gitos bien colocados." 
 *              Fin Si
 *          Sino
 *              Escribir "El n?mero ",adiv," es correcto, enhorabuena."
 *              oportunidad <-- 10
 *          Fin Si
 *          adivAux <-- adiv
 *          numAux <-- num
 *          oportunidad <-- oportunidad + 1
 *      Fin Mientras
 *      Si adiv <> num entonces
 *          Escribir "El n?mero correcto era el ",num,". Se han agotado las oportunidades, ha perdido."
 *      Fin Si
 * Fin Programa
 */
//Programa: Practica2
//Autor: Antonio Sard Gonz?lez
public class Practica2 {

    public static void main(String[] args) {
        //Entorno:
        int num, adiv, numAux, adivAux;
        byte oportunidad, digitos;
        //Algoritmo:
        System.out.print("Introduzca su n?mero: ");
        num = Leer.datoInt();
        numAux = num;
        oportunidad = 1;
        adivAux = num + 1;
        while (adivAux != numAux && oportunidad <= 10) {
            System.out.print("Adivine el n?mero que se ha introducido: ");
            adiv = Leer.datoInt();
            adivAux = adiv;
            if (adiv != num) {
                digitos = 0;
                if (num == 0 && num == adiv % 10) {
                    digitos++;
                } else {
                    while (adivAux != 0 && numAux != 0) {
                        if (numAux % 10 == adivAux % 10) {
                            digitos++;
                        }//Fin Si
                        adivAux = adivAux / 10;
                        numAux = numAux / 10;
                    }//Fin Mientras
                }//Fin Si
                if (digitos == 0) {
                    System.out.println("No se ha introducido ning?n d?gito correcto.");
                } else {
                    System.out.println("Se han introducido " + digitos + " d?gitos bien colocados.");
                }//Fin Si
            } else {
                System.out.println("El n?mero " + adiv + " es correcto, enhorabuena.");
                oportunidad = 10;
            }//Fin Si
            adivAux = adiv;
            numAux = num;
            oportunidad++;
        }//Fin Mientras
        if (adivAux != num) {
            System.out.println("El n?mero correcto era el " + num + ". Se han "
                    + "agotado las oportunidades, ha perdido.");
        }//Fin Si
    }//Fin Programa
}
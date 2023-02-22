/*
 * Programa: Practica1
 * Autor: Antonio Sard Gonz?lez
 * Entorno:
 *      n, adiv, oportunidad es num?rico entero
 * Algoritmo:
 *      Escribir "Introduzca su n?mero: "
 *      Leer n
 *      adiv <-- n+1
 *      oportunidad <-- 1
 *      Mientras adiv <> n y oportunidad <= 5 hacer
 *          Escribir "Adivine el n?mero introducido: "
 *          Leer adiv
 *          Si adiv > n entonces
 *              Escribir "El n?mero que ha introducido es mayor que el n?mero a adivinar."         
 *          Sino
 *              Si adiv < n entonces
 *                  Escribir "El n?mero que ha introducido es menor que el n?mero a adivinar."
 *              Sino
 *                  oportunidad <-- 5
 *              Fin Si
 *          Fin Si
 *          oportunidad <-- oportunidad+1
 *      Fin Mientras
 *      Si adiv <> n entonces
 *          Escribir "Se han agotado el n?mero de oportunidades, ha perdido."
 *      Sino
 *          Escribir "El n?mero ",adiv," es el correcto, enhorabuena."
 *      Fin Si
 * Fin Programa
 */
//Programa: Practica1
//Autor: Antonio Sard Gonz?lez
public class Practica1 {
    public static void main(String[] args){
    //Entorno:
       int n, adiv;
       byte oportunidad;
    //Algoritmo:
       System.out.print("Introduzca su n?mero: ");
       n=Leer.datoInt();
       adiv=n+1;
       oportunidad=1;
       while(adiv!=n && oportunidad <= 5 ){
           System.out.print("Adivine el n?mero introducido: ");
           adiv=Leer.datoInt();
           if(adiv > n){
               System.out.println("El n?mero que ha introducido es mayor que el n?mero a adivinar.");
           }else{
               if(adiv < n){
                   System.out.println("El n?mero que ha introducido es menor que el n?mero a adivinar.");
               }else{
                   oportunidad=5;
               }//Fin Si
           }//Fin Si
           oportunidad++;
       }//Fin Mientras
       if(adiv!=n){
           System.out.print("El n?mero correcto era el "+n+".Se han agotado el n?mero de oportunidades, ha perdido.");
       }else{
           System.out.print("El n?mero "+adiv+" es el correcto, enhorabuena.");
       }//Fin Si
   }//Fin Programa
}

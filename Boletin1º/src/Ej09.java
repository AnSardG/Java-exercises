//Programa: Ej09
//Autor: Antonio Sard González
public class Ej09 {

    public static void main(String[] args) {
        //Entorno:
        int sum, num;
        //Algoritmo:
        sum = 2;
        for (num = 4; num <= 1000; num = num + 2) {
            sum = sum + num;
        }//Fin Para
        System.out.print("El resultado de la suma de todos los pares entre 2 y 1000 es: " + sum);
    }//Fin Programa
}
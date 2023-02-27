//Programa: Ej09
//Autor: Antonio Sard González
public class Ej09 {

    public static void main(String[] args) {
        //Entorno:
        int sum, i;
        //Algoritmo:
        sum = 2;
        for (i = 2; i <= 500; i++) {
            sum = sum + i*2;
        }//Fin Para
        System.out.println("El resultado de la suma de todos los pares entre 2 y 1000 es: " + sum);
    }//Fin Programa
}
//Programa: Ej08
//Autor: Antonio Sard González
public class Ej08 {

    public static void main(String[] args) {
        //Entorno:
        short num;
        //Algoritmo:
        do {
            System.out.print("Introduzca un número: ");
            num = Leer.datoShort();
        } while (num < 1 || num > 10);
    }//Fin Programa
}
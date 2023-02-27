//Programa: Ej07
//Autor: Antonio Sard González
public class Ej07 {

    public static void main(String[] args) {
        //Entorno:
        byte posicion, digito;
        int num;
        //Algoritmo:
        System.out.print("Introduzca un número entero: ");
        num = Leer.datoInt();
        System.out.print("Introduzca la posición de la que quiera saber su dígito: ");
        posicion = Utilidades.leeByte();
        while (num > Math.pow(10, posicion)) {
            num = num / 10;
        }//Fin Mientras
        digito = (byte)(num % 10);
        System.out.print("El dígito que se encuentra en la posición " + posicion + " es el " + digito);
    }//Fin Programa
}
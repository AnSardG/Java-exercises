//Programa: Ej10
//Autor: Antonio Sard González
public class Ej10 {

    public static void main(String[] args) {
        //Entorno:
        float num1, num2, resultado;
        short op;
        //Algoritmo:
        System.out.print("Introduzca el primer número: ");
        num1 = Leer.datoFloat();
        System.out.print("Introduzca el segundo número: ");
        num2 = Leer.datoFloat();
        do {
            System.out.print("1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Resto\n Elija opción: ");
            op = Leer.datoShort();
            if (op < 1 || op > 5) {
                System.out.print("Debe introducir una opción entre 1 y 5.");
            }//Fin Si
        } while (op < 1 || op > 5);
        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.print(num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.print(num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.print(num1 + " x " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.print("No se puede dividir entre 0");
                }//Fin Si
                break;
            case 5:
                if (num1 == (int) num1 && num2 == (int) num2) {
                    resultado = num1 % num2;
                    System.out.print(num1 + " % " + num2 + " = " + resultado);
                } else {
                    System.out.print("No se puede efectuar el resto de una división entre números decimales.");
                }//Fin Si
                break;
        }//Fin Según Sea
    }//Fin Programa
}
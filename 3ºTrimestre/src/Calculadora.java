
/**
 *
 * @author Antonio Sard González
 */
public class Calculadora {

    public static void main(String[] args) {
        //Entorno:
        int num1, num2;
        //Algoritmo:
        System.out.print("Introduzca el primer número: ");
        num1 = Leer.datoInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = Leer.datoInt();
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + (num1 * num2));
        try {
            System.out.println("División: " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("Resto: " + num1 + " % " + num2 + " = " + (num1 % num2));
        } catch (ArithmeticException ae) {
            System.out.println("No es posible realizar divisiones entre 0.");
        }//Fin Try        
    }//Fin Programa
}

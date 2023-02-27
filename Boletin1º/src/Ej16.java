
/**
 *
 * @author Antonio Sard González
 */
public class Ej16 {

    public static void main(String[] args) {
        //Entorno:
        int num, divisor;
        //Algoritmo:
        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = Leer.datoInt();
        } while (num < 0);
        divisor = 1;
        System.out.print("Divisores del " + num + ": ");
        while (num/divisor>=divisor) {
            if (num % divisor == 0) {
                if(divisor!=num/divisor){
                    System.out.print(divisor + ", " + num / divisor + ", ");
                }else{
                    System.out.print(divisor + ", ");
                }//Fin Si
            }//Fin Si
            divisor++;
        }//Fin Mientras
        System.out.println("\b\b.");
    }//Fin Programa
}

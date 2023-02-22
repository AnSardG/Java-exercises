//Programa: EjModulos
//Autor: Antonio Sard Gonz?lez
public class EjModulos {
    public static long cubo(long a){
    //Entorno:
        long numCubo;
    //Algoritmo:
        numCubo=a*a*a;
        return numCubo;
    }//Fin Funci?n
    public static void pintaRaizCuadrada(long a){
    //Entorno:
        long divisor;
    //Algoritmo:
        divisor=a/2;
        if (a>=0) {
            while (divisor*divisor>a) {
                divisor=(long)(divisor/2);
            }//Fin Mientras
            while (divisor*divisor<a){
                divisor++;
            }//Fin Mientras
            if (divisor*divisor==a){
                System.out.println("La raíz de "+a+" es: "+divisor);
            } else {
                System.out.println("La raíz de "+a+" no existe.");
            }
        } else {
            System.out.println("La raíz de números negativos no existe.");
        }//Fin Si
    }//Fin Funci?n
    public static void main(String[] args){
    //Entorno:
        int num;
    //Algoritmo:
        System.out.print("Introduzca un número: ");
        num=Leer.datoInt();
        System.out.println("El cubo de "+num+" es: "+cubo(num));
        pintaRaizCuadrada(num);
    }//Fin Programa
}

public class EjFactorial {
    public static long factorial(long n){
        //Entorno:
        long fact;
        //Algoritmo:
        if(n==0){
            fact=1;
        } else {
            fact=n*factorial(n-1);
        }//Fin Si
        return fact;
    }//Fin Función
    public static void main(String[] args){
        //Entorno:
            int num;
        //Algoritmo:
            do{
                System.out.print("Introduzca un numero entero positivo:");
                num=Leer.datoInt();
            }while(num<0);
            System.out.print(factorial(num));
    }//Fin Programa
}

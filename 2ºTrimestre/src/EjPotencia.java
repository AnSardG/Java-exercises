public class EjPotencia {
    public static long potencia(long a, long b){
    //Entorno:
        long num;
    //Algoritmo;
        if (b==1){
            num=a;
        } else {
            num=a*potencia(a, b-1);
        }//Fin Si
        return num;
    }//Fin Función
    public static void main(String[] args){
    //Entorno:
        int num, numPotencia;
    //Algoritmo:
        do{
            System.out.print("Introduzca un número entero positivo: ");
            num=Leer.datoInt();
        }while(num<0);
        do{
            System.out.print("Introduzca la potencia a la que desea elevar su número: ");
            numPotencia=Leer.datoInt();
        }while(numPotencia<0);
        System.out.print(potencia(num, numPotencia));
    }//Fin Programa
}

public class EjFibonacci {
    public static void pintaFibonacci(long a){
    //Entorno:
        long numAnterior, numSecuencia, siguienteNum;
        byte contTermino;
    //Algoritmo:
        siguienteNum=0;
        numSecuencia=1;
        numAnterior=0;
        contTermino=1;
        if (a>0) {
            if (a==1){
              System.out.print(siguienteNum);  
            } else {
                System.out.print("0, 1");
                while(contTermino!=a){
                    siguienteNum=numAnterior+numSecuencia;
                    System.out.print(", "+siguienteNum);
                    numAnterior=numSecuencia;
                    numSecuencia=siguienteNum;
                    contTermino++;
                }//Fin Mientras
            }//Fin Si
        } else {
            System.out.print("El número "+a+" no es válido.");
        }//Fin Si
    }//Fin Procedimiento
    public static void main(String[] args){
    //Entorno:
        int num;
    //Algoritmo:
        do{
            System.out.print("Introduzca un número positivo: ");
            num=Leer.datoInt();
        }while(num<=0);
        pintaFibonacci(num);
    }//Fin Programa
}

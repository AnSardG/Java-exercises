public class EjCuadrado {
    public static int cuadrado(byte f, byte c){
    //Entorno:
        int num;
    //Algoritmo:
        if (f==1 || c==1){
            num=1;
        }  else {
            num=cuadrado(f, (byte)(c-1))+cuadrado((byte)(f-1), (byte)(c));
        }//Fin Si
        return num;
    }//Fin Procedimiento
    public static void main(String[] args){
    //Entorno:
        byte fila, columna;
        short auxFila, auxColumna;
    //Algoritmo:
        do{
            System.out.print("Introduzca la dimension del cuadrado (debe ser un número mayor que 0): ");
            auxFila=Leer.datoShort();
        }while(auxFila<=0);
        auxColumna=auxFila;
        for(fila=1;fila<=auxFila;fila++){
            System.out.println();
            for(columna=1;columna<=auxColumna;columna++){
                System.out.print(cuadrado(fila, columna)+"\t");
            }//Fin Para
        }//Fin Para  
        System.out.println("\n");
    }//Fin Programa
}

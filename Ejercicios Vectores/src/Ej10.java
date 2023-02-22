
/**
 *
 * @author Antonio Sard González
 */
public class Ej10 {

    public static void main(String[] args) {
        //Entorno:
        byte[] numero = {7, 8, 3, 0, 33};
        byte i, auxNum;
        //Algoritmo:
        System.out.println("Tabla normal: ");
        for(i=0;i<=numero.length-1;i++){
            System.out.print(numero[i]+", ");
        }//Fin Para
        System.out.println("\b\b\n-------------------------------------");
        auxNum=numero[0];
        System.out.println("Tabla tras la rotación de un número a la izquierda: ");
        for(i=0;i<=numero.length-1;i++){
            if(i!=numero.length-1){
                numero[i]=numero[i+1];
            }else{
                numero[i]=auxNum;
            }//Fin Si    
            System.out.print(numero[i]+", ");
        }//Fin Para
        System.out.println("\b\b");
    }//Fin Programa
}

/**
 *
 * @author Antonio Sard González
 */
public class Ej6 {
    public static boolean deseaContinuar(){
        //Entorno:
        char opcion;
        //Algoritmo
        do{
            System.out.print("¿Desea continuar? (S/N): ");
            opcion=Leer.datoChar();
        }while(opcion!='s' && opcion!='S' && opcion!='n' && opcion!='N');
        return opcion=='s' || opcion=='S';
    }//Fin Función
    public static void main(String[] args){
        //Entorno:
        byte[] numero={7, 8, 3, 0, 33};
        byte i, num;
        //Algoritmo:
        do{
            System.out.print("¿Qué número desea buscar?: ");
            num=(byte)Leer.datoShort();
            i=0;
            while(i<numero.length-1 && numero[i]!=num){
                i++;
            }//Fin Mientras
            if(numero[i]==num){
                System.out.println("El "+num+" se encuentra en la posición "+(i+1));
            }else{
                System.out.println("No se ha encontrado el "+num+" en la tabla");
            }//Fin Si
        }while(deseaContinuar());
    }//Fin Programa
}

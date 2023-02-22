/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio8 {
    public static void main(String[] args){
        //Entorno:
        String palabra;
        byte cont;
        //Algoritmo:
        do{
            System.out.print("Introduzca una palabra (10 carácteres max.): ");
            palabra=Leer.dato();
        }while(palabra.length()>10 || palabra.isEmpty() || palabra.trim().indexOf(" ")>0);
        System.out.print(palabra);
        for(cont=1;cont<=palabra.length();cont++){
            palabra=palabra.substring(palabra.length()-1)+palabra.substring(0, palabra.length()-1);
            System.out.print(", "+palabra);
        }//Fin Para
        System.out.println();
    }//Fin Programa
}
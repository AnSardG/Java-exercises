
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Antonio Sard González
 */
public class Ahorcado {
    /*
     * La dificultad fácil será false (0) y la difícil true (1).
     */
    public static byte pideDificultad(){
        //Entorno:
        BufferedReader teclado;
        String dificultad;
        //Algoritmo:
        System.out.println("Nivel 1.- Fácil");
        System.out.println("Nivel 2.- Difícil");
        System.out.print("Elige opción: ");
        teclado = new BufferedReader(new InputStreamReader(System.in));
        dificultad = "-1";
        try{            
            dificultad = teclado.readLine();
            while((Long.valueOf(dificultad) < Byte.MIN_VALUE || Long.valueOf(dificultad) > Byte.MAX_VALUE) 
                    || (Byte.valueOf(dificultad) != 1 && Byte.valueOf(dificultad) != 2)){
                System.out.print("Elige una opción correcta [1-2]: ");
                dificultad = teclado.readLine();
            }//Fin Mientras
        } catch (IOException ioe){
            System.out.println("Error de E/S.");        
        }//Fin Try       
        return Byte.valueOf(dificultad);
    }//Fin Función
    
    public static void main(String[] args) {
        //Entorno:
        
        //Algoritmo:
        System.out.println(Ahorcado.pideDificultad());
    }//Fin Programa

}

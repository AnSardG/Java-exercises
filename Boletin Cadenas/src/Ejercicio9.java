/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio9 {
    public static void main(String[] args){
        //Entorno:
        String mensaje;
        //Algoritmo:
        do{
            System.out.print("Introduzca su mensaje: ");
            mensaje=Leer.dato();
        }while(mensaje.isEmpty());
        System.out.println("Mensaje en minúsculas: "+mensaje.toLowerCase());
    }//Fin Programa
}
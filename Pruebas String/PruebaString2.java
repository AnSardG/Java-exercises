/**
 *
 * @author Antonio Sard González
 */
public class PruebaString2 {
    public static void main(String[] args){
        //Entorno:
        String texto;
        //Algoritmo:
        System.out.print("Introduzca el texto: ");
        texto=Leer.dato();
        System.out.println("La cadena tiene "+texto.length()+" caracteres.");
        if(texto.trim().indexOf(" ")==-1){
            System.out.println("La cadena tiene una palabra.");
        }else{
            System.out.println("La cadena tiene más de una palabra.");
        }//Fin Si
        System.out.println("Texto normal: "+texto);
        System.out.println("Texto reemplazando la 'a' por la 'o': "+texto.replace("a", "o"));
    }//Fin Programa
}
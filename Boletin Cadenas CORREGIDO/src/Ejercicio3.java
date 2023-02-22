/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio3 {
    public static void main(String[] args){
        //Entorno:
        String mensaje, mensajeCif, palabra;
        int indice, indiceAux;
        //Algoritmo:
        do{
            System.out.print("Introduzca un mensaje a cifrar (256 caracteres max.): ");
            mensaje= Leer.dato();
        }while (mensaje.isEmpty() || mensaje.length()>256);
        mensajeCif="";
        if(mensaje.length()==1){
            System.out.println(mensaje);
        }else{
            palabra="";
            mensaje=mensaje+" ";
            for(indice=0;indice<=mensaje.length()-1;indice++){
                if(mensaje.charAt(indice)!=' '){
                    palabra=palabra+mensaje.charAt(indice);
                }else{
                    for(indiceAux=palabra.length()-1;indiceAux>=0;indiceAux--){
                        mensajeCif=mensajeCif+palabra.charAt(indiceAux);
                    }//Fin Para
                    if(indice<mensaje.length()-1){
                        mensajeCif=mensajeCif+" ";
                    }//Fin Si
                    palabra="";
                }//Fin Si
            }//Fin Para
            System.out.println(mensajeCif);
        }//Fin Si
    }//Fin Programa
}
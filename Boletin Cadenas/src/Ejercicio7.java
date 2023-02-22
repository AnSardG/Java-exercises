
/**
 *
 * @author Antonio Sard González
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Entorno:
        String mensaje, mensajeAux, pareja;
        byte posMensaje, numParejas;
        boolean hayParejas;
        //Algoritmo:
        do {
            System.out.print("Introduzca su mensaje (max. 50 carácteres): ");
            mensaje = Leer.dato();
        } while (mensaje.isEmpty() || mensaje.length() > 50);
        hayParejas = false;
        mensajeAux=mensaje.trim();
        if(mensajeAux.length()%2==0){
            posMensaje=0;
        }else{
            posMensaje=1;
        }
        while(!hayParejas && posMensaje<=mensajeAux.length()-1){
            if(mensajeAux.charAt(posMensaje)!=' '){
                hayParejas=true;
            }//Fin Si
            posMensaje=(byte)(posMensaje+2);
        }//Fin Si
        if(hayParejas){
            System.out.println("Hay parejas.");
        }
    }//Fin Programa
}

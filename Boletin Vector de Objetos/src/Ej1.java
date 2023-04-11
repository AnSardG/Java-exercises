
/**
 *
 * @author Antonio Sard Gonz?lez
 */
public class Ej1 {
    public static void muestraFrecuencia(FrecuenciaPalabras vectorPalabras){
        //Entorno:
        int i;
        Palabra palabra;
        //Algoritmo:
        for(i = 0; i < vectorPalabras.getTotalPalabras(); i++){
            palabra = vectorPalabras.obtenerObjPalabra(i);
            System.out.println("Palabra: " + palabra.getPalabra() +
                    "\tFrecuencia: " + palabra.getContador());
        }//Fin Para
    }//Fin Procedimiento
    
    public static void main(String[] args) {
        //Entorno:
            String texto;
            Palabra palabra;
            FrecuenciaPalabras vectorPalabras;
            int i, pos;
        //Algoritmo:
            do{
                System.out.print("Introduzca un texto sin signos de puntuación: ");
                texto = Leer.dato();
            }while(texto.isEmpty() || !texto.matches("[a-zA-Z ]+"));
            texto = texto.trim().replaceAll("  +", " ").toLowerCase() + " ";
            vectorPalabras = new FrecuenciaPalabras();
            while(texto.length() > 0){
                if(texto.indexOf(" ") != 0){
                    palabra = new Palabra(texto.substring(0, texto.indexOf(" ")));
                    vectorPalabras.insertarPalabra(palabra);
                    texto = texto.replaceFirst(palabra.getPalabra(), "");
                } else if (texto.length() > 1){
                    texto = texto.replaceFirst(" ", "");
                } else {
                    texto = "";
                }//Fin Si                
            }//Fin Mientras
            muestraFrecuencia(vectorPalabras);
    }//Fin Programa

}

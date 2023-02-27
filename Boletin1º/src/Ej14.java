//Programa: Ej14
//Autor: Antonio Sard González
public class Ej14 {

    public static void main(String[] args) {
        //Entorno:
        long auxBinario;
        String numBinario;
        int numDecimal;
        byte posicion;
        //Algoritmo:
        do {
            System.out.print("Introduzca un número binario: ");
            numBinario = Leer.dato();
        } while (numBinario.isEmpty() || numBinario.length() > String
                .valueOf(Long.MAX_VALUE).length() || numBinario.replaceAll("[01]", "")
                .matches("[23456789]+"));
        auxBinario = Long.valueOf(numBinario);
        numDecimal = 0;
        posicion = 0;
        while (auxBinario > 0) {
            numDecimal += auxBinario % 10 * Math.pow(2, posicion);
            auxBinario = auxBinario / 10;
            posicion++;
        }//Fin Mientras
        System.out.println("El número en decimal es: " + numDecimal);
    }//Fin Programa
}
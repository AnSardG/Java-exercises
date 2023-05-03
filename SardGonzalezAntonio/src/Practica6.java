
/**
 *
 * @author Antonio Sard González
 */
public class Practica6 {

    public static String pidePalabra() {
        //Entorno:
        String palabra;
        //Algoritmo:
        System.out.print("Palabra: ");
        palabra = Leer.dato();
        while (!palabra.matches("[a-zA-Z]{1,8}")) {
            System.out.print("Palabra no valida. Introduzca una palabra de 8 carácteres max.: ");
            palabra = Leer.dato();
        }//Fin Mientras
        return palabra;
    }//Fin Función   

    public static int[][] creaMatrizBinario(String palabra) {
        //Entorno:
        String cadenaByte;
        byte fila, col, cantUnos;
        byte cantCeros;
        int[][] matriz;
        char[] caracter;
        //Algoritmo:
        caracter = palabra.toCharArray();
        matriz = new int[caracter.length + 1][9];
        for (fila = 0; fila < palabra.length(); fila++) {
            cadenaByte = Integer.toBinaryString(Character.codePointAt(caracter, fila));
            if (cadenaByte.length() < 8) {
                cantCeros = (byte) (8 - cadenaByte.length());
                String ceros = "";
                while (cantCeros > 0) {
                    ceros += "0";
                    cantCeros--;
                }//Fin Mientras
                cadenaByte = ceros + cadenaByte + " ";
            }//Fin Si            
            cantUnos = 0;
            for (col = 0; col < matriz[0].length - 1; col++) {
                matriz[fila][col] = Integer.valueOf(cadenaByte.substring(col, col + 1));
                if (matriz[fila][col] == 1) {
                    cantUnos++;
                }//Fin Si
            }//Fin Para
            if (cantUnos % 2 == 0) {
                matriz[fila][col] = 0;
            } else {
                matriz[fila][col] = 1;
            }//Fin Si            
        }//Fin Para            
        for (col = 0; col < matriz[0].length - 1; col++) {
            cantUnos = 0;
            for (fila = 0; fila < matriz.length - 1; fila++) {
                if (matriz[fila][col] == 1) {
                    cantUnos++;
                }//Fin Si
            }//Fin Para
            if (cantUnos % 2 == 0) {
                matriz[fila][col] = 0;
            } else {
                matriz[fila][col] = 1;
            }//Fin Si
        }//Fin Para
        return matriz;
    }//Fin Función

    public static String convierteMatrizEnPalabra(int[][] matriz) {
        //Entorno:
        String palabra, numBinario, caracter;
        int codigo;
        byte fila, col;
        //Algoritmo:
        palabra = "";
        for (fila = 0; fila < matriz.length - 1; fila++) {
            numBinario = "";
            for (col = 0; col < matriz[0].length - 1; col++) {
                numBinario += Integer.toString(matriz[fila][col]);
            }//Fin Para
            codigo = Integer.parseInt(numBinario, 2);
            caracter = Character.getName(codigo);
            if(codigo < 91){
                caracter = caracter.substring(caracter.length() - 1);
            } else {
                caracter = caracter.substring(caracter.length() - 1).toLowerCase();
            }//Fin Si                        
            palabra += caracter;
        }//Fin Para
        return palabra;
    }//Fin Función

    public static void corrigeBit(int[][] matriz){
        //Entorno:
        boolean filaCorrecta, columnaCorrecta;
        byte fila, col, posFila, posCol, cantUnos;
        //Algoritmo:
        filaCorrecta = true;        
        fila = 0;        
        while(filaCorrecta && fila < matriz.length - 1){
            cantUnos = 0;
            for(col = 0; col < matriz[0].length -1; col++){
                if (matriz[fila][col] == 1) {
                    cantUnos++;
                }//Fin Si                
            }//Fin Para
            filaCorrecta = cantUnos % 2 == matriz[fila][col];
            fila++;
        }//Fin Mientras
        posFila = --fila;
        columnaCorrecta = true;
        col = 0;
        while(columnaCorrecta && col < matriz[0].length - 1){
            cantUnos = 0;
            for(fila = 0; fila < matriz.length -1; fila++){
                if (matriz[fila][col] == 1) {
                    cantUnos++;
                }//Fin Si                
            }//Fin Para
            columnaCorrecta = cantUnos % 2 == matriz[fila][col];
            col++;
        }//Fin Mientras
        posCol = --col;
        System.out.println("("+posFila+","+posCol+")");
        if(matriz[posFila][posCol] == 1){
            matriz[posFila][posCol] = 0;
        } else {
            matriz[posFila][posCol] = 1;
        }//Fin Si
    }//Fin Procedimiento
    
    public static void main(String[] args) {
        //Entorno:
        String palabra;
        int[][] matriz;
        //Algoritmo:
        palabra = Practica6.pidePalabra();
        System.out.println("Enviado");        
        matriz = Practica6.creaMatrizBinario(palabra);
        System.out.println(Practica6.convierteMatrizEnPalabra(matriz));        
        System.out.println("Con Ruido");
        Transmision.introduceRuido(matriz);
        System.out.println(Practica6.convierteMatrizEnPalabra(matriz));
        System.out.println("Arreglado");
        Practica6.corrigeBit(matriz);
        System.out.println(Practica6.convierteMatrizEnPalabra(matriz));
    }//Fin Programa
}

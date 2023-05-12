
/**
 *
 * @author Antonio Sard González
 */
public class AhorcadoDificil {
    //Atributos:

    public static final byte FALLOSPERMITIDOS = 10;
    protected String palabraSecreta, palabraRespuesta = "";
    protected byte fallos;
    protected String[] dibujoAhorcado;
    //Constructores:

    public AhorcadoDificil(String palabraSecreta) {
        //Entorno:
        byte i;
        //Algoritmo:
        this.palabraSecreta = palabraSecreta;
        dibujoAhorcado = new String[10];
        for (i = (byte) palabraSecreta.length(); i > 0; i--) {
            palabraRespuesta += "*";
        }//Fin Para
        for (i = 0; i < dibujoAhorcado.length; i++) {
            dibujoAhorcado[i] = " ";
        }//Fin Para
    }

    //Métodos:
    /*
     * Comprueba si la letra es correcta y se modifica el dibujo; a su vez, si la
     * letra es incorrecta se incrementarán los fallos.
     */
    public void compruebaLetra(char letra) {
        //Entorno:
        int cantLetra;
        //Algoritmo:
        letra = Character.toLowerCase(letra);
        cantLetra = palabraSecreta.length()
                - palabraSecreta.toLowerCase().replaceAll(String.valueOf(letra), "").length();
        if (cantLetra > 0 && palabraRespuesta.indexOf(String.valueOf(letra)) < 0) {
            this.modificaPalabraRespuesta(letra, cantLetra);
        } else {
            this.incrementaFallos();
        }//Fin Si
        this.modificaDibujo();
    }

    /*
     * Devolverá 1 o -1, dependiendo de si ha acertado la palabra o no, por lo 
     * tanto muestra el resultado por pantalla y a su vez da la información de 
     * si ha ganado el usuario.
     */
    public byte muestraResultado() {
        //Entorno:
        byte res;
        byte pos;
        //Algoritmo:
        res = -1;
        if (palabraRespuesta.equals(palabraSecreta)) {
            System.out.println("¡Enhorabuena, la palabra " + palabraRespuesta + " era"
                    + " la correcta, ha ganado en " + fallos + " intentos!");
            res = 1;
        } else {
            if (fallos == 1) {
                for (pos = 1; pos >= 0; pos--) {
                    System.out.println(dibujoAhorcado[pos]);
                }//Fin Para            
            } else if (fallos > 1) {
                for (pos = 9; pos >= 0; pos--) {
                    System.out.println(dibujoAhorcado[pos]);
                }//Fin Para
            }//Fin Si
            if (fallos == FALLOSPERMITIDOS) {
                System.out.println("Lo sentimos, ha llegado a " + FALLOSPERMITIDOS
                        + " fallos, la palabra correcta era: " + palabraSecreta);
            } else {
                System.out.println(palabraRespuesta);
            }//Fin Si
        }//Fin Si
        return res;
    }
   
    public byte getFallos() {
        return fallos;
    }
    
    /*
     * Cambia la palabra que se muestra por pantalla añadiendo la letra acertada y     
     * controlando si está en la última posición o a mitad de la palabra.     
     */
    protected void modificaPalabraRespuesta(char letra, int veces) {
        //Entorno:
        int pos;
        byte i;
        String palabraAux;
        //Algoritmo:
        palabraAux = palabraSecreta.toLowerCase();
        for (i = 0; i < veces; i++) {
            pos = palabraAux.indexOf(letra);
            if (pos + 1 < palabraSecreta.length()) {
                palabraRespuesta = palabraRespuesta.substring(0, pos) + letra
                        + palabraRespuesta.substring(pos + 1);
            } else {
                palabraRespuesta = palabraRespuesta.substring(0, pos) + letra;
            }//Fin Si
            palabraAux = palabraAux.replaceFirst(Character.toString(letra), "*");
        }//Fin Para        
    }

    /*
     * Este método se podría realizar con una matriz de dos dimensiones
     * en la que el número de filas equivale a los fallos y el de las columnas a
     * los códigos ASCII de cada línea; he optado por esta solución ya que ocupa
     * menos RAM (no se tendrían que guardar 100 variables).
     */
    protected void modificaDibujo() {
        //Entorno:
        byte pos;
        //Algoritmo:        
        switch (fallos) {
            case 1:
                dibujoAhorcado[1] = "   __/\\__";
                break;
            case 2:
                for (pos = 2; pos <= 7; pos++) {
                    dibujoAhorcado[pos] = "     |";
                }//Fin Para
                break;
            case 3:
                dibujoAhorcado[8] = "     +----+";
                break;
            case 4:
                dibujoAhorcado[7] = "     |    |";
                break;
            case 5:
                dibujoAhorcado[6] = "     |    o";
                break;
            case 6:
                dibujoAhorcado[5] = "     |    |";
                dibujoAhorcado[4] = "     |    |";
                break;
            case 7:
                dibujoAhorcado[5] = "     |   /|";
                break;
            case 8:
                dibujoAhorcado[5] = "     |   /|\\";
                break;
            case 9:
                dibujoAhorcado[3] = "     |    /";
                break;
            case 10:
                dibujoAhorcado[3] = "     |   //";
                break;
        }//Fin Según Sea
    }

    /*
     * A la hora de comprobar si la letra es correcta o no, se incrementarán
     * respectivamente los fallos o no.
     */
    protected void incrementaFallos() {
        fallos++;
    }
}

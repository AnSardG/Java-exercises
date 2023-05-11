


/**
 *
 * @author Antonio Sard González
 */
public class AhorcadoDificil {
    //Atributos:
    public static final byte FALLOSPERMITIDOS = 10;
    private String palabraSecreta, palabraAhorcado;
    private byte fallos;
    private String[] dibujoAhorcado;
    //Constructores:
    public AhorcadoDificil (String palabraSecreta){
        //Entorno:
        byte i;
        //Algoritmo:
        this.palabraSecreta = palabraSecreta;
        dibujoAhorcado = new String[10];
        for(i = (byte)palabraSecreta.length(); i > 0; i--){
            palabraAhorcado += "*";
        }//Fin Para
    }
    /*
     
     
       +----+
       |    |   
       |    o
       |   /|\
       |    |
       |   //
       |
     __/\__
      
     */
    //Métodos:
    /*
       Si existe la letra pasada por parámetro en la palabra secreta devolverá verdadero,
       mientras que si no existe devolvera falso.
     */
    public boolean compruebaLetra(char letra){
        //Entorno:
        boolean existeLetra;
        //Algoritmo:
        existeLetra = palabraSecreta.length() 
                - palabraSecreta.replaceAll(String.valueOf(letra), "").length() < 0;
        if(existeLetra){
            this.modificaPalabraAhorcado(letra);
        }
        return existeLetra;
    }//Fin Función
    public void muestraResultado(){
        
    }
    public void modificaPalabraAhorcado(char letra){
        //Entorno:
        
        //Algoritmo:
        
    }//Fin Procedimiento
    public void incrementaFallos(){
        fallos++;
    }//Fin Procedimiento
}

//Programa: Temperatura
//Autor: Antonio Sard González
public class Temperatura {
    public static short celsiusToFarenheit(byte celsius){
        return (short)(celsius*1.8+32);
    }//Fin Método
    public static byte farenheitToCelsius(short farenheit){
        return (byte)((farenheit-32)/1.8);
    }//Fin Método
}

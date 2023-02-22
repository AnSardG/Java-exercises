//Programa: PruebaTemperatura
//Autor: Antonio Sard González
public class PruebaTemperatura {
    public static void main(String[] args){
        //Entorno:
        short farenheit;
        byte celsius;
        //Algoritmo:
        celsius=32;
        farenheit=145;
        //Pruebas de métodos
        System.out.println(celsius+"ºC equivalen a "+Temperatura.celsiusToFarenheit(celsius)+"ºF.");
        System.out.println("----------------------");
        System.out.println(farenheit+"ºF equivalen a "+Temperatura.farenheitToCelsius(farenheit)+"ºC.");
        System.out.println("----------------------");
        celsius=-10;
        farenheit=-15;
        System.out.println(celsius+"ºC equivalen a "+Temperatura.celsiusToFarenheit(celsius)+"ºF.");
        System.out.println("----------------------");
        System.out.println(farenheit+"ºF equivalen a "+Temperatura.farenheitToCelsius(farenheit)+"ºC.");
        System.out.println("----------------------");
        celsius=0;
        farenheit=0;
        System.out.println(celsius+"ºC equivalen a "+Temperatura.celsiusToFarenheit(celsius)+"ºF.");
        System.out.println("----------------------");
        System.out.println(farenheit+"ºF equivalen a "+Temperatura.farenheitToCelsius(farenheit)+"ºC.");
        System.out.println("----------------------");
    }//Fin Programa
}

//Programa: FahrenheitACelsius
//Autor: Antonio Sard González
public class FahrenheitACelsius{
	public static void main(String[] args){
	//Entorno:
		float gradosF, gradosC;
	//Algoritmo:
		System.out.print("Introduzca la cantidad de grados Fahrenheit que desee convertir a grados Celsius: ");
		gradosF=Leer.datoFloat(); 
		gradosC=5F/9F*(gradosF-32F);
		System.out.print(gradosF+" ºF equivalen a "+gradosC+" ºC");
	}//Fin Programa
}
//Programa: FahrenheitACelsius
//Autor: Antonio Sard Gonz�lez
public class FahrenheitACelsius{
	public static void main(String[] args){
	//Entorno:
		float gradosF, gradosC;
	//Algoritmo:
		System.out.print("Introduzca la cantidad de grados Fahrenheit que desee convertir a grados Celsius: ");
		gradosF=Leer.datoFloat(); 
		gradosC=5F/9F*(gradosF-32F);
		System.out.print(gradosF+" �F equivalen a "+gradosC+" �C");
	}//Fin Programa
}
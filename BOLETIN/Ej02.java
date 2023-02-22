/*
Programa: Ej02
Autor: Antonio Sard González
Entorno:
	CONST PI es numérico real <-- 3.1416
	longitud, area, radio es numérico real
Algoritmo:
	Escribir "Los resultados se calcularán en centímetros."
	Repetir
		Escribir "Introduzca el radio del círculo (debe ser mayor que 0): "
		Leer radio
	Hasta radio>0
	longitud<--2*PI*radio
	area<--PI*radio^2
	Escribir "La longitud del círculo es: ",longitud," cm. El área del círculo es: ",area," cm."
Fin Programa
*/
//Programa: Ej02
//Autor: Antonio Sard González
public class Ej02{
	public static void main(String[] args){
	//Entorno:
		final float PI=3.1416F;
		float longitud, area, radio;
	//Algoritmo:
		System.out.println("Los resultados se calcularán en centímetros.");
		do{
			System.out.print("Introduzca el radio del círculo (debe ser mayor que 0): ");
			radio=Leer.datoFloat();
		}while(radio<=0);
		longitud=2F*PI*radio;
		area=PI*(float)Math.pow(radio, 2);
		System.out.print("La longitud del círculo es: "+longitud+" cm. El área del círculo es: "+area+" cm.");
	}//Fin Programa
}
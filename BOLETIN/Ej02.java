/*
Programa: Ej02
Autor: Antonio Sard Gonz�lez
Entorno:
	CONST PI es num�rico real <-- 3.1416
	longitud, area, radio es num�rico real
Algoritmo:
	Escribir "Los resultados se calcular�n en cent�metros."
	Repetir
		Escribir "Introduzca el radio del c�rculo (debe ser mayor que 0): "
		Leer radio
	Hasta radio>0
	longitud<--2*PI*radio
	area<--PI*radio^2
	Escribir "La longitud del c�rculo es: ",longitud," cm. El �rea del c�rculo es: ",area," cm."
Fin Programa
*/
//Programa: Ej02
//Autor: Antonio Sard Gonz�lez
public class Ej02{
	public static void main(String[] args){
	//Entorno:
		final float PI=3.1416F;
		float longitud, area, radio;
	//Algoritmo:
		System.out.println("Los resultados se calcular�n en cent�metros.");
		do{
			System.out.print("Introduzca el radio del c�rculo (debe ser mayor que 0): ");
			radio=Leer.datoFloat();
		}while(radio<=0);
		longitud=2F*PI*radio;
		area=PI*(float)Math.pow(radio, 2);
		System.out.print("La longitud del c�rculo es: "+longitud+" cm. El �rea del c�rculo es: "+area+" cm.");
	}//Fin Programa
}
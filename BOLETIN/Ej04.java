/*
Programa: Ej04
Autor: Antonio Sard Gonz�lez
Entorno:
	CONST PI es num�rico real <-- 3.1416
	volumen, area, radio es num�rico real
Algoritmo:
	Repetir
		Escribir "Introduzca un radio positivo mayor que 0: "
		Leer radio
	Hasta radio>0
	volumen <-- 4/3*PI*radio^3
	area <-- 4*PI*radio*2
	Escribir "El volumen de la esfera es: ",volumen,". El �rea de la esfera es: ",area
Fin Programa
*/
//Programa: Ej04
//Autor: Antonio Sard Gonz�lez
public class Ej04{
	public static void main(String[] args){
	//Entorno:
		final float PI=3.1416F;
		float volumen, area, radio;
	//Algoritmo:
		do{
			System.out.print("Introduzca un radio positivo mayor que 0: ");
			radio=Leer.datoFloat();
		}while(radio<=0);
		volumen=4F/3*PI*(float)Math.pow(radio, 3);
		area=4F*PI*radio*2;
		System.out.print("El volumen de la esfera es: "+volumen+". El �rea de la esfera es: "+area);
	}
}
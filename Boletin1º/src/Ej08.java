/*
Programa: Ej08
Autor: Antonio Sard Gonz�lez
Entorno:
	num es num�rico entero
Algoritmo:
	Repetir
		Escribir "Introduzca un n�mero: "
		Leer num
	Hasta num >=1 y num <= 10
Fin Programa
*/
public class Ej08{
	public static void main(String[] args){
	//Entorno:
		short num;
	//Algoritmo:
		do{
			System.out.print("Introduzca un n�mero: ");
			num=Leer.datoShort();
		}while(num <1 || num > 10);
	}//Fin Programa
}
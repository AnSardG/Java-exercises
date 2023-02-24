/*
Programa: Ej05
Autor: Antonio Sard Gonz�lez
Entorno:
	dias, meses, a�os es num�rico entero
Algoritmo:
	Repetir
		Escribir "Introduzca su edad en a�os: "
		Leer a�os
		Si a�os>150
			Escribir "Debe introducir la cantidad de a�os que tiene, no el a�o en el que naci�."
		Fin Si
	Hasta a�os>=0 y a�os<=150
	Repetir
		Escribir "Introduzca los meses: "
		Leer meses
	Hasta meses >= 0 y meses <= 12
	dias <-- a�os*360 + meses*30
	Escribir "Su edad equivale a ",dias," d�as."
Fin Programa
*/
//Programa: Ej05
//Autor: Antonio Sard Gonz�lez
public class Ej05{
	public static void main(String[] args){
	//Entorno:
		short meses, a�os;
		int dias;
	//Algoritmo:
		do{
			System.out.print("Introduzca su edad en a�os: ");
			a�os=Leer.datoShort();
			if(a�os>150){
				System.out.print("Debe introducir la cantidad de a�os que tiene, no el a�o en el que naci�.");
			}//Fin Si
		}while(a�os<0 || a�os>150);
		do{
			System.out.print("Introduzca los meses: ");
			meses=Leer.datoShort();
		}while(meses < 0 || meses > 12);
		dias=a�os*360 + meses*30;
		System.out.print("Su edad equivale a "+dias+" d�as.");
	}//Fin Programa
}
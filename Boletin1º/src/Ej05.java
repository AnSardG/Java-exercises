/*
Programa: Ej05
Autor: Antonio Sard González
Entorno:
	dias, meses, años es numérico entero
Algoritmo:
	Repetir
		Escribir "Introduzca su edad en años: "
		Leer años
		Si años>150
			Escribir "Debe introducir la cantidad de años que tiene, no el año en el que nació."
		Fin Si
	Hasta años>=0 y años<=150
	Repetir
		Escribir "Introduzca los meses: "
		Leer meses
	Hasta meses >= 0 y meses <= 12
	dias <-- años*360 + meses*30
	Escribir "Su edad equivale a ",dias," días."
Fin Programa
*/
//Programa: Ej05
//Autor: Antonio Sard González
public class Ej05{
	public static void main(String[] args){
	//Entorno:
		short meses, años;
		int dias;
	//Algoritmo:
		do{
			System.out.print("Introduzca su edad en años: ");
			años=Leer.datoShort();
			if(años>150){
				System.out.print("Debe introducir la cantidad de años que tiene, no el año en el que nació.");
			}//Fin Si
		}while(años<0 || años>150);
		do{
			System.out.print("Introduzca los meses: ");
			meses=Leer.datoShort();
		}while(meses < 0 || meses > 12);
		dias=años*360 + meses*30;
		System.out.print("Su edad equivale a "+dias+" días.");
	}//Fin Programa
}
/*
Programa: Ej01
Autor: Antonio Sard Gonz�lez
Entorno:
	base, altura, area es num�rico real
Algoritmo:
	Escribir "Debe introducir n�meros de unidades equitativas. "
	Repetir
		Escribir "Introduzca la base: "
		Leer base
	Hasta base>0
	Repetir
		Escribir "Introduzca la altura: "
		Leer altura
	Hasta altura>0
	area <-- base*altura
	Escribir "El �rea del tri�ngulo es: ",area
Fin Programa
*/
//Programa: Ej01
//Autor: Antonio Sard Gonz�lez
public class Ej01{
	public static void main(String[] args){
	//Entorno:
		float base, altura, area;
	//Algoritmo:
		System.out.print("Debe introducir n�meros de unidades equitativas.");
		do{
			System.out.print("Introduzca la base: ");
			base=Leer.datoFloat();
		}while(base<=0);
		do{
			System.out.print("Introduzca la altura: ");
			altura=Leer.datoFloat();
		}while(altura<=0);
		area=base*altura;
		System.out.print("El �rea del tri�ngulo es: "+area);
	}//Fin Programa
}
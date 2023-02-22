/*
Programa: Ej01
Autor: Antonio Sard González
Entorno:
	base, altura, area es numérico real
Algoritmo:
	Escribir "Debe introducir números de unidades equitativas. "
	Repetir
		Escribir "Introduzca la base: "
		Leer base
	Hasta base>0
	Repetir
		Escribir "Introduzca la altura: "
		Leer altura
	Hasta altura>0
	area <-- base*altura
	Escribir "El área del triángulo es: ",area
Fin Programa
*/
//Programa: Ej01
//Autor: Antonio Sard González
public class Ej01{
	public static void main(String[] args){
	//Entorno:
		float base, altura, area;
	//Algoritmo:
		System.out.print("Debe introducir números de unidades equitativas.");
		do{
			System.out.print("Introduzca la base: ");
			base=Leer.datoFloat();
		}while(base<=0);
		do{
			System.out.print("Introduzca la altura: ");
			altura=Leer.datoFloat();
		}while(altura<=0);
		area=base*altura;
		System.out.print("El área del triángulo es: "+area);
	}//Fin Programa
}
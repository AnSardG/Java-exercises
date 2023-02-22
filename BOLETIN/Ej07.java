/*
Programa: Ej07
Autor: Antonio Sard González
Entorno:
	num, posicion, digito es entero
Algoritmo:
	Escribir "Introduzca un número entero: "
	Leer num
	Escribir "Introduzca la posición de la que quiera saber su dígito: "
	Leer posicion
	Mientras 10^posicion > num hacer
		num <-- num div 10
	Fin Mientras
	digito <-- num % 10
	Escribir "El dígito que se encuentra en la posición ",posicion," es el ",digito
Fin Programa
*/
//Programa: Ej07
//Autor: Antonio Sard González
public class Ej07{
	public static void main(String[] args){
	//Entorno:
		short posicion, digito;
		int num;
	//Algoritmo:
		System.out.print("Introduzca un número entero: ");
		num=Leer.datoInt();
		System.out.print("Introduzca la posición de la que quiera saber su dígito: ");
		posicion=Leer.datoShort();
		while(num > Math.pow(10, posicion)){
			num=num/10;
		}//Fin Mientras
		digito=(short)(num % 10);
		System.out.print("El dígito que se encuentra en la posición "+posicion+" es el "+digito);
	}//Fin Programa
}
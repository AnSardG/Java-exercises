/*
Programa: ComparacionSueldos
Autor: Antonio Sard González
Entorno:
	nombre, nombreMayor, nombreMenor es alfanumérico(24)
	sueldo, mayorSueldo, menorSueldo, i es numérico entero
Algoritmo:
	mayorSueldo <-- 0
	menorSueldo <-- 1000000
	Para i de 1 a 100 hacer
		Escribir "Introduzca su nombre: "
		Leer nombre
		Escribir "Introduzca su sueldo: "
		Leer sueldo
		Si sueldo>mayorSueldo entonces
			nombreMayor <-- nombre
			mayorSueldo <-- sueldo
		Fin Si
		Si sueldo<menorSueldo entonces
			nombreMenor <-- nombre
			menorSueldo <-- sueldo
		Fin Si
	Fin Para
	Escribir "La persona que más cobra es: ",nombreMayor,", con un salario de: ",mayorSueldo,"euros. La persona que menos cobra es: ",nombreMenor,", con un salario de: ",menorSueldo,"euros."
Fin Programa
*/
//Programa: ComparacionSueldos
//Autor: Antonio Sard González
public class ComparacionSueldos{
	public static void main(String[] args){
	//Entorno:
		nombre, nombreMayor, nombreMenor es alfanumérico(24)
		sueldo, mayorSueldo, menorSueldo, i es numérico entero
	//Algoritmo:
		mayorSueldo <-- 0
		menorSueldo <-- 0
		Para i de 1 a 100 hacer
			Escribir "Introduzca su nombre: "
			Leer nombre
			Escribir "Introduzca su sueldo: "
			Leer sueldo
			Si sueldo>mayorSueldo entonces
				nombreMayor <-- nombre
				mayorSueldo <-- sueldo
			Fin Si
			Si sueldo<menorSueldo entonces
				nombreMenor <-- nombre
				menorSueldo <-- sueldo
			Fin Si
		Fin Para
		Escribir "La persona que más cobra es: ",nombreMayor,", ",mayorSueldo,". La persona que menos cobra es: ",nombreMenor,", ",menorSueldo,"."
	}//Fin Programa
}
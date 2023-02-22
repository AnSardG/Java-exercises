/*
Programa: Ej03
Autor: Antonio Sard González
Entorno:
	horas, minutos, segundos, minutosEnSegundos, horasEnSegundos es numérico entero
Algoritmo:
	Repetir
		Escribir "Introduzca la hora: "
		Leer horas
	Hasta hora>=0 y hora<=24
		Repetir
		Escribir "Introduzca los minutos: "
		Leer minutos
	Hasta minutos>=0 y minutos<=60
		Repetir
		Escribir "Introduzca los segundos: "
		Leer segundos
	Hasta segundos>=0 y segundos<=60
	minutosEnSegundos <-- 60*minutos
	horasEnSegundos <-- 3600*horas
	segundos <-- minutosEnSegundos+horasEnSegundos+segundos
	Escribir "La hora introducida equivale a: ",segundos," segundos."
Fin Programa
*/
//Programa: Ej03
//Autor: Antonio Sard González
public class Ej03{
	public static void main(String[] args){
	//Entorno:
		short horas, minutos;
		int horasEnSegundos, segundos, minutosEnSegundos;
	//Algoritmo:
		do{
			System.out.print("Introduzca la hora: ");
			horas=Leer.datoShort();
		}while(horas<0 || horas>23);
		do{
			System.out.print("Introduzca los minutos: ");
			minutos=Leer.datoShort();
		}while(minutos<0 || minutos>60);
		do{
			System.out.print("Introduzca los segundos: ");
			segundos=Leer.datoShort();
		}while(segundos<0 || segundos>60);
		minutosEnSegundos=minutos*60;
		horasEnSegundos=horas*3600;
		segundos=minutosEnSegundos+horasEnSegundos+segundos;
		System.out.print("La hora introducida equivale a: "+segundos+" segundos.");
	}//Fin Programa
}
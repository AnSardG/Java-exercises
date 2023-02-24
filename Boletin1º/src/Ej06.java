/*
Programa: Ej06
Autor: Antonio Sard Gonz�lez
Entorno:
	hora es num�rico entero
Algoritmo:
	Repetir
		Escribir "Introduzca una hora del d�a (no horas y minutos): "
		Leer hora
	Hasta hora >= 0
	Si hora >=0 y <=24 entonces
		Si hora <=12 entonces
			Escribir "Buenos d�as"
		Sino
			Si hora <=18 entonces
				Escribir "Buenas tardes"
			Sino
				Escribir "Buenas noches"
			Fin Si
		Fin Si
	Sino
		Escribir "Hora fuera de rango"
	Fin Si
Fin Programa
*/
//Programa: Ej06
//Autor: Antonio Sard Gonz�lez
public class Ej06{
	public static void main(String[] args){
	//Entorno:
		byte hora;
		short auxHora;
	//Algoritmo:
		do{
			System.out.print("Introduzca una hora del d�a (no horas y minutos): ");
			auxHora=Leer.datoShort();
		}while(auxHora < 0);
		hora=(byte)auxHora;
		if(hora >=0 && hora <=24){
			if(hora <=12){
				System.out.print("Buenos d�as.");
			}else{
				if(hora <=18){
					System.out.print("Buenas tardes");
				}else{
					System.out.print("Buenas noches");
				}//Fin Si
			}//Fin Si
		}else{
			System.out.print("Hora fuera de rango");
		}//Fin Si
	}//Fin Programa
}
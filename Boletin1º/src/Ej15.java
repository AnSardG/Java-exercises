/*
Programa: Ej15
Autor: Antonio Sard Gonz�lez
Entorno:
	num, numMayor, numMenor es num�rico real
	i es num�rico entero
Algoritmo:
	Escribir "Introduzca a continuaci�n cuatro n�meros para saber cu�l es mayor y cu�l menor: "
	Leer num
	numMayor <-- num
	numMenor <-- num
	i <-- 1
	Repetir
		Escribir "Introduzca otro n�mero: "
		Leer num
		Si numMayor<num entonces
			numMayor <-- num
		Sino
			Si numMenor>num entonces
				numMenor <-- num
			Fin Si
		Fin Si
		i++
	Hasta i=3
	Escribir "El n�mero mayor de los introducidos es: ",numMayor,", y el menor es: ",numMenor
Fin Programa
*/
//Programa: Ej15
//Autor: Antonio Sard Gonz�lez
public class Ej15{
	public static void main(String[] args){
	//Entorno:
		float num, numMayor, numMenor;
		short auxI;
		byte i;
	//Algoritmo:
		System.out.print("Introduzca a continuaci�n cuatro n�meros para saber cu�l es mayor y cu�l menor: ");
		num=Leer.datoFloat();
		numMayor=num;
		numMenor=num;
		auxI=(short)1;
		i=(byte)auxI;
		do{
			System.out.print("Introduzca otro n�mero: ");
			num=Leer.datoFloat();
			if(numMayor<num){
				numMayor=num;
			}else{
				if(numMenor>num){
					numMenor=num;
				}//Fin Si
			}//Fin Si
			i++;
		}while(i<=3);
		System.out.print("El n�mero mayor de los introducidos es: "+numMayor+", y el menor es: "+numMenor);
	}//Fin Programa
}

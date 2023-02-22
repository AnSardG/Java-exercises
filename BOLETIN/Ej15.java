/*
Programa: Ej15
Autor: Antonio Sard González
Entorno:
	num, numMayor, numMenor es numérico real
	i es numérico entero
Algoritmo:
	Escribir "Introduzca a continuación cuatro números para saber cuál es mayor y cuál menor: "
	Leer num
	numMayor <-- num
	numMenor <-- num
	i <-- 1
	Repetir
		Escribir "Introduzca otro número: "
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
	Escribir "El número mayor de los introducidos es: ",numMayor,", y el menor es: ",numMenor
Fin Programa
*/
//Programa: Ej15
//Autor: Antonio Sard González
public class Ej15{
	public static void main(String[] args){
	//Entorno:
		float num, numMayor, numMenor;
		short auxI;
		byte i;
	//Algoritmo:
		System.out.print("Introduzca a continuación cuatro números para saber cuál es mayor y cuál menor: ");
		num=Leer.datoFloat();
		numMayor=num;
		numMenor=num;
		auxI=(short)1;
		i=(byte)auxI;
		do{
			System.out.print("Introduzca otro número: ");
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
		System.out.print("El número mayor de los introducidos es: "+numMayor+", y el menor es: "+numMenor);
	}//Fin Programa
}

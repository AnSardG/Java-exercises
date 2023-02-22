/*
Programa: Ej14
Autor: Antonio Sard Gonz�lez
Entorno:
	num, numBase10, auxNum, posicion es num�rico entero
	esBinario es booleano
Algoritmo:
	Repetir
		esBinario <-- VERDADERO
		Escribir "Introduzca un n�mero binario: "
		Leer num
		auxNum <-- num
		Repetir
			Si auxNum%10 > 1 entonces
				esBinario <-- FALSO
			Fin Si
			auxNum div 10
		Hasta num-auxNum=num
	Hasta esBinario
	auxNum <-- num
	numBase10 <-- 0
	posicion <-- 0
	Mientras auxNum>0 hacer
		numBase10 <-- numBase10+auxNum%10*2^posicion
		auxNum <-- auxNum div 10
		posicion <-- posicion+1
	Fin Mientras
	Escribir "El n�mero en decimal es: ",numBase10
Fin Programa
*/
//Programa: Ej14
//Autor: Antonio Sard Gonz�lez
public class Ej14{
	public static void main(String[] args){
	//Entorno:
		int num, auxNum;
		short numBase10, posicion;
		boolean esBinario;
	//Algoritmo:
		do{
			esBinario=true;
			System.out.print("Introduzca un n�mero binario: ");
			num=Leer.datoInt();
			auxNum=num;
			do{
				if(auxNum%10 > 1){
					esBinario=false;
				}//Fin Si
				auxNum=(int)(auxNum/10);
			}while(auxNum!=0);
		}while(!esBinario);
		auxNum=num;
		numBase10=0;
		posicion=0;
		while(auxNum>0){
			numBase10=(short)(numBase10+(auxNum%10*Math.pow(2, posicion)));
			auxNum=(int)(auxNum/10);
			posicion++;
		}//Fin Mientras
		System.out.print("El n�mero en decimal es: "+numBase10);
	}//Fin Programa
}
/*
Programa: NumerosPrimos
Autor: Antonio Sard Gonz�lez
Entorno:
	num, i, contadorNum es num�rico entero
	noPrimo es booleano 
Algoritmo:
	Repetir
		Escribir "Introduzca un n�mero mayor que 0 del que quiera saber todos los n�meros primos hasta dicho n�mero: "
		Leer num
	Hasta num>0
	noPrimo <-- FALSO
	Si num=1 entonces
			Escribir "Los n�meros primos hasta ",num," son: ",num
	Sino
		Escribir "Los n�meros primos hasta ",num," son: "
		Para contadorNum de num a 2 con incremento -1 hacer
			Para i de contadorNum/2 a 2 con incremento -1 hacer
				Si contadorNum%i=0 entonces
					noEntero <-- VERDADERO
					i <-- 1
				Fin Si
			Fin Para
			Si noPrimo=FALSO entonces
				Escribir contadorNum,", "
			Sino
				noPrimo <-- FALSO
			Fin Si
		Fin Para
		Escribir contadorNum,"."
	Fin Si
Fin Programa
*/
//Programa: NumerosPrimos
//Autor: Antonio Sard Gonz�lez
public class NumerosPrimos{
	public static void main(String[] args){
	//Entorno:
		int num, i, contadorNum;
		boolean noPrimo;
	//Algoritmo:
		do{
			System.out.print("Introduzca un n�mero mayor que 0 del que quiera saber todos los n�meros primos hasta dicho n�mero: ");
			num=Leer.datoInt();
		}while(num<=0);
		noPrimo=false;
		if(num==1){
			System.out.print("Los n�meros primos hasta "+num+" son: "+num);
		}else{
			System.out.print("Los n�meros primos hasta "+num+" son: ");
			for(contadorNum=num; contadorNum>=2; contadorNum--){
				for(i=contadorNum/2; i>=2; i--){
					if(contadorNum%i==0){
						noPrimo=true;
						i=1;
					}//Fin Si
				}//Fin Para
				if(noPrimo==false){
					System.out.print(contadorNum+", ");
				}else{
					noPrimo=false;
				}//Fin Si
			}//Fin Para
			System.out.print(contadorNum+".");
		}//Fin Si
	}//Fin Programa
}
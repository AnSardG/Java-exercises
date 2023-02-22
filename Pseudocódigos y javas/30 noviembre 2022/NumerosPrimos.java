/*
Programa: NumerosPrimos
Autor: Antonio Sard González
Entorno:
	num, i, contadorNum es numérico entero
	noPrimo es booleano 
Algoritmo:
	Repetir
		Escribir "Introduzca un número mayor que 0 del que quiera saber todos los números primos hasta dicho número: "
		Leer num
	Hasta num>0
	noPrimo <-- FALSO
	Si num=1 entonces
			Escribir "Los números primos hasta ",num," son: ",num
	Sino
		Escribir "Los números primos hasta ",num," son: "
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
//Autor: Antonio Sard González
public class NumerosPrimos{
	public static void main(String[] args){
	//Entorno:
		int num, i, contadorNum;
		boolean noPrimo;
	//Algoritmo:
		do{
			System.out.print("Introduzca un número mayor que 0 del que quiera saber todos los números primos hasta dicho número: ");
			num=Leer.datoInt();
		}while(num<=0);
		noPrimo=false;
		if(num==1){
			System.out.print("Los números primos hasta "+num+" son: "+num);
		}else{
			System.out.print("Los números primos hasta "+num+" son: ");
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
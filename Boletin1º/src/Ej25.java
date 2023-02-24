/*
Programa: Ej25
Autor: Antonio Sard González
Entorno:
	tecla es alfanumérico(1)
	num es numérico entero
Algoritmo:
	Para num de 1 a 100 hacer
		Escribir num
		Si num=20 o num=40 o num=60 o num=80 o num=100
			Leer tecla
		Fin Si
	Fin Para
Fin Programa
*/
//Programa: Ej25
//Autor: Antonio Sard González
public class Ej25{
	public static void main(String[] args){
	//Entorno:
		String tecla;
		byte num;
	//Algoritmo:
		for(num=1; num<=100; num++){
			System.out.println(num);
			if(num%20==0){
				System.out.println("Pulse una tecla para continuar");
				tecla=Leer.dato();
				tecla=tecla+tecla;
				System.out.println(tecla);
			}//Fin Si
			
		}//Fin Para
	}//Fin Programa
}
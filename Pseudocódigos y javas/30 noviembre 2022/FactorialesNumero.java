/*
Programa: FactorialesNumero
Autor: Antonio Sard González
Entorno:
	num, factorial, resultadoFactorial es numérico entero
Algoritmo:
	Repetir
		Escribir "Introduzca un número: "
		Leer num
	Hasta num>0
	Si num>1 entonces
		Escribir num,"! = ",num
		resultadoFactorial <-- num
		Para factorial de num-1 a 1 con incremento -1 hacer
			Escribir " x ",factorial
			resultadoFactorial <-- resultadoFactorial*factorial
		Fin Para
		Escribir " = ",resultadoFactorial
	Sino
		Escribir num,"! = ",num
	Fin Si
Fin Programa
*/
//Programa: FactorialesNumero
//Autor: Antonio Sard González
public class FactorialesNumero{
	public static void main(String[] args){
	//Entorno:
		short num, factorial;
		long resultadoFactorial;
	//Algoritmo:
		do{
			System.out.print("Introduzca un número: ");
			num=Leer.datoShort();
		}while(num<=0);
		if(num>1){
			System.out.print(num+"! = "+num);
			resultadoFactorial=num;
			for(factorial=(short)(num-1); factorial>=1; factorial--){
				System.out.print(" x "+factorial);
				resultadoFactorial=resultadoFactorial*factorial;
			}//Fin Para
			System.out.print(" = "+resultadoFactorial);
		}else{
			System.out.print(num+"! = "+num);
		}//Fin Si
	}//Fin Programa
}
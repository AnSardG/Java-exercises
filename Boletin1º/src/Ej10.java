/*
Programa: Ej10
Autor: Antonio Sard González
Entorno:
	num1, num2, resultado es numérico real
	op es numérico entero
Algoritmo:
	Escribir "Introduzca el primer número: "
	Leer num1
	Escribir "Introduzca el segundo número: "
	Leer num2
	Repetir
		Escribir "1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Resto\n Elija opción: "
		Leer op
		Si op<1 o op>5 entonces
			Escribir "Debe introducir una opción entre 1 y 5."
		Fin Si
	Hasta op>=1 y op<=5
	Según Sea op hacer
		1:
			resultado <-- num1 + num2
			Escribir num1," + ",num2," = ",resultado
		2:
			resultado <-- num1 - num2
			Escribir num1," - ",num2," = ",resultado
		3:
			resultado <-- num1 * num2
			Escribir num1," x ",num2," = ",resultado
		4:
			Si num2 != 0 entonces
				resultado <-- num1 / num2
				Escribir num1," / ",num2," = ",resultado
			Sino
				Escribir "No se puede dividir entre 0"
			Fin Si
		5:
			Si num1 - num1 div 1 = 0 y num2 - num2 div 2 = 0 entonces
				resultado <-- num1 mod num2
				Escribir num1," % ",num2," = ",resultado
			Sino
				Escribir "No se puede efectuar el resto de una división entre números decimales."
			Fin Si
	Fin Según Sea
Fin Programa
*/
//Programa: Ej10
//Autor: Antonio Sard González
public class Ej10{
	public static void main(String[] args){
	//Entorno:
		float num1, num2, resultado;
		short op;
	//Algoritmo:
		System.out.print("Introduzca el primer número: ");
		num1=Leer.datoFloat();
		System.out.print("Introduzca el segundo número: ");
		num2=Leer.datoFloat();
		do{
			System.out.print("1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Resto\n Elija opción: ");
			op=Leer.datoShort();
			if(op<1 || op>5){
				System.out.print("Debe introducir una opción entre 1 y 5.");
			}//Fin Si
		}while(op<1 || op>5);
		switch(op){
			case 1:
				resultado= num1 + num2;
				System.out.print(num1+" + "+num2+" = "+resultado);
				break;
			case 2:
				resultado=num1 - num2;
				System.out.print(num1+" - "+num2+" = "+resultado);
				break;
			case 3:
				resultado=num1 * num2;
				System.out.print(num1+" x "+num2+" = "+resultado);
				break;
			case 4:
				if(num2 != 0){
					resultado=num1 / num2;
					System.out.print(num1+" / "+num2+" = "+resultado);
				}else{
					System.out.print("No se puede dividir entre 0");
				}//Fin Si
				break;
			case 5:
				if(num1 == (int)num1 && num2 == (int)num2){
					resultado=num1 %num2;
					System.out.print(num1+" % "+num2+" = "+resultado);
				}else{
					System.out.print("No se puede efectuar el resto de una división entre números decimales.");
				}//Fin Si
				break;
		}//Fin Según Sea
	}//Fin Programa
}
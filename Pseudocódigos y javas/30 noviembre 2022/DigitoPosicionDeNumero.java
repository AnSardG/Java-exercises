/*
Programa: DigitoPosicionDeNumero
Autor: Antonio Sard Gonz�lez
Entorno:
	num, posicion, digito, resultadoDivision es num�rico entero
Algoritmo:
	Escribir "Introduzca un n�mero: "
	Leer num
	Si num <0 entonces
		num <-- -num
	Fin Si
	Repetir
		Escribir "Introduzca la posici�n de la que desee saber el d�gito: "
		Leer digito
	Hasta digito/num^10>0
	resultadoDivision <-- num div 10^(posicion-1)
	digito <-- resultado-resultado\10*10
	Escribir "El d�gito de la posici�n ",posicion," es el n�mero: ",digito
Fin Programa
*/
//Programa: DigitoPosicionDeNumero
//Autor: Antonio Sard Gonz�lez
public class DigitoPosicionDeNumero{
	public static void main(String[] args){
	//Entorno:
		int num, resultadoDivision;
		short auxPosicion, auxDigito;
		byte posicion, digito;
	//Algoritmo:
		System.out.print("Introduzca un n�mero: ");
		num=Leer.datoInt();
		if(num<0){
			num=-num;
		}//Fin Si
		do{
			System.out.print("Introduzca la posici�n de la que desee saber el d�gito: ");
			 auxPosicion=Leer.datoShort();
			 posicion=(byte)auxPosicion;
			 posicion=(byte)(posicion-1);
		}while((float)posicion/(float)Math.pow(10, posicion)<0F);
		resultadoDivision=num/(int)Math.pow(10, posicion);	
		auxDigito=(short)(resultadoDivision-resultadoDivision/10*10);
		digito=(byte)auxDigito;
		posicion=(byte)(posicion+1);
		System.out.print("El d�gito de la posici�n "+posicion+" es el n�mero: "+digito);
	}//Fin Programa
}
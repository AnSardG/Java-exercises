//Programa: Calculadora
//Autor: Antonio Sard Gonz�lez
public class Calculadora{
	public static void main(String[] args){
	//Entorno:
		float num1, num2, suma, resta, multiplicacion, divisionReal;
		int divisionEntera, resto;
	//Algoritmo:
		System.out.print("Introduzca el primer n�mero: "); 
		num1=Leer.datoFloat();
		System.out.print("Introduzca el segundo n�mero: ");
		num2=Leer.datoFloat();
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicaci�n: "+multiplicacion);
		if(num2==(float)0F){
			System.out.println("La divisi�n no existe.");
		}else{
			divisionReal=num1/num2;
			System.out.println("La divisi�n real es: "+divisionReal);
			if(num1/1 == num1/1 && num2/1==num2/1){
				divisionEntera=(int)(num1/num2);
				resto=(int)(num1%num2);
				System.out.println("La divisi�n entera es: "+divisionEntera);
				System.out.println("El resto de la divisi�n es: "+resto);
			}else{
				System.out.println("No existe divisi�n entera ni resto.");
			}//Fin Si
		}//Fin Si
	}//Fin Programa
}
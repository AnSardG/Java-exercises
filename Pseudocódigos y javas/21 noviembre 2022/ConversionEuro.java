/*



*/
//Programa: ConversionEuro
//Autor: Antonio Sard González
public class ConversionEuro{
	public static void main(String[] args){
	 //Entorno:
		//cantEuro es numérico real
		//cantDolar es numérico real
		//cantPeseta es numérico real
		//CONST VALORDOLAR es numérico real <-- 0.99
		//CONST VALORPESETA es numérico real <-- 166.386
		float cantEuro, cantDolar, cantPeseta;
		final float VALORDOLAR=0.99F;
		final float VALORPESETA=166.386F;
	 //Algoritmo:
		//Escribir "Introduzca una cantidad en euros: "
		//Leer cantEuro
		//cantDolar <-- cantEuro*VALORDOLAR
		//cantPeseta <-- cantEuro*VALORPESETA
		//Escribir cantEuro," euros son ",cantDolar," dólares y ",cantPeseta," Ptas."
		System.out.println("Introduzca una cantidad en euros: ");
		cantEuro=Leer.datoFloat();
		cantDolar=cantEuro*VALORDOLAR;
		cantPeseta=cantEuro*VALORPESETA;
		System.out.print(cantEuro+(" euros son ")+cantDolar+(" dólares y ")+cantPeseta+(" Ptas."));
	} //Fin Programa
}
/*



*/
//Programa: EuroDolarComision
//Autor: Antonio Sard González
public class EuroDolarComision{
	public static void main(String[] args){
	 //Entorno:
		//cantEuro es numérico real
		//cantDolar es numérico real
		//cantDolarComision es numérico real
		//CONST VALORDOLAR es numérico real <-- 0.99
		//CONST PORCENCOMISION es numérico real <-- 3
		float cantEuro, cantDolar, cantDolarComision;
		final float VALORDOLAR=0.99F;
		final float PORCENCOMISION=3F;
	 //Algoritmo:
		//Escribir "Introduzca una cantidad en euros a cambiar por dólares: "
		//Leer cantEuro
		//cantDolar <-- cantEuro*VALORDOLAR
		//cantDolarComision <-- (cantEuro-cantEuro*PORCENCOMISION/100)*VALORDOLAR
		//Escribir cantEuro," euros equivalen a ",cantDolar," dólares que corresponden a ",cantDolarComision," tras aplicar un ",PORCENCOMISION,"% de comisión."
		System.out.println("Introduzca una cantidad en euros a cambiar por dólares: ");
		cantEuro=Leer.datoFloat();
		cantDolar=cantEuro*VALORDOLAR;
		cantDolarComision=(cantEuro-cantEuro*PORCENCOMISION/100)*VALORDOLAR;
		System.out.print(cantEuro+(" euros equivalen a ")+cantDolar+(" dólares que corresponden a ")+cantDolarComision+(" tras aplicar un ")+PORCENCOMISION+("% de comisión."));
	} //Fin Programa
}
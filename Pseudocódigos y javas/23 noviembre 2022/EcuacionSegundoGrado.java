//Programa: EcuacionSegundoGrado
//Autor: Antonio Sard González
public class EcuacionSegundoGrado{
	public static void main(String[] args){
	//Entorno
		float numA, numB, numC, discriminante, resultadoSuma, resultadoResta;
	//Algoritmo
		do{
			System.out.print("Introduce un valor para la a (no puede ser 0): ");
			numA=Leer.datoFloat();
		}while(numA==0);
		System.out.print("Introduce un valor para la b: ");
		numB=Leer.datoFloat();
		System.out.print("Introduce un valor para la c: ");
		numC=Leer.datoFloat();
		discriminante=(float)Math.sqrt(Math.pow(numB, 2) - 4 * numA * numC);
		if(discriminante>=0){
			resultadoSuma=((0F - numB) + discriminante) / (2 * numA);
			resultadoResta=((0F - numB) - discriminante) / (2 * numA);
			System.out.print("Los dos posibles resultados para los valores de la ecuación introducidos son: "+resultadoSuma+" y "+resultadoResta+".");
		}else{
			System.out.print("No existen soluciones reales para los valores de la ecuación introducidos.");
		}//Fin Si
	} //Fin Programa
}


//Programa: Ej02
//Autor: Antonio Sard González
public class Ej02{
	public static void main(String[] args){
	//Entorno:
		final float PI=3.1416F;
		float radio;
	//Algoritmo:
		System.out.println("Los resultados se calcularán en centímetros.");
		do{
			System.out.print("Introduzca el radio del círculo "
                                + "(debe ser mayor que 0): ");
			radio=Leer.datoFloat();
		}while(radio<=0);
		System.out.print("La longitud del circulo es: "+(2F*PI*radio)+" cm."
                        + " El área del circulo es: "+(PI*(float)Math.pow(radio, 2))+" cm.");
	}//Fin Programa
}
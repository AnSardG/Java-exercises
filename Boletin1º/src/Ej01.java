//Programa: Ej01
//Autor: Antonio Sard González
public class Ej01{
	public static void main(String[] args){
	//Entorno:
		float base, altura, area;
	//Algoritmo:
		System.out.print("Debe introducir números de unidades equitativas.");
		do{
			System.out.print("Introduzca la base: ");
			base=Leer.datoFloat();
		}while(base<=0);
		do{
			System.out.print("Introduzca la altura: ");
			altura=Leer.datoFloat();
		}while(altura<=0);
		area=base*altura;
		System.out.println("El área del triángulo es: "+area);
	}//Fin Programa
}
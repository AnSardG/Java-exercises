/*
Programa: NotaCalificacion
Autor: Antonio Sard González
Entorno:
	nota es numérico real
Algoritmo:
	Repetir
		Escribir "Introduzca su nota: "
		Leer nota
	Hasta nota>=0 y nota<=10
	Si nota<6 entonces
		Si nota<3 entonces
			Escribir "MD"
		Sino
			Si nota<5 entonces
				Escribir "INS"
			Sino
				Escribir "SUF"
			Fin Si
		Fin Si
	Sino
		Si nota<7 entonces
			Escribir "BIEN"
		Sino
			Si nota<9 entonces
				Escribir "NOT"
			Sino
				Escribir "SOBR"	
			Fin Si
		Fin Si
	Fin Si
Fin Programa
*/
//Programa: NotaCalificacion
//Autor: Antonio Sard González
public class NotaCalificacion{
	public static void main(String[] args){
	//Entorno:
		float nota;
	//Algoritmo:
		do{
			System.out.print("Introduzca su nota: ");
			nota=Leer.datoFloat();
		}while(nota<0 || nota>10);
		if(nota<6){
			if(nota<3){
				System.out.print("MD");
			}else{
				if(nota<5){
					System.out.print("INS");
				}else{
					System.out.print("SUF");
				}//Fin Si
			}// Fin Si
		}else{
			if(nota<7){
				System.out.print("BIEN");
			}else{
				if(nota<9){
					System.out.print("NOT");
				}else{
					System.out.print("SOBR");
				}//Fin Si
			}//Fin Si
		}//Fin Si
	}//Fin Programa
}
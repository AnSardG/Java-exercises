/*
Programa: EjNotas
Autor: Antonio Sard González
Entorno:
	numAprobados, numSuspensos, numAlumnos es numérico entero
	porcenSuspenso, porcenAprobado, mediaNota es numérico real
	nota es alfanumérico(4)
Algoritmo:
	mediaNota <-- 0
	Para numAlumnos de 1 a 35 hacer
		Repetir
			Escribir "Introduzca la nota: "
			Leer nota
		Hasta nota="SOBR" o nota="NOT" o nota="BIEN" o nota="SUF" o nota="INS" o nota="MD" o nota=" "
		Si nota="SOBR" o nota="NOT" o nota="BIEN" o nota="SUF" entonces
			numAprobados++
			Si nota=""SOBR" entonces
				mediaNota<--mediaNota+9.5
			Sino
				Si nota="NOT" entonces
					mediaNota<--mediaNota+7.5
				Sino
					Si nota="BIEN" entonces
						mediaNota<--mediaNota+6
					Sino
						mediaNota<--mediaNota+5
					Fin Si
				Fin Si
			Fin Si
		Sino
			numSuspensos++
			Si nota="INS" entonces
				mediaNota<--mediaNota+4.5
			Sino
				Si nota="MD" entonces
					mediaNota<--mediaNota+3
				Fin Si
			Fin Si
		Fin Si
	Fin Para
	mediaNota<--mediaNota/(numAlumnos-1)
	Escribir "El número de aprobados es: ",numAprobados,". El número de suspensos es: ",numSuspensos,". El procentaje de aprobados es: ",porcenAprobado,". El porcentaje de suspensos es: ",porcenSuspenso,". La media del curso es: ",mediaNota
Fin Programa
*/
//Programa: EjNotas
//Autor: Antonio Sard González
public class EjNotas{
	public static void main(String[] args){
	//Entorno:
		short numAprobados, numSuspensos, numAlumnos;
		float porcenSuspenso, porcenAprobado, mediaNota;
		char nota;
	//Algoritmo:
		mediaNota=0F;
		for(numAlumnos=(short)1; numAlumnos=(short)35; numAlumnos++){
			do{
				Escribir "Introduzca la nota: "
				Leer nota
			}while(nota="SOBR" o nota="NOT" o nota="BIEN" o nota="SUF" o nota="INS" o nota="MD" o nota=" ")
			Si nota="SOBR" o nota="NOT" o nota="BIEN" o nota="SUF" entonces
				numAprobados++
				Si nota=""SOBR" entonces
					mediaNota<--mediaNota+9.5
				Sino
					Si nota="NOT" entonces
						mediaNota<--mediaNota+7.5
					Sino
						Si nota="BIEN" entonces
							mediaNota<--mediaNota+6
						Sino
							mediaNota<--mediaNota+5
						Fin Si
					Fin Si
				Fin Si
			Sino
				numSuspensos++
				Si nota="INS" entonces
					mediaNota<--mediaNota+4.5
				Sino
					Si nota="MD" entonces
						mediaNota<--mediaNota+3
					Fin Si
				Fin Si
			Fin Si
		}//Fin Para
		mediaNota<--mediaNota/(numAlumnos-1)
		Escribir "El número de aprobados es: ",numAprobados,". El número de suspensos es: ",numSuspensos,". El procentaje de aprobados es: ",porcenAprobado,". El porcentaje de suspensos es: ",porcenSuspenso,". La media del curso es: ",mediaNota
	}//Fin Programa
}
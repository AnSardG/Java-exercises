//Programa: Ej06
//Autor: Antonio Sard González
public class Ej06{
        public static byte leeByte(){
            //Entorno:
            short num;
            //Algoritmo:
            num=Leer.datoShort();
            while(num<Byte.MIN_VALUE || num>Byte.MAX_VALUE){
                System.out.print("Dato no válido. Teclee otro: ");
                num=Leer.datoShort();
            }//Fin Mientras
            return (byte) num;
        }//Fin Función
	public static void main(String[] args){
	//Entorno:
		byte hora;
	//Algoritmo:
		do{
			System.out.print("Introduzca una hora del día(no horas y minutos): ");
			hora=Ej06.leeByte();
		}while(hora < 0);
		hora=(byte)hora;
		if(hora >=0 && hora <=24){
			if(hora <=12){
				System.out.print("Buenos d�as.");
			}else{
				if(hora <=18){
					System.out.print("Buenas tardes");
				}else{
					System.out.print("Buenas noches");
				}//Fin Si
			}//Fin Si
		}else{
			System.out.print("Hora fuera de rango");
		}//Fin Si
	}//Fin Programa
}
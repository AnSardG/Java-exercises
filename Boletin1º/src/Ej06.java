//Programa: Ej06
//Autor: Antonio Sard González
public class Ej06 {

    public static void main(String[] args) {
        //Entorno:
        byte hora;
        //Algoritmo:
        do {
            System.out.print("Introduzca una hora del día (no horas y minutos): ");
            hora = Utilidades.leeByte();
        } while (hora < 0);
        hora = (byte) hora;
        if (hora >= 0 && hora <= 24) {
            if (hora <= 12) {
                System.out.print("Buenos días.");
            } else {
                if (hora <= 18) {
                    System.out.print("Buenas tardes");
                } else {
                    System.out.print("Buenas noches");
                }//Fin Si
            }//Fin Si
        } else {
            System.out.print("Hora fuera de rango");
        }//Fin Si
    }//Fin Programa
}
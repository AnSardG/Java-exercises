
import java.util.GregorianCalendar;

//Programa: Ej03
//Autor: Antonio Sard González
public class Ej03 {

    public static byte leeByte() {
        //Entorno:
        short num;
        //Algoritmo:
        num = Leer.datoShort();
        while (num > Byte.MAX_VALUE || num < Byte.MIN_VALUE) {
            System.out.print("Ese dato no es válido. Teclee otro: ");
            num = Leer.datoShort();
        }//Fin Mientras
        return (byte) num;
    }

    public static void main(String[] args) {
        //Entorno:
        byte horas, minutos, segundos;
        GregorianCalendar dia;
        //Algoritmo:
        dia = new GregorianCalendar();
        do {
            System.out.print("Introduzca la hora: ");
            horas = Ej03.leeByte();
        } while (horas < 0 || horas > 23);
        do {
            System.out.print("Introduzca los minutos: ");
            minutos = Ej03.leeByte();
        } while (minutos < 0 || minutos > 60);
        do {
            System.out.print("Introduzca los segundos: ");
            segundos = Ej03.leeByte();
        } while (segundos < 0 || segundos > 60);
        dia.set(GregorianCalendar.HOUR_OF_DAY, horas);
        dia.set(GregorianCalendar.MINUTE, minutos);
        dia.set(GregorianCalendar.SECOND, segundos);
        System.out.println("La hora " + dia.get(GregorianCalendar.HOUR_OF_DAY) + ":"
                + dia.get(GregorianCalendar.MINUTE) + ":" + dia.get(GregorianCalendar.SECOND)
                + " equivale a " + (dia.get(GregorianCalendar.MINUTE) * 60
                + dia.get(GregorianCalendar.HOUR_OF_DAY) * 3600
                + dia.get(GregorianCalendar.SECOND)) + " segundos.");
    }//Fin Programa
}
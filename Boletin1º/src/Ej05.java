
import java.util.GregorianCalendar;

//Programa: Ej05
//Autor: Antonio Sard González
public class Ej05 {

    public static byte leeByte() {
        //Entorno:
        short num;
        //Algoritmo:
        num = Leer.datoShort();
        while (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
            System.out.print("Dato incorrecto. Teclee otro dato: ");
            num = Leer.datoShort();
        }//Fin Mientras
        return (byte) num;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        byte meses;
        String anios;
        GregorianCalendar fechaHoy, fechaAnios;
        short auxAnios;
        int dias;
        //Algoritmo:
        System.out.print("Introduzca su edad en años: ");
        anios = Leer.dato();
        if (anios.length() > 3) {
            fechaHoy = new GregorianCalendar();
            fechaAnios = new GregorianCalendar(Integer.valueOf(anios.substring(0, 4))
                    .intValue() - 1, Integer.valueOf(anios.substring(5, 7)).intValue() + 1,
                    Integer.valueOf(anios.substring(8)).intValue());
            auxAnios = (short) (fechaHoy.get(GregorianCalendar.YEAR) - fechaAnios
                    .get(GregorianCalendar.YEAR));
            dias = auxAnios * 360 + fechaAnios.get(GregorianCalendar.MONTH) * 30;
        } else {
            auxAnios = Short.valueOf(anios).shortValue();
            do {
                System.out.print("Introduzca los meses: ");
                meses = Ej05.leeByte();
            } while (meses < 0 || meses > 12);
            dias = auxAnios * 360 + meses * 30;
        }//Fin Si    
        System.out.println("Su edad equivale a " + dias + " días.");
    }//Fin Programa
}
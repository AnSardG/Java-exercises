
import java.util.GregorianCalendar;

//Programa: Ej05
//Autor: Antonio Sard González
public class Ej05 {

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
                meses = Utilidades.leeByte();
            } while (meses < 0 || meses > 12);
            dias = auxAnios * 360 + meses * 30;
        }//Fin Si    
        System.out.println("Su edad equivale a " + dias + " días.");
    }//Fin Programa
}
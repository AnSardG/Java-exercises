
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class Practica4 {

    public static byte obtieneTotalDias(GregorianCalendar fecha) {
        return (byte) fecha.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }//Fin Función

    public static byte obtienePrimerDia(GregorianCalendar fecha) {
        return (byte) fecha.get(GregorianCalendar.DAY_OF_WEEK);
    }//Fin Función

    public static void pintaFecha(GregorianCalendar fecha) {
        //Entorno:
        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
            "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        //Algoritmo:
        System.out.println("");
        System.out.println("\t\tCALENDARIO " + meses[fecha.get(GregorianCalendar.MONTH)]
                + " DE " + fecha.get(GregorianCalendar.YEAR));
        System.out.println("");
    }//Fin Procedimiento

    public static void pintaCalendario(GregorianCalendar fecha) {
        //Entorno:    
        String linea;
        byte dia, semana, diaSemana, primerDia, totalDias;
        //Algoritmo:
        totalDias = Practica4.obtieneTotalDias(fecha);
        primerDia = Practica4.obtienePrimerDia(fecha);
        Practica4.pintaFecha(fecha);
        System.out.println("\tLU\tMA\tMI\tJU\tVI\tSA\tDO");
        linea = "";
        dia = 1;
        for (diaSemana = 1; diaSemana <= primerDia; diaSemana++) {
            linea += "\t";
        }//Fin Para
        for (diaSemana = primerDia; diaSemana <= 7; diaSemana++) {
            linea += " " + Byte.toString(dia) + "\t";
            dia++;
        }//Fin Para
        System.out.println(linea);
        linea = "\t";
        diaSemana = 1;
        while (dia < 10) {
            linea += " " + Byte.toString(dia) + "\t";
            dia++;
            diaSemana++;
        }//Fin Mientras
        for (diaSemana = diaSemana; diaSemana <= 7; diaSemana++) {
            linea += Byte.toString(dia) + "\t";
            dia++;
        }//Fin Para       
        System.out.println(linea);
        for (semana = 2; semana <= 3; semana++) {
            linea = "\t";
            for (diaSemana = 1; diaSemana <= 7; diaSemana++) {
                linea += Byte.toString(dia) + "\t";
                dia++;
            }//Fin Para
            System.out.println(linea);
        }//Fin Para
        if (dia <= totalDias) {
            linea = "\t";
            for (dia = dia; dia <= totalDias; dia++) {
                linea += Byte.toString(dia) + "\t";
            }//Fin Para
            System.out.println(linea);
        }//Fin Si
    }//Fin Procedimiento

    public static GregorianCalendar pideFecha() {
        //Entorno:
        byte mes;
        short anio;
        //Algoritmo:
        System.out.print("Mes: ");
        mes = Practica4.leeByte();
        while (mes < 1 || mes > 12) {
            System.out.print("Mes no válido. Introduzca un mes de 1 a 12: ");
            mes = Practica4.leeByte();
        }//Fin Mientras
        mes--;
        System.out.print("Año: ");
        anio = Leer.datoShort();
        while (anio < 46 || anio > 2123) {
            System.out.print("Año no válido. Introduzca un año válido [46-2123]: ");
            anio = Leer.datoShort();
        }//Fin Mientras
        return new GregorianCalendar(anio, mes, 7);
    }//Fin Función

    public static byte leeByte() {
        //Entorno:
        short num;
        //Algoritmo:
        num = Leer.datoShort();
        while (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
            System.out.print("Dato no válido. Teclee otro: ");
            num = Leer.datoShort();
        }//Fin Mientras
        return (byte) num;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        GregorianCalendar fecha;
        //Algoritmo:
        fecha = Practica4.pideFecha();
        Practica4.pintaCalendario(fecha);
    }//Fin Programa
}


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
        /*           
         Este caso se puede realizar creando una tabla de String, inicializando
         dicha tabla con los valores de cada mes ("ENERO", "FEBRERO", "MARZO"...) 
         e imprimiendo el mes según la posición de la tabla correspondiente 
         a este; al buscar otra solución que ocupase menos RAM, encontré el método          
         "getDisplayName()" en GregorianCalendar (heredado de Calendar) que realiza 
         lo mismo sin tener que inicializar y cargar ningún vector de objetos (String), 
         esta solución quizá ocuparía menos RAM pero supondría el uso de una clase
         que no se ha explicado ya que se tiene que pasar un "Locale" por parámetro,
         aun así veo interesante esta alternativa.                            
         */

        //Entorno:
        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO"
                , "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        //Algoritmo:
        System.out.println("\t\tCALENDARIO " + meses[fecha.get(GregorianCalendar.MONTH)]
                + " DE " + fecha.get(GregorianCalendar.YEAR));

        /*
         Segunda manera de formar la fecha descrita anteriormente (se debe importar
         la clase Locale de java.util): 
         
            //Entorno:
            Locale esp;
            //Algoritmo:
            esp = new Locale("es");
            Locale.setDefault(esp);
            System.out.println("\t\tCALENDARIO " + fecha.getDisplayName(GregorianCalendar.MONTH
            , GregorianCalendar.LONG, Locale.getDefault()).toUpperCase() 
            + " DE " + fecha.get(GregorianCalendar.YEAR));
         
         El método "setDefault()" de la clase Locale no modifica la región ni el
         idioma del ordenador anfitrión que ejecute el código, solo cambia la instancia
         actual de la JVM temporalmente, por lo tanto lo utilizamos para asegurar que el 
         mes esté siempre escrito en español en este caso.   
        */
    }//Fin Procedimiento

    public static void pintaCalendario(GregorianCalendar fecha) {
        //Entorno:    
        String linea;
        byte dia, semana, diaSemana, primerDia, totalDias;
        //Algoritmo:
        totalDias = Practica4.obtieneTotalDias(fecha);
        primerDia = Practica4.obtienePrimerDia(fecha);
        System.out.println("");
        Practica4.pintaFecha(fecha);
        System.out.println("");
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
            if (diaSemana > 7) {
                System.out.println(linea);
                linea = "\t";
                diaSemana = 1;
            }//Fin Si
        }//Fin Mientras        
        for (semana = 2; semana <= 4; semana++) {
            while (diaSemana <= 7) {
                linea += Byte.toString(dia) + "\t";
                dia++;
                diaSemana++;
            }//Fin Mientras
            diaSemana = 1;
            System.out.println(linea);
            linea = "\t";
        }//Fin Para
        if (dia <= totalDias) {
            while (dia <= totalDias) {
                linea += Byte.toString(dia) + "\t";
                dia++;
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
        while (anio < 46) {
            System.out.print("Año no válido. Introduzca un año válido [46-32.767]: ");
            anio = Leer.datoShort();
        }//Fin Mientras
        /*
          Instanciamos un objeto GregorianCalendar con los datos introducidos por el
          usuario y que comience en el día 7, esto lo hago para ahorrar varias preguntas
          en el resto de código ya que el método que devuelve el día de la semana 
          ("fecha.get(GregorianCalendar.DAY_OF_WEEK)") considera el domingo como 
          primer día.
           
          Para tratar la fecha de lunes a domingo instanciamos la fecha
          al día anterior de la siguiente semana; por ejemplo: si el mes comienza en
          domingo, el método anteriormente descrito devuelve "1", para que devuelva
          lo que nosotros queremos lo hemos creado en el séptimo dia, es decir, 
          el sábado de la siguiente semana, que efectivamente devuelve un "7" (el 
          valor del domingo para nosotros).
           
          Esta alternativa es solo posible ya que, al pintar por pantalla los días
          del calendario, no necesitamos utilizar métodos de GregorianCalendar (para ahorrar RAM).
         */
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

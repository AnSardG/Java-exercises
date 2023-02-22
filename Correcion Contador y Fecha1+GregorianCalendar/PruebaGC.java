import java.util.GregorianCalendar;
/**
 *
 * @author Administrador
 */
public class PruebaGC {
    public static void main(String[] args){
        //Entorno: 
        GregorianCalendar fecha;
        //Algoritmo:
        fecha=new GregorianCalendar();
        System.out.println(fecha.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println(fecha.get(GregorianCalendar.MONTH)+1);
        System.out.println(fecha.get(GregorianCalendar.YEAR));
    }//Fin Programa
}

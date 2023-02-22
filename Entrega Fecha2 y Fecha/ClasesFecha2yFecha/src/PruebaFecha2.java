
/**
 *
 * @author Antonio
 */
public class PruebaFecha2 {

    public static void main(String[] args) {
        //Entorno:
        Fecha2 cumpleLuis;
        byte dia, mes;
        short anio;
        //Algoritmo:
        cumpleLuis = new Fecha2();
        dia = 16;
        System.out.println("----------------");
        System.out.println("Prueba asignar fecha de hoy: ");
        System.out.println("----------------");
        cumpleLuis.asignarFecha();
        System.out.println("Cumpleaños de Luis (Fecha de hoy): ");
        cumpleLuis.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba asignar dia a la fecha: ");
        System.out.println("----------------");
        cumpleLuis.asignarFecha(dia);
        System.out.println("Cumpleaños de Luis (dia bien): ");
        cumpleLuis.mostrarFecha();
        dia = 32;
        mes = 13;
        System.out.println("Cumpleaños de Luis (dia mal): ");
        cumpleLuis.asignarFecha(dia);
        cumpleLuis.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba asignar dia y mes a la fecha: ");
        System.out.println("----------------");
        System.out.println("Cumpleaños de Luis (dia y mes mal): ");
        cumpleLuis.asignarFecha(dia, mes);
        cumpleLuis.mostrarFecha();
        mes=2;
        System.out.println("Cumpleaños de Luis (dia mal): ");
        cumpleLuis.asignarFecha(dia, mes);
        cumpleLuis.mostrarFecha();
        dia=16;
        mes=15;
        System.out.println("Cumpleaños de Luis (mes mal): ");
        cumpleLuis.asignarFecha(dia, mes);
        cumpleLuis.mostrarFecha();
        dia = 16;
        mes = 3;
        System.out.println("Cumpleaños de Luis (dia y mes bien): ");
        cumpleLuis.asignarFecha(dia, mes);
        cumpleLuis.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba asignar dia, mes y año a la fecha: ");
        System.out.println("----------------");
        dia = 32;
        mes = 13;
        anio = 1000;
        System.out.println("Cumpleaños de Luis (dia, mes, año mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        anio = 1991;
        System.out.println("Cumpleaños de Luis (dia y mes mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        mes = 3;
        System.out.println("Cumpleaños de Luis (dia mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        dia = 16;
        mes = 16;
        System.out.println("Cumpleaños de Luis (mes mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        anio = 1000;
        System.out.println("Cumpleaños de Luis (mes y año mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        dia = 32;
        mes = 15;
        anio=1991;
        System.out.println("Cumpleaños de Luis (día y mes mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        anio = 1000;
        mes = 3;
        System.out.println("Cumpleaños de Luis (día y año mal): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
        anio=1991;
        mes=2;
        dia=16;
        System.out.println("Cumpleaños de Luis (día, mes y año bien): ");
        cumpleLuis.asignarFecha(dia, mes, anio);
        cumpleLuis.mostrarFecha();
    }//Fin Programa
}

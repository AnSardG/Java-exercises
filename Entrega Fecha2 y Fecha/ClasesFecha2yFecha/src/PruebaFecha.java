
/**
 *
 * @author Antonio
 */
public class PruebaFecha {

    public static void main(String[] args) {
        //Entorno:
        Fecha cumple1, cumple2, cumple3, cumple4;
        byte dia, mes;
        short anio;
        //Algoritmo:
        cumple1 = new Fecha();
        System.out.println("----------------");
        System.out.println("Prueba constructor normal: ");
        System.out.println("----------------");
        System.out.println("Fecha de hoy: ");
        cumple1.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba constructor con día: ");
        System.out.println("----------------");
        System.out.println("Constructor día bien: ");
        dia = 16;
        cumple2 = new Fecha(dia);
        cumple2.mostrarFecha();
        System.out.println("Constructor día mal: ");
        dia = 32;
        cumple2 = new Fecha(dia);
        cumple2.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba constructor con día y mes: ");
        System.out.println("----------------");
        System.out.println("Constructor día y mes bien: ");
        dia = 16;
        mes = 2;
        cumple3 = new Fecha(dia, mes);
        cumple3.mostrarFecha();
        System.out.println("Constructor día mal: ");
        dia = 31;
        cumple3 = new Fecha(dia, mes);
        cumple3.mostrarFecha();
        System.out.println("Constructor mes mal: ");
        dia = 16;
        mes = 13;
        cumple3 = new Fecha(dia, mes);
        cumple3.mostrarFecha();
        System.out.println("Constructor dia y mes mal: ");
        dia = 31;
        mes = 13;
        cumple3 = new Fecha(dia, mes);
        cumple3.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba constructor con día, mes y año: ");
        System.out.println("----------------");
        System.out.println("Constructor día, mes y año bien: ");
        dia = 16;
        mes = 2;
        anio = 1991;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor día mal: ");
        dia = 31;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor mes mal: ");
        dia = 16;
        mes = 13;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor dia y mes mal: ");
        dia = 31;
        mes = 13;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor año mal: ");
        dia = 16;
        mes = 2;
        anio = 1400;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor día y año mal: ");
        dia = 32;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor mes y año mal: ");
        dia = 16;
        mes = 14;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("Constructor día, mes y año mal: ");
        dia = 32;
        anio = 1200;
        cumple4 = new Fecha(dia, mes, anio);
        cumple4.mostrarFecha();
        System.out.println("----------------");
    }//Fin Programa
}

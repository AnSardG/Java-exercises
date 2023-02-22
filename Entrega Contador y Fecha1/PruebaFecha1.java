/**
 *
 * @author Antonio
 */
public class PruebaFecha1 {
    public static void main(String[] args){
        //Entorno:
        Fecha1 cumpleLuis, cumpleAntonio;
        byte dia, mes;
        short anio;
        //Algoritmo:
        System.out.println("Fecha Luis: ");
        cumpleLuis=new Fecha1();
        System.out.println("Día: "+cumpleLuis.getDia()+". Mes: "+cumpleLuis.getMes()+". Año: "+cumpleLuis.getAnio());
        cumpleAntonio=new Fecha1();
        System.out.println("----------------");
        System.out.println("Fecha Antonio: ");
        dia=20;
        mes=11;
        anio=2000;
        cumpleAntonio.setFecha(dia, mes, anio);
        cumpleAntonio.mostrarFecha();
        if(Fecha1.esFechaCorrecta(dia, mes, anio)){
            System.out.println("Es una fecha correcta.");
        } else {
            System.out.println("Es una fecha incorrecta.");
        }//Fin Si
        System.out.println("----------------");
        System.out.println("Prueba fecha inválida: ");
        dia=31;
        mes=2;
        cumpleLuis.setFecha(dia, mes, anio);
        if(Fecha1.esFechaCorrecta(dia, mes, anio)){
            System.out.println("Es una fecha correcta.");
        } else {
            System.out.println("Es una fecha incorrecta.");
        }//Fin Si
        cumpleLuis.mostrarFecha();
        System.out.println("----------------");
        System.out.println("Prueba año bisiesto: ");
        if(Fecha1.esBisiesto(anio)){
            System.out.println("El año "+anio+" es bisiesto.");
        } else {
            System.out.println("El año "+anio+" no es bisiesto.");
        }//Fin Si
        anio=1991;
        if(Fecha1.esBisiesto(anio)){
            System.out.println("El año "+anio+" es bisiesto.");
        } else {
            System.out.println("El año "+anio+" no es bisiesto.");
        }//Fin Si
        dia=16;
        mes=3;
        System.out.println("----------------");
        System.out.println("Prueba fechas: ");
        cumpleLuis.setFecha(dia, mes, anio);
        System.out.println("Cumpleaños de Luis: ");
        cumpleLuis.mostrarFecha();
        System.out.println("Cumpleaños de Antonio: ");
        cumpleAntonio.mostrarFecha();
    }//Fin Programa
}

//Programa: Ej13
//Autor: Antonio Sard González
public class Ej13 {

    public static String opcion() {
        //Entorno:
        String opt;
        //Algoritmo:
        System.out.println("A. Longitud de la circunferencia.");
        System.out.println("B. Superficie de la circunferencia.");
        System.out.println("C. Volumen de la circunferencia.");
        System.out.println("D. Área de la circunferencia.");
        System.out.println("E. Salir");
        do {
            System.out.print("Elija opcion: ");
            opt = Leer.dato();
        } while (!opt.trim().toLowerCase().matches("[abcde]") || opt.isEmpty());
        return opt.trim().toLowerCase();
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        final float PI = 3.1416F;
        float radio, longitud, superficie, volumen, area;
        String opcion;
        //Algoritmo:

        do {
            do {
                System.out.print("Introduzca el radio de la circunferencia "
                        + "(debe ser distinto de 0): ");
                radio = Leer.datoFloat();
            } while (radio <= 0);
            opcion = Ej13.opcion();
            if (!"e".equals(opcion)) {
                if ("a".equals(opcion)) {
                    longitud = PI * radio * 2;
                    System.out.println("La longitud de la circunferencia es: "
                            + longitud);
                } else {
                    if ("b".equals(opcion)) {
                        superficie = PI * (float) Math.pow(radio, 2);
                        System.out.println("La superficie de la circunferencia es: "
                                + superficie);
                    } else {
                        if ("c".equals(opcion)) {
                            volumen = (PI * (float) Math.pow(radio, 3) * 4) / 3;
                            System.out.println("El volumen de la circunferencia es: "
                                    + volumen);
                        } else {
                            if ("d".equals(opcion)) {
                                area = PI * (float) Math.pow(radio, 2) * 4;
                                System.out.print("El área de la circunferencia es: "
                                        + area);
                            }//Fin Si
                        }//Fin Si
                    }//Fin Si
                }//Fin Si
            }//Fin Si
        } while (!"e".equals(opcion) && Utilidades.continuar());
    }//Fin Programa
}
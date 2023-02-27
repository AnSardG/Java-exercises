//Programa: Ej13
//Autor: Antonio Sard González
public class Ej13 {

    public static void main(String[] args) {
        //Entorno:
        final float PI = 3.1416F;
        float radio, longitud, superficie, volumen, area;
        char opcion;
        //Algoritmo:
        System.out.println("A. Longitud de la circunferencia.");
        System.out.println("B. Superficie de la circunferencia.");
        System.out.println("C. Volumen de la circunferencia.");
        System.out.println("D. Área de la circunferencia.");
        System.out.println("E. Salir");
        do {
            System.out.print("Elija opcion: ");
            opcion = Leer.datoChar();
        } while (opcion != 'a' && opcion != 'b' && opcion != 'c' && opcion != 'd'
                && opcion != 'e' && opcion != 'A' && opcion != 'B' && opcion != 'C' 
                && opcion != 'D' && opcion != 'E');
        if (opcion != 'E' && opcion != 'e') {
            do {
                System.out.print("Introduzca el radio de la circunferencia "
                        + "(debe ser distinto de 0): ");
                radio = Leer.datoFloat();
            } while (radio <= 0);
            switch (opcion) {
                case 'A':
                case 'a':
                    longitud = PI * radio * 2;
                    System.out.print("La longitud de la circunferencia es: " 
                            + longitud);
                    break;
                case 'B':
                case 'b':
                    superficie = PI * (float) Math.pow(radio, 2);
                    System.out.print("La superficie de la circunferencia es: " 
                            + superficie);
                    break;
                case 'C':
                case 'c':
                    volumen = (PI * (float) Math.pow(radio, 3) * 4) / 3;
                    System.out.print("El volumen de la circunferencia es: " 
                            + volumen);
                    break;
                case 'D':
                case 'd':
                    area = PI * (float) Math.pow(radio, 2) * 4;
                    System.out.print("El área de la circunferencia es: " + area);
                    break;
            }//Fin Seg�n Sea
        }//Fin Si
    }//Fin Programa
}
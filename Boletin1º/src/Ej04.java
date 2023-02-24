//Programa: Ej04
//Autor: Antonio Sard González
public class Ej04 {

    public static void main(String[] args) {
        //Entorno:
        final float PI = 3.1416F;
        float radio;
        //Algoritmo:
        do {
            System.out.print("Introduzca un radio mayor que 0: ");
            radio = Leer.datoFloat();
        } while (radio <= 0);
        System.out.println("El volumen de la esfera es: " 
                + (4F / 3 * PI * (float) Math.pow(radio, 3)) 
                + ". El área de la esfera es: " + (4F * PI * radio * 2));
    }//F
}
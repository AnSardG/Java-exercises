//Programa: Ej25
//Autor: Antonio Sard González
public class Ej25 {

    public static void main(String[] args) {
        //Entorno:
        String tecla;
        byte num;
        //Algoritmo:
        for (num = 1; num <= 100; num++) {
            System.out.println(num);
            if (num % 20 == 0) {
                System.out.println("Pulse una tecla para continuar");
                tecla = Leer.dato();
                tecla = tecla + tecla;
                System.out.println(tecla);
            }//Fin Si

        }//Fin Para
    }//Fin Programa
}
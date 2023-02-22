public class Pruebas {
    public static void main(String[] args){
    //Entorno
        int num;
    //Algoritmo:
        System.out.print("Introduzca un numero: ");
        num=Leer.datoInt();
        System.out.print("El numero "+num+" tiene "+Utilidades.cifras(num)+" cifras.");
    }//Fin Programa
}

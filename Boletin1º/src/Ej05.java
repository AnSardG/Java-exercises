//Programa: Ej05
//Autor: Antonio Sard González
public class Ej05 {
    public static byte leeByte(){
        //Entorno:
        short num;
        //Algoritmo:
        num=Leer.datoShort();
        while(num<Byte.MIN_VALUE || num > Byte.MAX_VALUE){
            System.out.print("Dato incorrecto. Teclee otro dato: ");
            num=Leer.datoShort();
        }//Fin Mientras
        return (byte) num;
    }
    public static void main(String[] args) {
        //Entorno:
        byte meses, anios;
        int dias;
        //Algoritmo:
        do {
            System.out.print("Introduzca su edad en a�os: ");
            anios = Ej05.leeByte();
            if (anios > 150) {
                System.out.print("Debe introducir la cantidad de años que tiene,"
                        + " no el año en el que nació.");
            }//Fin Si
        } while (anios < 0 || anios > 150);
        do {
            System.out.print("Introduzca los meses: ");
            meses = Ej05.leeByte();
        } while (meses < 0 || meses > 12);
        dias = anios * 360 + meses * 30;
        System.out.print("Su edad equivale a " + dias + " días.");
    }//Fin Programa
}
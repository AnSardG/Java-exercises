
/**
 *
 * @author Antonio Sard González
 */
public class Ej11 {

    public static boolean deseaContinuar() {
        //Entorno:
        String opcion;
        //Algoritmo
        do {
            System.out.print("¿Desea continuar? (S/N): ");
            opcion = Leer.dato();
        } while (!opcion.matches("[sSnN]"));
        return "S".equals(opcion) || "s".equals(opcion);
    }//Fin Función

    public static byte sacaPosicion(int[] v, int num, byte total) {
        //Entorno:
        byte pos;
        //Algoritmo:
        pos = 0;
        while (pos < total && num >= v[pos]) {
            pos++;
        }
        return pos;
    }//Fin Función

    public static void muestraTabla(int[] v, byte total) {
        //Entorno:
        byte i;
        String linea;
        //Algoritmo:
        linea = "";
        for (i = 0; i <= total; i++) {
            linea += v[i] + "\t";
        }//Fin Para
        System.out.println(linea);
    }

    public static int[] desplazaTabla(int[] v, int num, byte pos, byte i) {
        //Entorno:
        byte total;
        for (total = i; total > pos; total--) {
            v[total] = v[total - 1];
        }
        v[pos] = num;
        return v;
    }//Fin Procedimiento

    public static void main(String[] args) {
        //Entorno:
        int[] numero;
        byte i, pos;
        int num;
        //Algoritmo:
        numero = new int[50];
        i = 0;
        System.out.print("Número " + (i + 1) + ": ");
        numero[i] = Leer.datoInt();
        while (i < numero.length && Ej11.deseaContinuar()) {
            i++;
            System.out.print("Número " + (i + 1) + ": ");
            num = Leer.datoInt();
            pos = Ej11.sacaPosicion(numero, num, i);
            numero = Ej11.desplazaTabla(numero, num, pos, i);
        }//Fin Mientras
        Ej11.muestraTabla(numero, i);
    }//Fin Programa
}

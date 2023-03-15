
public class Utilidades {

    public static byte cifras(int num) {
        //Entorno:
        byte cif;
        //Algoritmo:
        cif = 1;
        while (num >= Math.pow(10, cif)) {
            cif++;
        }//Fin Mientras
        return cif;
    }//Fin Función

    public static boolean continuar() {
        //Entorno:
        String opcion;
        //Algoritmo:
        do {
            System.out.print("¿Desea continuar?(s/n):");
            opcion = Leer.dato();
        } while ("sSnN".indexOf(opcion)<0 || opcion.isEmpty());
        return "s".equals(opcion.toLowerCase());
    }//Fin Función

    public static boolean esFechaValida(byte d, byte m, short a) {
        //Entorno:
        boolean esValida;
        byte[] mes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //Algoritmo:
        esValida = false;
        if (a >= 1582 && a <= 2023) {
            if (d >= 1) {
                if (m == mes[2]) {
                    if (esBisiesto(a)) {
                        if (d <= 29) {
                            esValida = true;
                        }//Fin Si
                    } else {
                        if (d <= 28) {
                            esValida = true;
                        }//Fin Si
                    }//Fin Si
                } else {
                    if (m == mes[4] || m == mes[6] || m == mes[9] || m == mes[11]) {
                        if (d <= 30) {
                            esValida = true;
                        }//Fin Si
                    } else {
                        if (m == mes[1] || m == mes[3] || m == mes[5] || m == mes[7]
                                || m == mes[8] || m == mes[10] || m == mes[12]) {
                            if (d <= 31) {
                                esValida = true;
                            }//Fin Si 
                        }
                    }//Fin Si
                }//Fin Si
            }//Fin Si
        }//Fin Si
        return esValida;
    }//Fin Función

    public static boolean esBisiesto(short a) {
        //Entorno:
        boolean esBisies;
        //Algoritmo:
        esBisies = false;
        if (a >= 1582 && a <= 2100) {
            if (a % 4 == 0 && (!(a % 100 == 0) || a % 400 == 0)) {
                esBisies = true;
            }//Fin Si
        }//Fin Si
        return esBisies;
    }//Fin Función

    public static byte sacaDigito(int n, byte p) {
        //Entorno:
        byte digito, div;
        int auxNum;
        //Algoritmo:
        div = (byte) (cifras(n) - p);
        if (div <= 0) {
            System.out.print("Ha introducido una posición incorrecta (el número tiene menos dígitos).");
            digito = 0;
        } else {
            n = n / (int) Math.pow(10, div);
            auxNum = n / 10 * 10;
            digito = (byte) (n - auxNum);
        }//Fin Si
        return digito;
    }//Fin Función

    public static int invierte(int n) {
        //Entorno:
        int num, auxNum;
        byte pos;
        //Algoritmo:
        num = 0;
        for (pos = cifras(n); pos >= 1; pos--) {
            auxNum = n / 10 * 10;
            num = num + (n - auxNum) * (int) Math.pow(10, pos);
            n = n / 10;
        }//Fin Para
        num = num / 10;
        return num;
    }//Fin Función

    public static boolean esCapicua(int n) {
        //Entorno:
        boolean esCap;
        int numDcha;
        byte numIzq, digitoDcha, digitoIzq;
        //Algoritmo:
        esCap = true;
        digitoDcha = (byte) (cifras(n) - 1);
        digitoIzq = 1;
        numDcha = n;
        while (digitoDcha > digitoIzq && esCap) {
            numIzq = (byte) ((n / (int) Math.pow(10, digitoDcha)) % 10);
            if (numDcha % 10 != numIzq) {
                esCap = false;
            }//Fin Si
            numDcha = numDcha / 10;
            digitoDcha--;
            digitoIzq++;
        }//Fin Mientras
        return esCap;
    }//Fin Función
    
    public static boolean esCapicuaCadena(int n){
        //Entorno:
        String str;
        byte izq, dcha;
        //Algoritmo:
        str = Integer.toString(n);
        dcha = (byte) (str.length() - 1);
        izq = 0;
        str += " ";
        while(izq < dcha && str.substring(izq, izq+1).equals(str.substring(dcha, dcha+1))){
            izq++;
            dcha++;
        }
        return izq<=dcha;
    }//Fin Funci�n
    public static byte leeByte(){
            //Entorno:
            short num;
            //Algoritmo:
            num=Leer.datoShort();
            while(num<Byte.MIN_VALUE || num>Byte.MAX_VALUE){
                System.out.print("Dato no válido. Teclee otro: ");
                num=Leer.datoShort();
            }//Fin Mientras
            return (byte) num;
        }//Fin Función
}
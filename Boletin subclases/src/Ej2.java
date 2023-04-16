
import Electrodomesticos.*;

/**
 *
 * @author Antonio Sard González
 */
public class Ej2 {
    
    public static void muestraPrecios(Electrodomestico[] electrodomesticos, byte numElectrodomesticos){
        //Entorno:
        byte i;        
        float precioTotal, precioLavadoras, precioTelevisiones;
        //Algoritmo:
        precioTotal = 0;
        precioLavadoras = 0;
        precioTelevisiones = 0;
        for (i = 0; i < numElectrodomesticos; i++) {
            electrodomesticos[i].precioFinal();
            precioTotal += electrodomesticos[i].getPrecioBase();
            if (electrodomesticos[i] instanceof Television) {
                precioTelevisiones += electrodomesticos[i].getPrecioBase();
            } else if (electrodomesticos[i] instanceof Lavadora) {
                precioLavadoras += electrodomesticos[i].getPrecioBase();
            }//Fin Si
        }//Fin Para
        System.out.println("Precio de todos los electrodomésticos: " + precioTotal + "€.");
        System.out.println("Precio de todas las lavadoras: " + precioLavadoras + "€.");
        System.out.println("Precio de todos las televisiones: " + precioTelevisiones + "€.");
    }
    
    public static Electrodomestico creaElectrodomestico() {
        //Entorno:
        Electrodomestico e;
        float precio, peso;
        String color, opDatos;
        char consumo;
        //Algoritmo:
        opDatos = Ej2.pideCuantosDatos();
        if (opDatos.equals("a") || opDatos.equals("t")) {
            do {
                System.out.print("Introduzca el precio base: ");
                precio = Leer.datoFloat();
            } while (precio < 0);
            do {
                System.out.print("Introduzca el peso: ");
                peso = Leer.datoFloat();
            } while (peso < 1);
            if (opDatos.equals("t")) {
                System.out.print("Introduzca el color (blanco, negro, rojo, azul o gris): ");
                color = Leer.dato();
                System.out.print("Introduzca el consumo energético: ");
                consumo = Leer.datoChar();
                e = new Electrodomestico(precio, color, consumo, peso);
            } else {
                e = new Electrodomestico(precio, peso);
            }//Fin Si
        } else {
            e = new Electrodomestico();
        }//Fin Si
        return e;
    }

    public static Lavadora creaLavadora() {
        //Entorno:
        Lavadora l;
        float precio, peso, carga;
        String color, opDatos;
        char consumo;
        //Algoritmo:
        opDatos = Ej2.pideCuantosDatos();
        if (opDatos.equals("a") || opDatos.equals("t")) {
            do {
                System.out.print("Introduzca el precio base: ");
                precio = Leer.datoFloat();
            } while (precio < 0);
            do {
                System.out.print("Introduzca el peso: ");
                peso = Leer.datoFloat();
            } while (peso < 1);
            if (opDatos.equals("t")) {
                System.out.print("Introduzca el color (blanco, negro, rojo, azul o gris): ");
                color = Leer.dato();
                System.out.print("Introduzca el consumo energético: ");
                consumo = Leer.datoChar();
                do {
                    System.out.print("Introduzca la carga: ");
                    carga = Leer.datoFloat();
                } while (carga < 1);
                l = new Lavadora(precio, color, consumo, peso, carga);
            } else {
                l = new Lavadora(precio, peso);
            }//Fin Si
        } else {
            l = new Lavadora();
        }//Fin Si
        return l;
    }

    public static Television creaTelevision() {
        //Entorno:
        Television t;
        float precio, peso;
        String color, opDatos, op;
        char consumo;
        short resolucion;
        boolean sintonizador;
        //Algoritmo:
        opDatos = Ej2.pideCuantosDatos();
        if (opDatos.equals("a") || opDatos.equals("t")) {
            do {
                System.out.print("Introduzca el precio base: ");
                precio = Leer.datoFloat();
            } while (precio < 0);
            do {
                System.out.print("Introduzca el peso: ");
                peso = Leer.datoFloat();
            } while (peso < 1);
            if (opDatos.equals("t")) {
                System.out.print("Introduzca el color (blanco, negro, rojo, azul o gris): ");
                color = Leer.dato();
                System.out.print("Introduzca el consumo energético: ");
                consumo = Leer.datoChar();
                System.out.print("Introduzca su resolución en pulgadas: ");
                resolucion = Leer.datoShort();
                do {
                    System.out.print("¿Tiene sintetizador?[S/N]: ");
                    op = Leer.dato();
                } while ("SsNn".indexOf(op) < 0);
                sintonizador = op.toLowerCase().equals("s");
                t = new Television(precio, color, consumo, peso, resolucion, sintonizador);
            } else {
                t = new Television(precio, peso);
            }//Fin Si
        } else {
            t = new Television();
        }//Fin Si
        return t;
    }

    public static String pideCuantosDatos() {
        //Entorno:
        String opDatos;
        //Algoritmo:
        System.out.print("¿Quiere introducir todos los datos ('T')"
                + ", precio base y peso ('A'), o ninguno ('N')?: ");
        opDatos = Leer.dato();
        while (opDatos.isEmpty() || "TtAaNn".indexOf(opDatos) < 0) {
            System.out.print("Dato no válido. Introduzca un dato válido [T/A/N]: ");
            opDatos = Leer.dato();
        }//Fin Mientras
        return opDatos.toLowerCase();
    }

    public static String pideElectrodomestico() {
        //Entorno:
        String op;
        //Algoritmo:
        System.out.print("¿Que electrodoméstico desea introducir? "
                + "(En caso de ser una lavadora introducir 'L', en caso de ser "
                + "una televisión introducir 'T', de otra forma introducir 'E'): ");
        op = Leer.dato();
        while (op.isEmpty() || "TtLlEe".indexOf(op) < 0) {
            System.out.print("Dato no válido. Introduzca un dato válido [E/L/T]: ");
            op = Leer.dato();
        }//Fin Mientras
        return op.toUpperCase();
    }

    public static void main(String[] args) {
        //Entorno:
        Electrodomestico[] electrodomesticos;
        byte numElectrodomesticos;
        String tipoElectrodomestico;
        //Algoritmo:
        electrodomesticos = new Electrodomestico[10];
        numElectrodomesticos = 0;
        do {
            tipoElectrodomestico = Ej2.pideElectrodomestico();
            switch (tipoElectrodomestico) {
                case "E":
                    electrodomesticos[numElectrodomesticos] = Ej2.creaElectrodomestico();
                    break;
                case "L":
                    electrodomesticos[numElectrodomesticos] = Ej2.creaLavadora();
                    break;
                case "T":
                    electrodomesticos[numElectrodomesticos] = Ej2.creaTelevision();
                    break;
            }//Fin Según Sea
            numElectrodomesticos++;
        } while (Utilidades.continuar() && numElectrodomesticos < 10);
        Ej2.muestraPrecios(electrodomesticos, numElectrodomesticos);
    }//Fin Programa
}

package Cuentas;


import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaCorrienteConIn extends CuentaCorriente {
    //Atributos:

    private final double SALDOMINIMO = 3000;
    //Constructores:

    public CuentaCorrienteConIn() {
    }

    public CuentaCorrienteConIn(String nombre, String apellidos, String entidad, 
            String sucursal, String dc, String numero, double saldo, double tipoDeInteres,
            double importePorTrans, int transExentas) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres, importePorTrans, transExentas);
    }
    //Métodos:

    @Override
    public double intereses() {
        //Entorno:
        GregorianCalendar date;
        double importe;
        //Algoritmo:
        date = new GregorianCalendar();
        importe = 0;
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1 && estado() >= SALDOMINIMO) {
            importe = getTipoDeInteres() / 100 * 12 * estado();     
            ingreso(importe);
            decrementarTransacciones();
        }//Fin Si
        return importe;
    }//Fin Método
}

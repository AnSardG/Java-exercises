package Cuentas;


import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaCorriente extends Cuenta {
    //Atributos:

    private int transacciones, transExentas;
    private double importePorTrans;
    //Constructores:

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String apellidos, String entidad, String sucursal,
            String dc, String numero, double saldo, double tipoDeInteres, double importePorTrans,
            int transExentas) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres);
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }
    //Métodos:

    protected void decrementarTransacciones() {
        transacciones--;
    }//Fin Método

    /**
     * @return the transExentas
     */
    public int getTransExentas() {
        return transExentas;
    }//Fin Método

    /**
     * @param transExentas the transExentas to set
     */
    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }//Fin Método

    /**
     * @return the importePorTrans
     */
    public double getImportePorTrans() {
        return importePorTrans;
    }//Fin Método

    /**
     * @param importePorTrans the importePorTrans to set
     */
    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }//Fin Método

    @Override
    public void ingreso(double cantidad) {
        super.ingreso(cantidad);
        transacciones++;
    }//Fin Método

    @Override
    public boolean reintegro(double cantidad) {
        //Entorno:
        boolean saldoSuficiente;
        //Algoritmo:
        saldoSuficiente = super.reintegro(cantidad);
        if (saldoSuficiente) {
            transacciones++;
        }//Fin Si
        return saldoSuficiente;
    }//Fin Método

    @Override
    public void comisiones() {
        //Entorno:
        GregorianCalendar date;
        //Algoritmo:
        date = new GregorianCalendar();
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1 && transacciones - transExentas > 0) {
            reintegro((transacciones - transExentas) * importePorTrans);
            transacciones = 0;
        }//Fin Si
    }//Fin Método

    @Override
    public double intereses() {
        //Entorno:
        GregorianCalendar date;
        double importe;
        //Algoritmo:
        date = new GregorianCalendar();
        importe = 0;
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            if (estado() <= 3000) {
                importe = 0.005 * 12 * estado();
            } else {
                importe = 3000 * 0.5 / 1200.0 + getTipoDeInteres() / 100 * 12 * (estado() - 3000);
            }//Fin Si            
            ingreso(importe);
            decrementarTransacciones();
        }//Fin Si
        return importe;
    }//Fin Método
}

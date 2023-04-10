package Cuentas;


import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaAhorro extends Cuenta {
    //Atributos:

    private double cuotaMantenimiento;

    //Constructores:
    public CuentaAhorro() {
    }

    public CuentaAhorro(String nombre, String apellidos, String entidad, String sucursal, 
            String dc, String numero, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres);
        this.setCuotaMantenimiento(cuotaMantenimiento);
    }

    //Métodos:
    /**
     * @return the cuotaMantenimiento
     */
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }//Fin Método

    /**
     * @param cuotaMantenimiento the cuotaMantenimiento to set
     */
    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        if(cuotaMantenimiento > 0){
            this.cuotaMantenimiento = cuotaMantenimiento;
        }//Fin Si        
    }//Fin Método

    @Override
    public void comisiones() {
        //Entorno:
        GregorianCalendar date;
        //Algoritmo:
        date = new GregorianCalendar();
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            reintegro(cuotaMantenimiento);
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
            importe = getTipoDeInteres() / 100 * 12 * estado();
        }//Fin Si
        return importe;
    }//Fin Método
}

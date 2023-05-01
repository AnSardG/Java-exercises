package Cuentas;


import java.util.GregorianCalendar;

/**
 * <P>La clase Cuenta de Ahorro permite crear un objeto de tipo Cuenta Bancaria con
 * una cuota de mantenimiento.</P>
 * <P></P><P>Esta cuota la cobrará la entidad bancaria por el mantenimiento de la cuenta.</P>
 
 * @author Antonio Sard González
 * @version 1.0
 * @since 10-04-2023
 */
public class CuentaAhorro extends Cuenta {
    //Atributos:
    /**
     * <P>El dato decimal de doble precisión correspondiente a la cuota de mantenimiento de esta cuenta.</P>
     */
    private double cuotaMantenimiento;

    //Constructores:
    /**
     * <P>Constructor por defecto de Cuenta de Ahorro.</P>
     */
    public CuentaAhorro() {
    }

    /**
     * <P>Construye un objeto <B>CuentaAhorro</B> con todas las características base
     * de la superclase <B>Cuenta</B>.</P>
     * <P></P><P>Adicionalmente debe pasarse por parámetro la cuota de mantenimiento
     * inicial que va a tener esta cuenta.</P>
     * @param nombre nombre del propietario de la cuenta a crear.
     * @param apellidos apellidos del propietario de la cuenta a crear.
     * @param entidad dígitos correspondientes a la entidad bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param sucursal dígitos correspondientes a la sucursal bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param dc dígitos de control correspondientes a la cuenta a crear, siendo estos 2 dígitos.
     * @param numero número correspondiente de la cuenta a crear, siendo este de 10 dígitos.
     * @param saldo cantidad de saldo inicial de la cuenta a crear.
     * @param tipoDeInteres tipo de interés en porcentaje de la cuenta a crear.
     * @param cuotaMantenimiento cuota de mantenimiento en procentaje de la cuenta a crear.
     */
    public CuentaAhorro(String nombre, String apellidos, String entidad, String sucursal, 
            String dc, String numero, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres);
        this.setCuotaMantenimiento(cuotaMantenimiento);
    }

    //Métodos:
    /**
     * Devuelve un decimal de doble precisión equivalente al valor de la cuota de mantenimiento anual de esta cuenta. 
     * @return la cuota de mantenimiento anual de esta cuenta.
     */
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }//Fin Método

    /**
     * Modifica la cuota de mantenimiento actual de la cuenta por el decimal de doble precisión pasado por parámetro.
     * @param cuotaMantenimiento la cuota de mantenimiento anual a cambiar.
     */
    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        if(cuotaMantenimiento > 0){
            this.cuotaMantenimiento = cuotaMantenimiento;
        }//Fin Si        
    }//Fin Método

    /**
     * <P>Se ejecutará los días uno de cada mes para cobrar el importe del mantenimiento mensual 
     * de esta cuenta.</P>
     * <P></P><P>Este importe se calculará mediante la cuota de mantenimiento anual actual.</P>
     */
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

    /**
     * <P>Calcula los intereses mensuales producidos en esta cuenta bancaria.</P>
     * <P></P><P>Solamente podrá realizarse dicho cálculo el día 1 de cada mes, sabiendo
     * que el tipo de interés es anual.</P>
     * @return el interés mensual producido.
     */
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

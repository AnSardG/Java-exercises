package Cuentas;


import java.util.GregorianCalendar;

/**
 * <P>La clase Cuenta Corriente permite crear un objeto de tipo Cuenta Bancaria con
 * un importe por transacción correspondiente.</P>
 * <P></P><P>A su vez podrán incluirse transacciones exentas por parte de la entidad bancaria,
 * así como el número de transacciones realizadas cada mes.</P>
 
 * @author Antonio Sard González
 * @version 1.0
 * @since 10-04-2023
 */
public class CuentaCorriente extends Cuenta {
    //Atributos:
    /**
     * Cantidad de transacciones realizadas mensualmente de esta cuenta.
     */
    private int transacciones;
    /**
     * Cantidad de transacciones exentas de importe de esta cuenta.
     */
    private int transExentas;
    /**
     * Importe decimal de doble precisión por cada transacción realizada en esta cuenta.
     */
    private double importePorTrans;
    //Constructores:

    /**
     * Constructor por defecto
     */
    public CuentaCorriente() {
    }

    /**
     * <P>Construye un objeto <B>CuentaCorriente</B> con todas las características base de la superclase <B>Cuenta</B>.</P> 
     * <P></P><P>A su vez se creará con un importe inicial por transacción y una cantidad de transacciones exentas.</P>
     * @param nombre nombre del propietario de la cuenta a crear.
     * @param apellidos apellidos del propietario de la cuenta a crear.
     * @param entidad dígitos correspondientes a la entidad bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param sucursal dígitos correspondientes a la sucursal bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param dc dígitos de control correspondientes a la cuenta a crear, siendo estos 2 dígitos.
     * @param numero número correspondiente de la cuenta a crear, siendo este de 10 dígitos.
     * @param saldo cantidad de saldo inicial de la cuenta a crear.
     * @param tipoDeInteres tipo de interés en porcentaje de la cuenta a crear.
     * @param importePorTrans importe por transacción de la cuenta a crear.
     * @param transExentas cantidad de transacciones exentas de la cuenta a crear.
     */
    public CuentaCorriente(String nombre, String apellidos, String entidad, String sucursal,
            String dc, String numero, double saldo, double tipoDeInteres, double importePorTrans,
            int transExentas) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres);
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }
    //Métodos:

    /**
     * Método protegido que permite decrementar en uno las transacciones efectuadas en esta cuenta cada vez que sea ejecutado.
     */
    protected void decrementarTransacciones() {
        transacciones--;
    }//Fin Método

    /**
     * Devuelve un número entero equivalente a la cantidad de transacciones exentas actuales de esta cuenta.
     * @return las transacciones exentas de esta cuenta bancaria.
     */
    public int getTransExentas() {
        return transExentas;
    }//Fin Método

    /**
     * Modifica las transacciones exentas actuales a las indicadas por parámetro.
     * @param transExentas las transacciones exentas a cambiar.
     */
    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }//Fin Método

    /**
     * Devuelve un decimal de doble precisión equivalente al importe por transacción de esta cuenta.
     * @return el importe por transacción en número decimal.
     */
    public double getImportePorTrans() {
        return importePorTrans;
    }//Fin Método

    /**
     * Modifica el importe por transacción actual de esta cuenta al decimal de doble precisión indicado por parámetro.
     * @param importePorTrans the importePorTrans to set
     */
    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }//Fin Método

    /**
     * <P>Añade la cantidad especificada por parámetro en decimal de doble precisión a esta cuenta.</P>
     * <P></P>
     * <P>La cantidad nunca podrá ser negativa. Cada vez que se ejecute se sumará una transacción al total de transacciones actuales de esta cuenta corriente.</P>
     * @param cantidad la cantidad a ingresar a la cuenta.
     */
    @Override
    public void ingreso(double cantidad) {
        super.ingreso(cantidad);
        transacciones++;
    }//Fin Método

    /**
     * <P>Devuelve <B>true</B> si esta cuenta tiene saldo suficiente y resta la cantidad especificada del saldo actual de la cuenta.</P>
     * <P></P>
     * <P>En caso de haberse realizado el reintegro, se sumará una transacción al total de transacciones actual de esta cuenta corriente.</P>
     * <P>En caso de no haber saldo suficiente, devolverá falso y no se producirá dicha resta.</P>
     * @param cantidad la cantidad a deducir de la cuenta.
     * @return el valor <B>boolean</B> de la operación.
     */
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

    /**
     *<P>Se ejecutará los días uno de cada mes para cobrar el importe del mantenimiento mensual de esta cuenta corriente.</P>
     * <P></P>
     * <P>Se restará a las transacciones actuales las transacciones exentas de esta cuenta corriente y pondrá a 0 el número de transacciones actuales.</P>
     */
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

    /**
     * <P>Calcula los intereses mensuales producidos en esta cuenta corriente bancaria.</P>
     * <P></P>
     * <P>Estos intereses se añadirán al saldo el día uno de cada mes, sabiendo que el tipo de interés será
     * hasta 3000€ al 0.5% de tipo de interés; el esto irá al interés actual establecido en esta cuenta corriente.</P>
     * @return los intereses mensuales de la cuenta bancaria.
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

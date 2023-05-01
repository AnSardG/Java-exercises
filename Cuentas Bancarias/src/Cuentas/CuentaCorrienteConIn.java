package Cuentas;


import java.util.GregorianCalendar;

/**
 * <P>La clase Cuenta Corriente con Incremento permite crear un objeto de tipo Cuenta Bancaria con
 * un importe por transacción correspondiente y un saldo mínimo necesario para ser creado.</P>
 * <P></P><P>A su vez podrán incluirse transacciones exentas por parte de la entidad bancaria,
 * así como el número de transacciones realizadas cada mes.</P>
 
 * @author Antonio Sard González
 * @version 1.0
 * @since 10-04-2023
 */
public class CuentaCorrienteConIn extends CuentaCorriente {
    //Atributos:
    /**
     * Valor del saldo mínimo para crear un objeto de esta clase. Por defecto 3000€.
     */
    private final double SALDOMINIMO = 3000;
    //Constructores:

    /**
     * Constructor por defecto.
     */
    public CuentaCorrienteConIn() {
    }

    /**
     * Construye un objeto <B>CuentaCorrienteConIn</B> con todas las características
     * base de la superclase <B>Cuenta</B></P>
     * <P></P>
     * <P>A su vez se creará con un importe inicial por transacción y una cantidad de transacciones exentas.</P>
     * <P>El saldo deberá ser mayor o igual al mínimo establecido</P>
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
    public CuentaCorrienteConIn(String nombre, String apellidos, String entidad, 
            String sucursal, String dc, String numero, double saldo, double tipoDeInteres,
            double importePorTrans, int transExentas) {
        super(nombre, apellidos, entidad, sucursal, dc, numero, saldo, tipoDeInteres, importePorTrans, transExentas);
    }
    //Métodos:

    /**
     * <P>Calcula los intereses mensuales producidos en esta cuenta corriente bancaria.</P>
     * <P></P>
     * <P>Estos intereses se añadirán al saldo el día uno de cada mes, sabiendo que el tipo de interés será hasta 3000€ al 0.5% de tipo de interés; el esto irá al interés actual establecido en esta cuenta corriente.</P>
     * <P>Precisa de un saldo mínimo de 3000€ para que puedan acumularse dichos intereses.</P>
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
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1 && estado() >= SALDOMINIMO) {
            importe = getTipoDeInteres() / 100 * 12 * estado();     
            ingreso(importe);
            decrementarTransacciones();
        }//Fin Si
        return importe;
    }//Fin Método
}

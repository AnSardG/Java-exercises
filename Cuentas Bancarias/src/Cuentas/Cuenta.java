package Cuentas;


/**
 * <P>La clase Cuenta otorga la estructura base para crear cualquier objeto de algún tipo de cuenta bancaria.</P>
 * <P></P>
 * <P>Esta clase abstracta define los comportamientos y características base que va a tenr cualquier
 * tipo de cuenta bancaria.</P>
 * 
 * @author Antonio Sard González
 * @version 1.0
 * @since 10-04-2023
 */
public abstract class Cuenta {
    //Atributos:

    private String nombre, apellidos, entidad, sucursal, dc, numero, iban;
    private double tipoDeInteres, saldo;

    //Constructores:
    /**
     * Constructor por defecto.
     */
    public Cuenta() {
    }
    /**
     * Construye un objeto Cuenta con todas sus características base.
     * @param nombre nombre del propietario de la cuenta a crear.
     * @param apellidos apellidos del propietario de la cuenta a crear.
     * @param entidad dígitos correspondientes a la entidad bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param sucursal dígitos correspondientes a la sucursal bancaria de la cuenta a crear, siendo estos 4 dígitos.
     * @param dc dígitos de control correspondientes a la cuenta a crear, siendo estos 2 dígitos.
     * @param numero número correspondiente de la cuenta a crear, siendo este de 10 dígitos.
     * @param saldo cantidad de saldo inicial de la cuenta a crear.
     * @param tipoDeInteres tipo de interés anual en porcentaje de la cuenta a crear.
     */
    public Cuenta(String nombre, String apellidos, String entidad, String sucursal, String dc, String numero,
            double saldo, double tipoDeInteres) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.entidad = entidad;
        this.sucursal = sucursal;
        this.dc = dc;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        calculaIban();
    }

    //Métodos:
    /**
     * Devuelve un objeto <B>String</B> con el nombre del propietario de la cuenta.
     * @return el nombre del propietario de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }//Fin Método

    /**
     * Modifica el nombre del propietario de la cuenta al <B>String</B> pasado por parámetro.
     * @param nombre nombre del propietario de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin Método

    /**
     * Devuelve un objeto <B>String</B> con los apellidos del propietario de la cuenta.
     * @return los apellidos del propietario de la cuenta.
     */
    public String getApellidos() {
        return apellidos;
    }//Fin Método

    /**
     * Modifica los apellidos del propietario de la cuenta al <B>String</B> pasado por parámetro.
     * @param apellidos apellidos del propietario de la cuenta.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }//Fin Método

    /**
     * Devuelve un número decimal de doble precisión con el valor porcentual del tipo de interés anual de esta cuenta.
     * @return el tipo de interés de la cuenta.
     */
    public double getTipoDeInteres() {
        return tipoDeInteres;
    }//Fin Método

    /**
     * Modifica el tipo de interés anual de la cuenta al valor decimal de doble precisión pasado por parámetro.
     * @param tipoDeInteres el tipo de interés a cambiar.
     */
    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }//Fin Método

    /**
     * Devuelve un String con el valor del IBAN de esta cuenta, incluyendo País y dígito de control.
     * @return el IBAN de esta cuenta.
     */
    public String getCCC() {
        return iban;
    }//Fin Método

    /**
     * <P>Modifica el IBAN de la cuenta, manteniendo el país intacto.</P> <P></P>Para modificarse se deben introducir todos los diferentes dígitos del IBAN descompuestos.
     * @param entidad la entidad bancaria de esta cuenta.
     * @param sucursal la sucursal bancaria de esta cuenta.
     * @param dc el dígito de control de esta cuenta.
     * @param numero el número de esta cuenta.
     */
    public void setCCC(String entidad, String sucursal, String dc, String numero) {
        this.entidad = entidad;
        this.sucursal = sucursal;
        this.dc = dc;
        this.numero = numero;
        calculaIban();
    }//Fin Método

    /**
     * <P>Calcula el IBAN incluyendo exclusivamente el país y el dígito de control frente al Código de la Cuenta del Cliente.</P>
     * <P></P><P>En este caso el país siempre será España.</P>
     */
    public void calculaIban() {
        iban = "ES" + dc + " " + entidad + " " + sucursal + " " + dc + numero.substring(0, 2)
                + " " + numero.substring(2, 6) + " " + numero.substring(6);
    }//Fin Método

    /**
     * Devuelve un decimal de doble precisión equivalente al saldo de esta cuenta.
     * @return el saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }//Fin Método

    /**
     * <P>Se ejecutará los días uno de cada mes para cobrar el importe del mantenimiento de esta cuenta.</P>
     * <P></P><P>Para ello deberá utilizar <B>GregorianCalendar</B>.</P>
     */
    public abstract void comisiones();

    /**
     * <P>Añade la cantidad especificada por parámetro en decimal de doble precisión a esta cuenta.</P>
     * <P></P>
     * <P>La cantidad nunca podrá ser negativa</P>
     * @param cantidad la cantidad a ingresar a la cuenta.
     */
    public void ingreso(double cantidad) {
        if(cantidad>0){
            saldo += cantidad;
        }//Fin Si        
    }//Fin Método

    /**
     * <P>Devuelve <B>true</B> si esta cuenta tiene saldo suficiente y resta la cantidad
     * especificada del saldo actual de la cuenta.
     * </P><P>
     * </P><P>En caso de no haber saldo suficiente, devolverá falso y no se producirá dicha resta.</P>
     * @param cantidad la cantidad a deducir de la cuenta.
     * @return el valor <B>boolean</B> de la operación.
     */
    public boolean reintegro(double cantidad) {
        //Entorno:
        boolean saldoSuficiente;
        //Algoritmo:
        saldoSuficiente = saldo - cantidad >= 0;
        if (saldoSuficiente) {
            saldo -= cantidad;
        }//Fin Si
        return saldoSuficiente;
    }//Fin Método

    /**
     * Calcula los intereses producidos en esta cuenta bancaria mensualmente.
     * @return los intereses mensuales de la cuenta bancaria
     */
    public abstract double intereses();
}

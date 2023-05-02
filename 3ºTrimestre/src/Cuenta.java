
/**
 * <h1>Cuenta bancaria de la que heredarán los diferentes tipos de cuenta
 * bancaria.</h1>
 *
 *
 * @version 1.0
 * @author Antonio Sard González
 * @since 2023-21-04
 */
public abstract class Cuenta {
    //Atributos:

    private String nombre, apellidos, entidad, sucursal, dc, numero, iban;
    private double tipoDeInteres, saldo;

    //Constructores:
    public Cuenta() {
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param entidad
     * @param sucursal
     * @param dc
     * @param numero
     * @param saldo
     * @param tipoDeInteres
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
    }

    //Métodos:
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }//Fin Método

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin Método

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }//Fin Método

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }//Fin Método

    /**
     * @return the tipoDeInteres
     */
    public double getTipoDeInteres() {
        return tipoDeInteres;
    }//Fin Método

    /**
     * @param tipoDeInteres the tipoDeInteres to set
     */
    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }//Fin Método

    /**
     *
     * @return String
     */
    public String getCCC() {
        return iban;
    }//Fin Método

    public void setCCC(String entidad, String sucursal, String dc, String numero) {
        this.entidad = entidad;
        this.sucursal = sucursal;
        this.dc = dc;
        this.numero = numero;
    }//Fin Método

    public void calculaIban() {
        iban = "ES" + dc + " " + entidad + " " + sucursal + " " + dc + numero.substring(0, 2)
                + " " + numero.substring(2, 6) + " " + numero.substring(6);
    }//Fin Método

    /**
     *
     * @return double
     */
    public double estado() {
        return saldo;
    }//Fin Método

    public abstract void comisiones();

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }//Fin Método

    /**
     *
     * @param cantidad
     * @return boolean
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

    public abstract double intereses();
}

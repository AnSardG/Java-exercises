package Cuentas;


/**
 *
 * @author Antonio Sard González
 */
public abstract class Cuenta {
    //Atributos:

    private String nombre, apellidos, entidad, sucursal, dc, numero, iban;
    private double tipoDeInteres, saldo;

    //Constructores:
    public Cuenta() {
    }

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

    public String getCCC() {
        return iban;
    }//Fin Método

    public void setCCC(String entidad, String sucursal, String dc, String numero) {
        this.entidad = entidad;
        this.sucursal = sucursal;
        this.dc = dc;
        this.numero = numero;
        calculaIban();
    }//Fin Método

    public void calculaIban() {
        iban = "ES" + dc + " " + entidad + " " + sucursal + " " + dc + numero.substring(0, 2)
                + " " + numero.substring(2, 6) + " " + numero.substring(6);
    }//Fin Método

    public double estado() {
        return saldo;
    }//Fin Método

    public abstract void comisiones();

    public void ingreso(double cantidad) {
        if(cantidad>0){
            saldo += cantidad;
        }//Fin Si        
    }//Fin Método

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

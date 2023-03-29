
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
    }

    //Métodos:
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the tipoDeInteres
     */
    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    /**
     * @param tipoDeInteres the tipoDeInteres to set
     */
    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public String getCCC() {
        return iban;
    }

    public void setCCC(String CCC) {
        CCC = CCC.trim().replaceAll(" +", "");
        this.entidad = CCC.substring(0, 4);
        this.sucursal = CCC.substring(4, 8);
        this.dc = CCC.substring(8, 10);
        this.numero = CCC.substring(10);
    }
    
    public void calculaIban(){
        
    }

    public double estado() {
        return saldo;
    }

    public abstract void comisiones();

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public boolean reintegro(double cantidad) {
        //Entorno:
        boolean saldoSuficiente;
        //Algoritmo:
        saldoSuficiente = saldo - cantidad >= 0;
        if (saldoSuficiente) {
            saldo -= cantidad;
        }//Fin Si
        return saldoSuficiente;
    }

    public abstract double intereses();
}


/**
 *
 * @author Antonio Sard González
 */
public abstract class Cuenta {
    //Atributos:
    private String nombre, apellidos, entidad, sucursal, dc, numero;
    private final String IBAN = "ES";
    private double tipoDeInteres, saldo;
    private int tiempo;
    
    //Constructores:
    public Cuenta() {
    }

    public Cuenta(String nombre, String CCC, double saldo, double tipoDeInteres) {
        this.nombre = nombre;
        CCC = CCC.trim().replaceAll(" +", "");
        this.entidad = CCC.substring(0, 4);
        this.sucursal = CCC.substring(4, 8);
        this.dc = CCC.substring(8, 10);
        this.numero = CCC.substring(10);
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
    
    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getCCC() {
        return IBAN + entidad + sucursal + dc + numero;
    }

    public void setCCC(String CCC) {
        CCC = CCC.trim().replaceAll(" +", "");
        this.entidad = CCC.substring(0, 4);
        this.sucursal = CCC.substring(4, 8);
        this.dc = CCC.substring(8, 10);
        this.numero = CCC.substring(10);
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

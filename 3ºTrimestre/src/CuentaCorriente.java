
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaCorriente extends Cuenta{
    //Atributos:
    private int transacciones, transExentas;
    private double importePorTrans;
    //Constructores:
    public CuentaCorriente(){
    }
    public CuentaCorriente(String nombre, String CCC, double saldo, double tipoDeInteres,
            double importePorTrans, int transExentas){
        super(nombre, CCC, saldo, tipoDeInteres);
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }
    //Métodos:
    public void decrementarTransacciones(){
        transacciones--;
    }

    /**
     * @return the transExentas
     */
    public int getTransExentas() {
        return transExentas;
    }

    /**
     * @param transExentas the transExentas to set
     */
    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }

    /**
     * @return the importePorTrans
     */
    public double getImportePorTrans() {
        return importePorTrans;
    }

    /**
     * @param importePorTrans the importePorTrans to set
     */
    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }
    
    public void ingreso(float cantidad){
         super.ingreso(cantidad);
         transacciones++;
    }
    
    public boolean reintegro(float cantidad){
        //Entorno:
        boolean saldoSuficiente;
        //Algoritmo:
        saldoSuficiente = super.reintegro(cantidad);
        if(saldoSuficiente){
            transacciones++;
        }//Fin Si
        return saldoSuficiente;
    }
    
    @Override
    public void comisiones(){
         //Entorno:
        GregorianCalendar date;
        //Algoritmo:
        date = new GregorianCalendar();
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            reintegro((transacciones - transExentas) * importePorTrans);
            transacciones = 0;
        }
    }
    
    @Override
    public double intereses(){
        //Entorno:
        GregorianCalendar date;
        double importe, interes;
        //Algoritmo:
        date = new GregorianCalendar();
        importe = 0;
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            setTiempo(getTiempo() + 1);
            interes = getTipoDeInteres();
            if(estado() <= 3000){
                importe += (estado() + 0.5 + getTiempo()) / 1200;
            } else {
                importe += (estado() + interes + getTiempo()) / 1200;
            }//Fin Si            
        }//Fin Si
        return importe;
    }
    
}

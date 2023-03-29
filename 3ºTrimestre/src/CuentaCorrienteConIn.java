
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaCorrienteConIn extends CuentaCorriente {
    //Atributos:

    private final double SALDOMINIMO = 3000;
    //Constructores:

    public CuentaCorrienteConIn() {
    }

    public CuentaCorrienteConIn(String nombre, String CCC, double saldo, double tipoDeInteres,
            double importePorTrans, int transExentas) {
        super(nombre, CCC, saldo, tipoDeInteres, importePorTrans, transExentas);
    }
    //Métodos:

    @Override
    public double intereses() {
        //Entorno:
        GregorianCalendar date;
        double importe;
        //Algoritmo:
        date = new GregorianCalendar();
        importe = 0;
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1 && estado() >= SALDOMINIMO) {
            importe = getTipoDeInteres()/12 * estado();         
        }//Fin Si
        return importe;
    }
}

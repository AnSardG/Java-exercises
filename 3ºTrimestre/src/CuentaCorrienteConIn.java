
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaCorrienteConIn extends CuentaCorriente {
    //Atributos:

    private final short SALDOMINIMO = 3000;
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
        double importe, interes;
        //Algoritmo:
        date = new GregorianCalendar();
        importe = 0;
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1 && estado() >= SALDOMINIMO) {
            setTiempo(getTiempo() + 1);
            interes = getTipoDeInteres();
            if (interes > 0.5) {
                interes -= 0.5;
                importe = 3000;
            }
            importe += (estado() + interes + getTiempo()) / 1200;
        }//Fin Si
        return importe;
    }
}

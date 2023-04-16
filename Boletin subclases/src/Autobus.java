
/**
 *
 * @author Antonio Sard González
 */
public class Autobus extends Vehiculo {
    //Atributos:

    private byte plazas;
    
    //Constructores:

    public Autobus(String marca, String modelo, String matricula, byte plazas) {
        super(marca, modelo, matricula);
        setPlazas(plazas);
    }

    public Autobus(String marca, String modelo, String matricula, int dia, int mes, int anio, byte plazas) {
        super(marca, modelo, matricula, dia, mes, anio);
        setPlazas(plazas);
    }
    
    //Métodos:

    /**
     * @return the plazas
     */
    public byte getPlazas() {
        return plazas;
    }

    /**
     * @param plazas the plazas to set
     */
    public void setPlazas(byte plazas) {
        if (plazas >= 0) {
            this.plazas = plazas;
        } else {
            this.plazas = -1;
        }//Fin Si       
    }
}

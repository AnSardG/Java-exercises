
/**
 *
 * @author Antonio Sard González
 */
public class Camion extends Vehiculo {
    //Atributos:

    private float carga;
    
    //Constructores:

    public Camion(String marca, String modelo, String matricula, float carga) {
        super(marca, modelo, matricula);
        setCarga(carga);
    }

    //Métodos:
    /**
     * @return the carga
     */
    public float getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(float carga) {
        if (carga >= 0) {
            this.carga = carga;
        } else {
            this.carga = -1;
        }//Fin Si        
    }
}

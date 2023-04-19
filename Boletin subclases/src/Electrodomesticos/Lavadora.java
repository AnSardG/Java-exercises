package Electrodomesticos;

/**
 *
 * @author Antonio Sard González
 */
public class Lavadora extends Electrodomestico{
    //Atributos:
    private float carga;
    private final float cargaPorDefecto = 5F;
    //Constructores:
    public Lavadora(){
        carga = cargaPorDefecto;
    }
    public Lavadora(float precioBase, float peso){
        super(precioBase, peso);
        carga = cargaPorDefecto;
    }
    public Lavadora(float precioBase, String color, String consumoEnergetico, float peso, float carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //Métodos:

    /**
     * @return the carga
     */
    public float getCarga() {
        return carga;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga > 30){
            super.precioBase += 50;
        }//Fin Si
    }
    
}

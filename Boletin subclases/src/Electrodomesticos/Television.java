package Electrodomesticos;

/**
 *
 * @author Antonio Sard González
 */
public class Television extends Electrodomestico{
    //Atributos:
    private short resolucion;
    private boolean sintonizadorTdt;
    private final short resolucionPorDefecto = 20;
    private boolean sintonizadorTdtPorDefecto = false;
    //Constructores:
    public Television(){
        resolucion = resolucionPorDefecto;
        sintonizadorTdt = sintonizadorTdtPorDefecto;
    }
    public Television(float precioBase, float peso){
        super(precioBase, peso);
        resolucion = resolucionPorDefecto;
        sintonizadorTdt = sintonizadorTdtPorDefecto;
    }
    public Television(float precioBase, String color, char consumoEnergetico, float peso
            , short resolucion, boolean sintonizadorTdt){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }
    //Métodos:

    /**
     * @return the resolucion
     */
    public short getResolucion() {
        return resolucion;
    }

    /**
     * @return the sintonizadorTdt
     */
    public boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion > 40){
            super.precioBase *= 1.3; 
        }//Fin Si
        if (sintonizadorTdt){
            super.precioBase += 50;
        }//Fin Si
    }
}

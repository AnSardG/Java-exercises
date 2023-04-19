package Electrodomesticos;

/**
 *
 * @author Antonio Sard González
 */
public class Electrodomestico {

    protected float precioBase;
    protected float peso;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;
    //Constructores:
    protected final float precioPorDefecto = 100F;
    protected final float pesoPorDefecto = 5F;
    protected final Color colorPorDefecto = Color.BLANCO;
    protected final ConsumoEnergetico consumoPorDefecto = ConsumoEnergetico.F;

    public Electrodomestico() {
        precioBase = precioPorDefecto;
        peso = pesoPorDefecto;
        color = colorPorDefecto;
        consumoEnergetico = consumoPorDefecto;
    }

    public Electrodomestico(float precioBase, float peso) {
        color = colorPorDefecto;
        consumoEnergetico = consumoPorDefecto;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(float precioBase, String color, String consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        comprobarColor(color);        
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    //Métodos:

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color.name();
    }

    /**
     * @return the consumoEnergetico
     */
    public String getConsumoEnergetico() {
        return consumoEnergetico.name();
    }

    /**
     * @return the precioPorDefecto
     */
    public float getPrecioPorDefecto() {
        return precioPorDefecto;
    }

    /**
     * @return the pesoPorDefecto
     */
    public float getPesoPorDefecto() {
        return pesoPorDefecto;
    }

    /**
     * @return the colorPorDefecto
     */
    public String getColorPorDefecto() {
        return colorPorDefecto.name();
    }

    /**
     * @return the consumoPorDefecto
     */
    public String getConsumoPorDefecto() {
        return consumoPorDefecto.name();
    }

    protected void comprobarColor(String color) {
        try {            
            this.color = Color.valueOf(color.toUpperCase());
        } catch(IllegalArgumentException iae){
            this.color = colorPorDefecto;
        }//Fin Try  
    }

    protected void comprobarConsumoEnergetico(String letra) {   
        try {            
            consumoEnergetico = ConsumoEnergetico.valueOf(letra.toUpperCase());
        } catch(IllegalArgumentException iae){
            consumoEnergetico = consumoPorDefecto;
        }//Fin Try        
    }

    public void precioFinal() {
        //Entorno:
        float[] preciosPeso = {10F, 50F, 80F, 100F}, pesos = {19, 49, 79, 80};
        byte i;
        //Algoritmo:
        precioBase += consumoEnergetico.getPrecio();
        i = 0;
        while (i < pesos.length && peso > pesos[i]) {
            i++;
        }// Fin Mientras
        precioBase += preciosPeso[i];
    }
}

enum Color {

    BLANCO, NEGRO, ROJO, AZUL, GRIS
}

enum ConsumoEnergetico {
    //Identificadores:
    A(100F), B(80F), C(60F), D(50F), E(30F), F(10F);
    
    //Atributos:
    private float precio;

    //Constructores:
    private ConsumoEnergetico(float precio) {
        this.precio = precio;
    }
    
    //Métodos:
    public float getPrecio(){
        return precio;
    }
}
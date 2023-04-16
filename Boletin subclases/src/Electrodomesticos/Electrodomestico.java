package Electrodomesticos;

/**
 *
 * @author Antonio Sard González
 */
public class Electrodomestico {

    protected float precioBase;
    protected float peso;
    protected String color;
    protected char consumoEnergetico;
    //Constructores:
    protected final float precioPorDefecto = 100F;
    protected final float pesoPorDefecto = 5F;
    protected final String colorPorDefecto = "blanco";
    protected final char consumoPorDefecto = 'F';

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

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
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
        return color;
    }

    /**
     * @return the consumoEnergetico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
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
        return colorPorDefecto;
    }

    /**
     * @return the consumoPorDefecto
     */
    public char getConsumoPorDefecto() {
        return consumoPorDefecto;
    }

    protected void comprobarColor(String color) {
        //Entorno:
        String colores;
        //Algoritmo:        
        color = color.toLowerCase();
        colores = "blanco negro rojo azul gris";
        if (colores.indexOf(color) >= 0) {
            this.color = color;
        } else {
            this.color = colorPorDefecto;
        }//Fin Si
    }
    protected void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' 
                || letra == 'E' || letra == 'F'){
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = consumoPorDefecto;
        }//Fin Si        
    }
    public void precioFinal(){
        //Entorno:
        float[] preciosConsumo = {100F, 80F, 60F, 50F, 30F, 10F}, preciosPeso = {10F, 50F, 80F, 100F}, 
                pesos = {19, 49, 79, 80};
        byte i;
        //Algoritmo:
        precioBase += preciosConsumo["ABCDEF".indexOf(String.valueOf(consumoEnergetico))];
        i = 0;
        while(i<pesos.length && peso > pesos[i]){
            i++;
        }// Fin Mientras
        precioBase += preciosPeso[i];            
    }
}

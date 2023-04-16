
/**
 *
 * @author Antonio Sard González
 */
public class Especial extends Camion {
    //Atributos:

    private byte compartimentos;
    
    //Constructores:

    public Especial(String marca, String modelo, String matricula, float carga, byte compartimentos) {
        super(marca, modelo, matricula, carga);
        setCompartimentos(compartimentos);
    }
    
    //Métodos:

    /**
     * @return the compartimentos
     */
    public byte getCompartimentos() {
        return compartimentos;
    }

    /**
     * @param compartimentos the compartimentos to set
     */
    public void setCompartimentos(byte compartimentos) {
        if (compartimentos > 0) {
            this.compartimentos = compartimentos;
        } else {
            this.compartimentos = -1;
        }//Fin Si        
    }
    
    @Override
    public float getCarga(){
        return super.getCarga() / compartimentos;
    }
    
    public String getDescripcion(){
        //Entorno:
        
        //Algoritmo:
        return "Marca: " + getMarca() + ". Modelo: " + getModelo() 
                + ". Nº de compartimentos: " + getCompartimentos();
    }
}

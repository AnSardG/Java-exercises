package PruebaInterfaz;

/**
 *
 * @author Antonio Sard González
 */
public class Masajista extends SeleccionFutbol{
    //Atributos:
    private String titulacion;
    private int aniosExperiencia;
    //Constructores:
    public Masajista(){        
    }
    //Métodos:
    public void darMasaje(){
        System.out.println("Te doy un masajito nene");
    }
    @Override
    public void concentrarse(){
        System.out.println("Relajar musculatura");
    }
    @Override
    public void entrenar(){        
    }
    @Override
    public void jugarPartido(){        
    }
}

package PruebaInterfaz;

/**
 *
 * @author Antonio Sard González
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    //Atributos:
    protected int id, edad;
    protected String nombre, apellidos;
    //Métodos:
    @Override
    public void viajar(){
        System.out.println("Estoy de viaje por el mundo.");
    }
}

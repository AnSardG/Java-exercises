package PruebaInterfaz;

/**
 *
 * @author Antonio Sard González
 */
public class Entrenador extends SeleccionFutbol{
    //Atributos:
    private int idFederacion;
    //Constructores:
    public Entrenador(){
        
    }
    //Métodos:
    public void planificarEntrenamiento(){
        System.out.println("Planificando tremenda estrategia.");
    }
    @Override
    public void concentrarse(){
        System.out.println("Preparandome para animar a los chavales");
    }
    @Override
    public void entrenar(){
        System.out.println("Vamos ahi los tios entrenando");
    }
    @Override
    public void jugarPartido(){
        System.out.println("Falta arbi!");
    }
}

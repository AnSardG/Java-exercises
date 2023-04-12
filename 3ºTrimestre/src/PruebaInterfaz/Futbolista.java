package PruebaInterfaz;

/**
 *
 * @author Antonio Sard González
 */
public class Futbolista extends SeleccionFutbol{
    //Atributos:
    private int dorsal;
    private String demarcacion;
    //Constructores:
    public Futbolista(){
    }
    //Métodos:
    public void entrevista(){
        System.out.println("Me estan entrevistando.");
    }
    @Override
    public void concentrarse(){
        System.out.println("Me concentro para chutar.");
    }
    @Override
    public void entrenar(){
        System.out.println("Entrenando fuerte al futbito.");
    }
    @Override
    public void jugarPartido(){
        System.out.println("Me paso la liga pokemon");
    }
}

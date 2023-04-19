

/**
 *
 * @author Antonio Sard González
 */
public class Dvd extends Cd{
    //Atributos:
    private boolean cantCapas;
    //Constructores:
    public Dvd(String codigo, String selloDiscografico, String autor
            , long almacenamientoMb, boolean cantCapas){
        super(codigo, selloDiscografico, autor, almacenamientoMb);
        this.cantCapas = cantCapas;
    }
    public Dvd(Dvd copia){
        super(copia);
        if (copia instanceof Dvd){
            cantCapas = copia.getCantCapas();
        }//Fin Si
    }
    //Métodos:

    /**
     * @return the cantCapas
     */
    public boolean getCantCapas() {
        return cantCapas;
    }

}

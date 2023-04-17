package Discos;

/**
 *
 * @author Antonio Sard González
 */
public class Cd extends Disco{
    //Atributos:
    private long almacenamientoMb;
    //Constructores:
    public Cd(String codigo, String selloDiscografico, String autor, long almacenamientoMb){
        super(codigo, selloDiscografico, autor);
        setAlmacenamientoMb(almacenamientoMb);
    }
    public Cd(Cd copia){
        super(copia);
        if (copia instanceof Cd){
            setAlmacenamientoMb(copia.getAlmacenamientoMb());
        } else {
            almacenamientoMb = -1;
        }//Fin Si
    }
    //Métodos:

    /**
     * @return the almacenamientoMb
     */
    public long getAlmacenamientoMb() {
        return almacenamientoMb;
    }

    /**
     * @param almacenamientoMb the almacenamientoMb to set
     */
    public void setAlmacenamientoMb(long almacenamientoMb) {
        if(almacenamientoMb >= 0){
            this.almacenamientoMb = almacenamientoMb;
        } else {
            this.almacenamientoMb = -1;
        }//Fin Si        
    }

}

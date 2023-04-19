

/**
 *
 * @author Antonio Sard González
 */
public class Vinilo extends Disco {
    //Atributos:
    private byte diametro, revolucionesPorMinuto;
    //Constructores:
    public Vinilo(String codigo, String selloDiscografico, String autor
            , byte diametro, byte revoluciones){
        super(codigo, selloDiscografico, autor);
        setDiametro(diametro);
        setRevolucionesPorMinuto(revoluciones);
    }
    public Vinilo(Vinilo copia){
        super(copia);
        if(copia instanceof Vinilo){
            diametro = copia.getDiametro();
            revolucionesPorMinuto = copia.getRevolucionesPorMinuto();
        } else {
            diametro = -1;
            revolucionesPorMinuto = -1;
        }//Fin Si
    }
    //Métodos:

    /**
     * @return the diametro
     */
    public byte getDiametro() {
        return diametro;
    }

    /**
     * @return the revolucionesPorMinuto
     */
    public byte getRevolucionesPorMinuto() {
        return revolucionesPorMinuto;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(byte diametro) {
        if(diametro == 30 || diametro == 25){
            this.diametro = diametro;
        } else {
            this.diametro = -1;
        }//Fin Si
        
    }

    /**
     * @param revolucionesPorMinuto the revolucionesPorMinuto to set
     */
    public void setRevolucionesPorMinuto(byte revolucionesPorMinuto) {
        if(revolucionesPorMinuto > 0){
            this.revolucionesPorMinuto = revolucionesPorMinuto;
        } else {
            this.revolucionesPorMinuto = -1;
        }//Fin Si        
    }
    
    
}

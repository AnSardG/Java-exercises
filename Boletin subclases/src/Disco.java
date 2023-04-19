

/**
 *
 * @author Antonio Sard González
 */
public abstract class Disco {
    //Atributos:
    private String codigo, selloDiscografico, autor;
    //Constructores:
    public Disco(String codigo, String selloDiscografico, String autor){
        this.codigo = codigo;
        this.selloDiscografico = selloDiscografico;
        this.autor = autor;
    }
    public Disco(Disco copia){
        if(copia instanceof Disco){
            codigo = Integer.toString(Integer.valueOf(copia.getCodigo()) + 1);
            selloDiscografico = copia.getSelloDiscografico();
            autor = copia.getAutor();
        } else {
            codigo = "";
            selloDiscografico = "";
            autor = "";
        }//Fin Si
    }
    //Métodos:

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the selloDiscografico
     */
    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

}


/**
 *
 * @author Antonio Sard González
 */
public class Serie implements Entregable {
    //Atributos:

    private String titulo, genero, creador;
    private byte temporadas;
    private boolean entregado;
    //Constructores:

    public Serie() {
        temporadas = 3;
        entregado = false;
        titulo = "";
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador) {
        setTitulo(titulo);
        setCreador(creador);
        temporadas = 3;
        entregado = false;
        genero = "";
    }

    public Serie(String titulo, String creador, String genero, byte temporadas) {
        setTitulo(titulo);
        setCreador(creador);
        setTemporadas(temporadas);
        setGenero(genero);
        entregado = false;
    }

    //Métodos:
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the temporadas
     */
    public byte getTemporadas() {
        return temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(byte temporadas) {
        if (temporadas > 0) {
            this.temporadas = temporadas;
        } else {
            this.temporadas = -1;
        }//Fin Si        
    }

    @Override
    public String toString() {
        //Entorno:
        String linea;
        //Algoritmo:
        if (!titulo.isEmpty()) {
            linea = "Título: " + titulo;
        } else {
            linea = "Sin título";
        }//Fin Si
        if (!creador.isEmpty()) {
            linea += ". Creador: " + creador;
        } else {
            linea += ". Sin creador";
        }//Fin Si
        if (temporadas != -1) {
            linea += ". Temporadas: " + Byte.toString(temporadas);
        } else {
            linea += ". Sin temporadas";
        }//Fin Si
        if (!genero.isEmpty()) {
            linea += ". Género: " + genero;
        } else {
            linea += ". Sin género";
        }//Fin Si
        if (entregado) {
            linea += ". Ya entregado.";
        } else {
            linea += ". Sin entregar.";
        }//Fin Si        
        return linea;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object serie) {
        //Entorno:
        int sgn;
        byte auxTemporadas;
        //Algoritmo:
        sgn = 2;
        try {
            auxTemporadas = ((Serie) serie).getTemporadas();
            if (auxTemporadas < this.getTemporadas()) {
                sgn = 1;
            } else if (auxTemporadas == this.getTemporadas()) {
                sgn = 0;
            } else {
                sgn = -1;
            }//Fin Si
        } catch (NullPointerException np) {
            System.out.println(np.getMessage());
        } catch (ClassCastException cc) {
            System.out.println(cc.getMessage());
        } finally {
            if(sgn == 2){
                sgn = -2;
            }//Fin Si
        }//Fin Try
        return sgn;
    }
}

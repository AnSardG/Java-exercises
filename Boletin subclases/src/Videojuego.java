/**
 *
 * @author Antonio Sard González
 */
public class Videojuego implements Entregable{
    //Atributos:
    private String titulo, genero, compania;
    private short horasEstimadas;
    private boolean entregado;
    //Constructores:
    public Videojuego(){
        titulo = "";
        genero = "";
        compania = "";
        horasEstimadas = 10;
        entregado = false;
    }
    public Videojuego(String titulo, short horasEstimadas){
        setTitulo(titulo);
        setHorasEstimadas(horasEstimadas);
        genero = "";
        compania = "";
        entregado = false;
    }
    public Videojuego(String titulo, short horasEstimadas, String genero, String compania){
        setTitulo(titulo);
        setHorasEstimadas(horasEstimadas);
        setGenero(genero);
        setCompania(compania);
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
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @return the horasEstimadas
     */
    public short getHorasEstimadas() {
        return horasEstimadas;
    }

    /**
     * @param horasEstimadas the horasEstimadas to set
     */
    public void setHorasEstimadas(short horasEstimadas) {
        if(horasEstimadas > 0){
            this.horasEstimadas = horasEstimadas;    
        } else {
            this.horasEstimadas = -1;
        }//Fin Si        
    }
    
    @Override
    public String toString(){
        //Entorno:
        String linea;
        //Algoritmo:
        if(!titulo.isEmpty()){
            linea = "Título: " + titulo;
        } else {
            linea = "Sin título";
        }//Fin Si
        if(!compania.isEmpty()){
            linea += ". Compañía: "+ compania;
        } else {
            linea += ". Sin compañía";
        }//Fin Si        
        if(!genero.isEmpty()){
            linea += ". Género: " + genero;
        } else {
            linea += ". Sin género";
        }//Fin Si
        if(horasEstimadas != -1){
            linea += ". Horas estimadas: " + Short.toString(horasEstimadas);
        } else {
            linea += ". Sin horas estimadas";
        }//Fin Si
        if(entregado){
            linea += ". Ya entregado.";
        }else{
            linea += ". Sin entregar.";
        }//Fin Si        
        return linea; 
    }
    
    @Override
    public void entregar(){
        entregado = true;
    }
    @Override
    public void devolver(){
        entregado = false;
    }
    @Override
    public boolean isEntregado(){
        return entregado;
    }
    @Override
    public int compareTo(Object juego){
        //Entorno:
        int sgn;
        short auxHoras;
        //Algoritmo:
        sgn = 2;
        try {
            auxHoras = ((Videojuego) juego).getHorasEstimadas();
            if (auxHoras < this.getHorasEstimadas()) {
                sgn = 1;
            } else if (auxHoras == this.getHorasEstimadas()) {
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

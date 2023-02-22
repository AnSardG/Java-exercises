/**
 *
 * @author Antonio Sard Gonzalez
 */
public class Contador {
    //Atributos:
    private int valor;
    private int incremento;
    //Constructores:
    public Contador(){
    }
    public Contador(int incremento){
        this.incremento=incremento;
    }
    public Contador(int valor, int incremento){
        this.valor=valor;
        this.incremento=incremento;
    }
    public Contador(Contador contador){
        this.valor=contador.valor;
        this.incremento=contador.incremento;
    }
    //Getters y Setters:
    public int getIncremento(){
        return this.incremento;
    }
    public int obtenerCuenta(){
        return this.valor;
    }
    public void iniciaCuenta(int valor){
        this.valor=valor;
    }
    //Mथऊtodos:
    public int incrementaCuenta(){
        this.valor=this.valor+this.incremento;
        return this.valor;
    }
    @Override
    public boolean equals(Object obj){
        return obj instanceof Contador && this.valor==((Contador)obj).valor;
    }
    
}
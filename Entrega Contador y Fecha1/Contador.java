/**
 *
 * @author Antonio Sard González
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
    //Métodos:
    public void incrementaCuenta(){
        this.valor=this.valor+this.incremento;
    }
}
//Programa: Numero
//Autor: Antonio Sard González
public class Numero {
//Atributos
    private int valor;
//Constructores
    public Numero(){
    }
    public Numero(int valor){
        this.valor=valor;
    }
//Métodos
    public void aniade(int num){
        this.valor=this.valor+num;
    }
    public void resta(int num){
        this.valor=this.valor-num;
    }
//Getters y Setters
    public int getValor(){
        return this.valor;
    }
    public int getDoble(){
        return this.valor*2;
    }
    public int getTriple(){
        return this.valor*3;
    }
    public int getCuadruple(){
        return this.valor*4;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
}

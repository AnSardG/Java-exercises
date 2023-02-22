//Programa: Finanzas
//Autor: Antonio Sard González
public class Finanzas{
//Atributos:
    private double importeCambio=1.37;
//Constructores:
    public Finanzas(){
    }
    public Finanzas(double importeCambio){
        this.importeCambio=importeCambio;
    }
//Setters y getters:
    public double getCambio(){
        return importeCambio;
    }
//Métodos:
    public double dolaresToEuros(double importeDolares){
        return importeDolares/importeCambio;
    }
    public double eurosToDolares(double importeEuros){
        return importeEuros*importeCambio;
    }
}
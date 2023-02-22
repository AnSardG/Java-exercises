//Programa: Consumo
//Autor: Antonio Sard González
public class Consumo {
//Atributos:
    private int kms;
    private float litros;
    private byte vmed;
    private float precio=1.5F;
//Constructores:
    public Consumo(int kms, float litros, byte vmed){
        this.kms=kms;
        this.litros=litros;
        this.vmed=vmed;
    }
//Setters y Getters:    
    public void setKms(int kms){
        this.kms=kms;
    }
    public void setLitros(float litros){
        this.litros=litros;
    }
    public void setVmed(byte vmed){
        this.vmed=vmed;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public int getKms(){
        return this.kms;
    }
    public float getLitros(){
        return this.litros;
    }
    public byte getVmed(){
        return this.vmed;
    }
    public float getPrecio(){
        return this.precio;
    }
    public short getTiempo(){
        return (short)(this.kms/this.vmed);
    }
//Métodos:
    public float consumoMedio(){
        return this.litros*100/this.kms;
    }
    public float consumoEuros(){
        return this.litros*this.precio;
    }
}
/**
 *
 * @author Antonio Sard González
 */
public class Fecha1 {
    //Atributos:
    private byte dia=1;
    private byte mes=1;
    private short anio=1582;
    //Constructores:
    public Fecha1(){
    }
    //Getters y Setters:
    public void setFecha(byte dia, byte mes, short anio){
        if(esFechaCorrecta(dia, mes, anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        } else {
            System.out.println("Fecha no válida, se mantendrán los valores por defecto.");
        }//Fin Si
    }
    public byte getDia(){
        return this.dia;
    }
    public byte getMes(){
        return this.mes;
    }
    public short getAnio(){
        return this.anio;
    }
    //Métodos:
    public static boolean esFechaCorrecta(byte dia, byte mes, short anio){
        return Utilidades.esFechaValida(dia, mes, anio);
    }
    public void mostrarFecha(){
        System.out.println("La fecha es "+this.dia+"/"+this.mes+"/"+this.anio);
    }
    public static boolean esBisiesto(short anio){
        return Utilidades.esBisiesto(anio);
    }
}
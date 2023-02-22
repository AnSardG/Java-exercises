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
        if(Fecha1.esFechaCorrecta(dia, mes, anio)){
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
        //Entorno:
        boolean esValida;
    //Algoritmo:
        esValida=false;
        if (anio>=1582 && dia>=1){
            switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                   if (dia<=31){
                       esValida=true;
                   }//Fin Si 
                break;
                case 4: case 6: case 9: case 11:
                    if (dia<=30){
                        esValida=true;
                    }//Fin Si
                break;
                case 2:
                    if(Fecha1.esBisiesto(anio)){
                        if (dia<=29){
                            esValida=true;
                        }//Fin Si
                    }else{
                        if (dia<=28){
                             esValida=true;
                         }//Fin Si
                    }//Fin Si
                break;
            }//Fin Según Sea
        }//Fin Si
        return esValida;
    }
    public void mostrarFecha(){
        System.out.println("La fecha es "+this.dia+"/"+this.mes+"/"+this.anio);
    }
    private static boolean esBisiesto(short anio){
    return anio%4==0 && (!(anio%100==0) || anio%400==0);
    }
}
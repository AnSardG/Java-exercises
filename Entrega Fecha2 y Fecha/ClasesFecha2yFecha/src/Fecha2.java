import java.util.GregorianCalendar;
/**
 *
 * @author Antonio Sard González
 */
public class Fecha2 {
    //Atributos:
    private byte dia=1;
    private byte mes=1;
    private short anio=1582;
    //Constructores:
    public Fecha2(){
    }
    //Getters y Setters:
    public void setFecha(byte dia, byte mes, short anio){
        if(Fecha2.esFechaCorrecta(dia, mes, anio)){
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
                    if(Fecha2.esBisiesto(anio)){
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
    public void asignarFecha(){
    // Cambia los valores de día, mes y año de la fecha a los de la fecha actual.
        //Entorno:
        GregorianCalendar fecha;
        //Algoritmo:
        fecha=new GregorianCalendar();
        this.dia=(byte)fecha.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes=(byte)(fecha.get(GregorianCalendar.MONTH)+1);
        this.anio=(short)fecha.get(GregorianCalendar.YEAR);
    }
    public void asignarFecha(byte dia){
        if(esFechaCorrecta(dia, this.mes, this.anio)){
            this.dia=dia;
        }else{
            System.out.println("Ha introducido un día no válido, se mantendrá la fecha anterior.");
        }//Fin Si
    }
    public void asignarFecha(byte dia, byte mes){
        if(esFechaCorrecta(dia, mes, this.anio)){
            this.dia=dia;
            this.mes=mes;
        }else{
            if(esFechaCorrecta(dia, this.mes, this.anio)){
                System.out.print("Ha introducido un mes");
            }else{
                if(esFechaCorrecta(this.dia, mes, this.anio)){
                    System.out.print("Ha introducido un día");
                }else{
                    if(esFechaCorrecta(this.dia, this.mes, this.anio)){
                        System.out.print("Ha introducido un día y mes");
                    }//Fin Si
                }//Fin Si
            }//Fin Si
        System.out.println(" no válido, se mantendrá la fecha anterior.");
        }//Fin Si
    }
    public void asignarFecha(byte dia, byte mes, short anio){
        if(esFechaCorrecta(dia, mes, anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }else{
            if(esFechaCorrecta(dia, mes, this.anio)){
                System.out.print("Ha introducido un año");
            }else{
                if(esFechaCorrecta(dia, this.mes, anio)){
                    System.out.print("Ha introducido un mes");
                }else{
                    if(esFechaCorrecta(this.dia, mes, anio)){
                        System.out.print("Ha introducido un día");
                    }else{
                        if(esFechaCorrecta(this.dia, this.mes, anio)){
                            System.out.print("Ha introducido un día y mes");
                        }else{    
                            if(esFechaCorrecta(dia, this.mes, this.anio)){
                            System.out.print("Ha introducido un mes y año");
                            }else{
                                if(esFechaCorrecta(this.dia, mes, this.anio)){
                                    System.out.print("Ha introducido un día y año");
                                }else{
                                    if(esFechaCorrecta(this.dia, this.mes, this.anio)){
                                        System.out.print("Ha introducido un día, mes y año");
                                    }//Fin Si
                                }//Fin Si
                            }//Fin Si
                        }//Fin Si
                    }//Fin Si
                }//Fin Si
            }//Fin Si
        System.out.println(" no válido, se mantendrá la fecha anterior.");
        }//Fin Si
    }
}
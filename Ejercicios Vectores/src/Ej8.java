/**
 *
 * @author Antonio Sard González
 */
public class Ej8 {
    public static void main(String[] args){
        //Entorno:
        byte[] calificacion;
        byte numNotas, nota, i, frecuencia;
        //Algoritmo:
        calificacion= new byte[30];
        numNotas=0;
        do{
            System.out.print("Introduzca la nota "+(numNotas+1)+": ");
            calificacion[numNotas]=(byte)Leer.datoShort();
            numNotas++;
        }while(numNotas<30 && calificacion[numNotas-1]>=0 && calificacion[numNotas-1]<=10);
        System.out.println("Lista de frecuencias de cada una de las notas: ");
        for(nota=0;nota<=10;nota++){
            frecuencia=0;
            for(i=0;i<=numNotas-1;i++){
                if(calificacion[i]==nota){
                    frecuencia++;
                }//Fin Si
            }//Fin Para
            if(frecuencia!=0){
                System.out.println("Nota: "+nota+". Frecuencia: "+frecuencia+".");
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}

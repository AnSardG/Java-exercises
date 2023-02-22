/**
 *
 * @author Antonio Sard González
 */
public class Utilidades {
    public static byte cifras(int num){
    //Entorno:
        byte cifras;
    //Algoritmo:
        if(num==0){
            cifras=1;
        }else{
            cifras=0;
            while (num!=0) {
                num=num/10;
                cifras++;
            }//Fin Mientras
        }//Fin Si
        return cifras;
    }//Fin Función
    public static byte sacaDigito(int numero, byte posicion){
    //Entorno:
        byte digito;
        int auxNum;
    //Algoritmo:
        if ((byte)(cifras(numero)-posicion)<0){
            digito=-1;
        } else {
            numero=numero/(int)Math.pow(10, (byte)(cifras(numero)-posicion));
            auxNum=numero/10*10;
            digito=(byte)(numero-auxNum);
        }//Fin Si
    return digito;
    }//Fin Función
    public static int numeroAleatorio(){
        //Entorno:
        byte cifras;
        //Algoritmo:
        do{
            cifras=(byte)(Math.random()*10);
        }while(cifras>6);
        return (int)(Math.random()*Math.pow(10, cifras))+1;
    }//Fin Función
    public static void muestraResultado(int numAleatorio, int numIntroducido){
        //Entorno:
        int auxAleatorio, auxIntroducido;
        byte cifraNum;
        //Algoritmo:
        auxAleatorio=numAleatorio;
        auxIntroducido=numIntroducido;
        if(cifras(numAleatorio)>cifras(numIntroducido)){
            while(cifras(auxAleatorio)>cifras(auxIntroducido)){
                System.out.print("*");
                auxAleatorio=auxAleatorio/10;
            }//Fin Mientras
            numAleatorio=numAleatorio-(int)(numAleatorio/Math.pow(10, cifras(numIntroducido)))*(int)Math.pow(10, cifras(numIntroducido));
        }//Fin Si
        if(cifras(numIntroducido)>cifras(numAleatorio)){
            numIntroducido=numIntroducido-(int)(numIntroducido/Math.pow(10, cifras(numAleatorio)))*(int)Math.pow(10, cifras(numAleatorio));
        }//Fin Si
        for(cifraNum=1;cifraNum<=cifras(numAleatorio);cifraNum++){
            if(sacaDigito(numAleatorio, cifraNum)==sacaDigito(numIntroducido, cifraNum)){
                System.out.print(sacaDigito(numAleatorio, cifraNum));
            } else {
                System.out.print("*");
            }//Fin Si
        }//Fin Para
        System.out.println();
    }//Fin Procedimiento
}
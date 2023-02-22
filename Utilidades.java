public class Utilidades {
    public static byte cifras(int num){
    //Entorno:
        byte cif;
        int auxNum;
    //Algoritmo:
        auxNum=num;
        cif=0;
        while (auxNum!=0) {
            auxNum=auxNum/10;
            cif++;
        }//Fin Mientras
        return cif;
    }//Fin Función
    public static boolean continuar(){
    //Entorno:
        boolean quiereContinuar;
        char opcion;
    //Algoritmo:
        quiereContinuar=false;
        do{
            System.out.print("¿Desea continuar?(s/n):");
            opcion=Leer.datoChar();
        }while(opcion!='s' && opcion!='S' && opcion!='N' && opcion!='n');
        if (opcion=='s' || opcion=='S'){
            quiereContinuar=true;
        }//Fin Si
        return quiereContinuar;
    }
    public static boolean esFechaValida(byte d, byte m, short a){
    //Entorno:
        boolean esValida;
    //Algoritmo:
        esValida=false;
        if (a>=1582 && a<=2023){
            if (d>=1){
                switch(m){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                       if (d<=31){
                           esValida=true;
                       }//Fin Si 
                    break;
                    case 4: case 6: case 9: case 11:
                        if (d<=30){
                            esValida=true;
                        }//Fin Si
                    break;
                    case 2:
                        if(esBisiesto(a)){
                            if (d<=29){
                                esValida=true;
                            }//Fin Si
                        }else{
                            if (d<=28){
                                 esValida=true;
                             }//Fin Si
                        }//Fin Si
                    break;
                }//Fin Según Sea
            }//Fin Si
        }//Fin Si
        return esValida;
    }//Fin Función
    public static boolean esBisiesto(short a){
    //Entorno:
        boolean esBisies;
    //Algoritmo:
        esBisies=false;
        if(a>=1582 && a<=2100){
            if (a%4==0 && (!(a%100==0) || a%400==0)){
                esBisies=true;
            }//Fin Si
        }//Fin Si
    return esBisies;
    }//Fin Función
    public static byte sacaDigito(int n, byte p){
    //Entorno:
        byte digito, div;
        int auxNum;
    //Algoritmo:
        div=(byte)(cifras(n)-p);
        if (div<=0){
            System.out.print("Ha introducido una posición incorrecta (el número tiene menos digitos).");
            digito=0;
        } else {
            n=n/(int)Math.pow(10, div);
            auxNum=n/10*10;
            digito=(byte)(n-auxNum);
        }//Fin Si
    return digito;
    }//Fin Función
    public static int invierte(int n){
    //Entorno:
        int num, auxNum;
        byte pos;
    //Algoritmo:
        num=0;
        for(pos=cifras(n);pos>=1;pos--){
            auxNum=n/10*10;
            num=num+(n-auxNum)*(int)Math.pow(10, pos);
            n=n/10;
        }//Fin Para
        num=num/10;
        return num;
    }//Fin Función
    public static boolean esCapicua(int n){
    //Entorno:
        boolean esCap;
        int numDcha;
        byte numIzq, digitoDcha, digitoIzq;
    //Algoritmo:
        esCap=true;
        digitoDcha=(byte)(cifras(n)-1);
        digitoIzq=1;
        numDcha=n;
        while(digitoDcha>=digitoIzq && esCap){
            numIzq=(byte)((n/(int)Math.pow(10, digitoDcha))%10);
            if(numDcha%10!=numIzq){
                esCap=false;
            }//Fin Si
            numDcha=numDcha/10;
            digitoDcha--;
            digitoIzq++;
        }//Fin Mientras
        return esCap;
    }//Fin Función
}
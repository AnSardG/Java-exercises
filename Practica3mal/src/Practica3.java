//Programa: Practica3
//Autor: Antonio Sard González
public class Practica3 {
    public static void main(String[] args){
        //Entorno:
        int numAleatorio, numIntroducido;
        byte oportunidad, cifrasAleatorio;
        boolean incorrecto;
        //Algoritmo:
        numAleatorio=Utilidades.numeroAleatorio();
        incorrecto=true;
        oportunidad=1;
        System.out.print("Tiene 10 oportunidades para adivinar el siguiente número: ");
        for(cifrasAleatorio=Utilidades.cifras(numAleatorio);cifrasAleatorio>=1;cifrasAleatorio--){
            System.out.print("*");
        }//Fin Para
        System.out.println(" ("+Utilidades.cifras(numAleatorio)+" dígitos)");
        do{
            System.out.print("Introduzca un número ("+oportunidad+"ª oportunidad): ");
            numIntroducido=Leer.datoInt();
            if(numAleatorio!=numIntroducido){
                Utilidades.muestraResultado(numAleatorio, numIntroducido);
                oportunidad++;
            }else{
                incorrecto=false;
            }//Fin Si
        }while(incorrecto && oportunidad<=10);
        if(incorrecto){
            System.out.println("Ha perdido, el número correcto es el "+numAleatorio+".");
        }else{
            System.out.println("¡Ha acertado, el número correcto es el "+numAleatorio+", ha ganado en la "+oportunidad+"ª oportunidad!");
        }//Fin Si
    }//Fin Programa
}
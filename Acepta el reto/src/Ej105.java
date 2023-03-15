
import java.util.Scanner;

/**
 *
 * @author Antonio Sard González
 */
public class Ej105 {

    public static void main(String[] args) {
        float[] valorDia;
        String[] dia = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        float mayor, menor, media;
        Scanner myObj;
        byte i, j, k;
        String valor;

        myObj = new Scanner(System.in);
        valorDia = new float[6];
        i = 0;
        mayor = -1;
        menor = -1;
        do {
            if (i > 5) {
                i = 0;
            }
            do {
                valor = myObj.nextLine();
            } while (!valor.trim().matches("\\-?\\d+(\\.\\d+)?"));
            valorDia[i] = Float.valueOf(valor);
            if (valorDia[0] == -1) {
                i = 1;
            } else {
                if (menor == -1) {
                    menor = valorDia[i];
                }
                if (valorDia[i] > mayor) {
                    mayor = valorDia[i];
                }
                if (valorDia[i] < menor) {
                    menor = valorDia[i];
                }
                i++;
                if (i > 5) {
                    k = 0;
                    for(j=0;j<=valorDia.length-1;j++){
                        if (valorDia[j] == mayor){
                            k++;
                        }
                    }
                    j = 0;
                    while (valorDia[j] != mayor && j < valorDia.length - 1) {
                        j++;
                    }
                    if (k < 2) {
                        System.out.print(dia[j] + " ");
                    } else {
                        System.out.print("EMPATE ");
                    }
                    k = 0;
                    for(j=0;j<=valorDia.length-1;j++){
                        if (valorDia[j] == menor){
                            k++;
                        }
                    }
                    j = 0;
                    while (valorDia[j] != menor && j < valorDia.length - 1) {
                        j++;
                    }
                    if (k < 2) {
                        System.out.print(dia[j] + " ");
                    } else {
                        System.out.print("EMPATE ");
                    }
                    media = 0;
                    for (j = 0; j <= valorDia.length - 1; j++) {
                        media += valorDia[j];
                    }
                    media /= 6;
                    if (valorDia[5] > media) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                    valorDia = new float[6];
                    menor = -1;
                    mayor = -1;
                }
            }
        } while (valorDia[i - 1] != -1 || dia[i - 1] != "MARTES");
    }
}

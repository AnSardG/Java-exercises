
import java.util.Scanner;

/**
 *
 * @author Antonio Sard González
 */
public class Ej117 {

    public static void main(String[] args) {
        int i;
        Scanner myObj;
        String frase, personas;
        myObj = new Scanner(System.in);
        do {
            personas = myObj.nextLine();
        } while (!personas.trim().matches("[0-9]*") || Integer.valueOf(personas) < 0);
        for (i = 1; i <= Integer.valueOf(personas); i++) {
            do {
                frase = myObj.nextLine();
            } while (frase.trim().length() > 104 || frase.isEmpty() || frase.trim()
                    .indexOf(" ") < 0 || frase.trim().substring(frase.indexOf(" ") + 1)
                    .indexOf(" ") >= 0 || !"Soy".equals(frase.substring(0, 3))
                    || !frase.substring(4).matches("[a-zA-Z]*"));
            frase = frase.substring(frase.indexOf(" ") + 1);
            System.out.println("Hola, " + frase+".");
        }


    }
}

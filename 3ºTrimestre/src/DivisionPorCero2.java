/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria Fuentes Pérez
 */
public class DivisionPorCero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 15;
        y = 0;
        try {
            z = x / y;
            System.out.println(x + " / " + y + " = " + z);
            System.out.println("Terminar proceso");
        } catch (ArithmeticException ae){
            System.out.println(" ");
        }
        System.out.println("Fin Programa");
    }
}

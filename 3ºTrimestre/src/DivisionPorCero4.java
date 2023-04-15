/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria Fuentes Pérez
 */
public class DivisionPorCero4 {

    /**
     * @param args the command line arguments
     */
    public static int divide(int dividendo, int divisor) throws ArithmeticException {
        return (dividendo / divisor);
    }

    public static void main(String[] args) {
        int x, y;
        x = 15;
        y = 0;

        System.out.println(x + " / " + y + " = " + divide(x, y));

        System.out.println("Terminar proceso");

        System.out.println("Fin Programa");
    }
}

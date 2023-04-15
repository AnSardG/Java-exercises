/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria Fuentes Pérez
 */
public class DivisionPorCero5 {

    /**
     * @param args the command line arguments
     */
    public static int divide(int dividendo, int divisor) throws ArithmeticException {
        int z;
        
        z=dividendo / divisor;

            System.out.println("Aquí controlo yo");
            
        
        return z;
    }

    public static void main(String[] args) {
        int x, y;
        x = 15;
        y = 0;
        try {
            System.out.println(x + " / " + y + " = " + divide(x, y));
        } catch (ArithmeticException ae) {
            System.out.println("No se puede realizar la división");
        }finally{
            System.out.println("Terminar proceso");
        }
        System.out.println("Fin Programa");
    }
}

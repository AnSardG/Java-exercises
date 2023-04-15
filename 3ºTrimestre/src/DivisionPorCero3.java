/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria Fuentes Pérez
 */
public class DivisionPorCero3 {

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
        } catch (NullPointerException ae) {
            System.out.println("No se puede realizar la división");
        }finally{
            System.out.println("Terminar proceso");
        }
        
        System.out.println("Fin Programa");
    }
}

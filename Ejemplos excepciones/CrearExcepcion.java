/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria Fuentes Pérez
 */
public class CrearExcepcion {

    /**
     * @param args the command line arguments
     */
    public static int divide(int a, int b) throws MiExcepcion,ArithmeticException {
        int res;
        if (b < 1) {
            //throw new MiExcepcion("Denominador negativo");
            throw new MiExcepcion();
        } else {
            res = a / b;
        }
        return res;

    }

    public static void main(String[] args) {
        int x, y;
        x = 3;
        y = -1;
        try {
            System.out.println(divide(x, y));
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        } catch (MiExcepcion m) {
            System.out.println(m.toString());
        }
    }
}

class MiExcepcion extends Exception {

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(String s) {
        super(s);
    }

    public String toString() {
        String msg=this.getMessage();
        if (msg==null){
            msg="Sin mensaje";
        }
        return "Se ha producido la excepción "
                + this.getClass().getName() + "\n"
                + "Con el siguiente mensaje: " + msg + "\n";
    }
}
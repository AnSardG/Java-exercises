
import Cuentas.CuentaCorriente;
import Cuentas.CuentaCorrienteConIn;
import Cuentas.CuentaAhorro;


/**
 *
 * @author Antonio Sard González
 */
public class PruebaCuentas {

    public static void main(String[] args) {
        //Entorno:
//        Cuenta cuenta;
        CuentaAhorro ahorro;
        CuentaCorriente corriente;
        CuentaCorrienteConIn corrienteInc;
//        String nombre, apellidos, entidad, sucursal, dc, numero;
//        double saldo, tipoDeInteres, cuotaMantenimiento;        
        //Algoritmo:
// La clase Cuenta no puede ser instanciada al ser abstracta.
//      cuenta = new Cuenta();
        System.out.println("CUENTA AHORRO:");
        ahorro = new CuentaAhorro();
        System.out.println("\nCONSTRUCTOR POR DEFECTO ");
        System.out.println("Nombre: " + ahorro.getNombre() + ". Saldo: " 
                + ahorro.estado());
// El constructor por defecto inicializa los atributos a null y 0.
        System.out.println("\nPRUEBA GETTERS y CONSTRUCTOR SOBRECARGADO");
        ahorro = new CuentaAhorro("Antonio", "Sard González", "0123", "3321", "39",
                "8345634523", 2341.23, 2, 120);
        System.out.println("\tNombre y apellidos: " + ahorro.getNombre() + " "
                + ahorro.getApellidos());
        System.out.println("\tTipo de interes: " + ahorro.getTipoDeInteres() 
                + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + ahorro.getCCC());
        System.out.println("\tSaldo actual: " + ahorro.estado() + "€.");
        System.out.println("\tCuota de Mantenimiento: " + ahorro.getCuotaMantenimiento() 
                + "€.");
        ahorro.ingreso(2000);
        System.out.println("\tSaldo tras ingreso: " + ahorro.estado() + "€.");
        ahorro.reintegro(1200.64);
        System.out.println("\tSaldo tras reintegro: " + ahorro.estado() + "€.");
        ahorro.reintegro(123131231212314.0);
        System.out.println("\tSaldo tras reintegro excesivo: " + ahorro.estado() 
                + "€.");
        System.out.println("\nPRUEBA SETTERS");
        ahorro.setNombre("Federico");
        ahorro.setApellidos("García Muñíz");
        ahorro.setCCC("1234", "2231", "78", "1234567891");
        ahorro.setTipoDeInteres(3.2);
        ahorro.setCuotaMantenimiento(210);
        System.out.println("\tNombre y apellidos: " + ahorro.getNombre() + " "
                + ahorro.getApellidos());
        System.out.println("\tTipo de interes: " + ahorro.getTipoDeInteres() + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + ahorro.getCCC());
        System.out.println("\tSaldo actual: " + ahorro.estado() + "€.");
        System.out.println("\tCuota de Mantenimiento: " + ahorro.getCuotaMantenimiento() 
                + "€.");
        System.out.println("\nPRUEBA COMISIONES E INTERESES (día 1 de cada mes)");
        System.out.println("\tSaldo actual: " + ahorro.estado() + "€.");
        ahorro.comisiones();
        System.out.println("\tSaldo tras comisiones: " + ahorro.estado() + "€.");
        System.out.println("\tIntereses anuales producidos: " + ahorro.intereses() 
                + "€.");
        System.out.println("------------------------------------------------");
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("\nCONSTRUCTOR POR DEFECTO");
        corriente = new CuentaCorriente();
        System.out.println("Nombre: " + corriente.getNombre() + ". Saldo: " 
                + corriente.estado());
        System.out.println("\nPRUEBA GETTERS Y CONSTRUCTOR SOBRECARGADO");
        corriente = new CuentaCorriente("Ángel", "Álamo González", "2223", "5453", "22",
                "1231422145", 1200.5, 4.5, 10.2, 3);
        System.out.println("\tNombre y apellidos: " + corriente.getNombre() + " "
                + corriente.getApellidos());
        System.out.println("\tTipo de interes: " + corriente.getTipoDeInteres() 
                + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + corriente.getCCC());
        System.out.println("\tSaldo actual: " + corriente.estado() + "€.");
        System.out.println("\tImporte por transacción: " + corriente.getImportePorTrans() 
                + "€.");
        System.out.println("\tTransacciones exentas: " + corriente.getTransExentas());
        corriente.ingreso(2000);
        System.out.println("\tSaldo tras ingreso: " + corriente.estado() + "€.");
        corriente.reintegro(1200.64);
        System.out.println("\tSaldo tras reintegro: " + corriente.estado() + "€.");
        corriente.reintegro(123131231212314.0);
        System.out.println("\tSaldo tras reintegro excesivo: " + corriente.estado() 
                + "€.");
        System.out.println("\nPRUEBA SETTERS");
        corriente.setNombre("Federico");
        corriente.setApellidos("García Muñíz");
        corriente.setCCC("1234", "2231", "78", "1234567891");
        corriente.setTipoDeInteres(3.2);
        corriente.setImportePorTrans(20.3);
        corriente.setTransExentas(0);
        System.out.println("\tNombre y apellidos: " + corriente.getNombre() + " "
                + corriente.getApellidos());
        System.out.println("\tTipo de interes: " + corriente.getTipoDeInteres() 
                + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + corriente.getCCC());
        corriente.ingreso(2000);
        System.out.println("\tSaldo actual: " + corriente.estado() + "€.");
        System.out.println("\tImporte por transacción: " + corriente.getImportePorTrans() 
                + "€.");
        System.out.println("\tTransacciones exentas: " + corriente.getTransExentas());
        System.out.println("\nPRUEBA COMISIONES E INTERESES (día 1 de cada mes)");
        System.out.println("\tSaldo actual: " + corriente.estado() + "€.");
        corriente.comisiones();
        System.out.println("\tSaldo tras comisiones: " + corriente.estado() + "€.");
        corriente.ingreso(0);
        //No puede acceder a un miembro protected
        //corriente.decrementarTransacciones();
        System.out.println("\tSaldo tras comisiones al no haber transacciones suficientes: " 
                + corriente.estado() + "€.");
        System.out.println("\tIntereses anuales producidos: " + corriente.intereses() + "€.");
         System.out.println("------------------------------------------------");
        System.out.println("CUENTA CORRIENTE CON INCREMENTO: ");
        System.out.println("\nCONSTRUCTOR POR DEFECTO");
        corrienteInc = new CuentaCorrienteConIn();
        System.out.println("Nombre: " + corrienteInc.getNombre() + ". Saldo: " 
                + corrienteInc.estado());
        System.out.println("\nPRUEBA GETTERS Y CONSTRUCTOR SOBRECARGADO");
        corrienteInc = new CuentaCorrienteConIn("Pepe", "González Ramos", "1132",
                "8978", "99", "0987654321", 6000.5, 1.5, 2.2, 3);
        System.out.println("\tNombre y apellidos: " + corrienteInc.getNombre() + " "
                + corrienteInc.getApellidos());
        System.out.println("\tTipo de interes: " + corrienteInc.getTipoDeInteres() 
                + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + corrienteInc.getCCC());
        System.out.println("\tSaldo actual: " + corrienteInc.estado() + "€.");
        System.out.println("\tImporte por transacción: " + corrienteInc.getImportePorTrans() 
                + "€.");
        System.out.println("\tTransacciones exentas: " + corrienteInc.getTransExentas());
        corrienteInc.ingreso(100.23);
        System.out.println("\tSaldo tras ingreso: " + corrienteInc.estado() + "€.");
        corrienteInc.reintegro(345.64);
        System.out.println("\tSaldo tras reintegro: " + corrienteInc.estado() + "€.");
        corrienteInc.reintegro(123131231212314.0);
        System.out.println("\tSaldo tras reintegro excesivo: " + corrienteInc.estado() + "€.");
        System.out.println("\nPRUEBA SETTERS");
        corrienteInc.setNombre("Luis");
        corrienteInc.setApellidos("Viera Ruíz");
        corrienteInc.setCCC("1111", "2222", "11", "0123456789");
        corrienteInc.setTipoDeInteres(7.2);
        corrienteInc.setImportePorTrans(18.3);
        corrienteInc.setTransExentas(0);
        System.out.println("\tNombre y apellidos: " + corrienteInc.getNombre() + " "
                + corrienteInc.getApellidos());
        System.out.println("\tTipo de interes: " + corrienteInc.getTipoDeInteres() + "%.");
        System.out.println("\tCódigo Cuenta Cliente: " + corrienteInc.getCCC());
        corrienteInc.ingreso(2000);
        System.out.println("\tSaldo actual: " + corrienteInc.estado() + "€.");
        System.out.println("\tImporte por transacción: " + corrienteInc.getImportePorTrans() 
                + "€.");
        System.out.println("\tTransacciones exentas: " + corrienteInc.getTransExentas());
        System.out.println("\nPRUEBA COMISIONES E INTERESES (día 1 de cada mes)");
        System.out.println("\tSaldo actual: " + corrienteInc.estado() + "€.");
        corrienteInc.comisiones();
        System.out.println("\tSaldo tras comisiones: " + corrienteInc.estado() + "€.");
        corrienteInc.ingreso(0);
        //No puede acceder a un miembro protected
        //corrienteInc.decrementarTransacciones();
        System.out.println("\tSaldo tras comisiones al no haber transacciones suficientes: " 
                + corrienteInc.estado() + "€.");
        System.out.println("\tIntereses anuales producidos: " + corrienteInc.intereses() 
                + "€.");
        corrienteInc.reintegro(5700);
        System.out.println("\tIntereses anuales con saldo menor que el minimo: " 
                + corrienteInc.intereses() + "€.");
        
    }//Fin Programa
}

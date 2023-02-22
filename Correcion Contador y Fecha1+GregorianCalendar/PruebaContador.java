/**
 *
 * @author Antonio Sard González
 */
public class PruebaContador {
    public static void main(String[] args){
        //Entorno:
        Contador luz, agua, cronometro;
        int valor, incremento;
        byte i;
        //Algoritmo:
        System.out.println("----------------");
        System.out.println("Prueba constructores: ");
        System.out.println("----------------");
        luz = new Contador();
        System.out.println("Contador de luz:\nIncremento: "+luz.getIncremento()+". Valor: "+luz.obtenerCuenta());
        System.out.println("----------------");
        incremento=2;
        agua = new Contador(incremento);
        System.out.println("Contador de agua:\nIncremento: "+agua.getIncremento()+". Valor: "+agua.obtenerCuenta());
        System.out.println("----------------");
        if(agua.equals(luz)){
            System.out.println("Los contadores tienen valores iguales.");
        }else {
            System.out.println("Los contadores tienen valores distintos.");
        }//Fin Si
        System.out.println("----------------");
        incremento=1;
        valor=0;
        cronometro = new Contador(valor, incremento);
        System.out.println("Contador de cronómetro:\nIncremento: "+cronometro.getIncremento()+". Valor: "+cronometro.obtenerCuenta());
        System.out.println("----------------");
        System.out.println("Prueba Setter: ");
        System.out.println("----------------");
        //luz.iniciaCuenta(1.5F);  *tipo incorrecto de dato*
        valor=5;
        luz.iniciaCuenta(valor);
        System.out.println("Contador de luz:\nIncremento: "+luz.getIncremento()+". Valor: "+luz.obtenerCuenta());
        System.out.println("----------------");
        System.out.println("Prueba incrementos: ");
        System.out.println("----------------");
        System.out.println("Contador de luz:\nIncremento: "+luz.getIncremento()+". Valor: "+luz.obtenerCuenta());
        luz.incrementaCuenta();
        System.out.println("Tras incremento:\n"+"Valor: "+luz.obtenerCuenta());
        System.out.println("----------------");
        System.out.println("Contador de agua:\nIncremento: "+agua.getIncremento()+". Valor: "+agua.obtenerCuenta());
        agua.incrementaCuenta();
        System.out.println("Tras incremento:\n"+"Valor: "+agua.obtenerCuenta());
        System.out.println("----------------");
        System.out.println("Contador de cronómetro:\nIncremento: "+cronometro.getIncremento()+". Valor: "+cronometro.obtenerCuenta());
        System.out.println("Iniciando cronómetro...");
        for(i=1;i<=50;i++){
           
           if(i!=50){
               System.out.print(cronometro.incrementaCuenta()+", ");
           } else {
               System.out.println(cronometro.incrementaCuenta()+".");
           }//Fin Si
        }//Fin Para
        System.out.println("Fin del cronómetro.");
        System.out.println("----------------");
    }//Fin Programa
}
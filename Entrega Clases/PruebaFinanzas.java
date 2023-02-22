//Programa: PruebaFinanzas
//Autor: Antonio Sard González
public class PruebaFinanzas {
    public static void main(String[] args){
        //Entorno:
        Finanzas prueba1, prueba2;
        float dolares;
        double euros;
        //Algoritmo:
        /*
        * Prueba de acceso al miembro privado de Finanzas
        * System.out.print(prueba1.importeCambio);
        */
        //Pruebas de constructores:
        prueba1=new Finanzas();
        prueba2=new Finanzas(1.27);
        //Pruebas de getter:
        System.out.println(prueba1.getCambio());
        System.out.println("----------------------");
        System.out.println(prueba2.getCambio());
        System.out.println("----------------------");
        //Pruebas de métodos:
        dolares=237.4F;
        System.out.println(dolares+"$ equivalen a "+prueba1.dolaresToEuros(dolares)+"€.");
        System.out.println("----------------------");
        euros=200.48;
        System.out.println(euros+"€ equivalen a "+prueba2.eurosToDolares(euros)+"$.");
    }//Fin Programa
}
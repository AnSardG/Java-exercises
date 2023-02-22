//Programa: PruebaNumero
//Autor: Antonio Sard
public class PruebaNumero {
    public static void main(String[] args){
    //Entorno:
        Numero num;
        int numAniade, numResta;
    //Algoritmo: 
        /*
        * Prueba de acceso al atributo "valor" de la clase Numero:
        * System.out.print(primerNum.valor);
        * El atributo es privado, no se puede acceder desde otra clase.
        */
        //Prueba del primer constructor
        num=new Numero();
        num.setValor(5);
        num.getDoble();
        //Prueba del segundo constructor
        num=new Numero(1);
        //Prueba aniade
        numAniade=123454320;
        System.out.print(num.getValor()+" + "+numAniade+" = ");
        num.aniade(numAniade);
        System.out.println(num.getValor());
        //Prueba resta
        numResta=321;
        System.out.print(num.getValor()+" - "+numResta+" = ");
        num.resta(numResta);
        System.out.println(num.getValor());
        //Pruebas de Getters y Setters:
        System.out.println("----------------------");
        System.out.println("El valor del número es: "+num.getValor());
        System.out.println("----------------------");
        System.out.println("El valor doble de "+num.getValor()+" es: "+num.getDoble());
        System.out.println("----------------------");
        System.out.println("El valor doble de "+num.getValor()+" es: "+num.getTriple());
        System.out.println("----------------------");
        System.out.println("El valor doble de "+num.getValor()+" es: "+num.getCuadruple());
        System.out.println("----------------------");
        System.out.print("Cambiando el valor de "+num.getValor()+" a ");
        num.setValor(1);
        System.out.println(num.getValor()+".");
    }//Fin Programa
}

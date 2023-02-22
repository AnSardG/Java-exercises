//Programa: PruebaConsumo
//Autor: Antonio Sard González
public class PruebaConsumo {
    public static void main(String[] args){
        //Entorno:
        Consumo coche;
        int kms;
        float litros, precio;
        byte vmed;
        //Algoritmo:
        /*
        * Pruebas de acceso a los atributos de Consumo *
        System.out.print(coche.kms);
        System.out.print(coche.litros);
        System.out.print(coche.vmed);
        System.out.print(coche.precio);
        */
        //Prueba de constructor
        kms=300500;
        litros=66750.43F;
        vmed=80;
        coche= new Consumo(kms, litros, vmed);
        System.out.println("El consumo de su coche es el siguiente: "+coche.getKms()+" kms, "+coche.getLitros()+" litros y "+coche.getVmed()+" km/h como velocidad media.");
        System.out.println("----------------------");
        //Prueba setters y getters
        System.out.print("Cambiando los kilómetros del coche de "+coche.getKms()+" kms a ");
        coche.setKms(kms+123);
        System.out.println(coche.getKms()+" kms.");
        System.out.println("----------------------");
        System.out.print("Cambiando los litros consumidos de "+coche.getLitros()+" litros a ");
        coche.setLitros(litros+30.2F);
        System.out.println(coche.getLitros()+" litros.");
        System.out.println("----------------------");
        System.out.print("Cambiando la velocidad media del coche de "+coche.getVmed()+" km/h a ");
        coche.setVmed((byte)(vmed+5));
        System.out.println(coche.getVmed()+" km/h.");
        System.out.println("----------------------");
        precio=1.74F;
        System.out.print("Cambiando el precio del combustible de "+coche.getPrecio()+"€ a ");
        coche.setPrecio(precio);
        System.out.println(coche.getPrecio()+"€.");
        System.out.println("----------------------");
        System.out.println("Son necesarias "+coche.getTiempo()+ " horas para recorrer "+coche.getKms()+" kms a una velocidad media de "+coche.getVmed()+" kms/h.");
        System.out.println("----------------------");
        System.out.println("Se han consumido "+coche.consumoMedio()+" litros por cada 100 kilómetros recorridos.");
        System.out.println("----------------------");
        System.out.println("El importe en euros de los kilómetros recorridos ("+coche.getKms()+" kms) es: "+coche.consumoEuros()+"€.");
        System.out.println("----------------------");
    }//Fin Programa
}
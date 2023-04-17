import Discos.*;

/**
 *
 * @author Antonio Sard González
 */
public class Ej4 {

    public static void main(String[] args) {
        //Entorno:
        Disco disk;
        Vinilo v1, v2;
        Cd cd1, cd2;
        Dvd dvd1, dvd2;
        //Algoritmo:
//      No es instanciable al ser abstracta la clase
//        disk = new Disco("1234", "Sony", "Pepe");
        System.out.println("Pruebas vinilo");
        System.out.println("Vinilo 1: ");
        v1 = new Vinilo("1234", "Sony", "Mozart", (byte)30, (byte)45);
        System.out.println("Código: " + v1.getCodigo());
        System.out.println("Discográfica: " + v1.getSelloDiscografico());
        System.out.println("Autor: " + v1.getAutor());
        System.out.println("Diámetro: " + v1.getDiametro());
        System.out.println("Revoluciones por minuto: " + v1.getRevolucionesPorMinuto());
        System.out.println("Vinilo 2 (copia): ");
        v2 = new Vinilo(v1);        
        System.out.println("Código: " + v2.getCodigo());
        System.out.println("Discográfica: " + v2.getSelloDiscografico());
        System.out.println("Autor: " + v2.getAutor());
        System.out.println("Diámetro: " + v2.getDiametro());
        System.out.println("Revoluciones por minuto: " + v2.getRevolucionesPorMinuto());
        System.out.println("Vinilo parámetros erroneos: ");
        v2 = new Vinilo("1239", "Sony", "Schubert", (byte)3, (byte)-2);
        System.out.println("Código: " + v2.getCodigo());
        System.out.println("Discográfica: " + v2.getSelloDiscografico());
        System.out.println("Autor: " + v2.getAutor());
        System.out.println("Diámetro: " + v2.getDiametro());
        System.out.println("Revoluciones por minuto: " + v2.getRevolucionesPorMinuto());
        System.out.println("---------------------------------------------");
        System.out.println("Pruebas CD");
        System.out.println("Cd 1: ");
        cd1 = new Cd("1", "Warner Bros", "Karnivool", 2040345563);
        System.out.println("Código: " + cd1.getCodigo());
        System.out.println("Discográfica: " + cd1.getSelloDiscografico());
        System.out.println("Autor: " + cd1.getAutor());
        System.out.println("Almacenamiento (Mbs): " + cd1.getAlmacenamientoMb());
        System.out.println("Copia cd 1: ");
        cd2 = new Cd(cd1);
        System.out.println("Código: " + cd2.getCodigo());
        System.out.println("Discográfica: " + cd2.getSelloDiscografico());
        System.out.println("Autor: " + cd2.getAutor());
        System.out.println("Almacenamiento (Mbs): " + cd2.getAlmacenamientoMb());
        System.out.println("CD parámetros erroneos: ");
        cd1 = new Cd("10", "Bros", "OSI", -234);
        System.out.println("Código: " + cd1.getCodigo());
        System.out.println("Discográfica: " + cd1.getSelloDiscografico());
        System.out.println("Autor: " + cd1.getAutor());
        System.out.println("Almacenamiento (Mbs): " + cd1.getAlmacenamientoMb());
        System.out.println("---------------------------------------------");
        System.out.println("Pruebas DVD");
        System.out.println("Dvd 1: ");
        dvd1 = new Dvd("100", "Decca", "Plini", 12345, false);
        System.out.println("Código: " + dvd1.getCodigo());
        System.out.println("Discográfica: " + dvd1.getSelloDiscografico());
        System.out.println("Autor: " + dvd1.getAutor());
        System.out.println("Almacenamiento (Mbs): " + dvd1.getAlmacenamientoMb());
        if(!dvd1.getCantCapas()){
            System.out.println("Nº Capas: 1");
        } else {
            System.out.println("Nº Capas: 2");
        }//Fin Si        
        dvd2 = new Dvd(dvd1);
        System.out.println("Copia dvd 1: ");
        System.out.println("Código: " + dvd2.getCodigo());
        System.out.println("Discográfica: " + dvd2.getSelloDiscografico());
        System.out.println("Autor: " + dvd2.getAutor());
        System.out.println("Almacenamiento (Mbs): " + dvd2.getAlmacenamientoMb());
        if(!dvd2.getCantCapas()){
            System.out.println("Nº Capas: 1");
        } else {
            System.out.println("Nº Capas: 2");
        }//Fin Si    
        System.out.println("Dvd parámetros mal: ");
        dvd1 = new Dvd("23124214", "Universal", "Eric Johnsson", -1234, true);
        System.out.println("Copia dvd 1: ");
        System.out.println("Código: " + dvd1.getCodigo());
        System.out.println("Discográfica: " + dvd1.getSelloDiscografico());
        System.out.println("Autor: " + dvd1.getAutor());
        System.out.println("Almacenamiento (Mbs): " + dvd1.getAlmacenamientoMb());
        if(!dvd1.getCantCapas()){
            System.out.println("Nº Capas: 1");
        } else {
            System.out.println("Nº Capas: 2");
        }//Fin Si    
//     Intento de copia erroneo
//        dvd2 = new Dvd(cd1);
    }//Fin Programa

}

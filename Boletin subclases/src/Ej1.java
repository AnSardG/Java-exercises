
/**
 *
 * @author Antonio Sard González
 */
public class Ej1 {

    public static void main(String[] args) {
        //Entorno:
        Vehiculo coche;
        Camion camion;
        Especial especial;
        //Algoritmo:
        camion = new Camion("Ford", "Focus", "A938DF", 3276.23F);
        especial = new Especial("Toyota", "Spezi", "39KFDK", 2345.2F, (byte)3);
        System.out.println("Carga camion: " + camion.getCarga());
        System.out.println("Carga especial: " + especial.getCarga());
        System.out.println(especial.getDescripcion());
    }//Fin Programa

}

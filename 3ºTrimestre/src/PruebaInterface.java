import PruebaInterfaz.*;
/**
 *
 * @author Antonio Sard González
 */
public class PruebaInterface {

    public static void main(String[] args) {
        //Entorno:
        Futbolista futbolista;
        Entrenador entrenador;
        Masajista masajista;
        //Algoritmo:
        futbolista = new Futbolista();
        System.out.println("Apartado futbolista:");
        futbolista.concentrarse();
        futbolista.entrenar();
        futbolista.viajar();
        futbolista.jugarPartido();
        futbolista.entrevista();
        entrenador = new Entrenador();
        System.out.println("Apartado entrenador:");
        entrenador.concentrarse();
        entrenador.entrenar();
        entrenador.jugarPartido();
        entrenador.viajar();
        entrenador.planificarEntrenamiento();
        masajista = new Masajista();
        System.out.println("Apartado masajista:");
        masajista.concentrarse();
        masajista.entrenar();
        masajista.jugarPartido();
        masajista.viajar();
        masajista.darMasaje();
    }//Fin Programa

}

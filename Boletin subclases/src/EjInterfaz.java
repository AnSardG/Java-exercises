
/**
 *
 * @author Antonio Sard González
 */
public class EjInterfaz {

    public static byte cuentaJuegosEntregados(Videojuego[] juego) {
        //Entorno:
        byte num, i;
        //Algoritmo:
        num = 0;
        for (i = 0; i < juego.length; i++) {
            if (juego[i].isEntregado()) {
                num++;
                juego[i].devolver();
            }//Fin Si
        }//Fin Para
        return num;
    }//Fin Función

    public static byte cuentaSeriesEntregadas(Serie[] serie) {
        //Entorno:
        byte num, i;
        //Algoritmo:
        num = 0;
        for (i = 0; i < serie.length; i++) {
            if (serie[i].isEntregado()) {
                num++;
                serie[i].devolver();
            }//Fin Si
        }//Fin Para
        return num;
    }//Fin Función

    public static void muestraSeries(Serie[] serie) {
        //Entorno:
        byte i;
        //Algoritmo:
        for (i = 0; i < serie.length; i++) {
            System.out.println("Serie " + (i + 1) + ":");
            System.out.println("\t" + serie[i].toString());
        }//Fin Para
    }//Fin Procedimiento

    public static void muestraJuegos(Videojuego[] juego) {
        //Entorno:
        byte i;
        //Algoritmo:
        for (i = 0; i < juego.length; i++) {
            System.out.println("Videojuego " + (i + 1) + ":");
            System.out.println("\t" + juego[i].toString());
        }//Fin Para
    }//Fin Procedimiento
    
    public static void muestraJuegoMasHoras(Videojuego[] juego){
        //Entorno:
        byte i, pos;
        short horas;
        //Algoritmo:
        horas = -1;
        pos = 0;
        for(i = 0; i < juego.length; i++){
            if(horas < juego[i].getHorasEstimadas()){
                horas = juego[i].getHorasEstimadas();
                pos = i;
            }//Fin Si
        }//Fin Para
        System.out.println("Videojuego con mas horas estimadas: ");
        System.out.println("\t" + juego[pos].toString());
    }//Fin Procedimiento
    
    public static void muestraSerieMasTemporadas(Serie[] serie){
        //Entorno:
        byte i, pos, temporadas;        
        //Algoritmo:
        temporadas = -1;
        pos = 0;
        for(i = 0; i < serie.length; i++){
            if(temporadas < serie[i].getTemporadas()){
                temporadas = serie[i].getTemporadas();
                pos = i;
            }//Fin Si
        }//Fin Para
        System.out.println("Serie con más temporadas: ");
        System.out.println("\t" + serie[pos].toString());
    }//Fin Procedimiento
    
    public static Serie[] creaSeries() {
        //Entorno:
        Serie[] serie;
        //Algoritmo:
        serie = new Serie[5];
        serie[0] = new Serie();
        serie[0].entregar();
        serie[1] = new Serie("True Detective", "Nic Pizzolatto");
        serie[1].entregar();
        serie[2] = new Serie("La casa de papel", "Álex Pina", "Drama, Suspense", (byte) 5);
        serie[3] = new Serie(null, null);
        serie[4] = new Serie(null, null, null, (byte) -23);
        return serie;
    }//Fin Función

    public static Videojuego[] creaJuegos() {
        //Entorno:
        Videojuego[] juego;
        //Algoritmo:
        juego = new Videojuego[5];
        juego[0] = new Videojuego();
        juego[1] = new Videojuego("Dark Souls 3", (short) 25);
        juego[1].entregar();
        juego[2] = new Videojuego("Dark Souls 1", (short) 8, "Acción y aventura", "FromSoftware");
        juego[2].entregar();
        juego[3] = new Videojuego(null, (short) -20);
        juego[4] = new Videojuego(null, (short) -20, null, null);
        return juego;
    }//Fin Función

    public static void main(String[] args) {
        //Entorno:
        Serie[] serie;
        Videojuego[] juego;
        //Algoritmo:       
        serie = EjInterfaz.creaSeries();
        EjInterfaz.muestraSeries(serie);    
        System.out.println("-----------------------------------------------");
        juego = EjInterfaz.creaJuegos();
        EjInterfaz.muestraJuegos(juego);
        System.out.println("-----------------------------------------------");
        System.out.println("Se han entregado " + EjInterfaz.cuentaSeriesEntregadas(serie) 
                + " series, las cuales se devolveran en este instante.");
        System.out.println("Se han entregado " + EjInterfaz.cuentaJuegosEntregados(juego) 
                + " videojuegos, los cuales se devolveran en este instante.");
        System.out.println("-----------------------------------------------");
        System.out.println("Series tras las devoluciones: ");
        EjInterfaz.muestraSeries(serie);   
        System.out.println("-----------------------------------------------");
        System.out.println("Juegos tras las devoluciones: ");
        EjInterfaz.muestraJuegos(juego);
        System.out.println("-----------------------------------------------");
        EjInterfaz.muestraJuegoMasHoras(juego);
        EjInterfaz.muestraSerieMasTemporadas(serie);
    }//Fin Programa
}

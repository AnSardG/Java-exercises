
/**
 *
 * @author Antonio Sard González
 */
public class Ej109 {

    public static void main(String[] args) {
        String resultado, casa, visitante, categoria;
        byte puntos;
        short numEquipos, numPartidos;
        do {
            do {
                System.out.print("Introduce categoría: ");
                categoria = Leer.dato();
            } while (categoria.isEmpty() || categoria.trim().indexOf(" +") >= 0);
            if (!"FIN".equals(categoria)) {
                do{
                    System.out.print("Introduce resultado: ");
                    resultado = Leer.dato();
                    
                }while(!"FIN".equals(resultado));
            }
        } while (!"FIN".equals(categoria));
    }
}

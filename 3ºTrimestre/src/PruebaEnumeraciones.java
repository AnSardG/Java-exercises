
/**
 *
 * @author Antonio Sard González
 */
public class PruebaEnumeraciones {

    public static void main(String[] args) {
        //Entorno:
        Color color;
        //Algoritmo:     
        System.out.println(color.valueOf("AMARILLO"));        
    }//Fin Programa

}
enum Color{
    //Identificadores:
    AMARILLO,BLANCO,AZUL;
    //Atributos:
    private float precio;
    //Constructores:
    Color(String color){
        setPrecio(color);
    }
    //Métodos:

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String color) {
        switch (color) {
            case "AMARILLO":
                precio = 1;
                break;
            case "BLANCO":
                precio = 2;
                break;
            case "AZUL":
                precio = 3;
                break;
        }
    }
    
}

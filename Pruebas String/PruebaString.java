/**
 *
 * @author Antonio Sard González
 */
public class PruebaString {
    public static void main(String[] args){
        //Entorno
        String nombre, apellido1, apellido2, nombreCompleto;
        //Algoritmo:
        System.out.print("Introduzca su nombre: ");
        nombre=Leer.dato();
        System.out.print("Introduzca su primer apellido: ");
        apellido1=Leer.dato();
        System.out.print("Introduzca su segundo apellido: ");
        apellido2=Leer.dato();
        nombreCompleto=nombre.trim().substring(0, 1).toUpperCase()+nombre.trim()
                .substring(1).toLowerCase()+
                " "+
                apellido1.trim().substring(0, 1).toUpperCase()+apellido1.trim()
                .substring(1).toLowerCase()+
                " "+
                apellido2.trim().substring(0, 1).toUpperCase()+apellido2.trim().
                substring(1).toLowerCase();
        System.out.println(nombreCompleto);
    }//Fin programa
}
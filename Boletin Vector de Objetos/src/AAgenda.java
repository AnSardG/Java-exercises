
/**
 *
 * @author Antonio Sard González
 */
public class AAgenda {

    public static byte muestraMenu() {
        //Entorno:
        byte op;
        //Algoritmo:
        do {
            System.out.println("1.- Buscar.");
            System.out.println("2.- Buscar siguiente.");
            System.out.println("3.- Añadir.");
            System.out.println("4.- Eliminar.");
            System.out.println("5.- Salir.");
            System.out.print("\tOpcion: ");
            op = Utilidades.leeByte();
        } while (op < 1 || op > 5);
        return op;
    }//Fin Función

    public static CPersona pidePersona() {
        //Entorno:
        String nombre, direccion;
        long telefono;
        //Algoritmo:
        do {
            System.out.print("Nombre de la persona: ");
            nombre = Leer.dato();
        } while (nombre.isEmpty());
        do {
            System.out.print("Dirección de la persona: ");
            direccion = Leer.dato();
        } while (direccion.isEmpty());
        do {
            System.out.print("Teléfono de la persona: ");
            telefono = Leer.datoLong();
        } while (telefono <= 0);
        return new CPersona(nombre, direccion, telefono);
    }

    public static void main(String[] args) {
        //Entorno:
        byte op;
        int pos, ultimaBusqueda;
        long telefono;
        String nombre;
        CPersona persona;
        ListaTelefonos listin;
        //Algoritmo:
        listin = new ListaTelefonos();
        ultimaBusqueda = -1;
        op = muestraMenu();
        while (op != 5) {
            switch (op) {
                case 1:
                    if (listin.longitud() > 0) {
                        do {
                            System.out.print("Introduzca el nombre de la persona: ");
                            nombre = Leer.dato();
                        } while (nombre.isEmpty());
                        pos = listin.buscar(nombre);
                        if (pos >= 0) {
                            System.out.println("Nombre: " + listin.valorEn(pos)
                                    .obtenerNombre());
                            System.out.println("Dirección: " + listin.valorEn(pos)
                                    .obtenerDireccion());
                            System.out.println("Teléfono: " + listin.valorEn(pos)
                                    .obtenerTelefono());
                            ultimaBusqueda = pos;
                        } else {
                            System.out.println("No se encuentra en la agenda.");
                        }//Fin Si
                    } else {
                        System.out.println("Agenda vacía.");
                    }//Fin Si
                    break;
                case 2:
                    if (listin.longitud() > 0) {
                        if (ultimaBusqueda >= 0) {
                            nombre = listin.valorEn(ultimaBusqueda).obtenerNombre();
                            pos = ultimaBusqueda + 1;
                            while (pos < listin.longitud() && !listin.valorEn(pos)
                                    .obtenerNombre().equals(nombre)) {
                                pos++;
                            }//Fin Mientras
                            if (listin.valorEn(pos) != null && 
                                    listin.valorEn(pos).obtenerNombre().equals(nombre)) {
                                System.out.println("Nombre: " + listin.valorEn(pos)
                                        .obtenerNombre());
                                System.out.println("Dirección: " + listin.valorEn(pos)
                                        .obtenerDireccion());
                                System.out.println("Teléfono: " + listin.valorEn(pos)
                                        .obtenerTelefono());
                                ultimaBusqueda = pos;
                            } else {
                                ultimaBusqueda = -1;
                            }//Fin Si
                        }//Fin Si
                        if (ultimaBusqueda == -1) {
                            System.out.println("No hay datos");
                        }//Fin Si
                    } else {
                        System.out.println("Agenda vacía.");
                    }//Fin Si
                    break;
                case 3:
                    persona = pidePersona();
                    listin.aniadir(persona);
                    break;
                case 4:
                    if (listin.longitud() > 0) {
                        System.out.print("Teléfono de la persona: ");
                        telefono = Leer.datoLong();
                        pos = 0;
                        while (pos < listin.longitud() && listin.valorEn(pos)
                                .obtenerTelefono() != telefono) {
                            pos++;
                        }//Fin Mientras
                        if(listin.valorEn(pos) != null && 
                                listin.valorEn(pos).obtenerTelefono() == telefono){
                            listin.eliminar(pos);
                            System.out.println("Registro eliminado.");
                        } else {
                            System.out.println("Teléfono no encontrado.");
                        }//Fin Si
                    } else {
                        System.out.println("Agenda vacía");
                    }//Fin Si
                    break;
            }//Fin Según Sea
            op = muestraMenu();
        }//Fin Mientras
    }//Fin Programa
}

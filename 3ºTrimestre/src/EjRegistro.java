
/**
 *
 * @author Antonio Sard González
 */
public class EjRegistro {
    public static void muestraAlumnos(EjemploAlumno[] alumnos){
        //Entorno:
        byte i;
        //Algoritmo:
        for(i=0;i<alumnos.length;i++){
            System.out.println("Alumno "+(i+1));
            System.out.println("\tCodigo: "+alumnos[i].getCod());
            System.out.println("\tNombre: "+alumnos[i].getNombre());
            System.out.println("\tNota: "+alumnos[i].getNota());
        }//Fin Para
    }//Fin Procedimiento
    public static void main(String[] args) {
        //Entorno:
        EjemploAlumno[] alumnos;
        byte codigo, i;
        String nombre;
        float nota;
        //Algoritmo:
        alumnos = new EjemploAlumno[8];
        for (i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno "+(i+1)+":");
            System.out.print("\tIntroduzca el código: ");
            codigo = Utilidades.leeByte();
            do {
                System.out.print("\tIntroduzca el nombre: ");
                nombre = Leer.dato();
            } while (nombre.trim().isEmpty());
            do {
                System.out.print("\tIntroduzca la nota: ");
                nota = Leer.datoFloat();
            } while (nota < 0 || nota > 10);
            alumnos[i] = new EjemploAlumno(codigo, nombre, nota);
        }//Fin Para
        System.out.println("---------------------------");
        EjRegistro.muestraAlumnos(alumnos);
    }//Fin Programa
}

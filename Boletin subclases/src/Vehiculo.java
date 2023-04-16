
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class Vehiculo {
    //Atributos:

    private String marca, modelo, matricula;
    private GregorianCalendar fechaMatriculacion;
    
    //Constructores:    

    public Vehiculo(String marca, String modelo, String matricula) {
        setMarca(marca);
        setModelo(modelo);
        setMatricula(matricula);
        fechaMatriculacion = new GregorianCalendar();
    }

    public Vehiculo(String marca, String modelo, String matricula, int dia, int mes, int anio) {
        setMarca(marca);
        setModelo(modelo);
        setMatricula(matricula);
        setFechaMatriculacion(anio, mes, dia);
    }

    //Métodos:
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        } else {
            this.marca = "-1";
        }//Fin Si        
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            this.modelo = "-1";
        }//Fin Si
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            this.matricula = "-1";
        }//Fin Si
    }

    /**
     * @return the fechaMatriculacion
     */
    public String getFechaMatriculacion() {
        //Entorno:
        String fecha;
        //Algoritmo:
        fecha = Integer.toString(fechaMatriculacion.get(GregorianCalendar.DAY_OF_MONTH))
                + "/" + Integer.toString(fechaMatriculacion.get(GregorianCalendar.MONTH) + 1)
                + "/" + Integer.toString(fechaMatriculacion.get(GregorianCalendar.YEAR));
        return fecha;
    }

    /**
     * @param fechaMatriculacion the fechaMatriculacion to set
     */
    public void setFechaMatriculacion(int dia, int mes, int anio) {
        fechaMatriculacion.set(GregorianCalendar.YEAR, anio);
        fechaMatriculacion.set(GregorianCalendar.MONTH, mes);
        fechaMatriculacion.set(GregorianCalendar.DAY_OF_MONTH, dia);
    }
}

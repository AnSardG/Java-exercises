/**
 *
 * @author Antonio Sard González
 */
public interface Entregable {
    public abstract void entregar();
    public abstract void devolver();
    public abstract boolean isEntregado();
    public abstract int compareTo(Object a);
}

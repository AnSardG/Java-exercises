
/**
 *
 * @author Antonio Sard González
 */
public class Ej109 {

    public static void main(String[] args) {
        String resultado, casa, visitante, categoria, puntosCasa, puntosVisitante,
                ganadores, perdedores, equipos;
        short numEquipos, numPartidos;
        do {
            do {
                System.out.print("Introduce categoría: ");
                categoria = Leer.dato();
            } while (categoria.isEmpty() || categoria.trim().indexOf(" ") >= 0
                    || categoria.trim().length() > 16);
            if (!"FIN".equals(categoria)) {
                numEquipos = 0;
                numPartidos = 0;
                ganadores = "";
                perdedores = "";
                equipos = "";
                do {
                    System.out.print("Introduce resultado: ");
                    resultado = Leer.dato();
                    resultado = resultado.trim().replaceAll(" +", " ");
                    if (resultado.length() - resultado.replaceAll(" ", "")
                            .length() == 3) {
                        casa = resultado.substring(0, resultado.indexOf(" "));
                        resultado = resultado.substring(resultado.indexOf(" ") + 1);
                        puntosCasa = resultado.substring(0, resultado.indexOf(" "));
                        resultado = resultado.substring(resultado.indexOf(" ") + 1);
                        visitante = resultado.substring(0, resultado.indexOf(" "));
                        puntosVisitante = resultado.substring(resultado.indexOf(" ") + 1);
                        if (casa.length() <= 16 && visitante.length() <= 16
                                && !casa.equals(visitante) && puntosCasa.length()
                                == 1 && puntosVisitante.length() == 1 && "0123"
                                .indexOf(puntosCasa) >= 0 && "0123"
                                .indexOf(puntosVisitante) >= 0 && Byte.valueOf(puntosCasa)
                                + Byte.valueOf(puntosVisitante) == 3) {
                            if (Byte.valueOf(puntosCasa) > 1) {
                                ganadores += casa;
                                perdedores += visitante;
                            } else {
                                ganadores += visitante;
                                perdedores += casa;
                            }
                            if (ganadores.indexOf(casa) < 0 && perdedores.indexOf(casa) < 0) {
                                numEquipos++;
                            }
                            if (ganadores.indexOf(visitante) < 0 && perdedores.indexOf(casa) < 0) {
                                numEquipos++;
                            }
                            if (equipos.indexOf(casa) < 0) {
                                equipos += casa + " ";
                            }
                            if (equipos.indexOf(visitante) < 0) {
                                equipos += visitante + " ";
                            }
                            numPartidos++;
                        }
                    }
                } while (!"FIN".equals(resultado));
                System.out.println(ganadores + " " + (numPartidos % numEquipos));
            }
        } while (!"FIN".equals(categoria));
    }
}

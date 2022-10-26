import java.util.*;

/**
 * Clase EliminadosComparator, comparador de Tenistas segÃºn su posicion en la que fue eliminado
 * 
 * @author (NicolÃ¡s LÃ³pez de lerma LÃ³pez) 
 * @version (14/10/2021)
 */
public class comparadorCiclistas implements Comparator<Ciclista> {
    /**
     * 
     */
    public int compare(Ciclista c1, Ciclista c2) 
    {
        if (c1.getEnergia() < c2.getEnergia()) {
            return 1;
        } else if (c1.getEnergia() > c2.getEnergia()) {
            return -1;
        } else {
            return 0;
        }
    }
}


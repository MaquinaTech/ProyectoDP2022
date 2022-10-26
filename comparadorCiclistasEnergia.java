import java.util.*;

/**
 * Comparador de ciclistas segun su energia
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (26/10/2022)
 */
public class comparadorCiclistasEnergia implements Comparator<Ciclista> {
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


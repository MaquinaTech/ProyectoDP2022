import java.util.*;

/**
 * Comparador de ciclistas segun su habilidad
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (26/10/2022)
 */
public class comparadorCiclistasHabilidad implements Comparator<Ciclista> {
    /**
     * 
     */
    public int compare(Ciclista c1, Ciclista c2) 
    {
        if (c1.getHabilidad() < c2.getHabilidad()) {
            return 1;
        } else if (c1.getHabilidad() > c2.getHabilidad()) {
            return -1;
        } else {
            return 0;
        }
    }
}


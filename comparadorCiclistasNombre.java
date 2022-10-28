import java.util.*;

/**
 * Comparador de biciletas segun su nombre
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (26/10/2022)
 */
public class comparadorCiclistasNombre implements Comparator<Ciclista> {
    /**
     * 
     */
    public int compare(Ciclista c1, Ciclista c2) 
    {
        return  c1.getNombreCiclista().compareTo(c2.getNombreCiclista());
    }
}


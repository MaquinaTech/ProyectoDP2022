import java.util.*;

/**
 * Comparador de biciletas segun su nombre
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (26/10/2022)
 */
public class comparadorBicicletasNombre implements Comparator<Bicicleta> {
    /**
     * 
     */
    public int compare(Bicicleta b1, Bicicleta b2) 
    {
        return  b1.getNombre().compareTo(b2.getNombre());
    }
}


import java.util.*;

/**
 * Comparador de biciletas segun su peso
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (26/10/2022)
 */
public class comparadorBicicletasPeso implements Comparator<Bicicleta> {
    
    /**
     * 
     */
    public int compare(Bicicleta b1, Bicicleta b2) 
    {
        if (b1.getPeso() < b2.getPeso()) {
            return 1;
        } else if (b1.getPeso() > b2.getPeso()) {
            return -1;
        } else {
            return 0;
        }
    }
}


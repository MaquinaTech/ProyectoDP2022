import java.util.*;

/**
 * Clase EliminadosComparator, comparador de Tenistas segÃºn su posicion en la que fue eliminado
 * 
 * @author (Nicolas Lopez de lerma Lopez) 
 * @version (14/10/2021)
 */
public class comparadorBicicletas implements Comparator<Bicicleta> {
    /**
     * 
     */
    public int compare(Bicicleta b1, Bicicleta b2) 
    {
        return  b1.getNombre().compareTo(b2.getNombre());
        /*if (b1.getNombre() < b2.getNombre()) {
            return 1;
        } else if (b1.getNombre() > b2.getNombre()) {
            return -1;
        } else {
            return 0;
        }*/
    }
}


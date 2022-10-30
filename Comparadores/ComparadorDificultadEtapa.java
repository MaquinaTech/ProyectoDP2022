import java.util.Comparator;

public class ComparadorDificultadEtapa implements Comparator<Etapa>{

    @Override
    public int compare(Etapa e1, Etapa e2) {
        if(e1.getDificultadEtapa() > e2.getDificultadEtapa()) {
            return 1;
        }
        else {
            if (e1.getDificultadEtapa() < e2.getDificultadEtapa()) {
                return -1;
            }
            else {
                return e1.getNombreEtapa().compareTo(e2.getNombreEtapa());
            }
        }
    }
}

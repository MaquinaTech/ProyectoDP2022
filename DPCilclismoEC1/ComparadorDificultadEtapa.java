import java.util.Comparator;

public class ComparadorDificultadEtapa implements Comparator<Etapa>{

	@Override
	public int compare(Etapa o1, Etapa o2) {
		if(o1.getDificultad()>o2.getDificultad()) {
			return 1;
		}
		else {
			if(o1.getDificultad()<o2.getDificultad()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}

	
	
}

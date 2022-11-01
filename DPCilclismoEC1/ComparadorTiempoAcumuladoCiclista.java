import java.util.Comparator;

public class ComparadorTiempoAcumuladoCiclista implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista o1, Ciclista o2) {
		if(o1.tiempoTerminadas()>o2.tiempoTerminadas()) {
			return 1;
		}
		else {
			if(o1.tiempoTerminadas()<o2.tiempoTerminadas()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}
	
}

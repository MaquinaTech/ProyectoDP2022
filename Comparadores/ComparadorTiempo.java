import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista c1, Ciclista c2) {
		if(c1.tiempoTerminadas() > c2.tiempoTerminadas()) {
			return 1;
		}
		else {
			if(c1.tiempoTerminadas() < c2.tiempoTerminadas()) {
				return -1;
			}
			else {
				return c1.getNombreCiclista().compareTo(c2.getNombreCiclista());
			}
		}
	}
}

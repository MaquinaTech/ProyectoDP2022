import java.util.Comparator;

public class ComparadorUltimoTiempo implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista c1, Ciclista c2) {
		if (c1.ultimoTiempo() > c2.ultimoTiempo()) {
			return 1;
		}
		else {
			if (c1.ultimoTiempo() < c2.ultimoTiempo()) {
				return -1;
			}
			else {
				return c1.getNombreCiclista().compareTo(c2.getNombreCiclista());
			}
		}
	}

}

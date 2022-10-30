import java.util.Comparator;

public class ComparadorEnergia implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista c1, Ciclista c2) {
		if (c1.getEnergiaCiclista() > c2.getEnergiaCiclista()) {
			return 1;
		}
		else {
			if (c1.getEnergiaCiclista() < c2.getEnergiaCiclista()) {
				return -1;
			}
			else {
				return c1.getNombreCiclista().compareTo(c2.getNombreCiclista());
			}
		}
	}
}

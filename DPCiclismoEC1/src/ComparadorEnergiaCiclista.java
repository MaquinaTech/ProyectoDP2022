import java.util.Comparator;

public class ComparadorEnergiaCiclista implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista o1, Ciclista o2) {
		if(o1.getEnergia()>o2.getEnergia()) {
			return 1;
		}
		else {
			if(o1.getEnergia()<o2.getEnergia()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}

}

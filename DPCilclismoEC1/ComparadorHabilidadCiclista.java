import java.util.Comparator;

public class ComparadorHabilidadCiclista implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista o1, Ciclista o2) {
		if(o1.getHabilidad()>o2.getHabilidad()) {
			return 1;
		}
		else {
			if(o1.getHabilidad()<o2.getHabilidad()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}
	
}

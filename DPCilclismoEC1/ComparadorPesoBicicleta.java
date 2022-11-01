import java.util.Comparator;

public class ComparadorPesoBicicleta implements Comparator<Bicicleta>{

	@Override
	public int compare(Bicicleta o1, Bicicleta o2) {
		if(o1.getPeso()>o2.getPeso()) {
			return 1;
		}
		else {
			if(o1.getPeso()<o2.getPeso()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}

}

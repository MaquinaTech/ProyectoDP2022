import java.util.Comparator;

public class ComparadorPesoBicicleta implements Comparator<Bicicleta>{

	@Override
	public int compare(Bicicleta b1, Bicicleta b2) {
		if(b1.getPeso() > b2.getPeso()) {
			return 1;
		}
		else {
			if(b1.getPeso() < b2.getPeso()) {
				return -1;
			}
			else {
				return b1.getNombre().compareTo(b2.getNombre());
			}
		}
	}

}

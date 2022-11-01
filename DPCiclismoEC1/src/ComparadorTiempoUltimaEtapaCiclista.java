import java.util.Comparator;

public class ComparadorTiempoUltimaEtapaCiclista implements Comparator<Ciclista>{

	@Override
	public int compare(Ciclista o1, Ciclista o2) {
		if(o1.ultimoTiempoConseguido()>o2.ultimoTiempoConseguido()) {
			return 1;
		}
		else {
			if(o1.ultimoTiempoConseguido()<o2.ultimoTiempoConseguido()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}
	
}

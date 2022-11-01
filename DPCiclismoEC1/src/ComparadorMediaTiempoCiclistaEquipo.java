import java.util.Comparator;

public class ComparadorMediaTiempoCiclistaEquipo implements Comparator<Equipo>{

	@Override
	public int compare(Equipo o1, Equipo o2) {
		if(o1.mediaTiempoCiclistas()>o2.mediaTiempoCiclistas()) {
			return 1;
		}
		else {
			if(o1.mediaTiempoCiclistas()<o2.mediaTiempoCiclistas()) {
				return -1;
			}
			else {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}
	}

}

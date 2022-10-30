import java.util.Comparator;

public class ComparadorMediaTiempoEquipo implements Comparator<Equipo>{

	@Override
	public int compare(Equipo e1, Equipo e2) {
		if (e1.mediaTiempoCiclistas() > e2.mediaTiempoCiclistas()) {
			return 1;
		}
		else {
			if (e1.mediaTiempoCiclistas() < e2.mediaTiempoCiclistas()) {
				return -1;
			}
			else {
				return e1.getNombreEquipo().compareTo(e2.getNombreEquipo());
			}
		}
	}

}

import java.util.ArrayList;
import java.util.Comparator;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Ciclista> listaCiclistasEquipo;
	private ArrayList<Ciclista> listaAbandonosEquipo;
	private ArrayList<Bicicleta> listaBicicletasEquipo;
	private Comparator<Ciclista> comparadorCiclista;
	private Comparator<Bicicleta> comparadorBicicleta;	
	
	public Equipo() {
		this.nombreEquipo = "";
		this.listaCiclistasEquipo = new ArrayList<>();
		this.listaAbandonosEquipo = new ArrayList<>();
		this.listaBicicletasEquipo = new ArrayList<>();
	}

	public Equipo(String nombreEquipo) {;
		this.nombreEquipo = nombreEquipo;
		this.listaCiclistasEquipo = new ArrayList<>();
		this.listaAbandonosEquipo = new ArrayList<>();
		this.listaBicicletasEquipo = new ArrayList<>();
	}

	public Equipo(String nombreEquipo, Comparator<Ciclista> compC, Comparator<Bicicleta> compB) {
		this.nombreEquipo = nombreEquipo;
		this.listaCiclistasEquipo = new ArrayList<>();
		this.listaAbandonosEquipo = new ArrayList<>();
		this.listaBicicletasEquipo = new ArrayList<>();
		this.comparadorCiclista = compC;
		this.comparadorBicicleta = compB;
	}

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public void ordenarCiclistasEquipo() {
		this.listaCiclistasEquipo.sort(comparadorCiclista);
	}
	
	public void ordenarBicicletasEquipo() {
		this.listaBicicletasEquipo.sort(comparadorBicicleta);
	}
	
	public double getTiempoTotal() {
		double total = 0;
		for (Ciclista ciclista : listaCiclistasEquipo) {
			total+= ciclista.tiempoTerminadas();
		}
		return total;
	}
	
	public Ciclista enviarCiclista() {
		Ciclista ciclista = this.listaCiclistasEquipo.get(0);
		Bicicleta bicicleta = this.listaBicicletasEquipo.get(0);
		this.listaBicicletasEquipo.remove(0);
		ciclista.setBicicletaCiclista(bicicleta);
		this.listaCiclistasEquipo.remove(0);
		return ciclista;
	}
	
	public Bicicleta enviarBicicleta() {
		Bicicleta bicicleta = this.listaBicicletasEquipo.get(0);
		
		this.listaBicicletasEquipo.remove(0);
		return bicicleta;
	}
	
	public boolean hayCiclistas() {
		return !this.listaCiclistasEquipo.isEmpty();
	}

	public void anadirBicicleta(Bicicleta bicicleta) {
		this.listaBicicletasEquipo.add(bicicleta);
		
	}

	public void anadirCiclista(Ciclista ciclista) {
		this.listaCiclistasEquipo.add(ciclista);
		
	}

	@Override
	public String toString() {
		String cad = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
		cad+= "%%% " + this.nombreEquipo + " %%% Media Minutos de Ciclistas sin abandonar " 
		+ this.getTiempoTotal() + " %%%\n";
		return cad;
	}
	
	public void mostrarCiclistas() {
		for (Ciclista ciclista : listaCiclistasEquipo) {
			System.out.println(ciclista);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
	}
	
	public double mediaTiempoCiclistas() {
		double tiempo = 0, cont = 0;
		for (Ciclista ciclista : listaCiclistasEquipo) {
			tiempo+= ciclista.mediaTiempo();
			cont++;
		}
		return tiempo/cont;
	}
	
	
	
}


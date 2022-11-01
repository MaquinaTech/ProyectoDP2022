import java.util.ArrayList;
import java.util.Comparator;

public class Equipo {
	private String nombre;
	private ArrayList<Ciclista> listaCiclistas;
	private ArrayList<Ciclista> listaAbandonados;
	private ArrayList<Bicicleta> listaBicicletas;
	private Comparator<Ciclista> comparadorCiclista;
	private Comparator<Bicicleta> comparadorBicicleta;
	
	public Equipo() {
		this.nombre="";
		this.listaAbandonados = new ArrayList<Ciclista>();
		this.listaBicicletas = new ArrayList<Bicicleta>();
		this.listaCiclistas = new ArrayList<Ciclista>();
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.listaAbandonados = new ArrayList<Ciclista>();
		this.listaBicicletas = new ArrayList<Bicicleta>();
		this.listaCiclistas = new ArrayList<Ciclista>();
	}

	public Equipo(String nombre, Comparator<Ciclista> cc, Comparator<Bicicleta> cb) {
		this.nombre = nombre;
		this.listaAbandonados = new ArrayList<Ciclista>();
		this.listaBicicletas = new ArrayList<Bicicleta>();
		this.listaCiclistas = new ArrayList<Ciclista>();
		this.comparadorCiclista = cc;
		this.comparadorBicicleta = cb;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ordenarCiclistas() {
		this.listaCiclistas.sort(comparadorCiclista);
	}
	
	public void ordenarBicicletas() {
		this.listaBicicletas.sort(comparadorBicicleta);
	}
	
	public double getTiempoTotalCiclistas() {
		double tiempoTotal=0;
		for (Ciclista c : listaCiclistas) {
			tiempoTotal+=c.tiempoTerminadas();
		}
		return tiempoTotal;
	}
	
	public Ciclista enviarCiclista() {
		Ciclista c = this.listaCiclistas.get(0);
		Bicicleta b = this.listaBicicletas.get(0);
		this.listaBicicletas.remove(0);
		this.listaCiclistas.remove(0);
		c.setBici(b);
		return c;
	}
	
	public boolean hayCiclistas() {
		return !this.listaCiclistas.isEmpty();
	}
	
	public Bicicleta enviarBicicleta() {
		Bicicleta b = this.listaBicicletas.get(0);
		this.listaBicicletas.remove(0);
		return b;
	}

	public void anadirBicicleta(Bicicleta b) {
		this.listaBicicletas.add(b);
		this.ordenarBicicletas();
	}

	public void anadirCiclista(Ciclista c) {
		if(c.getEnergia()<0) {
			this.listaAbandonados.add(c);
		}
		else {
			this.listaCiclistas.add(c);
			this.ordenarCiclistas();
		}
	}

	@Override
	public String toString() {
		String cadena = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
		cadena+="%%% " + this.nombre.toUpperCase() + " %%% Media Minutos de Ciclistas sin abandonar " + this.mediaTiempoCiclistas() + " %%%\n";
		
		return cadena;
	}
	
	public void mostrarCiclistasEquipo() {
		for (Ciclista c : listaCiclistas) {
			System.out.println(c);
		}
		for (Ciclista c : listaAbandonados) {
			System.out.println(c);
		}
	}
	
	public double mediaTiempoCiclistas() {
		double tiempo=0, cont=0;
		for (Ciclista c : listaCiclistas) {
			tiempo+=c.tiempoTerminadas();
			cont++;
		}
		return tiempo/cont;
	}

	public boolean hayCiclistasAbandonados() {
		return !this.listaAbandonados.isEmpty();
	}

	public Ciclista enviarCiclistaAbandonado() {
		return this.listaAbandonados.remove(0);
	}
}

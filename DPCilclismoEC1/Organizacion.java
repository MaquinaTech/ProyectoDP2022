import java.util.ArrayList;
import java.util.Iterator;

public class Organizacion {
	private ArrayList<Etapa> listaEtapas;
	private ArrayList<Equipo> listaEquipos;
	private ArrayList<Ciclista> ciclistasCarrera;
	private ComparadorDificultadEtapa cde;
	private boolean hayAbandonados;
	
	public Organizacion() {
		this.listaEtapas = new ArrayList<Etapa>();
		this.listaEquipos = new ArrayList<Equipo>();
		this.ciclistasCarrera = new ArrayList<Ciclista>();
		this.cde = null;
		this.hayAbandonados=false;
	}
	
	public Organizacion(ComparadorDificultadEtapa comDifEtapa) {
		this.listaEtapas = new ArrayList<Etapa>();
		this.listaEquipos = new ArrayList<Equipo>();
		this.ciclistasCarrera = new ArrayList<Ciclista>();
		this.cde = comDifEtapa;
		this.hayAbandonados=false;
	}

	public void inscribirEquipo(Equipo e) {
		this.listaEquipos.add(e);
	}

	public void gestionarCampeonato() {
		int i=1;
		Etapa e = null;
		mostrarEtapas();
		mostrarEquipos();
		while(i<=listaEtapas.size()) {
			e=listaEtapas.get(i-1);
			System.out.println("\n********************************************************************************************************");
			System.out.println("*** CARRERA<" + i + "> EN " + e + " ***");
			System.out.println("********************************************************************************************************");
			obtenerCiclistas();
			this.ciclistasCarrera.sort(new ComparadorTiempoAcumuladoCiclista().reversed());
			mostrarCiclistasCompetir(e.getNombre());
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
					+ "+++++++++++++++++++++++++ Comienza la carrera en "+ e.getNombre() +" ++++++++++++++++++++++++++\r\n"
					+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			procesarCiclistas(e);
			mostrarClasificacionFinalCarrera(e);
			regresarCiclistas();
			i++;
		}
		System.out.println("****************************************************\r\n"
				+ "**************** FIN DEL CAMPEONATO ****************\r\n"
				+ "****************************************************");
		entregaPremios();
	}

	private void entregaPremios() {
		int i=1;
		obtenerCiclistas();
		if(!this.ciclistasCarrera.isEmpty()) {
			System.out.println("********** CLASIFICACIÓN FINAL DE CICLISTAS **********\r\n"
					+ "****************************************************");
			this.ciclistasCarrera.sort(new ComparadorTiempoAcumuladoCiclista());
			for (Ciclista c : ciclistasCarrera) {
				System.out.println("@@@ Posición(" + i + "): " + c.getNombre() + " - Tiempo Total: " + c.tiempoTerminadas() + " @@@");
				c.mostrarResultados();
				System.out.println();
				i++;
			}
			regresarCiclistas();
			
			if(hayAbandonados) {
				System.out.println("****************************************************\r\n"
						+ "************** CICLISTAS QUE ABANDONARON **************\r\n"
						+ "****************************************************");
				obtenerCiclistasAbandonados();
				for (Ciclista c : ciclistasCarrera) {
					System.out.println("--- ciclista Abandonado: " + c.getNombre() + " - Puntos Totales Anulados: " + c.tiempoTerminadas() + " ---");
					c.mostrarResultados();
					System.out.println();
				}
			}
			regresarCiclistas();
			

			System.out.println("****************************************************\r\n"
					+ "******** CLASIFICACIÓN FINAL DE EQUIPOS *********\r\n"
					+ "****************************************************");
			this.listaEquipos.sort(new ComparadorMediaTiempoCiclistaEquipo());
			i=1;
			for (Equipo e : listaEquipos) {
				System.out.println("@@@ Posición(" + i + ") " + e.getNombre() + " con " + e.mediaTiempoCiclistas() + " minutos de media @@@");
				System.out.println(e);
				e.mostrarCiclistasEquipo();
				i++;
			}
			
		}
		else {
			System.out.println("No se pueden entregar los premios porque abandonaron todos los ciclistas");
		}
	}

	private void regresarCiclistas() {
		for (Iterator<Ciclista> iterator = ciclistasCarrera.iterator(); iterator.hasNext();) {
			Ciclista c = (Ciclista) iterator.next();
			insertarCiclistaEnSuEquipo(c);
			iterator.remove();
		}
	}

	private void insertarCiclistaEnSuEquipo(Ciclista c) {
		String nombreEquipo=c.getEquipo().getNombre();
		Equipo e;
		boolean enc=false;
		int i=0;
		while(i<this.listaEquipos.size()&&!enc) {
			e=listaEquipos.get(i);
			if(e.getNombre()==nombreEquipo) {
				enc=true;
				e.anadirCiclista(c);
				e.anadirBicicleta(c.getBici());
			}
			else {
				i++;
			}
		}
	}
	
	private void mostrarClasificacionFinalCarrera(Etapa e) {
		int i=1;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "+++++++++++++++++ Clasificación final de la carrera en " + e.getNombre() + " ++++++++++++++++++\r\n"
				+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		this.ciclistasCarrera.sort(new ComparadorTiempoUltimaEtapaCiclista());
		for (Ciclista c : ciclistasCarrera) {
			if(c.getEnergia()>=0) {
				System.out.println("@@@ Posición(" + i + "): " + c.getNombre() + " - Tiempo: " + c.ultimoTiempoConseguido() + " minutos @@@");
				i++;
			}
		}
		for (Ciclista c : ciclistasCarrera) {
			if(c.getEnergia()<0) {
				System.out.println("¡¡¡ Ha abandonado " + c.getNombre() + " - Tiempo: " + c.getEnergia() + " - Además ha abandonado para el resto del Campeonato !!!");
			}
		}
	}

	private void procesarCiclistas(Etapa e) {
		Ciclista c;
		for(int i=0; i<this.ciclistasCarrera.size(); i++) {
			System.out.println("@@@ ciclista " + (i+1) + " de " + this.ciclistasCarrera.size());
			c = this.ciclistasCarrera.get(i);
			System.out.println(c + " con bicicleta");
			System.out.println(c.getBici() + " en etapa " + e.getNombre());
			System.out.println("+++ Con estas condiciones el ciclista "+ c.getNombre() + " con la bicicleta " + c.getBici().getNombre() + " alcanza una velocidadad de "+ c.getBici().calcularVelocidad(c, e) +" km/hora +++");
			
			c.setEnergia(c.getEnergia() - c.calcularTiempo(e));
			if(c.getEnergia()<0) {
				System.out.println("¡¡¡ El ciclista " + c.getNombre() + " se quedó sin energia a falta de " + (0-c.getEnergia()) + " minutos para terminar !!!");
				System.out.println("¡¡¡ En el momento de quedarse sin energia llevaba en carrera " + (c.calcularTiempo(e) + c.getEnergia()) + " minutos !!!");
				c.anotarResultado(e.getNombre(), c.getEnergia());
				hayAbandonados=true;
			}
			else {
				System.out.println("+++ " + c.getNombre() + " termina la etapa en " + c.calcularTiempo(e) + " minutos +++");
				c.anotarResultado(e.getNombre(), c.calcularTiempo(e));
			}
			
			System.out.println("+++ La energía del ciclista " + c.getNombre() + " tras la carrera es " + Math.round(c.getEnergia()*100.0)/100.0 + " +++");
			System.out.println("@@@");
		}
	}

	private void mostrarCiclistasCompetir(String nombreEtapa) {
		System.out.println("********************************************************************************************************");
		System.out.println("******************************** Ciclistas que van a competir en " + nombreEtapa + " *******************************");
		System.out.println("**********************************************************************************************************");
		for (Ciclista c : ciclistasCarrera) {
			System.out.println(c);
		}
	}

	private void obtenerCiclistas() {
		for (Equipo e : listaEquipos) {
			while(e.hayCiclistas()) {
				this.ciclistasCarrera.add(e.enviarCiclista());
			}
		}
	}

	private void obtenerCiclistasAbandonados() {
		for (Equipo e : listaEquipos) {
			while(e.hayCiclistasAbandonados()) {
				this.ciclistasCarrera.add(e.enviarCiclistaAbandonado());
			}
		}
	}
	
	private void mostrarEquipos() {
		this.listaEquipos.sort(new ComparadorMediaTiempoCiclistaEquipo());
		System.out.println("\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%% EQUIPOS DEL CAMPEONATO %%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		for (Equipo e : listaEquipos) {
			//e.ordenarCiclistas();
			//e.ordenarBicicletas();
			System.out.println(e);
			e.mostrarCiclistasEquipo();
			
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		}
		
	}

	private void mostrarEtapas() {
		this.listaEtapas.sort(new ComparadorDificultadEtapa());
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\r\n"
				+ "||||||||||||||||||| ETAPAS DEL CAMPEONATO |||||||||||||||||||\r\n"
				+ "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		for (Etapa e : listaEtapas) {
			System.out.println(e);
		}
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	}

	
	
	public void anadirEtapa(Etapa e) {
		this.listaEtapas.add(e);
		
	}
}

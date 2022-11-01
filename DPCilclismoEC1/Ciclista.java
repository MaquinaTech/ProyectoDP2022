import java.util.ArrayList;

public class Ciclista {
	private String nombre;
	private Bicicleta bici;
	private double habilidad;
	private double energia;
	private ArrayList<Resultado> resultados;
	private Equipo equipo;
	
	public Ciclista() {
		this.nombre="Sin asignar";
		this.bici=null;
		this.habilidad=0.0;
		this.energia=0.0;
		this.resultados= new ArrayList<Resultado>();
		this.equipo=null;
	}

	public Ciclista(String nombre, double habilidad, double energia) {
		this.nombre = nombre;
		this.bici=null;
		this.habilidad = habilidad;
		this.energia = energia;
		this.resultados= new ArrayList<Resultado>();
		this.equipo=null;
	}

	public Ciclista(String nombre, double habilidad, double energia, Equipo e) {
		this.nombre=nombre;
		this.bici=null;
		this.habilidad=habilidad;
		this.energia=energia;
		this.resultados = new ArrayList<Resultado>();
		this.equipo=e;
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

	/**
	 * @return the bici
	 */
	public Bicicleta getBici() {
		return bici;
	}

	/**
	 * @param bici the bici to set
	 */
	public void setBici(Bicicleta bici) {
		this.bici = bici;
	}

	/**
	 * @return the habilidad
	 */
	public double getHabilidad() {
		return habilidad;
	}

	/**
	 * @param habilidad the habilidad to set
	 */
	public void setHabilidad(double habilidad) {
		this.habilidad = habilidad;
	}

	/**
	 * @return the energia
	 */
	public double getEnergia() {
		return energia;
	}

	/**
	 * @param energia the energia to set
	 */
	public void setEnergia(double energia) {
		this.energia = energia;
	}

	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "<" + this.getClass().getName().toLowerCase() + ":" + nombre + "> <energía: " + energia + "> <habilidad: " + habilidad + ",> <tiempo acumulado sin abandonar: " + this.tiempoTerminadas() + "> <abandonado:" + haAbandonado() + ">";
	}
	
	public boolean haAbandonado() {
		boolean res;
		if(this.energia<0)
			res = true;
		else
			res = false;
		return res;
	}
	
	public void anotarResultado(String nombreEtapa, double resultadoEtapa) {
		Resultado r = new Resultado(nombreEtapa, resultadoEtapa);
		this.resultados.add(r);
	}
	
	public void mostrarResultados() {
		for (Resultado r : resultados) {
			System.out.println(r);
		}
	}
	
	public int numeroEtapas() {
		return this.resultados.size();
	}
	
	public int numeroEtapasTerminadas() {
		int cont=0;
		for (Resultado r : resultados) {
			if(r.getTiempoEtapa()>0) {
				cont++;
			}
		}
		return cont;
	}
	
	public double tiempoTerminadas() {
		double res=0;
		for (Resultado r : resultados) {
			if(r.getTiempoEtapa()>0) {
				res+=r.getTiempoEtapa();
			}
		}
		return res;
	}
	
	public String etapaAbandono() {
		String nombreEtapa = null;
		Resultado r;
		boolean enc=false;
		int i=0;
		while(i<this.resultados.size()&&!enc) {
			r=this.resultados.get(i);
			if(r.getTiempoEtapa()<0) {
				nombreEtapa = r.getNombreEtapa();
				enc=true;
			}
			else {
				i++;
			}
		}
		return nombreEtapa;
	}
	
	public double ultimoTiempoConseguido() {
		Resultado r = this.resultados.get(resultados.size()-1);
		return r.getTiempoEtapa();
	}
	
	public double mediaTiempo() {
		double media=0;
		double cont=0;
		for (Resultado r : resultados) {
			media+=r.getTiempoEtapa();
			cont++;
		}
		if(cont==0)
			cont++;
		return media/cont;
	}
	
	public double calcularTiempo(Etapa e) {
		return this.bici.tiempoNecesario(e, this);
	}
}

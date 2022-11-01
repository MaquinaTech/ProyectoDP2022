
public class Etapa {
	private String nombre;
	private double dificultad;
	private int distancia;
	
	public Etapa() {
		this.nombre="Sin asignar";
		this.dificultad=0.0;
		this.distancia=0;
	}

	public Etapa(String nombre, double dificultad, int distancia) {
		this.nombre = nombre;
		this.dificultad = dificultad;
		this.distancia = distancia;
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
	 * @return the dificultad
	 */
	public double getDificultad() {
		return dificultad;
	}

	/**
	 * @param dificultad the dificultad to set
	 */
	public void setDificultad(double dificultad) {
		this.dificultad = dificultad;
	}

	/**
	 * @return the distancia
	 */
	public int getDistancia() {
		return distancia;
	}

	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	
	
	@Override
	public String toString() {
		return "<"+ this.getClass().getName().toLowerCase() +":" + this.nombre + "> <dificultad: " + this.dificultad + "> <distancia: " 
				+ this.distancia + ")>";
	}
	
}

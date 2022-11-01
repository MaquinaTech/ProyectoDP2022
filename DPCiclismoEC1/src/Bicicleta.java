
public class Bicicleta {
	private String nombre;
	private double peso;
	
	public Bicicleta() {
		this.nombre="Sin asignar";
		this.peso=0.0;
	}

	public Bicicleta(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
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
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "<bicicleta: " + nombre + "> <peso: " + peso + ")>";
	}
	
	public double calcularVelocidad(Ciclista c, Etapa e) {
		return (c.getHabilidad()*100)/(this.peso * e.getDificultad());
	}
	
	public double tiempoNecesario(Etapa e, Ciclista c) {
		return ((e.getDistancia() / this.calcularVelocidad(c, e)) * 60);
	}
	
	public double calcularVelocidad(double habilidad, double dificultad) {
		return (habilidad*100)/(this.peso * dificultad);
	}
	
	public double tiempoNecesario(double distancia, double habilidad, double dificultad) {
		return (distancia / (this.calcularVelocidad(habilidad, dificultad)) * 60);
	}
}

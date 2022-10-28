
public class Bicicleta {
	private String nombre;
	private double peso;
	
	Bicicleta(){
		this.nombre = "";
		this.peso = 0.0;
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
		Etapa e = new Etapa();
		return "<bicicleta: " + nombre + "> <peso: " + peso + ">) " + "en etapa " + e.getNombre();
	}
	
	
}

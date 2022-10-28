
public class Resultado {
	private String nombreEtapa;
	private double tiempoEtapa;
	
	public Resultado() {
		this.nombreEtapa = "";
		this.tiempoEtapa = 0.0;
	}

	public Resultado(String nombreEtapa, double tiempoEtapa) {
		this.nombreEtapa = nombreEtapa;
		this.tiempoEtapa = tiempoEtapa;
	}

	/**
	 * @return the nombreEtapa
	 */
	public String getNombreEtapa() {
		return nombreEtapa;
	}

	/**
	 * @param nombreEtapa the nombreEtapa to set
	 */
	public void setNombreEtapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}

	/**
	 * @return the tiempoEtapa
	 */
	public double getTiempoEtapa() {
		return tiempoEtapa;
	}

	/**
	 * @param tiempoEtapa the tiempoEtapa to set
	 */
	public void setTiempoEtapa(double tiempoEtapa) {
		this.tiempoEtapa = tiempoEtapa;
	}

	@Override
	public String toString() {
		return "Resultado [nombreEtapa=" + nombreEtapa + ", tiempoEtapa=" + tiempoEtapa + "]";
	}
	
	

}

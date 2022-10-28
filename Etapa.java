
/**
 * Write a description of class Etapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Etapa
{
    private String nombreEtapa;
    public double dificultadEtapa;
    private int distanciaEtapa;

    /**
     * Default constructor for objects of class Etapa
     */
    public Etapa()
    {
        nombreEtapa = "";
        dificultadEtapa = 0.0;
        distanciaEtapa = 0;
        
    }
    
    /**
     * Parameterized constructor of class Etapa
     */
    public Etapa(String nombreEtapa, Double dificultadEtapa, int distanciaEtapa)
    {
        this.nombreEtapa = nombreEtapa;
        this.dificultadEtapa = dificultadEtapa;
        this.distanciaEtapa = distanciaEtapa;
    }
    
        /**
     * @return the nombre
     */
    public String getNombreEtapa() {
        return nombreEtapa;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombreEtapa(String nombreEtapa) {
        this.nombreEtapa = nombreEtapa;
    }

    /**
     * @return the dificultad
     */
    public double getDificultadEtapa() {
        return dificultadEtapa;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultadEtapa(double dificultadEtapa) {
        this.dificultadEtapa = dificultadEtapa;
    }

    /**
     * @return the distancia
     */
    public int getDistanciaEtapa() {
        return distanciaEtapa;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistanciaEtapa(int distanciaEtapa) {
        this.distanciaEtapa = distanciaEtapa;
    }
    
    @Override
    /**
     * Muestra la información de la etapa
     */
    public String toString() {
        return "<etapa:" + this.nombreEtapa + "> <dificultad: " + this.dificultadEtapa
        + "> <distancia: " + this.distanciaEtapa + ")>";
    }
    
}

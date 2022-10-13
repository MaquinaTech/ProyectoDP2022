
/**
 * Write a description of class Etapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Etapa
{
    // instance variables - replace the example below with your own
    private String nombreEtapa;
    public Double dificultadEtapa;
    private Double distanciaEtapa;

    /**
     * Default constructor for objects of class Etapa
     */
    public Etapa()
    {
        nombreEtapa = "";
        dificultadEtapa = 0.0;
        distanciaEtapa = 0.0;
        
    }
    
    /**
     * Parameterized constructor of class Etapa
     */
    public Etapa(String nombreEtapa, Double dificultadEtapa, Double distanciaEtapa)
    {
        this.nombreEtapa = nombreEtapa;
        this.dificultadEtapa = dificultadEtapa;
        this.distanciaEtapa = distanciaEtapa;
    }
    
    public void mostrarEtapa()
    {
        System.out.println("Nos encontramos ante la etapa "+nombreEtapa+
        ", la cual tiene una dificultad de "+dificultadEtapa+
        " y una distancia de "+distanciaEtapa+" kilómetros.");
        
    }
    
    /**
     * Método que devuelve la dificultad de una Etapa
     * 
     * @return    Dificultad de la etapa
     */
    public Double getDificultad()
    {
        return dificultadEtapa;
    }
    
    /**
     * Método que devuelve la distancia de una Etapa 
     * 
     * @return   Distancia de la etapa 
     */
    public Double getDistancia()
    { 
        return distanciaEtapa;
    }

    
}

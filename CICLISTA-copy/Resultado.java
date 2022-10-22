
/**
 * Write a description of class Resultado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resultado
{
    // instance variables - replace the example below with your own
    private String nombreEtapa;
    private double tiempoEtapa;
    /**
     * Constructor for objects of class Resultado
     */
    public Resultado()
    {
        this.nombreEtapa="Sin nombre";
        this.tiempoEtapa= 0.0;
       
    }
    
    public Resultado(String nombreEtapa,double tiempoEtapa){
        this.nombreEtapa = nombreEtapa;
        this.tiempoEtapa = tiempoEtapa;
    }

    public String getNombreEtapa(){
        return nombreEtapa;
    }
    
    public void setNombreEtapa(String nombreEtapa){
        this.nombreEtapa = nombreEtapa;
    }
    
    public double getTiempoEtapa(){
        return tiempoEtapa;
    }
    
    public void setTiempoEtapa(double tiempoEtapa){
        this.tiempoEtapa = tiempoEtapa;
    }
    
    public String toString(){
        return "Resultado[nombreEtapa"+ nombreEtapa+",tiempoEtapa"+tiempoEtapa + "]";
    }
}


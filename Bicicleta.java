
/**
 * Bicicletas que usarán los Ciclistas en las Etapas.
 * 
 * @author (Nicolás López de lerma López) 
 * @version (11/10/2022)
 */
public class Bicicleta
{
    private String nombre;
    private int peso;    

    /**
     * Constructor for objects of class Bicicleta
     */
    public Bicicleta()
    {
        nombre = "";
        peso = 0;   
    }

    /**
     * Método para calcular la velocidad de una bicicleta usada por un Ciclista en una Etapa
     * 
     * @param  c1 Ciclista que usa la bicicleta
     * @param  e1 Etapa en la que se usa la bicicleta
     * @return    Velocidad de la bicicleta 
     */
    public Double calcularVelocidad(Ciclista c1, Etapa e1)
    {                
        return (c1.getHabilidad() * 100) / (peso * e1.getDificultad());
    }
    
    /**
     * Método para calcular la velocidad de una bicicleta usada por un Ciclista en una Etapa
     * 
     * @param  c1 Ciclista que usa la bicicleta
     * @param  e1 Etapa en la que se usa la bicicleta
     * @return    Velocidad de la bicicleta 
     */
    public Double calcularTiempo(Ciclista c1, Etapa e1)
    {                
        return e1.getDistancia() / (calcularVelocidad(c1, e1) * 60) ;
    }
}

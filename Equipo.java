import java.util.*;
/**
 * Write a description of class Equipo here.
 * 
 * @author (Nicolás López de lerma López) 
 * @version (26/10/2022)
 */
public class Equipo
{
    private String nombre;
    private ArrayList <Ciclista> ciclistas;
    private ArrayList <Ciclista> ciclistasAbandonado;
    private ArrayList <Bicicleta> bicicletas;
    private comparadorCiclistas compCiclistas;
    private comparadorBicicletas compBicicletas;
    private boolean ordenCiclistas;
    private boolean ordenBicicletas;
    //Collections.sort(eliminados, new EliminadosComparator());
    

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo()
    {
        nombre = "";
        ciclistas = null;
        ciclistasAbandonado = null;
        bicicletas = null;
        compCiclistas = null;
        compBicicletas = null;
        ordenCiclistas = false;
        ordenBicicletas = false;
    }
    
    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre,comparadorCiclistas compCiclistas,boolean ordenCiclistas,comparadorBicicletas compBicicletas,boolean ordenBicicletas)
    {
        this.nombre = nombre;
        this.ordenCiclistas = ordenCiclistas;
        this.ordenBicicletas = ordenBicicletas;
        this.compCiclistas = compCiclistas;
        this.compBicicletas = compBicicletas;
    }
}

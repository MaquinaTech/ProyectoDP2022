import java.util.*;
/**
 * Clase Equipo, controla los ciclistas y bicicletas que se usarán en la Organizacion.
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
    private Comparator <Ciclista> compCiclistas;
    private Comparator <Bicicleta> compBicicletas;
    private boolean ordenCiclistas;
    private boolean ordenBicicletas;

    /**
     * Constructor clase Equipo
     */
    public Equipo()
    {
        nombre = "";
        ciclistas = new ArrayList();
        ciclistasAbandonado = new ArrayList();
        bicicletas = new ArrayList();
        ordenCiclistas = true;
        ordenBicicletas = true;
    }
    
    /**
     * Constructor clase Equipo parametrizado
     */
    public Equipo(String nombre,Comparator <Ciclista> compCiclistas,boolean ordenCiclistas,Comparator <Bicicleta> compBicicletas,boolean ordenBicicletas)
    {
        this.nombre = nombre;
        this.ordenCiclistas = ordenCiclistas;
        this.ordenBicicletas = ordenBicicletas;
        this.compCiclistas = compCiclistas;
        this.compBicicletas = compBicicletas;
    }
    
    /**
     * Metodo que suma los tiempos totales de sus ciclistas
     * @return double tiempo total acumulado por sus ciclistas
     */
    public double getTiempoTotal(){
        double total=0;
        for (Ciclista p:this.ciclistas) {
            //total += p.getTiempoTotal();
        }
        
        return total;
    }
    
    /**
     * Metodo que añade un ciclista
     * @param c1 Ciclista que añadir
     */
    public void anadirCiclista(Ciclista c1){
        this.ciclistas.add(c1);
    }
    
    /**
     * Metodo que añade una bicicleta
     * @param b1 Bicicleta que añadir
     */
    public void anadirBicicleta(Bicicleta b1){
        this.bicicletas.add(b1);
    }
    
    /**
     * Metodo que cambia el comparador de ciclistas
     * @param comparador comparador
     */
    public void setComparadorCiclistas(Comparator<Ciclista> comparador){
        this.compCiclistas = comparador;
    }
    
    /**
     * Metodo que cambia el comparador de bicicletas
     * @param comparador Comparador
     */
    public void setComparadorBicicletas(Comparator<Bicicleta> comparador){
        this.compBicicletas= comparador;
    }
    
    /**
     * Metodo que cambia el criterio de ordenacion de bicicletas
     * @param boolean orden ascendente=true, descendente=false
     */
    public void setOrdenCiclistas(boolean orden){
        this.ordenCiclistas = orden;
    }
    
    /**
     * Metodo que cambia el criterio de ordenacion de bicicletas
     * @param boolean orden ascendente=true, descendente=false
     */
    public void setOrdenBicicletas(boolean orden){
        this.ordenBicicletas = orden;
    }
    
    /**
     * Metodo que ordena los ciclistas segun los criterios asignados al equipo
     */
    public void ordenarCiclistas(){
        Comparator c = this.compCiclistas;
        if(this.ordenCiclistas == false){
            c = Collections.reverseOrder(this.compCiclistas);
        }
        Collections.sort(this.ciclistas, c);
    }
    
    /**
     * Metodo que ordena las bicicletas segun los criterios asignados al equipo
     */
    public void ordenarBicicletas(){
        Comparator c = this.compBicicletas;
        if(this.ordenBicicletas == false){
            c = Collections.reverseOrder(this.compBicicletas);
        }
        Collections.sort(this.bicicletas, c);
    }
    
    /**
     * Metodo que devuelve los ciclistas
     * @return ArrayList <Ciclista> array con los ciclistas disponibles
     */
    public ArrayList <Ciclista> enviarCiclistas(){
        int cont = 0;
        for (Ciclista p:this.ciclistas) {
            p.setBicicleta(this.bicicletas.get(cont));
            cont++;
        }
        return this.ciclistas;
    }
}

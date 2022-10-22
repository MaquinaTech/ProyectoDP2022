import java.util.ArrayList;
/**
 * Write a description of class Ciclista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciclista
{
    // instance variables - replace the example below with your own
    private String nombre ;
    private Bicicleta bici;
    private double habilidad;
    private double energia;
    private ArrayList<Resultado> resultados;
    private Equipo equipo;

    /**
     * Constructor for objects of class Ciclista
     */
    public Ciclista(){
        this.nombre="No asignado";
        this.bici= null;
        this.habilidad=0.0;
        this.energia=0.0;
        this.resultados= new ArrayList <Resultado>();
        this.equipo= null;
    }
    
    /**
     * Constructor parametrizado de la clase Ciclista
     */
    public Ciclista(String nombre,double habilidad,double energia){
        this.nombre=nombre;
        this.bici= null;
        this.habilidad=habilidad;
        this.energia=energia;
        this.resultados= new ArrayList <Resultado>();
        this.equipo= null;
    }

    /**
     * Devuelve el nombre del ciclista.
     * 
     * @return  Nombre del ciclista.
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve la bicicleta del ciclista.
     * 
     * @return  Bicicleta del ciclista.
     */
    public Bicicleta getBicicleta(){
        return bici;
    }
    
    /**
     * Devuelve la habilidad del ciclista.
     * 
     * @return  Habilidad del ciclista.
     */
    public double getHabilidad(){
        return habilidad;
    }
    
    /**
     * Devuelve la energia del ciclista.
     * 
     * @return  Energia del ciclista.
     */
    public double getEnergia(){
        return energia;
    }
    
    /**
     * Devuelve el equipo del ciclista.
     * 
     * @return  Nombre del ciclista.
     */
    public Equipo getEquipo()
    {
        return equipo;
    }
    
    /**
     * Pone el nombre especificado al ciclista.
     * 
     * @param nombre Parámetro a establecer al Ciclista.
     */
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * Asigna la bicicleta especifica al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setBicicleta(Bicicleta bici){
        this.bici=bici;
    }
    
    /**
     * Asigna la habilidad al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setHabilidad(double habilidad){
        this.habilidad=habilidad;
    }
    
    /**
     * Asigna la energia al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setEnergia(double energia){
        this.energia=energia;
    }
    
    
    /**
     * Asigna el equipo al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setEquipo(Equipo equipo){
        this.equipo=equipo;
    }
    
    /**
     * Muestra por pantalla el nombre del ciclista.
     */
    public void printNombre(){
        System.out.println("El nombre del ciclista es " + nombre);
    }
    
    /**
     * Muestra por pantalla el nombre del tenista.
     */
    public void printBicicleta(){
        System.out.println("La Bicicleta es " + bici);
    }
    
    /**
     * Muestra por pantalla la habilidad del ciclista.
     */
    public void printHabilidad(){
        System.out.println("La habilidad del ciclista es " + habilidad);
    }
    
    /**
     * Muestra por pantalla el saque del tenista.
     */
    public void printEnergia(){
        System.out.println("La Energia del tenista es " + energia);
    }
    
    /**
     * Muestra por pantalla el Resultado del ciclista.
     */
    public void printResultados(){
        System.out.println("Los resultados del ciclista son " + resultados);
    }
    
    /**
     * Muestra por pantalla el equipo del ciclista.
     */
    public void printEquipo(){
        System.out.println("El Equipo del cilcista es " + equipo);
    }
    
    public String toString(){
        return "Ciclista [nombre"+nombre + ",bici "+ bici + ",habilidad" + habilidad + ",energia"+energia",equipo"+ equipo + "]";
    }
    
    public boolean Abandono(){
        boolean resistencia;
        if(this.energia<0)
            resistencia = true;
        else
            resistencia = false;
        return res;
    }
    
    public void apuntaResultado(String nombreEtapa, double resultadoEtapa){
        Resultado resul = new Resultado(nombreEtapa,resultadoEtapa);
        this.resultado.add(resul);
    }
    
    public void mostrarResultados(){
        for(Resultado resul : resultados){
            System.out.printIn(resul);
        }
    }

    public int numeroEtapas(){
        return this.resultados.size();
    }
    
    public int numeroEtapasTerminadas(){
        int contador=0;
        for(Resultado resul: resultado){
            if(resul.getTiempoEtapa()>0){
                contador ++;
            }
        }
        
        return contador;
    }
    
    public double tiempoTerminadas(){
        double resultado =0;
        for(Resultado resul: resultados){
            if(resul.getTiempoEtapa()>0){
                resultado+=resul.getTiempoEtapa();
            }
        }
        return resul;
    }
    
    public String AbandonoEtapa(){
        String nombreEtapa = null;
        boolean enc = false;
        int i=0;
        while (i<this.resultados.size()&& !enc){
            resul=this.resultados.get(i);
            if(resul.getTiempoEtapa()<0){
                nombreEtapa = resul.getNombreEtapa();
                enc = true;
            }
            else {
                i++;
            }
        }
         return nombreEtapa;
        }
        
    
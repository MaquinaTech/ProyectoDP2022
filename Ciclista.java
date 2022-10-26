
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
    private double resultados;
    private String equipo;

    /**
     * Constructor for objects of class Ciclista
     */
    public Ciclista(String nombre,Bicicleta bici,double habilidad,double energia,double resultados,String equipo)
    {
        this.nombre=nombre;
        this.bici=bici;
        this.habilidad=habilidad;
        this.energia=energia;
        this.resultados=0;
        this.equipo=equipo;
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
     * Devuelve los resultados del ciclista.
     * 
     * @return  Resultados del ciclista.
     */
    public double getResultados(){
        return resultados;
    }
    
    /**
     * Devuelve el equipo del ciclista.
     * 
     * @return  Nombre del ciclista.
     */
    public String getEquipo()
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
     * Asigna los resultados al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setResultado(double resultados){
        this.resultados=resultados;
    }
    
    /**
     * Asigna el equipo al ciclista.
     * 
     * @param bici Parámetro a establecer al ciclista.
     */
    public void setEquipo(String equipo){
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
     * Muestra por pantalla el saque del tenista.
     */
    public void printResultados(){
        System.out.println("Los resultados del ciclista son " + resultados);
    }
    
    /**
     * Muestra por pantalla el saque del tenista.
     */
    public void printEquipo(){
        System.out.println("El Equipo del cilcista es " + equipo);
    }
    
}

import java.util.*;


public class Ciclista {
    // instance variables
    private String nombreCiclista;
    private Bicicleta bicicletaCiclista;
    private double habilidadCiclista;
    private double energiaCiclista;
    private ArrayList<Resultado> resultadosCiclista;
    private Equipo equipoCiclista;

    /**
    * Constructor for objects of class Ciclista
    */
    public Ciclista(){
        this.bicicletaCiclista = null;
        this.energiaCiclista = 0.0;
        this.equipoCiclista = null;
        this.habilidadCiclista = 0.0;
        this.nombreCiclista = "";
        this.resultadosCiclista = null;
    }
    
    /**
    * Constructor parametrizado de la clase Ciclista
    */
    public Ciclista(String nombreCiclista, double habilidadCiclista, double energiaCiclista) {
        super();
        this.bicicletaCiclista = null;
        this.energiaCiclista = energiaCiclista;
        this.equipoCiclista = null;
        this.habilidadCiclista = habilidadCiclista;
        this.nombreCiclista = nombreCiclista;
        this.resultadosCiclista = null;        
    }

    /**
     * Devuelve el nombre del ciclista
     * 
     * @return the nombreCiclista
     */
    public String getNombreCiclista() {
        return nombreCiclista;
    }

    /**
     * Pone un nombre a un ciclista
     * 
     * @param nombreCiclista the nombreCiclista to set
     */
    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    /**
     * Devuelve la bicicleta del ciclista
     * 
     * @return the bicicletaCiclista
     */
    public Bicicleta getBicicletaCiclista() {
        return bicicletaCiclista;
    }

    /**
     * Pone una bicicleta a un ciclista
     *
     * @param bicicletaCiclista the bicicletaCiclista to set
     */
    public void setBicicletaCiclista(Bicicleta bicicletaCiclista) {
        this.bicicletaCiclista = bicicletaCiclista;
    }

    /**
     * Devuelve la habilidad del ciclista
     * 
     * @return the habilidadCiclista
     */
    public double getHabilidadCiclista() {
        return habilidadCiclista;
    }

    /**
     * Pone la habilidad del ciclista
     * 
     * @param habilidadCiclista the habilidadCiclista to set
     */
    public void setHabilidadCiclista(double habilidadCiclista) {
        this.habilidadCiclista = habilidadCiclista;
    }

    /**
     * Devuelve la energía del ciclista
     * 
     * @return the energiaCiclista
     */
    public double getEnergiaCiclista() {
        return energiaCiclista;
    }

    /**
     * Pone la energía a un ciclista
     * 
     * @param energiaCiclista the energiaCiclista to set
     */
    public void setEnergiaCiclista(double energiaCiclista) {
        this.energiaCiclista = energiaCiclista;
    }

    /**
     * Devuelve el equipo del ciclista
     * 
     * @return the equipoCiclista
     */
    public Equipo getEquipoCiclista() {
        return equipoCiclista;
    }

    /**
     * Pone el equipo a un ciclista
     * 
     * @param equipoCiclista the equipoCiclista to set
     */
    public void setEquipoCiclista(Equipo equipoCiclista) {
        this.equipoCiclista = equipoCiclista;
    }

    /**
     * Muestra por pantalla el nombre del ciclista.
     */
    public void printNombre(){
        System.out.println("El nombre del ciclista es " + nombreCiclista);
    }
    
    /**
     * Muestra por pantalla el nombre del tenista.
     */
    public void printBicicleta(){
        System.out.println("La Bicicleta es " + bicicletaCiclista);
    }
    
    /**
     * Muestra por pantalla la habilidad del ciclista.
     */
    public void printHabilidad(){
        System.out.println("La habilidad del ciclista es " + habilidadCiclista);
    }
    
    /**
     * Muestra por pantalla el saque del tenista.
     */
    public void printEnergia(){
        System.out.println("La Energia del tenista es " + energiaCiclista);
    }
    
    /**
     * Muestra por pantalla el Resultado del ciclista.
     */
    public void printResultados(){
        System.out.println("Los resultados del ciclista son " + resultadosCiclista);
    }
    
    /**
     * Muestra por pantalla el equipo del ciclista.
     */
    public void printEquipo(){
        System.out.println("El Equipo del cilcista es " + equipoCiclista);
    }

    @Override
    public String toString() {
        return "<ciclista: " + nombreCiclista + "> <energía: "+
                energiaCiclista + "> <habilidad: " + habilidadCiclista +
                " > <tiempo acumulado sin abandonar: " + tiempoTerminadas()
                + "> <abandonado:" + siAbandono() + "> con bicicleta";
    }
    
    public boolean siAbandono() {
        return this.energiaCiclista <= 0;
    }
    
    public void apuntaResultado(String nombreEtapa, double resultadoEtapa){
        Resultado resultado = new Resultado(nombreEtapa,resultadoEtapa);
        this.resultadosCiclista.add(resultado);
    }
    
    public void mostrarResultados(){
        for(Resultado resultado : resultadosCiclista){
            System.out.println(resultado);
        }
    }

    public int numeroEtapas(){
        return this.resultadosCiclista.size();
    }
    
    public int numeroEtapasTerminadas(){
        int contador=0;
        for(Resultado resultado: resultadosCiclista){
            if(resultado.getTiempoEtapa()>0){
                contador ++;
            }
        }
        
        return contador;
    }
    
    public double tiempoTerminadas(){
        double resul =0;
        for(Resultado resultado: resultadosCiclista){
            if(resultado.getTiempoEtapa()>0){
                resul+=resultado.getTiempoEtapa();
            }
        }
        return resul;
    }
    
    public String AbandonoEtapa(){
        String nombreEtapa = null;
        Resultado resultado;
        boolean enc = false;
        int i=0;
        while (i<this.resultadosCiclista.size()&& !enc){
            resultado=this.resultadosCiclista.get(i);
            if(resultado.getTiempoEtapa()<0){
                nombreEtapa = resultado.getNombreEtapa();
                enc = true;
            }
            else {
                i++;
            }
        }
         return nombreEtapa;
        }
    
}

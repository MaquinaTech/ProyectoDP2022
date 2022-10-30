import java.util.ArrayList;

public class Organizacion {
    private ArrayList<Etapa> listaEtapas;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Ciclista> ciclistasCarrera;
    private ComparadorDificultadEtapa comp;
    
    public Organizacion() {
        this.ciclistasCarrera = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
        this.listaEtapas = new ArrayList<>();
        this.comp = null;
    }
    
    public Organizacion(ComparadorDificultadEtapa compDificultadEtapa) {
        this.ciclistasCarrera = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
        this.listaEtapas = new ArrayList<>();
        this.comp = compDificultadEtapa;
    }

    public void inscribirEquipo(Equipo e) {
        this.listaEquipos.add(e);
    }

    public void gestionarCampeonato() {
        int i = 1;
        Etapa e;
        mostrarEtapas();
        mostrarEquipos();
        while (i < listaEtapas.size()){
            e = listaEtapas.get(i-1);
            System.out.println("\n********************************************************************************************************");
            System.out.println("*** CARRERA<" + i + "> EN " + e + " ***" );
            System.out.println("********************************************************************************************************");
            obtenerCiclistas();
            this.ciclistasCarrera.sort(new ComparadorTiempo().reversed());
            mostrarCiclistasCompeticion(e.getNombreEtapa());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
                    + "+++++++++++++++++++++++++ Comienza la carrera en " + e.getNombreEtapa() + " ++++++++++++++++++++++++++\r\n"
                    + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            procesarCiclistas(e);
            i++;
        }
        
        
    }

    private void procesarCiclistas(Etapa e) {
        Ciclista ciclista;
        for (int i = 0; i < this.ciclistasCarrera.size(); i++) {
            System.out.println("@@@ ciclista " + (i+1) + " de " + this.ciclistasCarrera.size());
            ciclista = this.ciclistasCarrera.get(i);
            System.out.println(ciclista + " con bicicleta");
            System.out.println(ciclista.getBicicletaCiclista() + " en etapa " + e.getNombreEtapa());    
            System.out.println("+++ Con estas condiciones el ciclista " + ciclista.getNombreCiclista() 
            + " con la bicicleta " + ciclista.getBicicletaCiclista() + " alcanza una velocidad de " 
            + ciclista.getBicicletaCiclista().calcularVelocidad(ciclista, e)+ " km/hora +++\n");
        }            
    }

    private void mostrarCiclistasCompeticion(String nombreEtapa) {
        System.out.println("********************************************************************************************************");
        System.out.println("******************************** Ciclistas que van a competir en " + nombreEtapa + " *******************************");
        System.out.println("********************************************************************************************************");        
        for (Ciclista ciclista : ciclistasCarrera) {
            System.out.println(ciclista);            
        }
    }

    private void obtenerCiclistas() {
        for (Equipo equipo : listaEquipos) {
            while(equipo.hayCiclistas()) {
                this.ciclistasCarrera.add(equipo.enviarCiclista());
            }
        }
        
    }

    private void mostrarEtapas() {
        this.listaEtapas.sort(new ComparadorDificultadEtapa());
        System.out.println(
                  "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\r\n"
                + "||||||||||||||||||| ETAPAS DEL CAMPEONATO |||||||||||||||||||\r\n"
                + "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        for (Etapa e : listaEtapas) {
            System.out.println(e);
        }
        
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                        
    }
    
    private void mostrarEquipos() {
        this.listaEquipos.sort(new ComparadorMediaTiempoEquipo());
        System.out.println(
                  "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + "%%%%%%%% EQUIPOS DEL CAMPEONATO %%%%%%%%\r\n"
                + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
        for (Equipo equipo : listaEquipos) {
            equipo.ordenarCiclistasEquipo();
            equipo.ordenarBicicletasEquipo();
            System.out.println(equipo);
            equipo.mostrarCiclistas();
            
        
        }
                
    }

    public void anadirEtapa(Etapa etapa1) {
        this.listaEtapas.add(etapa1);
        
    }

}

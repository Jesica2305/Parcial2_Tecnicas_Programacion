package parcial;

public class Vuelo {
    //tiempo constante O(1)
    private String numeroVuelo;
    private String origen;
    private String destino;
    private String vueloSalida;
    private String diaVuelo;
    private int cantidadMaxima;
    private int sillasDisponibles;
    
    
    //Tiempo constante O(1)
    public Vuelo(String numeroVuelo, String origen, String destino, String vueloSalida, String diaVuelo, int cantidadMaxima, int sillasDisponibles){
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.vueloSalida = vueloSalida;
        this.diaVuelo = diaVuelo;
        this.cantidadMaxima = cantidadMaxima;
        this.sillasDisponibles = sillasDisponibles;
    }
    //Tiempo constante O(1)
    public boolean apartarSillas(){
        if (sillasDisponibles > 0){
            sillasDisponibles --;
            return true;
        } else {
            return false;
        }
    }
    //Tiempo Constante O(1)
    public void cancelarSilla(){
        sillasDisponibles ++;
    }
}

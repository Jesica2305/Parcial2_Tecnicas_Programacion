
package parcial;

public class Reserva {
    private Vuelo vuelo;
    private String diaReserva;
    private Pasajero pasajero;
    private boolean verificado;
    //tiempo constante O(1)
    public Reserva (Vuelo vuelo, String diaReserva, Pasajero pasajero, boolean verificado){
        this.vuelo = vuelo;
        this.diaReserva = diaReserva;
        this.pasajero = pasajero;
        this.verificado = verificado;
    }
    //Tiempo Constante O(1)
    public boolean reservaAceptada(){
        if(vuelo.apartarSillas()){
            verificado = true;
        }else{
        return false;
        }
    }
    //Tiempo constante O(1)
    public void cancelarSilla(){
        if (verificado){
            vuelo.cancelarSilla();
        }
    }
    
    
}

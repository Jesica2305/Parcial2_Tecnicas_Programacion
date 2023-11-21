
package parcial;

public class Pasajero {
    //tiempo constante O(1)
    private String nombre;
    private String pasaporteNumero;
    private int edad;
    private String alimentosPreferidos;
    //tiempo constante O(1)
    public Pasajero(String nombre, String pasaporteNumero, int edad, String alimentosPreferidos){
       this.nombre = nombre;
       this.pasaporteNumero = pasaporteNumero;
       this.edad = edad;
       this.alimentosPreferidos = alimentosPreferidos;
    }
    //tiempo constante O(1)
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    //tiempo constante O(1)
    public void setPasaporteNumero (String pasaporteNumero){
        this.pasaporteNumero= pasaporteNumero;
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setAlimentosPreferidos (String alimentosPreferidos){
        this.alimentosPreferidos= alimentosPreferidos;
    }
    //tiempo constante O(1)
    public String getNombre (){
        return getNombre;
    }
    //tiempo constante
}

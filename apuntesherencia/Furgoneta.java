/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesherencia;

//public class Furgoneta extends Coche, Camion { //no admite herencia múltiple
//    
//}
public class Furgoneta extends Coche {  // indicamos a la clase Furgoneta que tiene que heredar de coche
    
    private int capacidadExtra;
      
    /*
    tenemos que inicializarlo. aunque herede el estado ini del coche, una furgo puede tener un ini !=; 
    esta en concreto tiene un esta inical extra que es la capacidadExtra
    */
    // creamos constructor
    public Furgoneta  (int capacidadCarga) {  // constructor parametrizado 
        super(); // llama al constructor de la clase padre. primera instruccion con la que se encutra
        this.capacidadExtra = capacidadCarga; // tambien tenemos que inicalizarlo
    }
    
     // acceso capacidadExtra
    public void setCapacidadExtra (int capacidadExtra) {
        this.capacidadExtra = capacidadExtra;
    }
    
    public int getCapacidadExtra () {
        return capacidadExtra;
    }
    
    // enseñar los datos generales furgoneta - subclase
    @Override
    public String datos(){
        return "capacidad extra: " + super.datos() + capacidadExtra;
    }
    
}

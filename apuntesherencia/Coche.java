/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesherencia;

/**
 *
 * @author casty
 */
public class Coche {    
    // declao propiedades
    private int ruedas;
    private String color;
    private int capacidad;
    
    // creo constructor (buena practica hacerlo siempre). en este caso es un construc por defecto
    public Coche () { // inicializado. se supone que es un constructor parametrizado?? --> NO, no introducirmos parametros
        this.ruedas = 4;
        this.color = "azul";
        this.capacidad = 100;
    }

    // acceso ruedas
    public void setRuedas (int ruedas) {
        this.ruedas = ruedas;
    }
    
    public int getRuedas () {
        return this.ruedas;
    }
    
    // acceso capacidad
     public void setCapacidad (int capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getcCapacidad () {
        return this.capacidad;
    }
    
    // acceso color
    public void setColor (String color) {
        this.color = color;
    }
    
    public String getColor () {
        return this.color;
    }
    
    // enseñar datos generales coche - superclase
    public String datos() { 
        return  "capacidad: " + capacidad + ", color: " + color + ", ruedas: " + ruedas;
    }
    
}


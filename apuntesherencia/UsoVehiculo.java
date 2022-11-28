package apuntesherencia;

/**
 *Crearemos instancias pertenecientes a la clase Coche y Furgoneta
 * 
 * @author casty
 */
public class UsoVehiculo {

    public static void main(String[] args) {
        
        // creamos intancias
        Coche objetoCoche = new Coche();
        Furgoneta objetoFurgoneta = new Furgoneta(55);
        
        // asigamos caracteristicas
        objetoCoche.setColor("amarillo"); // asigno un color nuevo
        objetoFurgoneta.setRuedas(6); // utiliza metodo de la clase padre
        /*
        esta es la gran utilidad  de la herencia, no he tenido que reeprogramar setRuebas para 
        poder utilizarlo ya que este metodo se hereda de la clase padre
        */
        
        System.out.println("datos totales furgoneta = " + objetoFurgoneta.datos()); // puedo acceder desde el hijo a los metodos de padre

    }
    
}

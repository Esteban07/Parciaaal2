/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metereología;

/**
 *
 * @author Estudiante
 */
public abstract class AguaLluvia extends Sensor {
       
    public AguaLluvia(String marca, String referencia, String instalacion) {
        super(marca, referencia, instalacion);
    }
    public String listar() {
      return super.toString();  
    }    
}

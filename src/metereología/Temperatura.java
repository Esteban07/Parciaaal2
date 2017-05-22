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
public abstract class Temperatura extends Sensor{

    public Temperatura(String marca, String referencia, String instalacion) {
        super(marca, referencia, instalacion);
    }
    public String listarMN() {
      return super.toString();  
    }   
}

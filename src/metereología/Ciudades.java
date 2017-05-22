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
public class Ciudades {
    private String nombre;
    private Estacion [] estacion;

    public Ciudades(String nombre, Estacion[] estacion) {
        this.nombre = nombre;
        this.estacion = estacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estacion[] getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion[] estacion) {
        this.estacion = estacion;
    }
    
    
}

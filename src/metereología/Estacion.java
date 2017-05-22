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
public class Estacion {
    private String nombre;
    private String ubicacion;
    private String instalacion;

    public Estacion(String nombre, String ubicacion, String instalacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
    @Override
    public String toString() {
        return "Estacion{" + "NOMBRE:" + nombre + ", UBICACION:" + ubicacion + ", FECHA INSTALACIÓN:" + instalacion + '}';
    }
    
}

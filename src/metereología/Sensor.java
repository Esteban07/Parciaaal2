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
public abstract class Sensor {
    protected String marca;
    protected String referencia;
    protected String instalacion;

    public Sensor(String marca, String referencia, String instalacion) {
        this.marca = marca;
        this.referencia = referencia;
        this.instalacion = instalacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
    public abstract String ListarMN();
    
}

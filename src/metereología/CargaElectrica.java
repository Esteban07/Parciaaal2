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
public abstract class CargaElectrica extends Sensor {
    private int Carga;
    
    public CargaElectrica(String marca, String referencia, String instalacion) {
        super(marca, referencia, instalacion);
         this.Carga = Carga;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String listar() {
    return "CargaElectrica:" + "NivelCarga=" + Carga + '}'+super.toString();  
    }
    
}

/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 15/05/2023
 * Fecha de Actualización: 23/05/2023
 * Descripción: Primera intarfaz de Proyecto
 */
package entity;

public class Cliente extends Persona{
    private double cuenta;
    private String direccion;

    public Cliente() {
    }

    public Cliente(double cuenta, String direccion) {
        this.cuenta = cuenta;
        this.direccion = direccion;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}

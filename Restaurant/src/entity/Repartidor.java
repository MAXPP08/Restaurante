/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 15/05/2023
 * Fecha de Actualización: 23/05/2023
 * Descripción: Primera intarfaz de Proyecto
 */
package entity;

public class Repartidor extends Persona{
    private String noRepartidor;

    public Repartidor() {
    }

    public Repartidor(String noRepartidor) {
        this.noRepartidor = noRepartidor;
    }

    public String getNoRepartidor() {
        return noRepartidor;
    }

    public void setNoRepartidor(String noRepartidor) {
        this.noRepartidor = noRepartidor;
    }
    
    
}

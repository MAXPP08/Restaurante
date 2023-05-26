/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 15/05/2023
 * Fecha de Actualización: 23/05/2023
 * Descripción: Primera intarfaz de Proyecto
 */
package entity;

public class Menu {

    private String comida;
    private String bebida;
    private String postre;
    private String cliente;
    private String noRepartidor;

    public Menu() {
    }

    public Menu(String comida, String bebida, String postre, String cliente, String noRepartidor) {
        this.comida = comida;
        this.bebida = bebida;
        this.postre = postre;
        this.cliente = cliente;
        this.noRepartidor = noRepartidor;

    }

    public String getNoRepartidor() {
        return noRepartidor;
    }

    public void setNoRepartidor(String noRepartidor) {
        this.noRepartidor = noRepartidor;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

}

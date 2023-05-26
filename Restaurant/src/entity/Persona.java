/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 15/05/2023
 * Fecha de Actualización: 23/05/2023
 * Descripción: Primera intarfaz de Proyecto
 */
package entity;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}

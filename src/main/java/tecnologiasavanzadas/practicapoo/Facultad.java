/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Facultad {
    
    private
    
    Double id;
    String nombre;
    Persona decano;
    
    public
    
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Decano: \n" + decano;
    }
    
    Facultad(){
        this.id = 0.0;
        this.nombre = "";
        this.decano = new Persona();
    }

    Facultad(Double id, String nombre, Persona decano) {
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
    }
    
    
    
    Double getId() {
        return id;
    }

    void setId(Double id) {
        this.id = id;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    Persona getDecano() {
        return decano;
    }

    void setDecano(Persona decano) {
        this.decano = decano;
    }
    
    
    
     
    
}

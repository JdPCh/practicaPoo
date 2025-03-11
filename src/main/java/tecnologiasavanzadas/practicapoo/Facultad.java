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
    
<<<<<<< HEAD
    public
    
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Decano: \n" + decano;
    }
    
    Facultad(){
=======
    
    
    @Override
    public String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Decano: \n" + decano;
    }
    
    public Facultad(){
>>>>>>> f076d41 (Version-4)
        this.id = 0.0;
        this.nombre = "";
        this.decano = new Persona();
    }

<<<<<<< HEAD
    Facultad(Double id, String nombre, Persona decano) {
=======
    public Facultad(Double id, String nombre, Persona decano) {
>>>>>>> f076d41 (Version-4)
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
    }
    
<<<<<<< HEAD
    
    
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
=======
    public Facultad(String nombre, Persona decano) {
        this.id = null;
        this.nombre = nombre;
        this.decano = decano;
    }
    
    
    
    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDecano() {
        return decano;
    }

    public void setDecano(Persona decano) {
>>>>>>> f076d41 (Version-4)
        this.decano = decano;
    }
    
    
    
     
    
}

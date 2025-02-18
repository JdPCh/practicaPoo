/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Persona {
    
    private
            
    Double id;
    String nombre;
    String apellido;
    String email;
    
    public
            
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" + "Email: " + email;
    }

    Persona(Double id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    Persona(){
        this.id= 0.0;
        this.nombre= "";
        this.apellido= "";
        this.email="";
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

    String getApellido() {
        return apellido;
    }

    void setApellido(String apellido) {
        this.apellido = apellido;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }
}

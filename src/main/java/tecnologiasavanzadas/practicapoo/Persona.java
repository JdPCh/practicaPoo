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
    
<<<<<<< HEAD
    public
            
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" + "Email: " + email;
    }

    Persona(Double id, String nombre, String apellido, String email) {
=======
    
            
    @Override
    public String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" + "Email: " + email;
    }

    public Persona(Double id, String nombre, String apellido, String email) {
>>>>>>> f076d41 (Version-4)
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
<<<<<<< HEAD
    
    Persona(){
=======
    public Persona(String nombre, String apellido, String email) {
        this.id = null;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    
    public Persona(){
>>>>>>> f076d41 (Version-4)
        this.id= 0.0;
        this.nombre= "";
        this.apellido= "";
        this.email="";
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
=======
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
>>>>>>> f076d41 (Version-4)
        this.email = email;
    }
}

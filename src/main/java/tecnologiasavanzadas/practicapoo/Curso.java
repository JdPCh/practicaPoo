/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Curso {
    
    private
    
    int id;
    String nombre;
    Programa programa;
    Boolean activo;
    
    public
    
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: "+ nombre + "\n" +"´Programa:\n " + programa + "\n" +"Estado: " + activo ;
    }
    
    Curso() {
        this.id = 0;
        this.nombre = "";
        this.programa = new Programa();
        this.activo = true;
    }

    public Curso(int id, String nombre, Programa programa, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
        this.activo = activo;
    }

    

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    Programa getPrograma() {
        return programa;
    }

    void setPrograma(Programa programa) {
        this.programa = programa;
    }

    Boolean getActivo() {
        return activo;
    }

    void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
}

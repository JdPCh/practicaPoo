/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

import java.util.Date;

/**
 *
 * @author Estudiante_MCA
 */
public class Programa {

    private

    Double id;
    String nombre;
    Double duracion;
    Date registro;
    Facultad facultad;
    
    public
    
    @Override
    String toString(){
        return "Id: " +  id + "\n" + "Nombre: " + nombre + "\n" +"Duracion: " + duracion+ "\n" + "Fecha: " + registro + "\n" + "Facultad: \n" + facultad;
    }
    
    Programa(){
        this.id = 0.0;
        this.nombre = "";
        this.duracion = 0.0;
        this.registro = new Date();
        this.facultad = new Facultad();
    }

    Programa(Double id, String nombre, Double duracion, Date registro, Facultad facultad) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.registro = registro;
        this.facultad = facultad;
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

    Double getDuracion() {
        return duracion;
    }

    void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    Date getRegistro() {
        return registro;
    }

    void setRegistro(Date registro) {
        this.registro = registro;
    }

    Facultad getFacultad() {
        return facultad;
    }

    void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    
}

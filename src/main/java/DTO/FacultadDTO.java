/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author crism
 */
public class FacultadDTO {
    private final Double id;
    private final String nombre;
    private final String nombreDecano;

    public FacultadDTO(Double id, String nombre, String nombreDecano) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDecano = nombreDecano;
    }

    public Double getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getNombreDecano() { 
        return nombreDecano; 
    }
}
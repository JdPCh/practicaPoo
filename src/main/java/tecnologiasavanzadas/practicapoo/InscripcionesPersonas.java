/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante_MCA
 */
public class InscripcionesPersonas {
    
    private
    
    ArrayList<Persona> listado;
    
    public
    
    InscripcionesPersonas() {
        this.listado = new ArrayList();
    }
    
    InscripcionesPersonas(ArrayList<Persona> listado) {
        this.listado = listado;
    }

    ArrayList<Persona> getListado() {
        return listado;
    }

    void setListado(ArrayList<Persona> listado) {
        this.listado = listado;
    }
    
    void inscribir(Persona persona){};
    void eliminar(Persona persona){};
    void actualizar(Persona persona){};
    void guardarInformacion(Persona persona){};
    void cargarDatos(){};
}

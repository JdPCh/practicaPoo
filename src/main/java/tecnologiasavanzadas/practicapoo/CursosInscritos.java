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
public class CursosInscritos implements Servicios{
    
    private
    
    ArrayList<Inscripcion> listado;
    
    public
    
    @Override
    String toString(){
        
        String inscripciones = "";
        
        for(Inscripcion inscripcion : listado){
           inscripciones = inscripcion +", "+ inscripciones;
        }
        
        return inscripciones;
    }
    
    
    CursosInscritos() {
        this.listado = new ArrayList();
    }
    

    CursosInscritos(ArrayList<Inscripcion> listado) {
        this.listado = listado;
    }

    ArrayList<Inscripcion> getListado() {
        return listado;
    }

    void setListado(ArrayList<Inscripcion> listado) {
        this.listado = listado;
    }
   
    void inscribir(Inscripcion inscripcion){};
    void eliminar(Inscripcion inscripcion){};
    void actualizar(Inscripcion inscripcion){};
    void guardarInformacion(Inscripcion inscripcion){};
    void cargarDatos(){};

    @Override
    public String imprimirPosicion(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int cantidadActual() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<String> imprimirListado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
    
    
    
    
}

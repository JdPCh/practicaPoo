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
public class CursosProfesores implements Servicios{
    
    private
    
    ArrayList<CursoProfesor> listado;
    
    public
    
    @Override
    String toString(){
        
        String cursos = "";
        
        for(CursoProfesor curso: listado){
           cursos = curso +", "+ cursos;
        }
        
        return cursos;
    }
    
    CursosProfesores() {
        this.listado = new ArrayList();
    }

    CursosProfesores(ArrayList<CursoProfesor> listado) {
        this.listado = listado;
    }

    ArrayList<CursoProfesor> getListado() {
        return listado;
    }

    void setListado(ArrayList<CursoProfesor> listado) {
        this.listado = listado;
    }
    
    void inscribir(CursoProfesor cursoProfesor){};
    void guardarInformacion(CursoProfesor cursoProfesor){};
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Inscripcion {
    
    private
    
    Curso curso;
    int anio;
    int semestre;
    Estudiante estudiante;
    
    public
    
    @Override
    String toString(){
        return "Curso:\n " +  curso + "\n" + "Anio: " + anio + "\n" +"Semestre: " + semestre + "\n" + "Estudiante: \n" + estudiante;
    }  
    
    
    Inscripcion() {
        this.curso = new Curso();
        this.anio = 2025;
        this.semestre = 0;
        this.estudiante = new Estudiante();
    }

    Inscripcion(Curso curso, int anio, int semestre, Estudiante estudiante) {
        this.curso = curso;
        this.anio = anio;
        this.semestre = semestre;
        this.estudiante = estudiante;
    }
    
    

    Curso getCurso() {
        return curso;
    }

    void setCurso(Curso curso) {
        this.curso = curso;
    }

    int getAnio() {
        return anio;
    }

    void setAnio(int anio) {
        this.anio = anio;
    }

    int getSemestre() {
        return semestre;
    }

    void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    Estudiante getEstudiante() {
        return estudiante;
    }

    void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
}

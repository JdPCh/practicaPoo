/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class CursoProfesor {
    
    private
    
    Profesor profesor;
    int anio;
    int semestre;
    Curso curso;
    
    public
    
    @Override
    String toString(){
        return "Profesor: \n" + profesor + "\n" + "Anio: " +  anio + "\nSemestre: " + semestre + "\n" + "Curso: " + curso;
    }
    
    CursoProfesor() {
        this.profesor = new Profesor();
        this.anio = 2025;
        this.semestre = 0;
        this.curso = new Curso();
    }

    CursoProfesor(Profesor profesor, int anio, int semestre, Curso curso) {
        this.profesor = profesor;
        this.anio = anio;
        this.semestre = semestre;
        this.curso = curso;
    }

    Profesor getProfesor() {
        return profesor;
    }

    void setProfesor(Profesor profesor) {
        this.profesor = profesor;
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

    Curso getCurso() {
        return curso;
    }

    void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}

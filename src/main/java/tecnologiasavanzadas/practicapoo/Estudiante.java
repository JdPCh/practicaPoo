/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Estudiante extends Persona{
    
    private
    Double codigo;
    Programa programa;
    Boolean activo;
    Double promedio;
    
    public
    
    @Override
    String toString(){
        String auxActivo;
        
        if(activo)auxActivo="Activo";
        else auxActivo="Inactivo";
        
        return "Estudiante: \n" + super.toString()+ "\n" + "Codigo: " +  codigo + "\nEstado: " + auxActivo + "\n" + "Promedio: " + promedio + "\n" + "Programa:\n" + programa;
    }
    
    Estudiante() {
        super(0.0, "", "", "");
        this.codigo = 0.0;
        this.programa = new Programa();
        this.activo = true;
        this.promedio = 0.0;
    }

    Estudiante(Double codigo, Programa programa, Boolean activo, Double promedio, Double id, String nombre, String apellido, String email) {
        super(id,  nombre,  apellido,  email);
        this.codigo = codigo;
        this.programa = programa;
        this.activo = activo;
        this.promedio = promedio;
    }
    
    
    
    Double getCodigo() {
        return codigo;
    }

<<<<<<< HEAD
=======
    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

>>>>>>> f076d41 (Version-4)
    
    void setCodigo(Double codigo) {
        this.codigo = codigo;
    }

    
    Boolean getActivo() {
        return activo;
    }

    
    void setActivo(Boolean activo) {
        this.activo = activo;
    }

    Double getPromedio() {
        return promedio;
    }

    
    void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    
    
    
}

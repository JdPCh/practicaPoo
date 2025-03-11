/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class Profesor extends Persona{
    
    private

    String tipoContrato;

    public
            
    @Override
    String toString(){
        return "Tipo de contrato: " +  tipoContrato;
    }
    
    Profesor(){
        super(0.0, "", "", "");
        this.tipoContrato = "";
    }

<<<<<<< HEAD
    Profesor(String tipoContrato, Double id, String nombre, String apellido, String email) {
=======
    Profesor(Double id, String nombre, String apellido, String email, String tipoContrato) {
>>>>>>> f076d41 (Version-4)
        super(id, nombre, apellido, email);
        this.tipoContrato = tipoContrato;
    }
    
    String getTipoContrato() {
        return tipoContrato;
    }

    void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
}

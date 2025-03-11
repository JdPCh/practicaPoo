/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Adapatador.PersonaAdaptador;
import DTO.PersonaDTO;
import Servicios.PersonaServicio;
import java.util.List;


/**
 *
 * @author crism
 */
public class PersonaControlador {
    private final PersonaServicio personaServicio = new PersonaServicio();
    
    public List<PersonaDTO> obtenerPersonas(){
        return PersonaAdaptador.convertirListaAPersonaDTO(personaServicio.leerPersonas());
    }
    
    public void actualizarPersona(String nombre, String apellido, String email, Double id){
        personaServicio.actualizarPersona(nombre, apellido, email, id);
    }
    
    public void eliminarPersona(Double idPersona){
        personaServicio.eliminarPersona(idPersona);
    }
    
    public void crearPersona(String nombre, String apellido, String email){
        personaServicio.crearPersona(nombre, apellido, email);
    }
}

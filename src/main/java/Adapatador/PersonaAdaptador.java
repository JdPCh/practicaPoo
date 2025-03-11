/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapatador;

import DTO.PersonaDTO;
import java.util.List;
import java.util.stream.Collectors;
import tecnologiasavanzadas.practicapoo.Persona;

/**
 *
 * @author crism
 */
public class PersonaAdaptador {
     public static PersonaDTO convertirAPersonaDTO(Persona persona) {
        return new PersonaDTO(
            persona.getId(),
            persona.getNombre(),
            persona.getApellido(), 
            persona.getEmail()
        );
    }
      
    public static List<PersonaDTO> convertirListaAPersonaDTO(List<Persona> persona) {
        return (List<PersonaDTO>) persona.stream()
            .map(PersonaAdaptador::convertirAPersonaDTO)
            .collect(Collectors.toList());
    }
}

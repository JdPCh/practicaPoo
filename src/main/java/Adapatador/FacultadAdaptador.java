/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapatador;

import DTO.FacultadDTO;
import java.util.List;
import java.util.stream.Collectors;
import tecnologiasavanzadas.practicapoo.Facultad;

/**
 *
 * @author crism
 */
public class FacultadAdaptador {
    public static FacultadDTO convertirAFacultadDTO(Facultad facultad) {
        return new FacultadDTO(
            facultad.getId(),
            facultad.getNombre(),
            facultad.getDecano() != null 
                ? facultad.getDecano().getNombre() + " " + facultad.getDecano().getApellido() 
                : ""
        );
    }

    public static List<FacultadDTO> convertirListaAFacultadDTO(List<Facultad> facultades) {
        return facultades.stream()
            .map(FacultadAdaptador::convertirAFacultadDTO)
            .collect(Collectors.toList());
    }
}

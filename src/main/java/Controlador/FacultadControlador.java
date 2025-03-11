/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Adapatador.FacultadAdaptador;
import DTO.FacultadDTO;
import Servicios.FacultadServicio;
import java.util.List;

/**
 *
 * @author crism
 */
public class FacultadControlador {
    private final FacultadServicio facultadServicio = new FacultadServicio();

    public List<FacultadDTO> obtenerFacultades() {
        return FacultadAdaptador.convertirListaAFacultadDTO(facultadServicio.obtenerFacultades());
    }
    
    public void crearFacultad(String nombre, Double idDecano){
        facultadServicio.crearFacultad(nombre, idDecano);
    }
    
    public void actualizarFacultad(String nombre, Double idDecano, Double idFacultad){
        facultadServicio.actualizarFacultad(nombre, idDecano, idFacultad);
    }

    public void eliminarFacultad(Double id) {
        facultadServicio.eliminarFacultad(id);
    }
}

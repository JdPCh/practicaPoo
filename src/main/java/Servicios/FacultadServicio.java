/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Dao.FacultadDao;
import java.util.List;
import tecnologiasavanzadas.practicapoo.Facultad;

/**
 *
 * @author crism
 */
public class FacultadServicio {
    private final FacultadDao facultadDao;

    public FacultadServicio() {
        this.facultadDao = new FacultadDao();
    }
    
    public void crearFacultad(String nombre, Double id){
        facultadDao.crearFacultad(nombre, id);
    }
    
    public void actualizarFacultad(String nombre, Double decanoId, Double facultadId){
        facultadDao.actualizarFacultad(nombre, decanoId, facultadId);
    }

    public List<Facultad> obtenerFacultades() {
        return facultadDao.leerFacultades();
    }

    public void eliminarFacultad(Double id) {
        facultadDao.eliminarFacultad(id);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Dao.PersonaDao;
import java.util.List;
import tecnologiasavanzadas.practicapoo.Persona;

/**
 *
 * @author crism
 */
public class PersonaServicio {
    private final PersonaDao personaDao;
    
    public PersonaServicio() {
      this.personaDao = new PersonaDao();
    }
    
    public void crearPersona(String nombre, String apellido, String email){
        personaDao.crearPersona(nombre, apellido, email);
    }
    
    public List<Persona> leerPersonas(){
        return personaDao.leerPersonas();
    }
    
    public void actualizarPersona(String nombre, String apellido, String email, Double id){
        personaDao.actualizarPersona(nombre, apellido, email, id);
    }
    
    public void eliminarPersona(Double id){
        personaDao.eliminarPersona(id);
    }
    
    
}

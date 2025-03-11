/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Utilidades.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tecnologiasavanzadas.practicapoo.Facultad;
import tecnologiasavanzadas.practicapoo.Persona;

/**
 *
 * @author crism
 */
public class FacultadDao {

  
    public void crearFacultad(Facultad facultad) {
        String sql = "INSERT INTO facultad (nombre, decano_id) VALUES (?, ?)";

        try (Connection conn = ConexionDB.obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, facultad.getNombre());
            stmt.setDouble(2, facultad.getDecano().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public List<Facultad> leerFacultades() {
        List<Facultad> facultades = new ArrayList<>();
        String sql = "SELECT f.id, f.nombre, f.decano_id, p.nombre, p.apellido, p.email " +
                     "FROM facultad f JOIN persona p ON f.decano_id = p.id";

        try (Connection conn = ConexionDB.obtenerConexion(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Double id = rs.getDouble("f.id");
                String nombre = rs.getString("f.nombre");
                Double decanoId = rs.getDouble("f.decano_id");
                String decanoNombre = rs.getString("p.nombre");
                String decanoApellido = rs.getString("p.apellido");
                String decanoEmail = rs.getString("p.email");
                
                // Crear la persona (decano)
                Persona decano = new Persona(decanoId, decanoNombre, decanoApellido, decanoEmail);
                
                // Crear la facultad
                Facultad facultad = new Facultad(id, nombre, decano);
                facultades.add(facultad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facultades;
    }

  
    public void actualizarFacultad(Facultad facultad) {
        String sql = "UPDATE facultad SET nombre = ?, decano_id = ? WHERE id = ?";

        try (Connection conn = ConexionDB.obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, facultad.getNombre());
            stmt.setDouble(2, facultad.getDecano().getId());
            stmt.setDouble(3, facultad.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void eliminarFacultad(Double id) {
        String sql = "DELETE FROM facultad WHERE id = ?";

        try (Connection conn = ConexionDB.obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
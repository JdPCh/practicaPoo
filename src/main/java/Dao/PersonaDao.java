/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author crism
 */
import Utilidades.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tecnologiasavanzadas.practicapoo.Persona;

public class PersonaDao {

   
    public void crearPersona(Persona persona) {
        String query = "INSERT INTO persona (nombre, apellido, email) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.executeUpdate();
            System.out.println("Persona creada: " + persona);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public List<Persona> leerPersonas() {
        List<Persona> personas = new ArrayList<>();
        String query = "SELECT * FROM persona";
        try (Connection conn = ConexionDB.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Double id = rs.getDouble("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                Persona persona = new Persona(id, nombre, apellido, email);
                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }

   
    public void actualizarPersona(Persona persona) {
        String query = "UPDATE persona SET nombre = ?, apellido = ?, email = ? WHERE id = ?";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setDouble(4, persona.getId());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Persona actualizada con éxito.");
            } else {
                System.out.println("Persona no encontrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarPersona(Double id) {
        String query = "DELETE FROM persona WHERE id = ?";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Persona eliminada con éxito.");
            } else {
                System.out.println("Persona no encontrada con el ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
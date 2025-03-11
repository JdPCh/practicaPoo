/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/practicapoo";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Cristian6";

    public static Connection obtenerConexion() throws SQLException {
        try {
            System.out.println("Conexion con exito");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Error al conectar a la base de datos", e);
        }
    }
}

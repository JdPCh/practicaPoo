/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Ui.FormularioPrincipal;
import Utilidades.ConexionDB;
import java.sql.SQLException;
/**
 *
 * @author jsdvp
 */
public class Main {
      public static void main(String[] args) throws SQLException {
          FormularioPrincipal form = new FormularioPrincipal();
          form.setVisible(true);
          
          ConexionDB.obtenerConexion();
      }
}

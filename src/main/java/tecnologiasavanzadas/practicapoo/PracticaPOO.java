/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tecnologiasavanzadas.practicapoo;

/**
 *
 * @author Estudiante_MCA
 */
public class PracticaPOO {

    public static void main(String[] args) {
        Date fecha = new Date();
        
        Persona persona = new Persona(5.0, "Jorge", "Sanchez", "JSan@universidad.com");
        
        Facultad facultad = new Facultad(4.0,"FCBI", persona);
        
        Programa programa = new Programa(2.0, "Sistemas", 6.0, fecha, facultad);
        
        
        Estudiante estudiante = new Estudiante(1.0, programa, true, 5.0 ,1.0, "pepe", "lozano", "pepe@universidad.com");
        
        
        
        System.out.println(estudiante.toString());
    }
}

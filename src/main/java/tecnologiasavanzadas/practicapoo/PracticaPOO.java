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
        Programa programa = new Programa();
        Estudiante estudiante = new Estudiante(1.0, programa, true, 5.0 ,1.0, "pepe", "lozano", "123");
        
        
        
        System.out.println(estudiante.toString());
    }
}

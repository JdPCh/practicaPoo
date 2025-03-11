/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tecnologiasavanzadas.practicapoo;


import java.util.Date;


/**
 *
 * @author Estudiante_MCA
 */
public class PracticaPOO {
<<<<<<< HEAD

=======
/*
>>>>>>> f076d41 (Version-4)
    public static void main(String[] args) {


        Date fecha = new Date();
        
        Persona persona = new Persona(5.0, "Jorge", "Sanchez", "JSan@universidad.com");
        
        Facultad facultad = new Facultad(4.0,"FCBI", persona);
        
        Programa programa = new Programa(2.0, "Sistemas", 6.0, fecha, facultad);
        

        Estudiante estudiante = new Estudiante(1.0, programa, true, 5.0 ,1.0, "pepe", "lozano", "pepe@universidad.com");
        
        
        Profesor profesor = new Profesor(6.0, "Carlos", "Pulido", "CarlosP@universidad.com","tiempoCompleto");
        
        Curso curso = new Curso(1, "Matematicas", programa, true);
        
        CursoProfesor cursoProfesor = new CursoProfesor(profesor, 2025, 1, curso);
        
        
        InscripcionesPersonas inscripcionesPersonas = new InscripcionesPersonas();
        
        CursosProfesores cursosProfesores = new CursosProfesores();
        
        CursosInscritos cursosInscritos = new CursosInscritos();
        
        Inscripcion inscripcion = new Inscripcion(curso, 2025, 1, estudiante);
        
        inscripcionesPersonas.inscribir(persona);
        
        inscripcionesPersonas.guardarInformacion(estudiante);
        
        inscripcionesPersonas.cargarDatos();
        
        inscripcionesPersonas.eliminar(persona);
        
        cursosProfesores.inscribir(cursoProfesor);
        
        cursosProfesores.guardarInformacion(cursoProfesor);
        
        cursosProfesores.cargarDatos();
        
        cursosInscritos.guardarInformacion(inscripcion);
        
        cursosInscritos.cargarDatos();
        
      
        
        System.out.println(inscripcionesPersonas);
        System.out.println(cursosProfesores);
        System.out.println(cursosInscritos);
        
        System.out.println(estudiante.toString());
    }
<<<<<<< HEAD
=======
*/
>>>>>>> f076d41 (Version-4)
}

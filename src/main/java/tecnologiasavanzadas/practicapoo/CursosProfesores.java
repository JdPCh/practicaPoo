/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Estudiante_MCA
 */
public class CursosProfesores implements Servicios{
    
    private
    
    ArrayList<CursoProfesor> listado;
    
    public
    
    @Override
    String toString(){
        
        String cursos = "";
        
        for(CursoProfesor curso: listado){
           cursos += curso +"\n\n";
        }
        
        return cursos;
    }
    
    CursosProfesores() {
        this.listado = new ArrayList();
    }

    CursosProfesores(ArrayList<CursoProfesor> listado) {
        this.listado = listado;
    }

    ArrayList<CursoProfesor> getListado() {
        return listado;
    }

    void setListado(ArrayList<CursoProfesor> listado) {
        this.listado = listado;
    }
    
    void inscribir(CursoProfesor cursoProfesor){
        listado.add(cursoProfesor);
    };
    void guardarInformacion(CursoProfesor cursoProfesor){
         try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/OtherResources/CursoProfesor.txt", true));
            escritor.write("Profesor Tipo Contrato: " + cursoProfesor.getProfesor().getTipoContrato()+ ", ");
            escritor.write("Id: " + cursoProfesor.getProfesor().getId()+ ", ");
            escritor.write("Nombre: " + cursoProfesor.getProfesor().getNombre()+ ", ");
            escritor.write("Apellido: " + cursoProfesor.getProfesor().getApellido()+ ", ");
            escritor.write("Email: " + cursoProfesor.getProfesor().getEmail()+ ", ");
            escritor.write("Curso Profesor Anio: " + cursoProfesor.getAnio() + ", ");
            escritor.write("Semestre: " + cursoProfesor.getSemestre()+ ", ");
            escritor.write("Curso Id: " + cursoProfesor.getCurso().getId() + ", ");
            escritor.write("Nombre: " + cursoProfesor.getCurso().getNombre() + ", ");
            escritor.write("Activo: " + cursoProfesor.getCurso().getActivo()+ ", ");
            escritor.write("Programa Id: " + cursoProfesor.getCurso().getPrograma().getId()+ ", ");
            escritor.write("Nombre: " + cursoProfesor.getCurso().getPrograma().getNombre()+ ", ");
            escritor.write("Duracion: " + cursoProfesor.getCurso().getPrograma().getDuracion()+ ", ");
            escritor.write("Registro: " + cursoProfesor.getCurso().getPrograma().getRegistro()+ ", ");
            escritor.write("Facultad Id: " + cursoProfesor.getCurso().getPrograma().getFacultad().getId()+ ", ");
            escritor.write("Nombre: " + cursoProfesor.getCurso().getPrograma().getFacultad().getNombre()+ ", ");
            escritor.write("Decano Id: " + cursoProfesor.getCurso().getPrograma().getFacultad().getDecano().getId()+ ", ");
            escritor.write("Nombre: " + cursoProfesor.getCurso().getPrograma().getFacultad().getDecano().getNombre()+ ", ");
            escritor.write("Apellido: " + cursoProfesor.getCurso().getPrograma().getFacultad().getDecano().getApellido()+ ", ");
            escritor.write("Email: " + cursoProfesor.getCurso().getPrograma().getFacultad().getDecano().getEmail());
            escritor.newLine();
            escritor.flush();
            System.out.println("Curso Profesor guardado correctamente");
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    };
    void cargarDatos(){
    
        try (BufferedReader lector = new BufferedReader(new FileReader("src/main/java/OtherResources/CursoProfesor.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) { 
                String[] partes = linea.split(", ");
                 
                String tipoContrato = partes[0].split(": ")[1];
                String idProfesor = partes[1].split(": ")[1];
                String nombreProfesor = partes[2].split(": ")[1];
                String apellidoProfesor = partes[3].split(": ")[1];
                String emailProfesor = partes[4].split(": ")[1];

                String Anio = partes[5].split(": ")[1];
                String semestre = partes[6].split(": ")[1];
                String cursoId = partes[7].split(": ")[1];
                String nombreCurso = partes[8].split(": ")[1];
                String cursoActivo = partes[9].split(": ")[1];

                String programaId = partes[10].split(": ")[1];
                String nombrePrograma = partes[11].split(": ")[1];
                String duracionPrograma = partes[12].split(": ")[1];
                String registroPrograma = partes[13].split(": ", 2)[1];

                String facultadId = partes[14].split(": ")[1];
                String nombreFacultad = partes[15].split(": ")[1];

                String decanoId = partes[16].split(": ")[1];
                String nombreDecano = partes[17].split(": ")[1];
                String apellidoDecano = partes[18].split(": ")[1];
                String emailDecano = partes[19].split(": ")[1];
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                
                ZonedDateTime zonedDateTime = ZonedDateTime.parse(registroPrograma, formatter);
                
                 Date fecha = Date.from(zonedDateTime.toInstant());
                
                Profesor profesor = new Profesor(Double.valueOf(idProfesor),nombreProfesor, apellidoProfesor, emailProfesor, tipoContrato);
                
                Persona Decano = new Persona(Double.valueOf(decanoId), nombreDecano, apellidoDecano, emailDecano);
                
                Facultad facultad = new Facultad(Double.valueOf(facultadId), nombreFacultad, Decano);
                
                Programa programa = new Programa(Double.valueOf(programaId),nombrePrograma, Double.valueOf(duracionPrograma), fecha, facultad );
                
                Curso curso = new Curso(Integer.parseInt(cursoId), nombreCurso, programa, Boolean.valueOf(cursoActivo));
                
                
                CursoProfesor cursoProfesor = new CursoProfesor(profesor, Integer.parseInt(Anio), Integer.parseInt(semestre), curso);
                
                listado.add(cursoProfesor);
            }
            System.out.println("Cursos Profesores cargados con exito: ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    };

    @Override
    public String imprimirPosicion(int posicion) {
         return listado.get(posicion).toString();
    }

    @Override
    public int cantidadActual() {
        return listado.size();
    }

    @Override
    public ArrayList<String> imprimirListado() {
        ArrayList<String> lista = new ArrayList();
        for(CursoProfesor curso: listado){
            lista.add(curso.toString());
        }
        return lista;
    }
    
}

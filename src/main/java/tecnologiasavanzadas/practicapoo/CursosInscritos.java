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
public class CursosInscritos implements Servicios{
    
    private
    
    ArrayList<Inscripcion> listado;
    
    public
    
    @Override
    String toString(){
        
        String inscripciones = "";
        
        for(Inscripcion inscripcion : listado){
           inscripciones = inscripcion +", "+ inscripciones;
        }
        
        return inscripciones;
    }
    
    
    CursosInscritos() {
        this.listado = new ArrayList();
    }
    

    CursosInscritos(ArrayList<Inscripcion> listado) {
        this.listado = listado;
    }

    ArrayList<Inscripcion> getListado() {
        return listado;
    }

    void setListado(ArrayList<Inscripcion> listado) {
        this.listado = listado;
    }
   
    void inscribirCurso(Inscripcion inscripcion){
        listado.add(inscripcion);
    };
    void eliminar(Inscripcion inscripcion){
        listado.remove(inscripcion);
    };
    void actualizar(Inscripcion inscripcion){
        
    };
    void guardarInformacion(Inscripcion inscripcion){
       try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/OtherResources/CursosInscritos.txt", true));
            
            escritor.write("Inscripcion anio: " + inscripcion.getAnio()+ ", ");
            escritor.write("semestre: " + inscripcion.getSemestre()+ ", ");
            escritor.write("Curso Id: " + inscripcion.getCurso().getId() + ", ");
            escritor.write("Nombre: " + inscripcion.getCurso().getNombre() + ", ");
            escritor.write("Activo: " + inscripcion.getCurso().getActivo()+ ", ");
            escritor.write("CursoPrograma Id: " + inscripcion.getCurso().getPrograma().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getCurso().getPrograma().getNombre()+ ", ");
            escritor.write("Duracion: " + inscripcion.getCurso().getPrograma().getDuracion()+ ", ");
            escritor.write("Registro: " + inscripcion.getCurso().getPrograma().getRegistro()+ ", ");
            escritor.write("FacultadCurso Id: " + inscripcion.getCurso().getPrograma().getFacultad().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getCurso().getPrograma().getFacultad().getNombre()+ ", ");
            escritor.write("DecanoFacultadCurso Id: " + inscripcion.getCurso().getPrograma().getFacultad().getDecano().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getCurso().getPrograma().getFacultad().getDecano().getNombre()+ ", ");
            escritor.write("Apellido: " + inscripcion.getCurso().getPrograma().getFacultad().getDecano().getApellido()+ ", ");
            escritor.write("Email: " + inscripcion.getCurso().getPrograma().getFacultad().getDecano().getEmail()+ ", ");
            escritor.write("Estudiante Id: " + inscripcion.getEstudiante().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getEstudiante().getNombre()+ ", ");
            escritor.write("Apellido: " + inscripcion.getEstudiante().getApellido()+ ", ");
            escritor.write("Email: " + inscripcion.getEstudiante().getEmail()+ ", ");
            escritor.write("Codigo: " + inscripcion.getEstudiante().getCodigo()+ ", ");
            escritor.write("Activo: " + inscripcion.getEstudiante().getActivo()+ ", ");
            escritor.write("Promedio: " + inscripcion.getEstudiante().getPromedio()+ ", ");
            escritor.write("ProgramaEstudiante Id: " + inscripcion.getEstudiante().getPrograma().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getEstudiante().getPrograma().getNombre()+ ", ");
            escritor.write("Duracion: " + inscripcion.getEstudiante().getPrograma().getDuracion()+ ", ");
            escritor.write("Registro: " + inscripcion.getEstudiante().getPrograma().getRegistro()+ ", ");
            escritor.write("FacultadEstudiante Id: " + inscripcion.getEstudiante().getPrograma().getFacultad().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getEstudiante().getPrograma().getFacultad().getNombre()+ ", ");
            escritor.write("DecanoFacultadEstudiante Id: " + inscripcion.getEstudiante().getPrograma().getFacultad().getDecano().getId()+ ", ");
            escritor.write("Nombre: " + inscripcion.getEstudiante().getPrograma().getFacultad().getDecano().getNombre()+ ", ");
            escritor.write("Apellido: " + inscripcion.getEstudiante().getPrograma().getFacultad().getDecano().getApellido()+ ", ");
            escritor.write("Email: " + inscripcion.getEstudiante().getPrograma().getFacultad().getDecano().getEmail());
            escritor.newLine();
            escritor.flush();
            System.out.println("Persona guardada correctamente");
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    };
    void cargarDatos(){
        try (BufferedReader lector = new BufferedReader(new FileReader("src/main/java/OtherResources/CursosInscritos.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(", ");
        
                String anio = partes[0].split(": ")[1];
                String semestre = partes[1].split(": ")[1];
                String cursoId = partes[2].split(": ")[1];
                String nombreCurso = partes[3].split(": ")[1];
                String cursoActivo = partes[4].split(": ")[1];
        
                String programaId = partes[5].split(": ")[1];
                String nombrePrograma = partes[6].split(": ")[1];
                String duracionPrograma = partes[7].split(": ")[1];
                String registroPrograma = partes[8].split(": ", 2)[1];
        
                String facultadId = partes[9].split(": ")[1];
                String nombreFacultad = partes[10].split(": ")[1];
        
                String decanoId = partes[11].split(": ")[1];
                String nombreDecano = partes[12].split(": ")[1];
                String apellidoDecano = partes[13].split(": ")[1];
                String emailDecano = partes[14].split(": ")[1];
        
                String estudianteId = partes[15].split(": ")[1];
                String nombreEstudiante = partes[16].split(": ")[1];
                String apellidoEstudiante = partes[17].split(": ")[1];
                String emailEstudiante = partes[18].split(": ")[1];
                String codigoEstudiante = partes[19].split(": ")[1];
                String estudianteActivo = partes[20].split(": ")[1];
                String promedioEstudiante = partes[21].split(": ")[1];
        
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                ZonedDateTime zonedDateTime = ZonedDateTime.parse(registroPrograma, formatter);
                Date fecha = Date.from(zonedDateTime.toInstant());
        
                Persona decano = new Persona(Double.valueOf(decanoId), nombreDecano, apellidoDecano, emailDecano);
                Facultad facultad = new Facultad(Double.valueOf(facultadId), nombreFacultad, decano);
                Programa programa = new Programa(Double.valueOf(programaId), nombrePrograma, Double.valueOf(duracionPrograma), fecha, facultad);
                Curso curso = new Curso(Integer.parseInt(cursoId), nombreCurso, programa, Boolean.valueOf(cursoActivo));
                Estudiante estudiante = new Estudiante(Double.valueOf(codigoEstudiante), programa, Boolean.valueOf(estudianteActivo), Double.valueOf(promedioEstudiante),Double.valueOf(estudianteId) ,nombreEstudiante,apellidoEstudiante ,emailEstudiante );
        
                Inscripcion inscripcion = new Inscripcion(curso,Integer.parseInt(anio), Integer.parseInt(semestre), estudiante);
                listado.add(inscripcion);
        }
            System.out.println("Inscripciones cargadas con éxito.");
        }catch (IOException e) {
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
        for(Inscripcion inscripcion: listado){
            lista.add(inscripcion.toString());
        }
        return lista;
    }
    
    
}
